package org.konan.libcurl

import kotlinx.cinterop.*
import platform.*
import platform.posix.size_t        // import explicity
import libcurl.*

typealias HttpHandler = (String) -> Unit
class CUrl(url: String, USER_AGENT: String = "myexip/tiny kotlin/native cli to myexip") {

    val stableRef = StableRef.create(this)
    val curl = curl_easy_init()
    val header = Event<String>()
    val body = Event<String>()

    init {

        curl_easy_setopt(curl, CURLOPT_URL, url)
        curl_easy_setopt(curl, CURLOPT_USERAGENT, USER_AGENT)

        val header = staticCFunction(::header_callback)
        curl_easy_setopt(curl, CURLOPT_HEADERFUNCTION, header)
        curl_easy_setopt(curl, CURLOPT_HEADERDATA, stableRef.asCPointer())

        val write_data = staticCFunction(::write_data)
        curl_easy_setopt(curl, CURLOPT_WRITEFUNCTION, write_data)
        curl_easy_setopt(curl, CURLOPT_WRITEDATA, stableRef.asCPointer())

    }

    fun nobody(){
        curl_easy_setopt(curl, CURLOPT_NOBODY, 1L)
    }

    fun fetch(): Int {
        val res = curl_easy_perform(curl)
        return res
    }

    fun close() {
        curl_easy_cleanup(curl)
        stableRef.dispose()
    }

}

fun CPointer<ByteVar>.toKString(length: Int): String {
    val bytes = this.readBytes(length)
    return bytes.stringFromUtf8()
}

fun header_callback(buffer: CPointer<ByteVar>?, size: size_t, nitems: size_t, userdata: COpaquePointer?): size_t {
    if (buffer == null) {
        return 0
    }

    if (userdata != null) {
        val header = buffer.toKString((size * nitems).toInt()).trim()
        val curl = userdata.asStableRef<CUrl>().get()
        curl.header(header)
    }
    return size * nitems
}

fun write_data(buffer: CPointer<ByteVar>?, size: size_t, nitems: size_t, userdata: COpaquePointer?): size_t {
    if (buffer == null) {
        return 0
    }

    if (userdata != null) {
        val body = buffer.toKString((size * nitems).toInt()).trim()
        val curl = userdata.asStableRef<CUrl>().get()
        curl.body(body)
    }
    return size * nitems
}
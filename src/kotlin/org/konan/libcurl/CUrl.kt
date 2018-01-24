package org.konan.libcurl

import kotlinx.cinterop.*
import platform.*
import libcurl.*

typealias HttpHandler = (String) -> Unit

class CUrl(url: String, USER_AGENT: String = "myexip/tiny kotlin/native cli to myexip") {


    val stableRef = StableRef.create(this)
    val curl = curl_easy_init()
    val header = Event<String>()

    init {
        curl_easy_setopt(curl, CURLOPT_URL, url)
        val header = staticCFunction(::header_callback)

        curl_easy_setopt(curl, CURLOPT_HEADERFUNCTION, header)
        curl_easy_setopt(curl, CURLOPT_HEADERDATA, stableRef.asCPointer())
        curl_easy_setopt(curl, CURLOPT_USERAGENT, USER_AGENT)

    }

    fun nobody() {
        curl_easy_setopt(curl, CURLOPT_NOBODY ,1 )
    }

    fun noprogress() {
        curl_easy_setopt(curl, CURLOPT_NOPROGRESS, 1)
    }

    fun fetch() {
        val res = curl_easy_perform(curl)
        if (res != CURLE_OK) {
            println("curl_easy_perform() failed: ${curl_easy_strerror(res)}")
        }

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

    val header = buffer.toKString((size * nitems).toInt()).trim()
    if (userdata != null) {
        val curl = userdata.asStableRef<CUrl>().get()
        curl.header(header)
    }
    return size * nitems
}


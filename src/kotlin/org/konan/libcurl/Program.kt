package org.konan.libcurl

import kotlinx.cinterop.toKString
import libcurl.CURLE_OK
import libcurl.curl_easy_strerror

fun myexip(url: String): String{

    var ip = "?.?.?.?"

    val curl = CUrl(url)        // curl object

    curl.header += {
        if( it.contains("My-External-Ip") ) {
            ip = it.removePrefix("My-External-Ip: ")
        }
    }

    curl.nobody()               // tell curl we don't want the body
    val fetch = curl.fetch()
    if (fetch != CURLE_OK){
        val emsg = curl_easy_strerror(fetch)
        println("Error performing CURL download: ${emsg?.toKString()}")
        ip=""
    }
    curl.close()

    return ip;

}
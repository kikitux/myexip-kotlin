package org.konan.libcurl

import libcurl.CURLE_OK

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
        //actual error is very ugly ${curl_easy_strerror(res)
//        exitProcess(1) // fail and exit
        ip=""
    }
    curl.close()

    return ip;

}
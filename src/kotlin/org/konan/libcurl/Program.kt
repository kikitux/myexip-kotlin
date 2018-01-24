package org.konan.libcurl

import kotlinx.cinterop.*
import platform.*
import libcurl.*

fun myexip(url: String): String{

    var ip = "?.?.?.?"

    val curl = CUrl(url)


    curl.header += {
        if( it.contains("My-External-Ip") ) {
            ip = it.removePrefix("My-External-Ip: ")
        }
    }

    curl.fetch()
    curl.close()

    return ip;

}
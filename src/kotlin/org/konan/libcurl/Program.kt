package org.konan.libcurl

fun myexip(url: String): String{

    var ip = "?.?.?.?"

    val curl = CUrl(url)

    curl.header += {
        if( it.contains("My-External-Ip") ) {
            ip = it.removePrefix("My-External-Ip: ")
        }
    }

    curl.nobody()
    curl.fetch()
    curl.close()

    return ip;

}
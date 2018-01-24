import org.konan.libcurl.myexip
import platform.posix._exit
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    var largs = listOf(*args)

    val V4_URL     = "http://ipv4.myexternalip.com"
    val V6_URL     = "http://ipv6.myexternalip.com"

    var url = V4_URL                // default to ipv4

    if ( largs.contains("-h") ){
        halp(0)
    }

    // if -6 update url and reduce args
    if ( largs.contains("-6") ){
        url = V6_URL
        largs = largs.filterNot { it == "-6" }
    }

    // if we reach here we got args we don't know.
    // exit with error and display help
    if ( largs.count() > 0 ){
        println( "err: unknown options " + largs )
        halp(1)
    }

    println(myexip(url))

}

fun halp(exitCode: Int){
    println("use: myexip [-6]") // basic usage
    exitProcess(exitCode)

}
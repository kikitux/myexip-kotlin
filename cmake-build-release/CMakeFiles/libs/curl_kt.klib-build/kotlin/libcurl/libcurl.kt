@file:kotlinx.cinterop.InteropStubs
@file:Suppress("UNUSED_VARIABLE", "UNUSED_EXPRESSION")
package libcurl

import konan.SymbolName
import kotlinx.cinterop.*
import cnames.structs.curl_pushheaders

fun curl_strequal(s1: String?, s2: String?): Int {
    memScoped {
        return kniBridge0(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue)
    }
}

fun curl_strnequal(s1: String?, s2: String?, n: size_t): Int {
    memScoped {
        return kniBridge1(s1?.cstr?.getPointer(memScope).rawValue, s2?.cstr?.getPointer(memScope).rawValue, n)
    }
}

fun curl_formadd(httppost: CValuesRef<CPointerVar<curl_httppost>>?, last_post: CValuesRef<CPointerVar<curl_httppost>>?, vararg variadicArguments: Any?): CURLFORMcode {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CURLFORMcode.Var>(typeOf<CURLFORMcode.Var>())
        callWithVarargs(kniBridge2(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(httppost?.getPointer(memScope), last_post?.getPointer(memScope)), variadicArguments, memScope)
        return kniResult.value
    }
}

fun curl_formget(form: CValuesRef<curl_httppost>?, arg: CValuesRef<*>?, append: curl_formget_callback?): Int {
    memScoped {
        return kniBridge3(form?.getPointer(memScope).rawValue, arg?.getPointer(memScope).rawValue, append.rawValue)
    }
}

fun curl_formfree(form: CValuesRef<curl_httppost>?): Unit {
    memScoped {
        return kniBridge4(form?.getPointer(memScope).rawValue)
    }
}

fun curl_getenv(variable: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge5(variable?.cstr?.getPointer(memScope).rawValue))
    }
}

fun curl_version(): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge6())
}

fun curl_easy_escape(handle: CValuesRef<*>?, string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge7(handle?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_escape(string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge8(string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_easy_unescape(handle: CValuesRef<*>?, string: String?, length: Int, outlength: CValuesRef<IntVar>?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge9(handle?.getPointer(memScope).rawValue, string?.cstr?.getPointer(memScope).rawValue, length, outlength?.getPointer(memScope).rawValue))
    }
}

fun curl_unescape(string: String?, length: Int): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge10(string?.cstr?.getPointer(memScope).rawValue, length))
    }
}

fun curl_free(p: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge11(p?.getPointer(memScope).rawValue)
    }
}

fun curl_global_init(flags: Long): CURLcode {
    return kniBridge12(flags)
}

fun curl_global_init_mem(flags: Long, m: curl_malloc_callback?, f: curl_free_callback?, r: curl_realloc_callback?, s: curl_strdup_callback?, c: curl_calloc_callback?): CURLcode {
    return kniBridge13(flags, m.rawValue, f.rawValue, r.rawValue, s.rawValue, c.rawValue)
}

fun curl_global_cleanup(): Unit {
    return kniBridge14()
}

fun curl_slist_append(arg0: CValuesRef<curl_slist>?, arg1: String?): CPointer<curl_slist>? {
    memScoped {
        return interpretCPointer<curl_slist>(kniBridge15(arg0?.getPointer(memScope).rawValue, arg1?.cstr?.getPointer(memScope).rawValue))
    }
}

fun curl_slist_free_all(arg0: CValuesRef<curl_slist>?): Unit {
    memScoped {
        return kniBridge16(arg0?.getPointer(memScope).rawValue)
    }
}

fun curl_getdate(p: String?, unused: CValuesRef<time_tVar>?): time_t {
    memScoped {
        return kniBridge17(p?.cstr?.getPointer(memScope).rawValue, unused?.getPointer(memScope).rawValue)
    }
}

fun curl_share_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge18())
}

fun curl_share_setopt(arg0: CValuesRef<*>?, option: CURLSHoption, vararg variadicArguments: Any?): CURLSHcode {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CURLSHcode.Var>(typeOf<CURLSHcode.Var>())
        callWithVarargs(kniBridge19(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(arg0?.getPointer(memScope), option), variadicArguments, memScope)
        return kniResult.value
    }
}

fun curl_share_cleanup(arg0: CValuesRef<*>?): CURLSHcode {
    memScoped {
        return CURLSHcode.byValue(kniBridge20(arg0?.getPointer(memScope).rawValue))
    }
}

fun curl_version_info(arg0: CURLversion): CPointer<curl_version_info_data>? {
    return interpretCPointer<curl_version_info_data>(kniBridge21(arg0.value))
}

fun curl_easy_strerror(arg0: CURLcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge22(arg0))
}

fun curl_share_strerror(arg0: CURLSHcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge23(arg0.value))
}

fun curl_easy_pause(handle: CValuesRef<*>?, bitmask: Int): CURLcode {
    memScoped {
        return kniBridge24(handle?.getPointer(memScope).rawValue, bitmask)
    }
}

fun curl_easy_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge25())
}

fun curl_easy_setopt(curl: CValuesRef<*>?, option: CURLoption, vararg variadicArguments: Any?): CURLcode {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CURLcodeVar>(typeOf<CURLcodeVar>())
        callWithVarargs(kniBridge26(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(curl?.getPointer(memScope), option), variadicArguments, memScope)
        return kniResult.value
    }
}

fun curl_easy_perform(curl: CValuesRef<*>?): CURLcode {
    memScoped {
        return kniBridge27(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_cleanup(curl: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge28(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_getinfo(curl: CValuesRef<*>?, info: CURLINFO, vararg variadicArguments: Any?): CURLcode {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CURLcodeVar>(typeOf<CURLcodeVar>())
        callWithVarargs(kniBridge29(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(curl?.getPointer(memScope), info), variadicArguments, memScope)
        return kniResult.value
    }
}

fun curl_easy_duphandle(curl: CValuesRef<*>?): COpaquePointer? {
    memScoped {
        return interpretCPointer<COpaque>(kniBridge30(curl?.getPointer(memScope).rawValue))
    }
}

fun curl_easy_reset(curl: CValuesRef<*>?): Unit {
    memScoped {
        return kniBridge31(curl?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_recv(curl: CValuesRef<*>?, buffer: CValuesRef<*>?, buflen: size_t, n: CValuesRef<size_tVar>?): CURLcode {
    memScoped {
        return kniBridge32(curl?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, buflen, n?.getPointer(memScope).rawValue)
    }
}

fun curl_easy_send(curl: CValuesRef<*>?, buffer: CValuesRef<*>?, buflen: size_t, n: CValuesRef<size_tVar>?): CURLcode {
    memScoped {
        return kniBridge33(curl?.getPointer(memScope).rawValue, buffer?.getPointer(memScope).rawValue, buflen, n?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_init(): COpaquePointer? {
    return interpretCPointer<COpaque>(kniBridge34())
}

fun curl_multi_add_handle(multi_handle: CValuesRef<*>?, curl_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge35(multi_handle?.getPointer(memScope).rawValue, curl_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_remove_handle(multi_handle: CValuesRef<*>?, curl_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge36(multi_handle?.getPointer(memScope).rawValue, curl_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_fdset(multi_handle: CValuesRef<*>?, read_fd_set: CValuesRef<fd_set>?, write_fd_set: CValuesRef<fd_set>?, exc_fd_set: CValuesRef<fd_set>?, max_fd: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge37(multi_handle?.getPointer(memScope).rawValue, read_fd_set?.getPointer(memScope).rawValue, write_fd_set?.getPointer(memScope).rawValue, exc_fd_set?.getPointer(memScope).rawValue, max_fd?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_wait(multi_handle: CValuesRef<*>?, extra_fds: CValuesRef<curl_waitfd>?, extra_nfds: Int, timeout_ms: Int, ret: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge38(multi_handle?.getPointer(memScope).rawValue, extra_fds?.getPointer(memScope).rawValue, extra_nfds, timeout_ms, ret?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_perform(multi_handle: CValuesRef<*>?, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge39(multi_handle?.getPointer(memScope).rawValue, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_cleanup(multi_handle: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge40(multi_handle?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_info_read(multi_handle: CValuesRef<*>?, msgs_in_queue: CValuesRef<IntVar>?): CPointer<CURLMsg>? {
    memScoped {
        return interpretCPointer<CURLMsg>(kniBridge41(multi_handle?.getPointer(memScope).rawValue, msgs_in_queue?.getPointer(memScope).rawValue))
    }
}

fun curl_multi_strerror(arg0: CURLMcode): CPointer<ByteVar>? {
    return interpretCPointer<ByteVar>(kniBridge42(arg0))
}

fun curl_multi_socket(multi_handle: CValuesRef<*>?, s: curl_socket_t, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge43(multi_handle?.getPointer(memScope).rawValue, s, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_socket_action(multi_handle: CValuesRef<*>?, s: curl_socket_t, ev_bitmask: Int, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge44(multi_handle?.getPointer(memScope).rawValue, s, ev_bitmask, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_socket_all(multi_handle: CValuesRef<*>?, running_handles: CValuesRef<IntVar>?): CURLMcode {
    memScoped {
        return kniBridge45(multi_handle?.getPointer(memScope).rawValue, running_handles?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_timeout(multi_handle: CValuesRef<*>?, milliseconds: CValuesRef<LongVar>?): CURLMcode {
    memScoped {
        return kniBridge46(multi_handle?.getPointer(memScope).rawValue, milliseconds?.getPointer(memScope).rawValue)
    }
}

fun curl_multi_setopt(multi_handle: CValuesRef<*>?, option: CURLMoption, vararg variadicArguments: Any?): CURLMcode {
    memScoped {
        val kniResult = allocFfiReturnValueBuffer<CURLMcodeVar>(typeOf<CURLMcodeVar>())
        callWithVarargs(kniBridge47(), kniResult.rawPtr, FFI_TYPE_KIND_SINT32, arrayOf(multi_handle?.getPointer(memScope), option), variadicArguments, memScope)
        return kniResult.value
    }
}

fun curl_multi_assign(multi_handle: CValuesRef<*>?, sockfd: curl_socket_t, sockp: CValuesRef<*>?): CURLMcode {
    memScoped {
        return kniBridge48(multi_handle?.getPointer(memScope).rawValue, sockfd, sockp?.getPointer(memScope).rawValue)
    }
}

fun curl_pushheader_bynum(h: CValuesRef<curl_pushheaders>?, num: size_t): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge49(h?.getPointer(memScope).rawValue, num))
    }
}

fun curl_pushheader_byname(h: CValuesRef<curl_pushheaders>?, name: String?): CPointer<ByteVar>? {
    memScoped {
        return interpretCPointer<ByteVar>(kniBridge50(h?.getPointer(memScope).rawValue, name?.cstr?.getPointer(memScope).rawValue))
    }
}

val LIBCURL_VERSION_MAJOR: Int = 7

val LIBCURL_VERSION_MINOR: Int = 54

val LIBCURL_VERSION_PATCH: Int = 0

val LIBCURL_VERSION_NUM: Int = 472576

val CURLSYS_SIZEOF_LONG: Int = 8

val CURLSYS_SIZEOF_CURL_OFF_T: Int = 8

val CURLSYS_SIZEOF_CURL_SOCKLEN_T: Int = 4

val CURLSYS_PULL_SYS_TYPES_H: Int = 1

val CURLSYS_PULL_SYS_SOCKET_H: Int = 1

val CURL_PULL_SYS_TYPES_H: Int = 1

val CURL_PULL_STDINT_H: Int = 1

val CURL_PULL_INTTYPES_H: Int = 1

val CURL_PULL_SYS_SOCKET_H: Int = 1

val CURL_SIZEOF_LONG: Int = 8

val CURL_SIZEOF_CURL_SOCKLEN_T: Int = 4

val CURL_SIZEOF_CURL_OFF_T: Int = 8

val CURL_SOCKET_BAD: Int = -1

val CURL_HTTPPOST_FILENAME: Int = 1

val CURL_HTTPPOST_READFILE: Int = 2

val CURL_HTTPPOST_PTRNAME: Int = 4

val CURL_HTTPPOST_PTRCONTENTS: Int = 8

val CURL_HTTPPOST_BUFFER: Int = 16

val CURL_HTTPPOST_PTRBUFFER: Int = 32

val CURL_HTTPPOST_CALLBACK: Int = 64

val CURL_HTTPPOST_LARGE: Int = 128

val CURL_MAX_READ_SIZE: Int = 524288

val CURL_MAX_WRITE_SIZE: Int = 16384

val CURL_MAX_HTTP_HEADER: Int = 102400

val CURL_WRITEFUNC_PAUSE: Int = 268435457

val CURLFINFOFLAG_KNOWN_FILENAME: Int = 1

val CURLFINFOFLAG_KNOWN_FILETYPE: Int = 2

val CURLFINFOFLAG_KNOWN_TIME: Int = 4

val CURLFINFOFLAG_KNOWN_PERM: Int = 8

val CURLFINFOFLAG_KNOWN_UID: Int = 16

val CURLFINFOFLAG_KNOWN_GID: Int = 32

val CURLFINFOFLAG_KNOWN_SIZE: Int = 64

val CURLFINFOFLAG_KNOWN_HLINKCOUNT: Int = 128

val CURL_CHUNK_BGN_FUNC_OK: Int = 0

val CURL_CHUNK_BGN_FUNC_FAIL: Int = 1

val CURL_CHUNK_BGN_FUNC_SKIP: Int = 2

val CURL_CHUNK_END_FUNC_OK: Int = 0

val CURL_CHUNK_END_FUNC_FAIL: Int = 1

val CURL_FNMATCHFUNC_MATCH: Int = 0

val CURL_FNMATCHFUNC_NOMATCH: Int = 1

val CURL_FNMATCHFUNC_FAIL: Int = 2

val CURL_SEEKFUNC_OK: Int = 0

val CURL_SEEKFUNC_FAIL: Int = 1

val CURL_SEEKFUNC_CANTSEEK: Int = 2

val CURL_READFUNC_ABORT: Int = 268435456

val CURL_READFUNC_PAUSE: Int = 268435457

val CURL_SOCKOPT_OK: Int = 0

val CURL_SOCKOPT_ERROR: Int = 1

val CURL_SOCKOPT_ALREADY_CONNECTED: Int = 2

val CURLE_OBSOLETE16: Int = 16

val CURLE_OBSOLETE10: Int = 10

val CURLE_OBSOLETE12: Int = 12

val CURLOPT_ENCODING: Int = 10102

val CURLE_FTP_WEIRD_SERVER_REPLY: Int = 8

val CURLE_UNKNOWN_TELNET_OPTION: Int = 48

val CURLE_SSL_PEER_CERTIFICATE: Int = 51

val CURLE_OBSOLETE: Int = 50

val CURLE_BAD_PASSWORD_ENTERED: Int = 46

val CURLE_BAD_CALLING_ORDER: Int = 44

val CURLE_FTP_USER_PASSWORD_INCORRECT: Int = 10

val CURLE_FTP_CANT_RECONNECT: Int = 16

val CURLE_FTP_COULDNT_GET_SIZE: Int = 32

val CURLE_FTP_COULDNT_SET_ASCII: Int = 29

val CURLE_FTP_WEIRD_USER_REPLY: Int = 12

val CURLE_FTP_WRITE_ERROR: Int = 20

val CURLE_LIBRARY_NOT_FOUND: Int = 40

val CURLE_MALFORMAT_USER: Int = 24

val CURLE_SHARE_IN_USE: Int = 57

val CURLE_URL_MALFORMAT_USER: Int = 4

val CURLE_FTP_ACCESS_DENIED: Int = 9

val CURLE_FTP_COULDNT_SET_BINARY: Int = 17

val CURLE_FTP_QUOTE_ERROR: Int = 21

val CURLE_TFTP_DISKFULL: Int = 70

val CURLE_TFTP_EXISTS: Int = 73

val CURLE_HTTP_RANGE_ERROR: Int = 33

val CURLE_FTP_SSL_FAILED: Int = 64

val CURLE_OPERATION_TIMEOUTED: Int = 28

val CURLE_HTTP_NOT_FOUND: Int = 22

val CURLE_HTTP_PORT_FAILED: Int = 45

val CURLE_FTP_COULDNT_STOR_FILE: Int = 25

val CURLE_FTP_PARTIAL_FILE: Int = 18

val CURLE_FTP_BAD_DOWNLOAD_RESUME: Int = 36

val CURLE_ALREADY_COMPLETE: Int = 99999

val CURLOPT_FILE: Int = 10001

val CURLOPT_INFILE: Int = 10009

val CURLOPT_WRITEHEADER: Int = 10029

val CURLOPT_WRITEINFO: Int = 10040

val CURLOPT_CLOSEPOLICY: Int = 72

val CURLAUTH_NONE: Long = 0

val CURLAUTH_BASIC: Long = 1

val CURLAUTH_DIGEST: Long = 2

val CURLAUTH_NEGOTIATE: Long = 4

val CURLAUTH_GSSNEGOTIATE: Long = 4

val CURLAUTH_NTLM: Long = 8

val CURLAUTH_DIGEST_IE: Long = 16

val CURLAUTH_NTLM_WB: Long = 32

val CURLAUTH_ONLY: Long = -2147483648

val CURLAUTH_ANY: Long = -17

val CURLAUTH_ANYSAFE: Long = -18

val CURLSSH_AUTH_ANY: Int = -1

val CURLSSH_AUTH_NONE: Int = 0

val CURLSSH_AUTH_PUBLICKEY: Int = 1

val CURLSSH_AUTH_PASSWORD: Int = 2

val CURLSSH_AUTH_HOST: Int = 4

val CURLSSH_AUTH_KEYBOARD: Int = 8

val CURLSSH_AUTH_AGENT: Int = 16

val CURLSSH_AUTH_DEFAULT: Int = -1

val CURLGSSAPI_DELEGATION_NONE: Int = 0

val CURLGSSAPI_DELEGATION_POLICY_FLAG: Int = 1

val CURLGSSAPI_DELEGATION_FLAG: Int = 2

val CURL_ERROR_SIZE: Int = 256

val CURLSSLOPT_ALLOW_BEAST: Int = 1

val CURLSSLOPT_NO_REVOKE: Int = 2

val CURLFTPSSL_NONE: Int = 0

val CURLFTPSSL_TRY: Int = 1

val CURLFTPSSL_CONTROL: Int = 2

val CURLFTPSSL_ALL: Int = 3

val CURLFTPSSL_LAST: Int = 4

val CURLHEADER_UNIFIED: Int = 0

val CURLHEADER_SEPARATE: Int = 1

val CURLPROTO_HTTP: Int = 1

val CURLPROTO_HTTPS: Int = 2

val CURLPROTO_FTP: Int = 4

val CURLPROTO_FTPS: Int = 8

val CURLPROTO_SCP: Int = 16

val CURLPROTO_SFTP: Int = 32

val CURLPROTO_TELNET: Int = 64

val CURLPROTO_LDAP: Int = 128

val CURLPROTO_LDAPS: Int = 256

val CURLPROTO_DICT: Int = 512

val CURLPROTO_FILE: Int = 1024

val CURLPROTO_TFTP: Int = 2048

val CURLPROTO_IMAP: Int = 4096

val CURLPROTO_IMAPS: Int = 8192

val CURLPROTO_POP3: Int = 16384

val CURLPROTO_POP3S: Int = 32768

val CURLPROTO_SMTP: Int = 65536

val CURLPROTO_SMTPS: Int = 131072

val CURLPROTO_RTSP: Int = 262144

val CURLPROTO_RTMP: Int = 524288

val CURLPROTO_RTMPT: Int = 1048576

val CURLPROTO_RTMPE: Int = 2097152

val CURLPROTO_RTMPTE: Int = 4194304

val CURLPROTO_RTMPS: Int = 8388608

val CURLPROTO_RTMPTS: Int = 16777216

val CURLPROTO_GOPHER: Int = 33554432

val CURLPROTO_SMB: Int = 67108864

val CURLPROTO_SMBS: Int = 134217728

val CURLPROTO_ALL: Int = -1

val CURLOPTTYPE_LONG: Int = 0

val CURLOPTTYPE_OBJECTPOINT: Int = 10000

val CURLOPTTYPE_STRINGPOINT: Int = 10000

val CURLOPTTYPE_FUNCTIONPOINT: Int = 20000

val CURLOPTTYPE_OFF_T: Int = 30000

val CURLOPT_XFERINFODATA: Int = 10057

val CURLOPT_SERVER_RESPONSE_TIMEOUT: Int = 112

val CURLOPT_POST301: Int = 161

val CURLOPT_SSLKEYPASSWD: Int = 10026

val CURLOPT_FTPAPPEND: Int = 50

val CURLOPT_FTPLISTONLY: Int = 48

val CURLOPT_FTP_SSL: Int = 119

val CURLOPT_SSLCERTPASSWD: Int = 10026

val CURLOPT_KRB4LEVEL: Int = 10063

val CURL_IPRESOLVE_WHATEVER: Int = 0

val CURL_IPRESOLVE_V4: Int = 1

val CURL_IPRESOLVE_V6: Int = 2

val CURLOPT_RTSPHEADER: Int = 10023

val CURL_HTTP_VERSION_2: Int = 3

val CURL_REDIR_GET_ALL: Int = 0

val CURL_REDIR_POST_301: Int = 1

val CURL_REDIR_POST_302: Int = 2

val CURL_REDIR_POST_303: Int = 4

val CURL_REDIR_POST_ALL: Int = 7

val CURLSSLBACKEND_LIBRESSL: Int = 1

val CURLSSLBACKEND_BORINGSSL: Int = 1

val CURLSSLBACKEND_WOLFSSL: Int = 6

val CURLINFO_STRING: Int = 1048576

val CURLINFO_LONG: Int = 2097152

val CURLINFO_DOUBLE: Int = 3145728

val CURLINFO_SLIST: Int = 4194304

val CURLINFO_SOCKET: Int = 5242880

val CURLINFO_MASK: Int = 1048575

val CURLINFO_TYPEMASK: Int = 15728640

val CURLINFO_HTTP_CODE: Int = 2097154

val CURL_GLOBAL_SSL: Int = 1

val CURL_GLOBAL_WIN32: Int = 2

val CURL_GLOBAL_ALL: Int = 3

val CURL_GLOBAL_NOTHING: Int = 0

val CURL_GLOBAL_DEFAULT: Int = 3

val CURL_GLOBAL_ACK_EINTR: Int = 4

val CURLVERSION_NOW: Int = 3

val CURL_VERSION_IPV6: Int = 1

val CURL_VERSION_KERBEROS4: Int = 2

val CURL_VERSION_SSL: Int = 4

val CURL_VERSION_LIBZ: Int = 8

val CURL_VERSION_NTLM: Int = 16

val CURL_VERSION_GSSNEGOTIATE: Int = 32

val CURL_VERSION_DEBUG: Int = 64

val CURL_VERSION_ASYNCHDNS: Int = 128

val CURL_VERSION_SPNEGO: Int = 256

val CURL_VERSION_LARGEFILE: Int = 512

val CURL_VERSION_IDN: Int = 1024

val CURL_VERSION_SSPI: Int = 2048

val CURL_VERSION_CONV: Int = 4096

val CURL_VERSION_CURLDEBUG: Int = 8192

val CURL_VERSION_TLSAUTH_SRP: Int = 16384

val CURL_VERSION_NTLM_WB: Int = 32768

val CURL_VERSION_HTTP2: Int = 65536

val CURL_VERSION_GSSAPI: Int = 131072

val CURL_VERSION_KERBEROS5: Int = 262144

val CURL_VERSION_UNIX_SOCKETS: Int = 524288

val CURL_VERSION_PSL: Int = 1048576

val CURL_VERSION_HTTPS_PROXY: Int = 2097152

val CURLPAUSE_RECV: Int = 1

val CURLPAUSE_RECV_CONT: Int = 0

val CURLPAUSE_SEND: Int = 4

val CURLPAUSE_SEND_CONT: Int = 0

val CURLPAUSE_ALL: Int = 5

val CURLPAUSE_CONT: Int = 0

val CURLM_CALL_MULTI_SOCKET: Int = -1

val CURLPIPE_NOTHING: Long = 0

val CURLPIPE_HTTP1: Long = 1

val CURLPIPE_MULTIPLEX: Long = 2

val CURL_WAIT_POLLIN: Int = 1

val CURL_WAIT_POLLPRI: Int = 2

val CURL_WAIT_POLLOUT: Int = 4

val CURL_POLL_NONE: Int = 0

val CURL_POLL_IN: Int = 1

val CURL_POLL_OUT: Int = 2

val CURL_POLL_INOUT: Int = 3

val CURL_POLL_REMOVE: Int = 4

val CURL_SOCKET_TIMEOUT: Int = -1

val CURL_CSELECT_IN: Int = 1

val CURL_CSELECT_OUT: Int = 2

val CURL_CSELECT_ERR: Int = 4

val CURL_PUSH_OK: Int = 0

val CURL_PUSH_DENY: Int = 1

class curl_httppost(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var next: CPointer<curl_httppost>?
        get() = memberAt<CPointerVar<curl_httppost>>(0).value
        set(value) { memberAt<CPointerVar<curl_httppost>>(0).value = value }
    
    var name: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var namelength: Long
        get() = memberAt<LongVar>(16).value
        set(value) { memberAt<LongVar>(16).value = value }
    
    var contents: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var contentslength: Long
        get() = memberAt<LongVar>(32).value
        set(value) { memberAt<LongVar>(32).value = value }
    
    var buffer: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var bufferlength: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    var contenttype: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var contentheader: CPointer<curl_slist>?
        get() = memberAt<CPointerVar<curl_slist>>(64).value
        set(value) { memberAt<CPointerVar<curl_slist>>(64).value = value }
    
    var more: CPointer<curl_httppost>?
        get() = memberAt<CPointerVar<curl_httppost>>(72).value
        set(value) { memberAt<CPointerVar<curl_httppost>>(72).value = value }
    
    var flags: Long
        get() = memberAt<LongVar>(80).value
        set(value) { memberAt<LongVar>(80).value = value }
    
    var showfilename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var userp: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(96).value
        set(value) { memberAt<COpaquePointerVar>(96).value = value }
    
    var contentlen: curl_off_t
        get() = memberAt<curl_off_tVar>(104).value
        set(value) { memberAt<curl_off_tVar>(104).value = value }
    
}

class curl_slist(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var data: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var next: CPointer<curl_slist>?
        get() = memberAt<CPointerVar<curl_slist>>(8).value
        set(value) { memberAt<CPointerVar<curl_slist>>(8).value = value }
    
}

class curl_fileinfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 8)
    
    var filename: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var filetype: curlfiletype
        get() = memberAt<curlfiletypeVar>(8).value
        set(value) { memberAt<curlfiletypeVar>(8).value = value }
    
    var time: time_t
        get() = memberAt<time_tVar>(16).value
        set(value) { memberAt<time_tVar>(16).value = value }
    
    var perm: Int
        get() = memberAt<IntVar>(24).value
        set(value) { memberAt<IntVar>(24).value = value }
    
    var uid: Int
        get() = memberAt<IntVar>(28).value
        set(value) { memberAt<IntVar>(28).value = value }
    
    var gid: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var size: curl_off_t
        get() = memberAt<curl_off_tVar>(40).value
        set(value) { memberAt<curl_off_tVar>(40).value = value }
    
    var hardlinks: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    val strings: anonymousStruct1
        get() = memberAt(56)
    
    var flags: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var b_data: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(104).value
        set(value) { memberAt<CPointerVar<ByteVar>>(104).value = value }
    
    var b_size: size_t
        get() = memberAt<size_tVar>(112).value
        set(value) { memberAt<size_tVar>(112).value = value }
    
    var b_used: size_t
        get() = memberAt<size_tVar>(120).value
        set(value) { memberAt<size_tVar>(120).value = value }
    
}

class anonymousStruct1(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(40, 8)
    
    var time: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var perm: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var user: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(16).value
        set(value) { memberAt<CPointerVar<ByteVar>>(16).value = value }
    
    var group: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var target: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(32).value
        set(value) { memberAt<CPointerVar<ByteVar>>(32).value = value }
    
}

class curl_sockaddr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(32, 4)
    
    var family: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var socktype: Int
        get() = memberAt<IntVar>(4).value
        set(value) { memberAt<IntVar>(4).value = value }
    
    var protocol: Int
        get() = memberAt<IntVar>(8).value
        set(value) { memberAt<IntVar>(8).value = value }
    
    var addrlen: Int
        get() = memberAt<IntVar>(12).value
        set(value) { memberAt<IntVar>(12).value = value }
    
    val addr: sockaddr
        get() = memberAt(16)
    
}

class sockaddr(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 1)
    
    var sa_len: __uint8_t
        get() = memberAt<__uint8_tVar>(0).value
        set(value) { memberAt<__uint8_tVar>(0).value = value }
    
    var sa_family: sa_family_t
        get() = memberAt<sa_family_tVar>(1).value
        set(value) { memberAt<sa_family_tVar>(1).value = value }
    
    val sa_data: CArrayPointer<ByteVar>
        get() = arrayMemberAt(2)
    
}

class curl_khkey(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var key: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(0).value
        set(value) { memberAt<CPointerVar<ByteVar>>(0).value = value }
    
    var len: size_t
        get() = memberAt<size_tVar>(8).value
        set(value) { memberAt<size_tVar>(8).value = value }
    
    var keytype: curl_khtype
        get() = memberAt<curl_khtype.Var>(16).value
        set(value) { memberAt<curl_khtype.Var>(16).value = value }
    
}

class curl_forms(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var option: CURLformoption
        get() = memberAt<CURLformoption.Var>(0).value
        set(value) { memberAt<CURLformoption.Var>(0).value = value }
    
    var value: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
}

class curl_certinfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var num_of_certs: Int
        get() = memberAt<IntVar>(0).value
        set(value) { memberAt<IntVar>(0).value = value }
    
    var certinfo: CPointer<CPointerVar<curl_slist>>?
        get() = memberAt<CPointerVar<CPointerVar<curl_slist>>>(8).value
        set(value) { memberAt<CPointerVar<CPointerVar<curl_slist>>>(8).value = value }
    
}

class curl_tlssessioninfo(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(16, 8)
    
    var backend: curl_sslbackend
        get() = memberAt<curl_sslbackendVar>(0).value
        set(value) { memberAt<curl_sslbackendVar>(0).value = value }
    
    var internals: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
}

class curl_version_info_data(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(112, 8)
    
    var age: CURLversion
        get() = memberAt<CURLversion.Var>(0).value
        set(value) { memberAt<CURLversion.Var>(0).value = value }
    
    var version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(8).value
        set(value) { memberAt<CPointerVar<ByteVar>>(8).value = value }
    
    var version_num: Int
        get() = memberAt<IntVar>(16).value
        set(value) { memberAt<IntVar>(16).value = value }
    
    var host: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(24).value
        set(value) { memberAt<CPointerVar<ByteVar>>(24).value = value }
    
    var features: Int
        get() = memberAt<IntVar>(32).value
        set(value) { memberAt<IntVar>(32).value = value }
    
    var ssl_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(40).value
        set(value) { memberAt<CPointerVar<ByteVar>>(40).value = value }
    
    var ssl_version_num: Long
        get() = memberAt<LongVar>(48).value
        set(value) { memberAt<LongVar>(48).value = value }
    
    var libz_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(56).value
        set(value) { memberAt<CPointerVar<ByteVar>>(56).value = value }
    
    var protocols: CPointer<CPointerVar<ByteVar>>?
        get() = memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value
        set(value) { memberAt<CPointerVar<CPointerVar<ByteVar>>>(64).value = value }
    
    var ares: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(72).value
        set(value) { memberAt<CPointerVar<ByteVar>>(72).value = value }
    
    var ares_num: Int
        get() = memberAt<IntVar>(80).value
        set(value) { memberAt<IntVar>(80).value = value }
    
    var libidn: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(88).value
        set(value) { memberAt<CPointerVar<ByteVar>>(88).value = value }
    
    var iconv_ver_num: Int
        get() = memberAt<IntVar>(96).value
        set(value) { memberAt<IntVar>(96).value = value }
    
    var libssh_version: CPointer<ByteVar>?
        get() = memberAt<CPointerVar<ByteVar>>(104).value
        set(value) { memberAt<CPointerVar<ByteVar>>(104).value = value }
    
}

class CURLMsg(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(24, 8)
    
    var msg: CURLMSG
        get() = memberAt<CURLMSG.Var>(0).value
        set(value) { memberAt<CURLMSG.Var>(0).value = value }
    
    var easy_handle: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(8).value
        set(value) { memberAt<COpaquePointerVar>(8).value = value }
    
    val data: anonymousStruct2
        get() = memberAt(16)
    
}

class anonymousStruct2(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 8)
    
    var whatever: COpaquePointer?
        get() = memberAt<COpaquePointerVar>(0).value
        set(value) { memberAt<COpaquePointerVar>(0).value = value }
    
    var result: CURLcode
        get() = memberAt<CURLcodeVar>(0).value
        set(value) { memberAt<CURLcodeVar>(0).value = value }
    
}

class curl_waitfd(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(8, 4)
    
    var fd: curl_socket_t
        get() = memberAt<curl_socket_tVar>(0).value
        set(value) { memberAt<curl_socket_tVar>(0).value = value }
    
    var events: Short
        get() = memberAt<ShortVar>(4).value
        set(value) { memberAt<ShortVar>(4).value = value }
    
    var revents: Short
        get() = memberAt<ShortVar>(6).value
        set(value) { memberAt<ShortVar>(6).value = value }
    
}

class fd_set(rawPtr: NativePtr) : CStructVar(rawPtr) {
    
    companion object : Type(128, 4)
    
    val fds_bits: CArrayPointer<__int32_tVar>
        get() = arrayMemberAt(0)
    
}


typealias curlfiletypeVar = IntVarOf<curlfiletype>
typealias curlfiletype = Int

val CURLFILETYPE_FILE: curlfiletype = 0
val CURLFILETYPE_DIRECTORY: curlfiletype = 1
val CURLFILETYPE_SYMLINK: curlfiletype = 2
val CURLFILETYPE_DEVICE_BLOCK: curlfiletype = 3
val CURLFILETYPE_DEVICE_CHAR: curlfiletype = 4
val CURLFILETYPE_NAMEDPIPE: curlfiletype = 5
val CURLFILETYPE_SOCKET: curlfiletype = 6
val CURLFILETYPE_DOOR: curlfiletype = 7
val CURLFILETYPE_UNKNOWN: curlfiletype = 8

enum class curlsocktype(override val value: Int) : CEnum {
    CURLSOCKTYPE_IPCXN(0),
    CURLSOCKTYPE_ACCEPT(1),
    CURLSOCKTYPE_LAST(2),
    ;
    
    companion object {
        fun byValue(value: Int) = curlsocktype.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curlsocktype
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curlioerr(override val value: Int) : CEnum {
    CURLIOE_OK(0),
    CURLIOE_UNKNOWNCMD(1),
    CURLIOE_FAILRESTART(2),
    CURLIOE_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curlioerr.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curlioerr
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curliocmd(override val value: Int) : CEnum {
    CURLIOCMD_NOP(0),
    CURLIOCMD_RESTARTREAD(1),
    CURLIOCMD_LAST(2),
    ;
    
    companion object {
        fun byValue(value: Int) = curliocmd.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curliocmd
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias curl_infotypeVar = IntVarOf<curl_infotype>
typealias curl_infotype = Int

val CURLINFO_TEXT: curl_infotype = 0
val CURLINFO_HEADER_IN: curl_infotype = 1
val CURLINFO_HEADER_OUT: curl_infotype = 2
val CURLINFO_DATA_IN: curl_infotype = 3
val CURLINFO_DATA_OUT: curl_infotype = 4
val CURLINFO_SSL_DATA_IN: curl_infotype = 5
val CURLINFO_SSL_DATA_OUT: curl_infotype = 6
val CURLINFO_END: curl_infotype = 7

typealias CURLcodeVar = IntVarOf<CURLcode>
typealias CURLcode = Int

val CURLE_OK: CURLcode = 0
val CURLE_UNSUPPORTED_PROTOCOL: CURLcode = 1
val CURLE_FAILED_INIT: CURLcode = 2
val CURLE_URL_MALFORMAT: CURLcode = 3
val CURLE_NOT_BUILT_IN: CURLcode = 4
val CURLE_COULDNT_RESOLVE_PROXY: CURLcode = 5
val CURLE_COULDNT_RESOLVE_HOST: CURLcode = 6
val CURLE_COULDNT_CONNECT: CURLcode = 7
val CURLE_WEIRD_SERVER_REPLY: CURLcode = 8
val CURLE_REMOTE_ACCESS_DENIED: CURLcode = 9
val CURLE_FTP_ACCEPT_FAILED: CURLcode = 10
val CURLE_FTP_WEIRD_PASS_REPLY: CURLcode = 11
val CURLE_FTP_ACCEPT_TIMEOUT: CURLcode = 12
val CURLE_FTP_WEIRD_PASV_REPLY: CURLcode = 13
val CURLE_FTP_WEIRD_227_FORMAT: CURLcode = 14
val CURLE_FTP_CANT_GET_HOST: CURLcode = 15
val CURLE_HTTP2: CURLcode = 16
val CURLE_FTP_COULDNT_SET_TYPE: CURLcode = 17
val CURLE_PARTIAL_FILE: CURLcode = 18
val CURLE_FTP_COULDNT_RETR_FILE: CURLcode = 19
val CURLE_OBSOLETE20: CURLcode = 20
val CURLE_QUOTE_ERROR: CURLcode = 21
val CURLE_HTTP_RETURNED_ERROR: CURLcode = 22
val CURLE_WRITE_ERROR: CURLcode = 23
val CURLE_OBSOLETE24: CURLcode = 24
val CURLE_UPLOAD_FAILED: CURLcode = 25
val CURLE_READ_ERROR: CURLcode = 26
val CURLE_OUT_OF_MEMORY: CURLcode = 27
val CURLE_OPERATION_TIMEDOUT: CURLcode = 28
val CURLE_OBSOLETE29: CURLcode = 29
val CURLE_FTP_PORT_FAILED: CURLcode = 30
val CURLE_FTP_COULDNT_USE_REST: CURLcode = 31
val CURLE_OBSOLETE32: CURLcode = 32
val CURLE_RANGE_ERROR: CURLcode = 33
val CURLE_HTTP_POST_ERROR: CURLcode = 34
val CURLE_SSL_CONNECT_ERROR: CURLcode = 35
val CURLE_BAD_DOWNLOAD_RESUME: CURLcode = 36
val CURLE_FILE_COULDNT_READ_FILE: CURLcode = 37
val CURLE_LDAP_CANNOT_BIND: CURLcode = 38
val CURLE_LDAP_SEARCH_FAILED: CURLcode = 39
val CURLE_OBSOLETE40: CURLcode = 40
val CURLE_FUNCTION_NOT_FOUND: CURLcode = 41
val CURLE_ABORTED_BY_CALLBACK: CURLcode = 42
val CURLE_BAD_FUNCTION_ARGUMENT: CURLcode = 43
val CURLE_OBSOLETE44: CURLcode = 44
val CURLE_INTERFACE_FAILED: CURLcode = 45
val CURLE_OBSOLETE46: CURLcode = 46
val CURLE_TOO_MANY_REDIRECTS: CURLcode = 47
val CURLE_UNKNOWN_OPTION: CURLcode = 48
val CURLE_TELNET_OPTION_SYNTAX: CURLcode = 49
val CURLE_OBSOLETE50: CURLcode = 50
val CURLE_PEER_FAILED_VERIFICATION: CURLcode = 51
val CURLE_GOT_NOTHING: CURLcode = 52
val CURLE_SSL_ENGINE_NOTFOUND: CURLcode = 53
val CURLE_SSL_ENGINE_SETFAILED: CURLcode = 54
val CURLE_SEND_ERROR: CURLcode = 55
val CURLE_RECV_ERROR: CURLcode = 56
val CURLE_OBSOLETE57: CURLcode = 57
val CURLE_SSL_CERTPROBLEM: CURLcode = 58
val CURLE_SSL_CIPHER: CURLcode = 59
val CURLE_SSL_CACERT: CURLcode = 60
val CURLE_BAD_CONTENT_ENCODING: CURLcode = 61
val CURLE_LDAP_INVALID_URL: CURLcode = 62
val CURLE_FILESIZE_EXCEEDED: CURLcode = 63
val CURLE_USE_SSL_FAILED: CURLcode = 64
val CURLE_SEND_FAIL_REWIND: CURLcode = 65
val CURLE_SSL_ENGINE_INITFAILED: CURLcode = 66
val CURLE_LOGIN_DENIED: CURLcode = 67
val CURLE_TFTP_NOTFOUND: CURLcode = 68
val CURLE_TFTP_PERM: CURLcode = 69
val CURLE_REMOTE_DISK_FULL: CURLcode = 70
val CURLE_TFTP_ILLEGAL: CURLcode = 71
val CURLE_TFTP_UNKNOWNID: CURLcode = 72
val CURLE_REMOTE_FILE_EXISTS: CURLcode = 73
val CURLE_TFTP_NOSUCHUSER: CURLcode = 74
val CURLE_CONV_FAILED: CURLcode = 75
val CURLE_CONV_REQD: CURLcode = 76
val CURLE_SSL_CACERT_BADFILE: CURLcode = 77
val CURLE_REMOTE_FILE_NOT_FOUND: CURLcode = 78
val CURLE_SSH: CURLcode = 79
val CURLE_SSL_SHUTDOWN_FAILED: CURLcode = 80
val CURLE_AGAIN: CURLcode = 81
val CURLE_SSL_CRL_BADFILE: CURLcode = 82
val CURLE_SSL_ISSUER_ERROR: CURLcode = 83
val CURLE_FTP_PRET_FAILED: CURLcode = 84
val CURLE_RTSP_CSEQ_ERROR: CURLcode = 85
val CURLE_RTSP_SESSION_ERROR: CURLcode = 86
val CURLE_FTP_BAD_FILE_LIST: CURLcode = 87
val CURLE_CHUNK_FAILED: CURLcode = 88
val CURLE_NO_CONNECTION_AVAILABLE: CURLcode = 89
val CURLE_SSL_PINNEDPUBKEYNOTMATCH: CURLcode = 90
val CURLE_SSL_INVALIDCERTSTATUS: CURLcode = 91
val CURLE_HTTP2_STREAM: CURLcode = 92
val CURL_LAST: CURLcode = 93

typealias curl_proxytypeVar = IntVarOf<curl_proxytype>
typealias curl_proxytype = Int

val CURLPROXY_HTTP: curl_proxytype = 0
val CURLPROXY_HTTP_1_0: curl_proxytype = 1
val CURLPROXY_HTTPS: curl_proxytype = 2
val CURLPROXY_SOCKS4: curl_proxytype = 4
val CURLPROXY_SOCKS5: curl_proxytype = 5
val CURLPROXY_SOCKS4A: curl_proxytype = 6
val CURLPROXY_SOCKS5_HOSTNAME: curl_proxytype = 7

enum class curl_khtype(override val value: Int) : CEnum {
    CURLKHTYPE_UNKNOWN(0),
    CURLKHTYPE_RSA1(1),
    CURLKHTYPE_RSA(2),
    CURLKHTYPE_DSS(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_khtype.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_khtype
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_khstat(override val value: Int) : CEnum {
    CURLKHSTAT_FINE_ADD_TO_FILE(0),
    CURLKHSTAT_FINE(1),
    CURLKHSTAT_REJECT(2),
    CURLKHSTAT_DEFER(3),
    CURLKHSTAT_LAST(4),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_khstat.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_khstat
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_khmatch(override val value: Int) : CEnum {
    CURLKHMATCH_OK(0),
    CURLKHMATCH_MISMATCH(1),
    CURLKHMATCH_MISSING(2),
    CURLKHMATCH_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_khmatch.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_khmatch
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_usessl(override val value: Int) : CEnum {
    CURLUSESSL_NONE(0),
    CURLUSESSL_TRY(1),
    CURLUSESSL_CONTROL(2),
    CURLUSESSL_ALL(3),
    CURLUSESSL_LAST(4),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_usessl.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_usessl
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_ftpccc(override val value: Int) : CEnum {
    CURLFTPSSL_CCC_NONE(0),
    CURLFTPSSL_CCC_PASSIVE(1),
    CURLFTPSSL_CCC_ACTIVE(2),
    CURLFTPSSL_CCC_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_ftpccc.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_ftpccc
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_ftpauth(override val value: Int) : CEnum {
    CURLFTPAUTH_DEFAULT(0),
    CURLFTPAUTH_SSL(1),
    CURLFTPAUTH_TLS(2),
    CURLFTPAUTH_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_ftpauth.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_ftpauth
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_ftpcreatedir(override val value: Int) : CEnum {
    CURLFTP_CREATE_DIR_NONE(0),
    CURLFTP_CREATE_DIR(1),
    CURLFTP_CREATE_DIR_RETRY(2),
    CURLFTP_CREATE_DIR_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_ftpcreatedir.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_ftpcreatedir
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_ftpmethod(override val value: Int) : CEnum {
    CURLFTPMETHOD_DEFAULT(0),
    CURLFTPMETHOD_MULTICWD(1),
    CURLFTPMETHOD_NOCWD(2),
    CURLFTPMETHOD_SINGLECWD(3),
    CURLFTPMETHOD_LAST(4),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_ftpmethod.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_ftpmethod
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias CURLoptionVar = IntVarOf<CURLoption>
typealias CURLoption = Int

val CURLOPT_WRITEDATA: CURLoption = 10001
val CURLOPT_URL: CURLoption = 10002
val CURLOPT_PORT: CURLoption = 3
val CURLOPT_PROXY: CURLoption = 10004
val CURLOPT_USERPWD: CURLoption = 10005
val CURLOPT_PROXYUSERPWD: CURLoption = 10006
val CURLOPT_RANGE: CURLoption = 10007
val CURLOPT_READDATA: CURLoption = 10009
val CURLOPT_ERRORBUFFER: CURLoption = 10010
val CURLOPT_WRITEFUNCTION: CURLoption = 20011
val CURLOPT_READFUNCTION: CURLoption = 20012
val CURLOPT_TIMEOUT: CURLoption = 13
val CURLOPT_INFILESIZE: CURLoption = 14
val CURLOPT_POSTFIELDS: CURLoption = 10015
val CURLOPT_REFERER: CURLoption = 10016
val CURLOPT_FTPPORT: CURLoption = 10017
val CURLOPT_USERAGENT: CURLoption = 10018
val CURLOPT_LOW_SPEED_LIMIT: CURLoption = 19
val CURLOPT_LOW_SPEED_TIME: CURLoption = 20
val CURLOPT_RESUME_FROM: CURLoption = 21
val CURLOPT_COOKIE: CURLoption = 10022
val CURLOPT_HTTPHEADER: CURLoption = 10023
val CURLOPT_HTTPPOST: CURLoption = 10024
val CURLOPT_SSLCERT: CURLoption = 10025
val CURLOPT_KEYPASSWD: CURLoption = 10026
val CURLOPT_CRLF: CURLoption = 27
val CURLOPT_QUOTE: CURLoption = 10028
val CURLOPT_HEADERDATA: CURLoption = 10029
val CURLOPT_COOKIEFILE: CURLoption = 10031
val CURLOPT_SSLVERSION: CURLoption = 32
val CURLOPT_TIMECONDITION: CURLoption = 33
val CURLOPT_TIMEVALUE: CURLoption = 34
val CURLOPT_CUSTOMREQUEST: CURLoption = 10036
val CURLOPT_STDERR: CURLoption = 10037
val CURLOPT_POSTQUOTE: CURLoption = 10039
val CURLOPT_OBSOLETE40: CURLoption = 10040
val CURLOPT_VERBOSE: CURLoption = 41
val CURLOPT_HEADER: CURLoption = 42
val CURLOPT_NOPROGRESS: CURLoption = 43
val CURLOPT_NOBODY: CURLoption = 44
val CURLOPT_FAILONERROR: CURLoption = 45
val CURLOPT_UPLOAD: CURLoption = 46
val CURLOPT_POST: CURLoption = 47
val CURLOPT_DIRLISTONLY: CURLoption = 48
val CURLOPT_APPEND: CURLoption = 50
val CURLOPT_NETRC: CURLoption = 51
val CURLOPT_FOLLOWLOCATION: CURLoption = 52
val CURLOPT_TRANSFERTEXT: CURLoption = 53
val CURLOPT_PUT: CURLoption = 54
val CURLOPT_PROGRESSFUNCTION: CURLoption = 20056
val CURLOPT_PROGRESSDATA: CURLoption = 10057
val CURLOPT_AUTOREFERER: CURLoption = 58
val CURLOPT_PROXYPORT: CURLoption = 59
val CURLOPT_POSTFIELDSIZE: CURLoption = 60
val CURLOPT_HTTPPROXYTUNNEL: CURLoption = 61
val CURLOPT_INTERFACE: CURLoption = 10062
val CURLOPT_KRBLEVEL: CURLoption = 10063
val CURLOPT_SSL_VERIFYPEER: CURLoption = 64
val CURLOPT_CAINFO: CURLoption = 10065
val CURLOPT_MAXREDIRS: CURLoption = 68
val CURLOPT_FILETIME: CURLoption = 69
val CURLOPT_TELNETOPTIONS: CURLoption = 10070
val CURLOPT_MAXCONNECTS: CURLoption = 71
val CURLOPT_OBSOLETE72: CURLoption = 72
val CURLOPT_FRESH_CONNECT: CURLoption = 74
val CURLOPT_FORBID_REUSE: CURLoption = 75
val CURLOPT_RANDOM_FILE: CURLoption = 10076
val CURLOPT_EGDSOCKET: CURLoption = 10077
val CURLOPT_CONNECTTIMEOUT: CURLoption = 78
val CURLOPT_HEADERFUNCTION: CURLoption = 20079
val CURLOPT_HTTPGET: CURLoption = 80
val CURLOPT_SSL_VERIFYHOST: CURLoption = 81
val CURLOPT_COOKIEJAR: CURLoption = 10082
val CURLOPT_SSL_CIPHER_LIST: CURLoption = 10083
val CURLOPT_HTTP_VERSION: CURLoption = 84
val CURLOPT_FTP_USE_EPSV: CURLoption = 85
val CURLOPT_SSLCERTTYPE: CURLoption = 10086
val CURLOPT_SSLKEY: CURLoption = 10087
val CURLOPT_SSLKEYTYPE: CURLoption = 10088
val CURLOPT_SSLENGINE: CURLoption = 10089
val CURLOPT_SSLENGINE_DEFAULT: CURLoption = 90
val CURLOPT_DNS_USE_GLOBAL_CACHE: CURLoption = 91
val CURLOPT_DNS_CACHE_TIMEOUT: CURLoption = 92
val CURLOPT_PREQUOTE: CURLoption = 10093
val CURLOPT_DEBUGFUNCTION: CURLoption = 20094
val CURLOPT_DEBUGDATA: CURLoption = 10095
val CURLOPT_COOKIESESSION: CURLoption = 96
val CURLOPT_CAPATH: CURLoption = 10097
val CURLOPT_BUFFERSIZE: CURLoption = 98
val CURLOPT_NOSIGNAL: CURLoption = 99
val CURLOPT_SHARE: CURLoption = 10100
val CURLOPT_PROXYTYPE: CURLoption = 101
val CURLOPT_ACCEPT_ENCODING: CURLoption = 10102
val CURLOPT_PRIVATE: CURLoption = 10103
val CURLOPT_HTTP200ALIASES: CURLoption = 10104
val CURLOPT_UNRESTRICTED_AUTH: CURLoption = 105
val CURLOPT_FTP_USE_EPRT: CURLoption = 106
val CURLOPT_HTTPAUTH: CURLoption = 107
val CURLOPT_SSL_CTX_FUNCTION: CURLoption = 20108
val CURLOPT_SSL_CTX_DATA: CURLoption = 10109
val CURLOPT_FTP_CREATE_MISSING_DIRS: CURLoption = 110
val CURLOPT_PROXYAUTH: CURLoption = 111
val CURLOPT_FTP_RESPONSE_TIMEOUT: CURLoption = 112
val CURLOPT_IPRESOLVE: CURLoption = 113
val CURLOPT_MAXFILESIZE: CURLoption = 114
val CURLOPT_INFILESIZE_LARGE: CURLoption = 30115
val CURLOPT_RESUME_FROM_LARGE: CURLoption = 30116
val CURLOPT_MAXFILESIZE_LARGE: CURLoption = 30117
val CURLOPT_NETRC_FILE: CURLoption = 10118
val CURLOPT_USE_SSL: CURLoption = 119
val CURLOPT_POSTFIELDSIZE_LARGE: CURLoption = 30120
val CURLOPT_TCP_NODELAY: CURLoption = 121
val CURLOPT_FTPSSLAUTH: CURLoption = 129
val CURLOPT_IOCTLFUNCTION: CURLoption = 20130
val CURLOPT_IOCTLDATA: CURLoption = 10131
val CURLOPT_FTP_ACCOUNT: CURLoption = 10134
val CURLOPT_COOKIELIST: CURLoption = 10135
val CURLOPT_IGNORE_CONTENT_LENGTH: CURLoption = 136
val CURLOPT_FTP_SKIP_PASV_IP: CURLoption = 137
val CURLOPT_FTP_FILEMETHOD: CURLoption = 138
val CURLOPT_LOCALPORT: CURLoption = 139
val CURLOPT_LOCALPORTRANGE: CURLoption = 140
val CURLOPT_CONNECT_ONLY: CURLoption = 141
val CURLOPT_CONV_FROM_NETWORK_FUNCTION: CURLoption = 20142
val CURLOPT_CONV_TO_NETWORK_FUNCTION: CURLoption = 20143
val CURLOPT_CONV_FROM_UTF8_FUNCTION: CURLoption = 20144
val CURLOPT_MAX_SEND_SPEED_LARGE: CURLoption = 30145
val CURLOPT_MAX_RECV_SPEED_LARGE: CURLoption = 30146
val CURLOPT_FTP_ALTERNATIVE_TO_USER: CURLoption = 10147
val CURLOPT_SOCKOPTFUNCTION: CURLoption = 20148
val CURLOPT_SOCKOPTDATA: CURLoption = 10149
val CURLOPT_SSL_SESSIONID_CACHE: CURLoption = 150
val CURLOPT_SSH_AUTH_TYPES: CURLoption = 151
val CURLOPT_SSH_PUBLIC_KEYFILE: CURLoption = 10152
val CURLOPT_SSH_PRIVATE_KEYFILE: CURLoption = 10153
val CURLOPT_FTP_SSL_CCC: CURLoption = 154
val CURLOPT_TIMEOUT_MS: CURLoption = 155
val CURLOPT_CONNECTTIMEOUT_MS: CURLoption = 156
val CURLOPT_HTTP_TRANSFER_DECODING: CURLoption = 157
val CURLOPT_HTTP_CONTENT_DECODING: CURLoption = 158
val CURLOPT_NEW_FILE_PERMS: CURLoption = 159
val CURLOPT_NEW_DIRECTORY_PERMS: CURLoption = 160
val CURLOPT_POSTREDIR: CURLoption = 161
val CURLOPT_SSH_HOST_PUBLIC_KEY_MD5: CURLoption = 10162
val CURLOPT_OPENSOCKETFUNCTION: CURLoption = 20163
val CURLOPT_OPENSOCKETDATA: CURLoption = 10164
val CURLOPT_COPYPOSTFIELDS: CURLoption = 10165
val CURLOPT_PROXY_TRANSFER_MODE: CURLoption = 166
val CURLOPT_SEEKFUNCTION: CURLoption = 20167
val CURLOPT_SEEKDATA: CURLoption = 10168
val CURLOPT_CRLFILE: CURLoption = 10169
val CURLOPT_ISSUERCERT: CURLoption = 10170
val CURLOPT_ADDRESS_SCOPE: CURLoption = 171
val CURLOPT_CERTINFO: CURLoption = 172
val CURLOPT_USERNAME: CURLoption = 10173
val CURLOPT_PASSWORD: CURLoption = 10174
val CURLOPT_PROXYUSERNAME: CURLoption = 10175
val CURLOPT_PROXYPASSWORD: CURLoption = 10176
val CURLOPT_NOPROXY: CURLoption = 10177
val CURLOPT_TFTP_BLKSIZE: CURLoption = 178
val CURLOPT_SOCKS5_GSSAPI_SERVICE: CURLoption = 10179
val CURLOPT_SOCKS5_GSSAPI_NEC: CURLoption = 180
val CURLOPT_PROTOCOLS: CURLoption = 181
val CURLOPT_REDIR_PROTOCOLS: CURLoption = 182
val CURLOPT_SSH_KNOWNHOSTS: CURLoption = 10183
val CURLOPT_SSH_KEYFUNCTION: CURLoption = 20184
val CURLOPT_SSH_KEYDATA: CURLoption = 10185
val CURLOPT_MAIL_FROM: CURLoption = 10186
val CURLOPT_MAIL_RCPT: CURLoption = 10187
val CURLOPT_FTP_USE_PRET: CURLoption = 188
val CURLOPT_RTSP_REQUEST: CURLoption = 189
val CURLOPT_RTSP_SESSION_ID: CURLoption = 10190
val CURLOPT_RTSP_STREAM_URI: CURLoption = 10191
val CURLOPT_RTSP_TRANSPORT: CURLoption = 10192
val CURLOPT_RTSP_CLIENT_CSEQ: CURLoption = 193
val CURLOPT_RTSP_SERVER_CSEQ: CURLoption = 194
val CURLOPT_INTERLEAVEDATA: CURLoption = 10195
val CURLOPT_INTERLEAVEFUNCTION: CURLoption = 20196
val CURLOPT_WILDCARDMATCH: CURLoption = 197
val CURLOPT_CHUNK_BGN_FUNCTION: CURLoption = 20198
val CURLOPT_CHUNK_END_FUNCTION: CURLoption = 20199
val CURLOPT_FNMATCH_FUNCTION: CURLoption = 20200
val CURLOPT_CHUNK_DATA: CURLoption = 10201
val CURLOPT_FNMATCH_DATA: CURLoption = 10202
val CURLOPT_RESOLVE: CURLoption = 10203
val CURLOPT_TLSAUTH_USERNAME: CURLoption = 10204
val CURLOPT_TLSAUTH_PASSWORD: CURLoption = 10205
val CURLOPT_TLSAUTH_TYPE: CURLoption = 10206
val CURLOPT_TRANSFER_ENCODING: CURLoption = 207
val CURLOPT_CLOSESOCKETFUNCTION: CURLoption = 20208
val CURLOPT_CLOSESOCKETDATA: CURLoption = 10209
val CURLOPT_GSSAPI_DELEGATION: CURLoption = 210
val CURLOPT_DNS_SERVERS: CURLoption = 10211
val CURLOPT_ACCEPTTIMEOUT_MS: CURLoption = 212
val CURLOPT_TCP_KEEPALIVE: CURLoption = 213
val CURLOPT_TCP_KEEPIDLE: CURLoption = 214
val CURLOPT_TCP_KEEPINTVL: CURLoption = 215
val CURLOPT_SSL_OPTIONS: CURLoption = 216
val CURLOPT_MAIL_AUTH: CURLoption = 10217
val CURLOPT_SASL_IR: CURLoption = 218
val CURLOPT_XFERINFOFUNCTION: CURLoption = 20219
val CURLOPT_XOAUTH2_BEARER: CURLoption = 10220
val CURLOPT_DNS_INTERFACE: CURLoption = 10221
val CURLOPT_DNS_LOCAL_IP4: CURLoption = 10222
val CURLOPT_DNS_LOCAL_IP6: CURLoption = 10223
val CURLOPT_LOGIN_OPTIONS: CURLoption = 10224
val CURLOPT_SSL_ENABLE_NPN: CURLoption = 225
val CURLOPT_SSL_ENABLE_ALPN: CURLoption = 226
val CURLOPT_EXPECT_100_TIMEOUT_MS: CURLoption = 227
val CURLOPT_PROXYHEADER: CURLoption = 10228
val CURLOPT_HEADEROPT: CURLoption = 229
val CURLOPT_PINNEDPUBLICKEY: CURLoption = 10230
val CURLOPT_UNIX_SOCKET_PATH: CURLoption = 10231
val CURLOPT_SSL_VERIFYSTATUS: CURLoption = 232
val CURLOPT_SSL_FALSESTART: CURLoption = 233
val CURLOPT_PATH_AS_IS: CURLoption = 234
val CURLOPT_PROXY_SERVICE_NAME: CURLoption = 10235
val CURLOPT_SERVICE_NAME: CURLoption = 10236
val CURLOPT_PIPEWAIT: CURLoption = 237
val CURLOPT_DEFAULT_PROTOCOL: CURLoption = 10238
val CURLOPT_STREAM_WEIGHT: CURLoption = 239
val CURLOPT_STREAM_DEPENDS: CURLoption = 10240
val CURLOPT_STREAM_DEPENDS_E: CURLoption = 10241
val CURLOPT_TFTP_NO_OPTIONS: CURLoption = 242
val CURLOPT_CONNECT_TO: CURLoption = 10243
val CURLOPT_TCP_FASTOPEN: CURLoption = 244
val CURLOPT_KEEP_SENDING_ON_ERROR: CURLoption = 245
val CURLOPT_PROXY_CAINFO: CURLoption = 10246
val CURLOPT_PROXY_CAPATH: CURLoption = 10247
val CURLOPT_PROXY_SSL_VERIFYPEER: CURLoption = 248
val CURLOPT_PROXY_SSL_VERIFYHOST: CURLoption = 249
val CURLOPT_PROXY_SSLVERSION: CURLoption = 250
val CURLOPT_PROXY_TLSAUTH_USERNAME: CURLoption = 10251
val CURLOPT_PROXY_TLSAUTH_PASSWORD: CURLoption = 10252
val CURLOPT_PROXY_TLSAUTH_TYPE: CURLoption = 10253
val CURLOPT_PROXY_SSLCERT: CURLoption = 10254
val CURLOPT_PROXY_SSLCERTTYPE: CURLoption = 10255
val CURLOPT_PROXY_SSLKEY: CURLoption = 10256
val CURLOPT_PROXY_SSLKEYTYPE: CURLoption = 10257
val CURLOPT_PROXY_KEYPASSWD: CURLoption = 10258
val CURLOPT_PROXY_SSL_CIPHER_LIST: CURLoption = 10259
val CURLOPT_PROXY_CRLFILE: CURLoption = 10260
val CURLOPT_PROXY_SSL_OPTIONS: CURLoption = 261
val CURLOPT_PRE_PROXY: CURLoption = 10262
val CURLOPT_PROXY_PINNEDPUBLICKEY: CURLoption = 10263
val CURLOPT_ABSTRACT_UNIX_SOCKET: CURLoption = 10264
val CURLOPT_SUPPRESS_CONNECT_HEADERS: CURLoption = 265
val CURLOPT_LASTENTRY: CURLoption = 266

// enum (anonymous at /usr/include/curl/curl.h:1828:1):
val CURL_HTTP_VERSION_NONE: Int = 0
val CURL_HTTP_VERSION_1_0: Int = 1
val CURL_HTTP_VERSION_1_1: Int = 2
val CURL_HTTP_VERSION_2_0: Int = 3
val CURL_HTTP_VERSION_2TLS: Int = 4
val CURL_HTTP_VERSION_2_PRIOR_KNOWLEDGE: Int = 5
val CURL_HTTP_VERSION_LAST: Int = 6

// enum (anonymous at /usr/include/curl/curl.h:1850:1):
val CURL_RTSPREQ_NONE: Int = 0
val CURL_RTSPREQ_OPTIONS: Int = 1
val CURL_RTSPREQ_DESCRIBE: Int = 2
val CURL_RTSPREQ_ANNOUNCE: Int = 3
val CURL_RTSPREQ_SETUP: Int = 4
val CURL_RTSPREQ_PLAY: Int = 5
val CURL_RTSPREQ_PAUSE: Int = 6
val CURL_RTSPREQ_TEARDOWN: Int = 7
val CURL_RTSPREQ_GET_PARAMETER: Int = 8
val CURL_RTSPREQ_SET_PARAMETER: Int = 9
val CURL_RTSPREQ_RECORD: Int = 10
val CURL_RTSPREQ_RECEIVE: Int = 11
val CURL_RTSPREQ_LAST: Int = 12

enum class CURL_NETRC_OPTION(override val value: Int) : CEnum {
    CURL_NETRC_IGNORED(0),
    CURL_NETRC_OPTIONAL(1),
    CURL_NETRC_REQUIRED(2),
    CURL_NETRC_LAST(3),
    ;
    
    companion object {
        fun byValue(value: Int) = CURL_NETRC_OPTION.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURL_NETRC_OPTION
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

// enum (anonymous at /usr/include/curl/curl.h:1878:1):
val CURL_SSLVERSION_DEFAULT: Int = 0
val CURL_SSLVERSION_TLSv1: Int = 1
val CURL_SSLVERSION_SSLv2: Int = 2
val CURL_SSLVERSION_SSLv3: Int = 3
val CURL_SSLVERSION_TLSv1_0: Int = 4
val CURL_SSLVERSION_TLSv1_1: Int = 5
val CURL_SSLVERSION_TLSv1_2: Int = 6
val CURL_SSLVERSION_TLSv1_3: Int = 7
val CURL_SSLVERSION_LAST: Int = 8

// enum (anonymous at /usr/include/curl/curl.h:1891:1):
val CURL_SSLVERSION_MAX_NONE: Int = 0
val CURL_SSLVERSION_MAX_DEFAULT: Int = 65536
val CURL_SSLVERSION_MAX_TLSv1_0: Int = 262144
val CURL_SSLVERSION_MAX_TLSv1_1: Int = 327680
val CURL_SSLVERSION_MAX_TLSv1_2: Int = 393216
val CURL_SSLVERSION_MAX_TLSv1_3: Int = 458752
val CURL_SSLVERSION_MAX_LAST: Int = 524288

enum class CURL_TLSAUTH(override val value: Int) : CEnum {
    CURL_TLSAUTH_NONE(0),
    CURL_TLSAUTH_SRP(1),
    CURL_TLSAUTH_LAST(2),
    ;
    
    companion object {
        fun byValue(value: Int) = CURL_TLSAUTH.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURL_TLSAUTH
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class curl_TimeCond(override val value: Int) : CEnum {
    CURL_TIMECOND_NONE(0),
    CURL_TIMECOND_IFMODSINCE(1),
    CURL_TIMECOND_IFUNMODSINCE(2),
    CURL_TIMECOND_LASTMOD(3),
    CURL_TIMECOND_LAST(4),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_TimeCond.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_TimeCond
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class CURLformoption(override val value: Int) : CEnum {
    CURLFORM_NOTHING(0),
    CURLFORM_COPYNAME(1),
    CURLFORM_PTRNAME(2),
    CURLFORM_NAMELENGTH(3),
    CURLFORM_COPYCONTENTS(4),
    CURLFORM_PTRCONTENTS(5),
    CURLFORM_CONTENTSLENGTH(6),
    CURLFORM_FILECONTENT(7),
    CURLFORM_ARRAY(8),
    CURLFORM_OBSOLETE(9),
    CURLFORM_FILE(10),
    CURLFORM_BUFFER(11),
    CURLFORM_BUFFERPTR(12),
    CURLFORM_BUFFERLENGTH(13),
    CURLFORM_CONTENTTYPE(14),
    CURLFORM_CONTENTHEADER(15),
    CURLFORM_FILENAME(16),
    CURLFORM_END(17),
    CURLFORM_OBSOLETE2(18),
    CURLFORM_STREAM(19),
    CURLFORM_CONTENTLEN(20),
    CURLFORM_LASTENTRY(21),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLformoption.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLformoption
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class CURLFORMcode(override val value: Int) : CEnum {
    CURL_FORMADD_OK(0),
    CURL_FORMADD_MEMORY(1),
    CURL_FORMADD_OPTION_TWICE(2),
    CURL_FORMADD_NULL(3),
    CURL_FORMADD_UNKNOWN_OPTION(4),
    CURL_FORMADD_INCOMPLETE(5),
    CURL_FORMADD_ILLEGAL_ARRAY(6),
    CURL_FORMADD_DISABLED(7),
    CURL_FORMADD_LAST(8),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLFORMcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLFORMcode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias curl_sslbackendVar = IntVarOf<curl_sslbackend>
typealias curl_sslbackend = Int

val CURLSSLBACKEND_NONE: curl_sslbackend = 0
val CURLSSLBACKEND_OPENSSL: curl_sslbackend = 1
val CURLSSLBACKEND_GNUTLS: curl_sslbackend = 2
val CURLSSLBACKEND_NSS: curl_sslbackend = 3
val CURLSSLBACKEND_OBSOLETE4: curl_sslbackend = 4
val CURLSSLBACKEND_GSKIT: curl_sslbackend = 5
val CURLSSLBACKEND_POLARSSL: curl_sslbackend = 6
val CURLSSLBACKEND_CYASSL: curl_sslbackend = 7
val CURLSSLBACKEND_SCHANNEL: curl_sslbackend = 8
val CURLSSLBACKEND_DARWINSSL: curl_sslbackend = 9
val CURLSSLBACKEND_AXTLS: curl_sslbackend = 10
val CURLSSLBACKEND_MBEDTLS: curl_sslbackend = 11

typealias CURLINFOVar = IntVarOf<CURLINFO>
typealias CURLINFO = Int

val CURLINFO_NONE: CURLINFO = 0
val CURLINFO_EFFECTIVE_URL: CURLINFO = 1048577
val CURLINFO_RESPONSE_CODE: CURLINFO = 2097154
val CURLINFO_TOTAL_TIME: CURLINFO = 3145731
val CURLINFO_NAMELOOKUP_TIME: CURLINFO = 3145732
val CURLINFO_CONNECT_TIME: CURLINFO = 3145733
val CURLINFO_PRETRANSFER_TIME: CURLINFO = 3145734
val CURLINFO_SIZE_UPLOAD: CURLINFO = 3145735
val CURLINFO_SIZE_DOWNLOAD: CURLINFO = 3145736
val CURLINFO_SPEED_DOWNLOAD: CURLINFO = 3145737
val CURLINFO_SPEED_UPLOAD: CURLINFO = 3145738
val CURLINFO_HEADER_SIZE: CURLINFO = 2097163
val CURLINFO_REQUEST_SIZE: CURLINFO = 2097164
val CURLINFO_SSL_VERIFYRESULT: CURLINFO = 2097165
val CURLINFO_FILETIME: CURLINFO = 2097166
val CURLINFO_CONTENT_LENGTH_DOWNLOAD: CURLINFO = 3145743
val CURLINFO_CONTENT_LENGTH_UPLOAD: CURLINFO = 3145744
val CURLINFO_STARTTRANSFER_TIME: CURLINFO = 3145745
val CURLINFO_CONTENT_TYPE: CURLINFO = 1048594
val CURLINFO_REDIRECT_TIME: CURLINFO = 3145747
val CURLINFO_REDIRECT_COUNT: CURLINFO = 2097172
val CURLINFO_PRIVATE: CURLINFO = 1048597
val CURLINFO_HTTP_CONNECTCODE: CURLINFO = 2097174
val CURLINFO_HTTPAUTH_AVAIL: CURLINFO = 2097175
val CURLINFO_PROXYAUTH_AVAIL: CURLINFO = 2097176
val CURLINFO_OS_ERRNO: CURLINFO = 2097177
val CURLINFO_NUM_CONNECTS: CURLINFO = 2097178
val CURLINFO_SSL_ENGINES: CURLINFO = 4194331
val CURLINFO_COOKIELIST: CURLINFO = 4194332
val CURLINFO_LASTSOCKET: CURLINFO = 2097181
val CURLINFO_FTP_ENTRY_PATH: CURLINFO = 1048606
val CURLINFO_REDIRECT_URL: CURLINFO = 1048607
val CURLINFO_PRIMARY_IP: CURLINFO = 1048608
val CURLINFO_APPCONNECT_TIME: CURLINFO = 3145761
val CURLINFO_CERTINFO: CURLINFO = 4194338
val CURLINFO_CONDITION_UNMET: CURLINFO = 2097187
val CURLINFO_RTSP_SESSION_ID: CURLINFO = 1048612
val CURLINFO_RTSP_CLIENT_CSEQ: CURLINFO = 2097189
val CURLINFO_RTSP_SERVER_CSEQ: CURLINFO = 2097190
val CURLINFO_RTSP_CSEQ_RECV: CURLINFO = 2097191
val CURLINFO_PRIMARY_PORT: CURLINFO = 2097192
val CURLINFO_LOCAL_IP: CURLINFO = 1048617
val CURLINFO_LOCAL_PORT: CURLINFO = 2097194
val CURLINFO_TLS_SESSION: CURLINFO = 4194347
val CURLINFO_ACTIVESOCKET: CURLINFO = 5242924
val CURLINFO_TLS_SSL_PTR: CURLINFO = 4194349
val CURLINFO_HTTP_VERSION: CURLINFO = 2097198
val CURLINFO_PROXY_SSL_VERIFYRESULT: CURLINFO = 2097199
val CURLINFO_PROTOCOL: CURLINFO = 2097200
val CURLINFO_SCHEME: CURLINFO = 1048625
val CURLINFO_LASTONE: CURLINFO = 49

enum class curl_closepolicy(override val value: Int) : CEnum {
    CURLCLOSEPOLICY_NONE(0),
    CURLCLOSEPOLICY_OLDEST(1),
    CURLCLOSEPOLICY_LEAST_RECENTLY_USED(2),
    CURLCLOSEPOLICY_LEAST_TRAFFIC(3),
    CURLCLOSEPOLICY_SLOWEST(4),
    CURLCLOSEPOLICY_CALLBACK(5),
    CURLCLOSEPOLICY_LAST(6),
    ;
    
    companion object {
        fun byValue(value: Int) = curl_closepolicy.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: curl_closepolicy
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias curl_lock_dataVar = IntVarOf<curl_lock_data>
typealias curl_lock_data = Int

val CURL_LOCK_DATA_NONE: curl_lock_data = 0
val CURL_LOCK_DATA_SHARE: curl_lock_data = 1
val CURL_LOCK_DATA_COOKIE: curl_lock_data = 2
val CURL_LOCK_DATA_DNS: curl_lock_data = 3
val CURL_LOCK_DATA_SSL_SESSION: curl_lock_data = 4
val CURL_LOCK_DATA_CONNECT: curl_lock_data = 5
val CURL_LOCK_DATA_LAST: curl_lock_data = 6

typealias curl_lock_accessVar = IntVarOf<curl_lock_access>
typealias curl_lock_access = Int

val CURL_LOCK_ACCESS_NONE: curl_lock_access = 0
val CURL_LOCK_ACCESS_SHARED: curl_lock_access = 1
val CURL_LOCK_ACCESS_SINGLE: curl_lock_access = 2
val CURL_LOCK_ACCESS_LAST: curl_lock_access = 3

enum class CURLSHcode(override val value: Int) : CEnum {
    CURLSHE_OK(0),
    CURLSHE_BAD_OPTION(1),
    CURLSHE_IN_USE(2),
    CURLSHE_INVALID(3),
    CURLSHE_NOMEM(4),
    CURLSHE_NOT_BUILT_IN(5),
    CURLSHE_LAST(6),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLSHcode.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLSHcode
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class CURLSHoption(override val value: Int) : CEnum {
    CURLSHOPT_NONE(0),
    CURLSHOPT_SHARE(1),
    CURLSHOPT_UNSHARE(2),
    CURLSHOPT_LOCKFUNC(3),
    CURLSHOPT_UNLOCKFUNC(4),
    CURLSHOPT_USERDATA(5),
    CURLSHOPT_LAST(6),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLSHoption.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLSHoption
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

enum class CURLversion(override val value: Int) : CEnum {
    CURLVERSION_FIRST(0),
    CURLVERSION_SECOND(1),
    CURLVERSION_THIRD(2),
    CURLVERSION_FOURTH(3),
    CURLVERSION_LAST(4),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLversion.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLversion
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias CURLMcodeVar = IntVarOf<CURLMcode>
typealias CURLMcode = Int

val CURLM_CALL_MULTI_PERFORM: CURLMcode = -1
val CURLM_OK: CURLMcode = 0
val CURLM_BAD_HANDLE: CURLMcode = 1
val CURLM_BAD_EASY_HANDLE: CURLMcode = 2
val CURLM_OUT_OF_MEMORY: CURLMcode = 3
val CURLM_INTERNAL_ERROR: CURLMcode = 4
val CURLM_BAD_SOCKET: CURLMcode = 5
val CURLM_UNKNOWN_OPTION: CURLMcode = 6
val CURLM_ADDED_ALREADY: CURLMcode = 7
val CURLM_LAST: CURLMcode = 8

enum class CURLMSG(override val value: Int) : CEnum {
    CURLMSG_NONE(0),
    CURLMSG_DONE(1),
    CURLMSG_LAST(2),
    ;
    
    companion object {
        fun byValue(value: Int) = CURLMSG.values().find { it.value == value }!!
    }
    
    class Var(rawPtr: NativePtr) : CEnumVar(rawPtr) {
        companion object : Type(IntVar.size.toInt())
        var value: CURLMSG
            get() = byValue(this.reinterpret<IntVar>().value)
            set(value) { this.reinterpret<IntVar>().value = value.value }
    }
}

typealias CURLMoptionVar = IntVarOf<CURLMoption>
typealias CURLMoption = Int

val CURLMOPT_SOCKETFUNCTION: CURLMoption = 20001
val CURLMOPT_SOCKETDATA: CURLMoption = 10002
val CURLMOPT_PIPELINING: CURLMoption = 3
val CURLMOPT_TIMERFUNCTION: CURLMoption = 20004
val CURLMOPT_TIMERDATA: CURLMoption = 10005
val CURLMOPT_MAXCONNECTS: CURLMoption = 6
val CURLMOPT_MAX_HOST_CONNECTIONS: CURLMoption = 7
val CURLMOPT_MAX_PIPELINE_LENGTH: CURLMoption = 8
val CURLMOPT_CONTENT_LENGTH_PENALTY_SIZE: CURLMoption = 30009
val CURLMOPT_CHUNK_LENGTH_PENALTY_SIZE: CURLMoption = 30010
val CURLMOPT_PIPELINING_SITE_BL: CURLMoption = 10011
val CURLMOPT_PIPELINING_SERVER_BL: CURLMoption = 10012
val CURLMOPT_MAX_TOTAL_CONNECTIONS: CURLMoption = 13
val CURLMOPT_PUSHFUNCTION: CURLMoption = 20014
val CURLMOPT_PUSHDATA: CURLMoption = 10015
val CURLMOPT_LASTENTRY: CURLMoption = 10016

typealias __uint32_tVar = IntVarOf<__uint32_t>
typealias __uint32_t = Int

typealias __darwin_socklen_tVar = IntVarOf<__darwin_socklen_t>
typealias __darwin_socklen_t = __uint32_t

typealias socklen_tVar = IntVarOf<socklen_t>
typealias socklen_t = __darwin_socklen_t

typealias curlsys_socklen_tVar = IntVarOf<curlsys_socklen_t>
typealias curlsys_socklen_t = socklen_t

typealias curlsys_off_tVar = LongVarOf<curlsys_off_t>
typealias curlsys_off_t = Long

typealias curl_socklen_tVar = IntVarOf<curl_socklen_t>
typealias curl_socklen_t = socklen_t

typealias int64_tVar = LongVarOf<int64_t>
typealias int64_t = Long

typealias curl_off_tVar = LongVarOf<curl_off_t>
typealias curl_off_t = int64_t

typealias __curl_rule_01__Var = CPointerVarOf<__curl_rule_01__>
typealias __curl_rule_01__ = CArrayPointer<ByteVar>

typealias __curl_rule_02__Var = CPointerVarOf<__curl_rule_02__>
typealias __curl_rule_02__ = CArrayPointer<ByteVar>

typealias __curl_rule_03__Var = CPointerVarOf<__curl_rule_03__>
typealias __curl_rule_03__ = CArrayPointer<ByteVar>

typealias __curl_rule_04__Var = CPointerVarOf<__curl_rule_04__>
typealias __curl_rule_04__ = CArrayPointer<ByteVar>

typealias __curl_rule_05__Var = CPointerVarOf<__curl_rule_05__>
typealias __curl_rule_05__ = CArrayPointer<ByteVar>

typealias curl_socket_tVar = IntVarOf<curl_socket_t>
typealias curl_socket_t = Int

typealias curl_progress_callbackVar = CPointerVarOf<curl_progress_callback>
typealias curl_progress_callback = CPointer<CFunction<(COpaquePointer?, Double, Double, Double, Double) -> Int>>

typealias curl_xferinfo_callbackVar = CPointerVarOf<curl_xferinfo_callback>
typealias curl_xferinfo_callback = CPointer<CFunction<(COpaquePointer?, curl_off_t, curl_off_t, curl_off_t, curl_off_t) -> Int>>

typealias __darwin_size_tVar = LongVarOf<__darwin_size_t>
typealias __darwin_size_t = Long

typealias size_tVar = LongVarOf<size_t>
typealias size_t = __darwin_size_t

typealias curl_write_callbackVar = CPointerVarOf<curl_write_callback>
typealias curl_write_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t, size_t, COpaquePointer?) -> size_t>>

typealias __darwin_time_tVar = LongVarOf<__darwin_time_t>
typealias __darwin_time_t = Long

typealias time_tVar = LongVarOf<time_t>
typealias time_t = __darwin_time_t

typealias curl_chunk_bgn_callbackVar = CPointerVarOf<curl_chunk_bgn_callback>
typealias curl_chunk_bgn_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, Int) -> Long>>

typealias curl_chunk_end_callbackVar = CPointerVarOf<curl_chunk_end_callback>
typealias curl_chunk_end_callback = CPointer<CFunction<(COpaquePointer?) -> Long>>

typealias curl_fnmatch_callbackVar = CPointerVarOf<curl_fnmatch_callback>
typealias curl_fnmatch_callback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, CPointer<ByteVar>?) -> Int>>

typealias curl_seek_callbackVar = CPointerVarOf<curl_seek_callback>
typealias curl_seek_callback = CPointer<CFunction<(COpaquePointer?, curl_off_t, Int) -> Int>>

typealias curl_read_callbackVar = CPointerVarOf<curl_read_callback>
typealias curl_read_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t, size_t, COpaquePointer?) -> size_t>>

typealias curl_sockopt_callbackVar = CPointerVarOf<curl_sockopt_callback>
typealias curl_sockopt_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t, curlsocktype) -> Int>>

typealias __uint8_tVar = ByteVarOf<__uint8_t>
typealias __uint8_t = Byte

typealias sa_family_tVar = ByteVarOf<sa_family_t>
typealias sa_family_t = __uint8_t

typealias curl_opensocket_callbackVar = CPointerVarOf<curl_opensocket_callback>
typealias curl_opensocket_callback = CPointer<CFunction<(COpaquePointer?, curlsocktype, CPointer<curl_sockaddr>?) -> curl_socket_t>>

typealias curl_closesocket_callbackVar = CPointerVarOf<curl_closesocket_callback>
typealias curl_closesocket_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t) -> Int>>

typealias curl_ioctl_callbackVar = CPointerVarOf<curl_ioctl_callback>
typealias curl_ioctl_callback = CPointer<CFunction<(COpaquePointer?, Int, COpaquePointer?) -> curlioerr>>

typealias curl_malloc_callbackVar = CPointerVarOf<curl_malloc_callback>
typealias curl_malloc_callback = CPointer<CFunction<(size_t) -> COpaquePointer?>>

typealias curl_free_callbackVar = CPointerVarOf<curl_free_callback>
typealias curl_free_callback = CPointer<CFunction<(COpaquePointer?) -> Unit>>

typealias curl_realloc_callbackVar = CPointerVarOf<curl_realloc_callback>
typealias curl_realloc_callback = CPointer<CFunction<(COpaquePointer?, size_t) -> COpaquePointer?>>

typealias curl_strdup_callbackVar = CPointerVarOf<curl_strdup_callback>
typealias curl_strdup_callback = CPointer<CFunction<(CPointer<ByteVar>?) -> CPointer<ByteVar>?>>

typealias curl_calloc_callbackVar = CPointerVarOf<curl_calloc_callback>
typealias curl_calloc_callback = CPointer<CFunction<(size_t, size_t) -> COpaquePointer?>>

typealias curl_debug_callbackVar = CPointerVarOf<curl_debug_callback>
typealias curl_debug_callback = CPointer<CFunction<(COpaquePointer?, curl_infotype, CPointer<ByteVar>?, size_t, COpaquePointer?) -> Int>>

typealias curl_conv_callbackVar = CPointerVarOf<curl_conv_callback>
typealias curl_conv_callback = CPointer<CFunction<(CPointer<ByteVar>?, size_t) -> CURLcode>>

typealias curl_ssl_ctx_callbackVar = CPointerVarOf<curl_ssl_ctx_callback>
typealias curl_ssl_ctx_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, COpaquePointer?) -> CURLcode>>

typealias curl_sshkeycallbackVar = CPointerVarOf<curl_sshkeycallback>
typealias curl_sshkeycallback = CPointer<CFunction<(COpaquePointer?, CPointer<curl_khkey>?, CPointer<curl_khkey>?, curl_khmatch, COpaquePointer?) -> Int>>

typealias curl_formget_callbackVar = CPointerVarOf<curl_formget_callback>
typealias curl_formget_callback = CPointer<CFunction<(COpaquePointer?, CPointer<ByteVar>?, size_t) -> size_t>>

typealias curl_lock_functionVar = CPointerVarOf<curl_lock_function>
typealias curl_lock_function = CPointer<CFunction<(COpaquePointer?, curl_lock_data, curl_lock_access, COpaquePointer?) -> Unit>>

typealias curl_unlock_functionVar = CPointerVarOf<curl_unlock_function>
typealias curl_unlock_function = CPointer<CFunction<(COpaquePointer?, curl_lock_data, COpaquePointer?) -> Unit>>

typealias __int32_tVar = IntVarOf<__int32_t>
typealias __int32_t = Int

typealias curl_socket_callbackVar = CPointerVarOf<curl_socket_callback>
typealias curl_socket_callback = CPointer<CFunction<(COpaquePointer?, curl_socket_t, Int, COpaquePointer?, COpaquePointer?) -> Int>>

typealias curl_multi_timer_callbackVar = CPointerVarOf<curl_multi_timer_callback>
typealias curl_multi_timer_callback = CPointer<CFunction<(COpaquePointer?, Long, COpaquePointer?) -> Int>>

typealias curl_push_callbackVar = CPointerVarOf<curl_push_callback>
typealias curl_push_callback = CPointer<CFunction<(COpaquePointer?, COpaquePointer?, size_t, CPointer<curl_pushheaders>?, COpaquePointer?) -> Int>>

@SymbolName("libcurl_kniBridge0")
private external fun kniBridge0(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge1")
private external fun kniBridge1(p0: NativePtr, p1: NativePtr, p2: Long): Int
@SymbolName("libcurl_kniBridge2")
private external fun kniBridge2(): NativePtr
@SymbolName("libcurl_kniBridge3")
private external fun kniBridge3(p0: NativePtr, p1: NativePtr, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge4")
private external fun kniBridge4(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge5")
private external fun kniBridge5(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge6")
private external fun kniBridge6(): NativePtr
@SymbolName("libcurl_kniBridge7")
private external fun kniBridge7(p0: NativePtr, p1: NativePtr, p2: Int): NativePtr
@SymbolName("libcurl_kniBridge8")
private external fun kniBridge8(p0: NativePtr, p1: Int): NativePtr
@SymbolName("libcurl_kniBridge9")
private external fun kniBridge9(p0: NativePtr, p1: NativePtr, p2: Int, p3: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge10")
private external fun kniBridge10(p0: NativePtr, p1: Int): NativePtr
@SymbolName("libcurl_kniBridge11")
private external fun kniBridge11(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge12")
private external fun kniBridge12(p0: Long): Int
@SymbolName("libcurl_kniBridge13")
private external fun kniBridge13(p0: Long, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr, p5: NativePtr): Int
@SymbolName("libcurl_kniBridge14")
private external fun kniBridge14(): Unit
@SymbolName("libcurl_kniBridge15")
private external fun kniBridge15(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge16")
private external fun kniBridge16(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge17")
private external fun kniBridge17(p0: NativePtr, p1: NativePtr): Long
@SymbolName("libcurl_kniBridge18")
private external fun kniBridge18(): NativePtr
@SymbolName("libcurl_kniBridge19")
private external fun kniBridge19(): NativePtr
@SymbolName("libcurl_kniBridge20")
private external fun kniBridge20(p0: NativePtr): Int
@SymbolName("libcurl_kniBridge21")
private external fun kniBridge21(p0: Int): NativePtr
@SymbolName("libcurl_kniBridge22")
private external fun kniBridge22(p0: Int): NativePtr
@SymbolName("libcurl_kniBridge23")
private external fun kniBridge23(p0: Int): NativePtr
@SymbolName("libcurl_kniBridge24")
private external fun kniBridge24(p0: NativePtr, p1: Int): Int
@SymbolName("libcurl_kniBridge25")
private external fun kniBridge25(): NativePtr
@SymbolName("libcurl_kniBridge26")
private external fun kniBridge26(): NativePtr
@SymbolName("libcurl_kniBridge27")
private external fun kniBridge27(p0: NativePtr): Int
@SymbolName("libcurl_kniBridge28")
private external fun kniBridge28(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge29")
private external fun kniBridge29(): NativePtr
@SymbolName("libcurl_kniBridge30")
private external fun kniBridge30(p0: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge31")
private external fun kniBridge31(p0: NativePtr): Unit
@SymbolName("libcurl_kniBridge32")
private external fun kniBridge32(p0: NativePtr, p1: NativePtr, p2: Long, p3: NativePtr): Int
@SymbolName("libcurl_kniBridge33")
private external fun kniBridge33(p0: NativePtr, p1: NativePtr, p2: Long, p3: NativePtr): Int
@SymbolName("libcurl_kniBridge34")
private external fun kniBridge34(): NativePtr
@SymbolName("libcurl_kniBridge35")
private external fun kniBridge35(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge36")
private external fun kniBridge36(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge37")
private external fun kniBridge37(p0: NativePtr, p1: NativePtr, p2: NativePtr, p3: NativePtr, p4: NativePtr): Int
@SymbolName("libcurl_kniBridge38")
private external fun kniBridge38(p0: NativePtr, p1: NativePtr, p2: Int, p3: Int, p4: NativePtr): Int
@SymbolName("libcurl_kniBridge39")
private external fun kniBridge39(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge40")
private external fun kniBridge40(p0: NativePtr): Int
@SymbolName("libcurl_kniBridge41")
private external fun kniBridge41(p0: NativePtr, p1: NativePtr): NativePtr
@SymbolName("libcurl_kniBridge42")
private external fun kniBridge42(p0: Int): NativePtr
@SymbolName("libcurl_kniBridge43")
private external fun kniBridge43(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge44")
private external fun kniBridge44(p0: NativePtr, p1: Int, p2: Int, p3: NativePtr): Int
@SymbolName("libcurl_kniBridge45")
private external fun kniBridge45(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge46")
private external fun kniBridge46(p0: NativePtr, p1: NativePtr): Int
@SymbolName("libcurl_kniBridge47")
private external fun kniBridge47(): NativePtr
@SymbolName("libcurl_kniBridge48")
private external fun kniBridge48(p0: NativePtr, p1: Int, p2: NativePtr): Int
@SymbolName("libcurl_kniBridge49")
private external fun kniBridge49(p0: NativePtr, p1: Long): NativePtr
@SymbolName("libcurl_kniBridge50")
private external fun kniBridge50(p0: NativePtr, p1: NativePtr): NativePtr

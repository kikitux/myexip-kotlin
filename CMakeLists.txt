cmake_minimum_required(VERSION 3.5)

set(CMAKE_MODULE_PATH ${CMAKE_CURRENT_LIST_DIR}/KotlinCMakeModule)

project(myexip Kotlin)

set(CURL_LIBRARY "-lcurl")
find_package(CURL REQUIRED)

cinterop(
        NAME curl_kt
        DEF_FILE src/c_interop/libcurl.def
        COMPILER_OPTS "-I ${CURL_INCLUDE_DIR}"
)

konanc_executable(
        NAME myexip
        SOURCES src/kotlin/
        LIBRARIES curl_kt
        LINKER_OPTS "${CURL_LIBRARY}"
)

# myexip

## how to build

### command line

pre-requirements:
- `cmake` and `make`
- `java`
- kotlin native: `kotlinc` and `cinterop` binaries in the path

ie:
```
which cinterop konanc java cmake make
/usr/local/bin/cinterop
/usr/local/bin/konanc
/usr/bin/java
/usr/local/bin/cmake
/usr/bin/make
```

clone and build:
```
git clone https://github.com/kikitux/myexip-kotlin
mkdir myexip-kotlin/build
cd myexip-kotlin/build
cmake ..
make
```

sample output:
```
0  $ cd Downloads/
0  $ git clone https://github.com/kikitux/myexip-kotlin
remote: Counting objects: 171, done.
remote: Compressing objects: 100% (99/99), done.
remote: Total 171 (delta 54), reused 151 (delta 37), pack-reused 0
Receiving objects: 100% (171/171), 3.84 MiB | 854.00 KiB/s, done.
Resolving deltas: 100% (54/54), done.
0  $ mkdir myexip-kotlin/build
0  $ cd myexip-kotlin/build
0  (master) $ cmake ..
-- Found CURL: -lcurl (found version "7.54.0") 
-- Configuring done
-- Generating done
-- Build files have been written to: /Users/kikitux/Downloads/myexip-kotlin/build
0  (master) $ make
Scanning dependencies of target curl_kt
[ 33%] Generating CMakeFiles/libs/curl_kt.klib
Downloading native dependencies (LLVM, sysroot etc). This is a one-time action performed only on the first run of the compiler.
Downloading dependency: https://download.jetbrains.com/kotlin/native/libffi-3.2.1-2-darwin-macos.tar.gz (27.6 kiB/27.6 kiB). Done.
Extracting dependency: /Users/kikitux/.konan/cache/libffi-3.2.1-2-darwin-macos.tar.gz into /Users/kikitux/.konan/dependencies
Downloading dependency: https://download.jetbrains.com/kotlin/native/clang-llvm-5.0.0-darwin-macos.tar.gz (374.1 MiB/374.1 MiB). Done.
Extracting dependency: /Users/kikitux/.konan/cache/clang-llvm-5.0.0-darwin-macos.tar.gz into /Users/kikitux/.konan/dependencies
KtFile: libcurl.kt
[ 33%] Built target curl_kt
Scanning dependencies of target myexip.compile
[ 66%] Generating CMakeFiles/myexip_TEMP.kexe
KtFile: main.kt
KtFile: CUrl.kt
KtFile: Event.kt
KtFile: Program.kt
[ 66%] Built target myexip.compile
Scanning dependencies of target myexip.kexe
[100%] Linking Kotlin executable myexip.kexe
[100%] Built target myexip.kexe
0  (master) $ 
```



todo:
- this readme


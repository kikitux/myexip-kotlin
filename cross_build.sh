#!/usr/bin/env bash

DIR=$(cd "$(dirname "${BASH_SOURCE[0]}" )" && pwd )

INTEROP_ARGS_macbook="-headerFilterAdditionalSearchPrefix /opt/local/include"
INTEROP_ARGS_linux="-headerFilterAdditionalSearchPrefix /usr/include \
                    -headerFilterAdditionalSearchPrefix /usr/include/x86_64-linux-gnu"

INTEROP_ARGS_linux_mipsel32="-headerFilterAdditionalSearchPrefix /usr/include \
                             -headerFilterAdditionalSearchPrefix /usr/include/mipsel-linux-gnu"

COMPILER_ARGS_linux_mipsel32="-linkerOpts -lcurl -linkerOpts -L/usr/lib/mipsel-linux-gnu"

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=INTEROP_ARGS_${TARGET}
INTEROP_ARGS=${!var}
unset var

var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var}

COMPILER_ARGS="${COMPILER_ARGS} -verbose" # add -opt for an optimized build.

mkdir -p $DIR/build/c_interop/
mkdir -p $DIR/build/bin/

cinterop $INTEROP_ARGS -def $DIR/src/main/c_interop/libcurl.def -target $TARGET \
	 -o $DIR/build/c_interop/libcurl || exit 1

konanc $COMPILER_ARGS -target $TARGET $DIR/src/main/kotlin -library $DIR/build/c_interop/libcurl \
       -o $DIR/build/bin/myexip || exit 1

echo "Artifact path is $DIR/build/bin/myexip.kexe"

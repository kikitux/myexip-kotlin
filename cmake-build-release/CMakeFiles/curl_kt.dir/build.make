# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.9

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Remove some rules from gmake that .SUFFIXES does not remove.
SUFFIXES =

.SUFFIXES: .hpux_make_needs_suffix_list


# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = "/Users/kikitux/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/173.4301.33/CLion.app/Contents/bin/cmake/bin/cmake"

# The command to remove a file.
RM = "/Users/kikitux/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/173.4301.33/CLion.app/Contents/bin/cmake/bin/cmake" -E remove -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = /Users/kikitux/Desktop/myexip/myexip-kotlin

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release

# Utility rule file for curl_kt.

# Include the progress variables for this target.
include CMakeFiles/curl_kt.dir/progress.make

CMakeFiles/curl_kt: CMakeFiles/libs/curl_kt.klib


CMakeFiles/libs/curl_kt.klib: ../src/c_interop/libcurl.def
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --blue --bold --progress-dir=/Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Generating CMakeFiles/libs/curl_kt.klib"
	/Users/kikitux/.konan/kotlin-native-macos-0.5/bin/cinterop -compilerOpts -I\ /usr/include -def /Users/kikitux/Desktop/myexip/myexip-kotlin/src/c_interop/libcurl.def -target macbook -r /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles/libs/ -o /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles/libs//curl_kt.klib

curl_kt: CMakeFiles/curl_kt
curl_kt: CMakeFiles/libs/curl_kt.klib
curl_kt: CMakeFiles/curl_kt.dir/build.make

.PHONY : curl_kt

# Rule to build all files generated by this target.
CMakeFiles/curl_kt.dir/build: curl_kt

.PHONY : CMakeFiles/curl_kt.dir/build

CMakeFiles/curl_kt.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/curl_kt.dir/cmake_clean.cmake
.PHONY : CMakeFiles/curl_kt.dir/clean

CMakeFiles/curl_kt.dir/depend:
	cd /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/kikitux/Desktop/myexip/myexip-kotlin /Users/kikitux/Desktop/myexip/myexip-kotlin /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles/curl_kt.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/curl_kt.dir/depend

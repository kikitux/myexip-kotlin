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

# Include any dependencies generated for this target.
include CMakeFiles/myexip.kexe.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/myexip.kexe.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/myexip.kexe.dir/flags.make

# Object files for target myexip.kexe
myexip_kexe_OBJECTS =

# External object files for target myexip.kexe
myexip_kexe_EXTERNAL_OBJECTS =

myexip.kexe: CMakeFiles/myexip.kexe.dir/build.make
myexip.kexe: CMakeFiles/myexip.kexe.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir=/Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles --progress-num=$(CMAKE_PROGRESS_1) "Linking Kotlin executable myexip.kexe"
	"/Users/kikitux/Library/Application Support/JetBrains/Toolbox/apps/CLion/ch-0/173.4301.33/CLion.app/Contents/bin/cmake/bin/cmake" -E copy /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles/myexip_TEMP.kexe /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/myexip.kexe
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/myexip.kexe.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/myexip.kexe.dir/build: myexip.kexe

.PHONY : CMakeFiles/myexip.kexe.dir/build

CMakeFiles/myexip.kexe.dir/requires:

.PHONY : CMakeFiles/myexip.kexe.dir/requires

CMakeFiles/myexip.kexe.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/myexip.kexe.dir/cmake_clean.cmake
.PHONY : CMakeFiles/myexip.kexe.dir/clean

CMakeFiles/myexip.kexe.dir/depend:
	cd /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" /Users/kikitux/Desktop/myexip/myexip-kotlin /Users/kikitux/Desktop/myexip/myexip-kotlin /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release /Users/kikitux/Desktop/myexip/myexip-kotlin/cmake-build-release/CMakeFiles/myexip.kexe.dir/DependInfo.cmake --color=$(COLOR)
.PHONY : CMakeFiles/myexip.kexe.dir/depend

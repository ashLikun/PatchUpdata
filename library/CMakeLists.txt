# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.4.1)

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.
#设置生成的so动态库最后输出的路径
set(CMAKE_LIBRARY_OUTPUT_DIRECTORY ${PROJECT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI})

include_directories(src/main/jni/bzip2)
# 编译出一个动态库 bsdiff，
add_library( # Sets the name of the library.
             bspatch

             # Sets the library as a shared library.
             SHARED

             # Provides a relative path to your source file(s).
             src/main/jni/bspatch.c
             src/main/jni/bzip2/bzlib.c
             src/main/jni/bzip2/crctable.c
             src/main/jni/bzip2/compress.c
             src/main/jni/bzip2/decompress.c
             src/main/jni/bzip2/randtable.c
             src/main/jni/bzip2/blocksort.c
             src/main/jni/bzip2/huffman.c
             )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.
# 找到预编译库
find_library( # Sets the name of the path variable.
              log-lib

              # Specifies the name of the NDK library that
              # you want CMake to locate.
              log )

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
                       bspatch

                       # Links the target library to the log library
                       # included in the NDK.
                       ${log-lib} )
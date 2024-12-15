cmake_minimum_required(VERSION 3.22.1)

# Include OpenCV headers
include_directories(${CMAKE_SOURCE_DIR}/src/main/cpp/include)

# Add the OpenCV library path
set(OpenCV_LIBS "/opencv/native/jni/${ANDROID_ABI}")

# Add native library
add_library(${CMAKE_PROJECT_NAME}
        SHARED
        src/main/cpp/OpenCVInitializer.cpp)

# Link OpenCV libraries
find_library(log-lib log)
target_link_libraries(${CMAKE_PROJECT_NAME}
        ${log-lib}
        ${OpenCV_LIBS})

cmake_minimum_required(VERSION 3.26)
project(latihan_02)

set(CMAKE_CXX_STANDARD 20)

add_executable(latihan_02 main.cpp)
find_package(fmt CONFIG REQUIRED)
target_link_libraries(latihan_02 PRIVATE fmt::fmt)

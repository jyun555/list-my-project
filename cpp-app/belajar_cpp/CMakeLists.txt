cmake_minimum_required(VERSION 3.0)
project(build)
set(SOURCES src/main.cpp src/memo.cpp)
add_executable(${PROJECT_NAME} ${SOURCES})

target_include_directories(${PROJECT_NAME}
PRIVATE ${PROJECT_SOURCE_DIR}/header)

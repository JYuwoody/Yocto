add_executable (helloworld-c helloworld-c.c)
install(TARGETS helloworld-c DESTINATION ${CMAKE_INSTALL_PREFIX}/bin)

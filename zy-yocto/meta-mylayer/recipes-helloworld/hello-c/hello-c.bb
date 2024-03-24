# helloworld-c application
SUMMARY = "helloworld of Autotools recipe"
DESCRIPTION = "My hello world application"
LICENSE = "CLOSED"

inherit cmake

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld-c/"

S = "${WORKDIR}/helloworld-c/"

#CFLAGS:append = " -Wall -O -g"

FILES_${PN} = "${bindir}/"
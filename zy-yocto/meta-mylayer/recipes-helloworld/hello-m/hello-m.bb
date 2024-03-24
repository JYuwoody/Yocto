# helloworld application

SUMMARY = "helloworld OF makefile recipe"
DESCRIPTION = "helloworld-m application"
LICENSE = "CLOSED"

FILESEXTRAPATHS:prepend := "${THISDIR}/:"
SRC_URI = "file://helloworld-m"

S = "${WORKDIR}"

CFLAGS:append = "-Wall -O -g"

EXTRA_OEMAKE = "'CC=${CC}' 'CFLAGS=${CFLAGS}'"
EXTRA_OEMAKE:append = " 'LDFLAGS=${LDFLAGS}'"
EXTRA_OEMAKE:append = " 'DESTDIR=${D}'"


do_compile() {
	oe_runmake -C helloworld-m
}

do_install() {
	install -d ${D}${bindir}
	install -m 0755 helloworld-m/helloworld-m ${D}${bindir}
}

FILE_${PN} = "${bindir}/"
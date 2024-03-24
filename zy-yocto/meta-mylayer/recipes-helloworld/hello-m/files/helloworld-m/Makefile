TARGER = helloworld-m
all := $(TARGER)
CFLAGS ?= -Wall -O
bindir = $(DESTDIR)/usr/bindir

OBJS = helloworld-m.o

$(TARGER): $(OBJS)
		$(CC) $(CFLAGS) $(LDFLAGS) $^ -o $@

install:
		install -d $(bindir)

install:
		install -m 0755 $(TARGER) $(bindir)

uninstall:
		${RM} $(bindir)/$(TARGER)

clean:
		${RM} $(TARGER) $(OBJS)

.PHONY: all clean install uninstall
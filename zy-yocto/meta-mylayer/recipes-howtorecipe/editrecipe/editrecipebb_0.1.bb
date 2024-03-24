SUMMARY = "bitbake recipe"
DESCRIPTION = "Recipe created for test"
LICENSE = "MIT"
#shell style:
do_foo(){
        bbplain first
        fn
}
fn:prepend(){
        bbplain second
}
fn(){
        bbplain third
        echo "third 3th"
}
do_foo:append(){
        bbplain fourth
}
addtask foo

#bitbake style
python do_compile(){
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe do compile                  *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}
addtask compile

python do_printdate(){
    DATE = "${@time.strftime('%Y%m%d', time.gmtime())}"
    bb.plain(d.getVar("DATE"))
}

addtask printdate after do_fetch before do_build

#python orignal style
def get_depends(d):
    if d.getVar('SOMECONDITION'):
        return "testapphello"
    else: #there is ":" 
        return "libXYZ"

SOMECONDITION = "1" 
DEPENDS = "${@get_depends(d)}"


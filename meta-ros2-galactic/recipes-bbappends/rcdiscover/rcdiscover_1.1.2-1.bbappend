# Copyright (c) 2021 LG Electronics, Inc.

# ERROR: rcdiscover-1.0.4-1-r0 do_package_qa: QA Issue: non -dev/-dbg/nativesdk- package contains symlink .so: rcdiscover path '/work/core2-64-oe-linux/rcdiscover/1.0.4-1-r0/packages-split/rcdiscover/usr/lib/librcdiscover.so' [dev-so]
inherit ros_insane_dev_so

do_install:append() {
    mv ${D}${datadir}/package.xml ${D}${datadir}/${ROS_BPN}/
}
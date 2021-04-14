DESCRIPTION = "ROS package library"
SECTION = "devel/python"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/rospkg/__init__.py;beginline=1;endline=31;md5=9cea8ac73441707f7779ae66adf75f62"
SRCNAME = "rospkg"

SRCREV = "df4fa80a6136ee8d4ce2318b970709ba61cf13be"
ROS_BRANCH ?= "branch=master"
SRC_URI = "git://github.com/ros-infrastructure/rospkg;${ROS_BRANCH};protocol=https"

S = "${WORKDIR}/git"

RDEPENDS_${PN} += "${PYTHON_PN}-xml ${PYTHON_PN}-rosdep ${PYTHON_PN}-distro"

BBCLASSEXTEND = "native"
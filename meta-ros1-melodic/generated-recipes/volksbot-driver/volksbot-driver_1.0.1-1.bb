# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Driver for the Volksbot robot."
AUTHOR = "Sebastian Pütz <spuetz@uos.de>"
ROS_AUTHOR = "Jochen Sprickerhof <jochen@sprickerhof.de>"
HOMEPAGE = "http://wiki.ros.org/volksbot_driver"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "volksbot_driver"
ROS_BPN = "volksbot_driver"

ROS_BUILD_DEPENDS = " \
    epos2-motor-controller \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    epos2-motor-controller \
    geometry-msgs \
    nav-msgs \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/uos-gbp/volksbot_driver-release/archive/release/melodic/volksbot_driver/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/volksbot_driver"
SRC_URI = "git://github.com/uos-gbp/volksbot_driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "4c9a36fd7825fe254cd4731e35032583ac7cc907"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

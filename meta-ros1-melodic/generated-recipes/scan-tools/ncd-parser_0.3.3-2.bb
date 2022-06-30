# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The ncd_parser package reads in .alog data files from the New College Dataset and broadcasts scan and odometry messages to ROS."
AUTHOR = "Ivan Dryanovski <ccnyroboticslab@gmail.com>"
ROS_AUTHOR = "Ivan Dryanovski"
HOMEPAGE = "http://wiki.ros.org/ncd_parser"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "scan_tools"
ROS_BPN = "ncd_parser"

ROS_BUILD_DEPENDS = " \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
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

# matches with: https://github.com/ros-gbp/scan_tools-release/archive/release/melodic/ncd_parser/0.3.3-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ncd_parser"
SRC_URI = "git://github.com/ros-gbp/scan_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "fad73363620c70409469a73345442561f8f832c3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

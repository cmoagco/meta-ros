# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Dock driving library for Kobuki. Users owning a docking station for Kobuki  	    can use this tool to develop autonomous docking drive algorithms."
AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
ROS_AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_dock_drive"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_core"
ROS_BPN = "kobuki_dock_drive"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-geometry \
    ecl-linear-algebra \
    ecl-threads \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_dock_drive/0.7.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/kobuki_dock_drive"
SRC_URI = "git://github.com/yujinrobot-release/kobuki_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "a23f722fae1e3f749b5e5fc9ad5fd52cd18a006e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

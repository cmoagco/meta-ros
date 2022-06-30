# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This metapackage depends on the SMACH library and ROS SMACH integration     packages."
AUTHOR = "Isaac I. Y. Saito <gm130s@gmail.com>"
ROS_AUTHOR = "Jonathan Bohren"
HOMEPAGE = "http://ros.org/wiki/smach"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "executive_smach"
ROS_BPN = "executive_smach"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    smach \
    smach-msgs \
    smach-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/executive_smach-release/archive/release/noetic/executive_smach/2.5.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/executive_smach"
SRC_URI = "git://github.com/ros-gbp/executive_smach-release;${ROS_BRANCH};protocol=https"
SRCREV = "d96420336d2403b67bce2890f95a42f58f459f51"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

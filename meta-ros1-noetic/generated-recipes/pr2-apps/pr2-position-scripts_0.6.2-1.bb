# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "This package contains a number of scripts to set various components of the PR2. They are used in the apps to improve usablity."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Tony Pratkanis"
HOMEPAGE = "http://ros.org/wiki/pr2_position_scripts"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_apps"
ROS_BPN = "pr2_position_scripts"

ROS_BUILD_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    rospy \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    rospy \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    pr2-controllers-msgs \
    rospy \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_apps-release/archive/release/noetic/pr2_position_scripts/0.6.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/pr2_position_scripts"
SRC_URI = "git://github.com/pr2-gbp/pr2_apps-release;${ROS_BRANCH};protocol=https"
SRCREV = "ba0b92072899261c67c1adaaa65f362165db255c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

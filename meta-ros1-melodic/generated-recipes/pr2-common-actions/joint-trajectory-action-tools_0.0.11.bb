# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "joint_trajectory_action_tools"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Melonee Wise"
HOMEPAGE = "http://ros.org/wiki/joint_trajectory_action_tools"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "joint_trajectory_action_tools"

ROS_BUILD_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    joint-trajectory-action \
    pr2-controllers-msgs \
    roslib \
    rospy \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/joint_trajectory_action_tools/0.0.11-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/joint_trajectory_action_tools"
SRC_URI = "git://github.com/pr2-gbp/pr2_common_actions-release;${ROS_BRANCH};protocol=https"
SRCREV = "ce1c9cc475f0d013e0f648532cf78083ed20b4bb"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Gazebo model plugin to simulate Audibot"
AUTHOR = "Micho Radovnikovich <mtradovn@oakland.edu>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "audibot"
ROS_BPN = "audibot_gazebo"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-ros \
    roscpp \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    audibot-description \
    gazebo-ros \
    gazebo-ros-pkgs \
    robot-state-publisher \
    roscpp \
    rviz \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rospy \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/robustify/audibot-release/archive/release/noetic/audibot_gazebo/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/audibot_gazebo"
SRC_URI = "git://github.com/robustify/audibot-release;${ROS_BRANCH};protocol=https"
SRCREV = "f6254a601ae332a84f9a8f3c112ea98b8fcfc84d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

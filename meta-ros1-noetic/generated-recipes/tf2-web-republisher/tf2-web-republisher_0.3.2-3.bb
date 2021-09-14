# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Republishing of Selected TFs"
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Julius Kammer <jkammerl@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/tf2_web_republisher"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tf2_web_republisher"
ROS_BPN = "tf2_web_republisher"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-generation \
    roscpp \
    tf \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    roscpp \
    tf \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    roscpp \
    tf \
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

# matches with: https://github.com/RobotWebTools-release/tf2_web_republisher-release/archive/release/noetic/tf2_web_republisher/0.3.2-3.tar.gz
ROS_BRANCH ?= "branch=release/noetic/tf2_web_republisher"
SRC_URI = "git://github.com/RobotWebTools-release/tf2_web_republisher-release;${ROS_BRANCH};protocol=https"
SRCREV = "c64d591897edc89338b899458d3a922e0854630e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
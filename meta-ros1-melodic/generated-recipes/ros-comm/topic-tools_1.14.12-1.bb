# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Tools for directing, throttling, selecting, and otherwise messing with     ROS topics at a meta level. None of the programs in this package actually     know about the topics whose streams they are altering; instead, these     tools deal with messages as generic binary blobs. This means they can be     applied to any ROS topic."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Morgan Quigley"
HOMEPAGE = "http://ros.org/wiki/topic_tools"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_comm"
ROS_BPN = "topic_tools"

ROS_BUILD_DEPENDS = " \
    cpp-common \
    message-generation \
    rosconsole \
    roscpp \
    rostest \
    rostime \
    rosunit \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    rosconsole \
    roscpp \
    rostime \
    std-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    rosconsole \
    roscpp \
    rostime \
    std-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosbash \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/melodic/topic_tools/1.14.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/topic_tools"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "c7939f33bc92e6829f48a65c30907a8e98e2a142"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

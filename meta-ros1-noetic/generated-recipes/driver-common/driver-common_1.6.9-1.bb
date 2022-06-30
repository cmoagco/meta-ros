# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The driver_common stack contains classes and tools that are useful     throughout the driver stacks. It currently contains:      driver_base: A base class for sensors to provide a consistent state machine     (retries, error handling, etc.) and interface      timestamp_tools: Classes to help timestamp hardware events"
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Blaise Gassend"
HOMEPAGE = "http://www.ros.org/wiki/driver_common"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "driver_common"
ROS_BPN = "driver_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    driver-base \
    timestamp-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    driver-base \
    timestamp-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/driver_common-release/archive/release/noetic/driver_common/1.6.9-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/driver_common"
SRC_URI = "git://github.com/ros-gbp/driver_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "cbf895f735bb4927efa1d48b768d2a0964317228"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

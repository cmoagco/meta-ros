# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides messages and serializations / conversion for the <a href="http://octomap.github.io">OctoMap library</a>."
AUTHOR = "Armin Hornung <armin@hornung.io>"
ROS_AUTHOR = "Armin Hornung <armin@hornung.io>"
HOMEPAGE = "http://ros.org/wiki/octomap_msgs"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=5ee5b8b046ae48ad94a2037ca953a67b"

ROS_CN = "octomap_msgs"
ROS_BPN = "octomap_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/octomap_msgs-release/archive/release/melodic/octomap_msgs/0.3.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/octomap_msgs"
SRC_URI = "git://github.com/ros-gbp/octomap_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "8646c40359312e8d1f4fcbcaa1b10f4118a33fcc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

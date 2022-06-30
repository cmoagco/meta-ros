# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides a set of simple math utilities to work         with angles. The utilities cover simple things like         normalizing an angle and conversion between degrees and         radians. But even if you're trying to calculate things like         the shortest angular distance between two joint space         positions of your robot, but the joint motion is constrained         by joint limits, this package is what you need. The code in         this package is stable and well tested. There are no plans for         major changes in the near future."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "John Hsu <hsu@osrfoundation.org>"
HOMEPAGE = "http://wiki.ros.org/angles"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "angles"
ROS_BPN = "angles"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/geometry_angles_utils-release/archive/release/melodic/angles/1.9.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/angles"
SRC_URI = "git://github.com/ros-gbp/geometry_angles_utils-release;${ROS_BRANCH};protocol=https"
SRCREV = "afd41a7d9a08f72659005e39053daa1631fdcfd5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

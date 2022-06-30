# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A metapackage to bring in the default packages second generation Transform Library in ros, tf2."
AUTHOR = "Tully Foote <tfoote@osrfoundation.org>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://www.ros.org/wiki/geometry2"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry2"
ROS_BPN = "geometry2"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    tf2 \
    tf2-bullet \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-msgs \
    tf2-py \
    tf2-ros \
    tf2-sensor-msgs \
    tf2-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    tf2 \
    tf2-bullet \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-kdl \
    tf2-msgs \
    tf2-py \
    tf2-ros \
    tf2-sensor-msgs \
    tf2-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/geometry2-release/archive/release/noetic/geometry2/0.7.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/geometry2"
SRC_URI = "git://github.com/ros-gbp/geometry2-release;${ROS_BRANCH};protocol=https"
SRCREV = "35b49ba1b928e7e67a899437623af76cd9362152"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

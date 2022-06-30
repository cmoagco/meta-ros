# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Lightweight frontier-based exploration."
AUTHOR = "Jiri Horner <laeqten@gmail.com>"
ROS_AUTHOR = "Jiri Horner <laeqten@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/explore_lite"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "m_explore"
ROS_BPN = "explore_lite"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    costmap-2d \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    costmap-2d \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    costmap-2d \
    geometry-msgs \
    map-msgs \
    move-base-msgs \
    nav-msgs \
    roscpp \
    std-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/hrnr/m-explore-release/archive/release/noetic/explore_lite/2.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/explore_lite"
SRC_URI = "git://github.com/hrnr/m-explore-release;${ROS_BRANCH};protocol=https"
SRCREV = "8900e06e8d53c9bebb2107c7c56d9c019c7bfe9c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

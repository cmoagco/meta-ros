# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "Chad Rockey <chadrockey@gmail.com>"
ROS_AUTHOR = "Chad Rockey"
HOMEPAGE = "http://ros.org/wiki/depthimage_to_laserscan"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "depthimage_to_laserscan"
ROS_BPN = "depthimage_to_laserscan"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    gtest \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    image-geometry \
    image-transport \
    nodelet \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/depthimage_to_laserscan-release/archive/release/noetic/depthimage_to_laserscan/1.0.8-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/depthimage_to_laserscan"
SRC_URI = "git://github.com/ros-gbp/depthimage_to_laserscan-release;${ROS_BRANCH};protocol=https"
SRCREV = "844f2f797a7c6b0002ce564f7ecbc1fe4d743ddc"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

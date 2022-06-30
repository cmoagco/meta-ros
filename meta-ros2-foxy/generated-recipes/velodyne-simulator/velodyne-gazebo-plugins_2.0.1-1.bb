# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Gazebo plugin to provide simulated data from Velodyne laser scanners."
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck"
HOMEPAGE = "http://wiki.ros.org/velodyne_gazebo_plugins"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "velodyne_simulator"
ROS_BPN = "velodyne_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
    tf2 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-msgs \
    gazebo-ros \
    gazebo-rosdev \
    rclcpp \
    sensor-msgs \
    tf2 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DataspeedInc-release/velodyne_simulator-release/archive/release/foxy/velodyne_gazebo_plugins/2.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/velodyne_gazebo_plugins"
SRC_URI = "git://github.com/DataspeedInc-release/velodyne_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "79997965f25465695173a27b4cb4a4196a04c0be"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

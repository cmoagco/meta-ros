# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Assorted filters designed to operate on 2D planar laser scanners,     which use the sensor_msgs/LaserScan type."
AUTHOR = "Jon Binney <jon.binney@gmail.com>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/laser_filters"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_filters"
ROS_BPN = "laser_filters"

ROS_BUILD_DEPENDS = " \
    angles \
    dynamic-reconfigure \
    filters \
    laser-geometry \
    message-filters \
    nodelet \
    pluginlib \
    roscpp \
    rostest \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    dynamic-reconfigure \
    filters \
    laser-geometry \
    message-filters \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    dynamic-reconfigure \
    filters \
    laser-geometry \
    message-filters \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/laser_filters-release/archive/release/melodic/laser_filters/1.8.12-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/laser_filters"
SRC_URI = "git://github.com/ros-gbp/laser_filters-release;${ROS_BRANCH};protocol=https"
SRCREV = "38301ac938ce9184bd32ce283fdd83594b9b7179"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Implementation of warehouse_ros for sqlite"
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Bjarne von Horn"
HOMEPAGE = "http://ros.org/wiki/warehouse_ros"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warehouse_ros_sqlite"
ROS_BPN = "warehouse_ros_sqlite"

ROS_BUILD_DEPENDS = " \
    boost \
    class-loader \
    rclcpp \
    sqlite3 \
    sqlite3-vendor \
    warehouse-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    class-loader \
    rclcpp \
    warehouse-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    rclcpp \
    sqlite3 \
    warehouse-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-copyright \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    geometry-msgs \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/moveit/warehouse_ros_sqlite-release/archive/release/galactic/warehouse_ros_sqlite/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/warehouse_ros_sqlite"
SRC_URI = "git://github.com/moveit/warehouse_ros_sqlite-release;${ROS_BRANCH};protocol=https"
SRCREV = "639f1a0fb0cb7e3bfb77a2ec947cc01d327506a3"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
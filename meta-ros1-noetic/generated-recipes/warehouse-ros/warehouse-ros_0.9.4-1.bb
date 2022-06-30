# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Persistent storage of ROS messages"
AUTHOR = "MoveIt! Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Bhaskara Marthi <bhaskara@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/warehouse_ros"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warehouse_ros"
ROS_BPN = "warehouse_ros"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    pluginlib \
    roscpp \
    rostime \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    geometry-msgs \
    pluginlib \
    roscpp \
    rostime \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    geometry-msgs \
    pluginlib \
    roscpp \
    rostime \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/warehouse_ros-release/archive/release/noetic/warehouse_ros/0.9.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/warehouse_ros"
SRC_URI = "git://github.com/ros-gbp/warehouse_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "9909c7c6e594e2a7056f1f7382b3976f3ecb6a93"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

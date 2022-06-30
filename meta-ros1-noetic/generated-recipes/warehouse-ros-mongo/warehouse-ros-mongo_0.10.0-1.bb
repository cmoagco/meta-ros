# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Implementation of warehouse_ros for MongoDB"
AUTHOR = "MoveIt Release Team <moveit_releasers@googlegroups.com>"
ROS_AUTHOR = "Bhaskara Marthi <bhaskara@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/warehouse_ros"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "warehouse_ros_mongo"
ROS_BPN = "warehouse_ros_mongo"

ROS_BUILD_DEPENDS = " \
    class-loader \
    mongodb \
    roscpp \
    rostime \
    std-msgs \
    warehouse-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    class-loader \
    roscpp \
    rostime \
    std-msgs \
    warehouse-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    roscpp \
    rostime \
    std-msgs \
    warehouse-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    mongodb \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/warehouse_ros_mongo-release/archive/release/noetic/warehouse_ros_mongo/0.10.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/warehouse_ros_mongo"
SRC_URI = "git://github.com/ros-gbp/warehouse_ros_mongo-release;${ROS_BRANCH};protocol=https"
SRCREV = "a0475b32ebcf38513b1a7327453832f31e0d5a8a"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

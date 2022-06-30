# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Clearpath Husky Simulator bringup"
AUTHOR = "Tony Baltovski <tbaltovski@clearpathrobotics.com>"
ROS_AUTHOR = "Ryan Gariepy <rgariepy@clearpathrobotics.com>"
HOMEPAGE = "http://ros.org/wiki/husky_gazebo"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "husky"
ROS_BPN = "husky_gazebo"

ROS_BUILD_DEPENDS = " \
    roslaunch \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-control \
    hector-gazebo-plugins \
    husky-control \
    husky-description \
    multimaster-launch \
    pointcloud-to-laserscan \
    rostopic \
    velodyne-gazebo-plugins \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    controller-manager \
    gazebo-plugins \
    gazebo-ros \
    gazebo-ros-control \
    hector-gazebo-plugins \
    husky-control \
    husky-description \
    multimaster-launch \
    pointcloud-to-laserscan \
    rostopic \
    velodyne-gazebo-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/clearpath-gbp/husky-release/archive/release/melodic/husky_gazebo/0.4.10-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/husky_gazebo"
SRC_URI = "git://github.com/clearpath-gbp/husky-release;${ROS_BRANCH};protocol=https"
SRCREV = "98d92dafa10afd9640a434aef8c7fb7baf677f0b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

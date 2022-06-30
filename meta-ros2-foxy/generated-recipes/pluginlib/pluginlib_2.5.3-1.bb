# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "The pluginlib package provides tools for writing and dynamically loading plugins using the ROS build infrastructure.     To work, these tools require plugin providers to register their plugins in the package.xml of their package."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://www.ros.org/wiki/pluginlib"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pluginlib"
ROS_BPN = "pluginlib"

ROS_BUILD_DEPENDS = " \
    ament-index-cpp \
    class-loader \
    rcpputils \
    rcutils \
    tinyxml2-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ament-index-cpp \
    class-loader \
    rcpputils \
    rcutils \
    tinyxml2-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-cpp \
    class-loader \
    rcpputils \
    rcutils \
    tinyxml2-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/pluginlib-release/archive/release/foxy/pluginlib/2.5.3-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/pluginlib"
SRC_URI = "git://github.com/ros2-gbp/pluginlib-release;${ROS_BRANCH};protocol=https"
SRCREV = "7b86a790c81d8f701deb39bd7ea6682031e522ef"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

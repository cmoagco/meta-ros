# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "tf2_msgs"
AUTHOR = "Chris Lalancette <clalancette@openrobotics.org>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://www.ros.org/wiki/tf2_msgs"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "geometry2"
ROS_BPN = "tf2_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    builtin-interfaces \
    geometry-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/geometry2-release/archive/release/galactic/tf2_msgs/0.17.2-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/tf2_msgs"
SRC_URI = "git://github.com/ros2-gbp/geometry2-release;${ROS_BRANCH};protocol=https"
SRCREV = "58ae778d2781c334d3e5f468fe314b96655feb56"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

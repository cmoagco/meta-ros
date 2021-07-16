# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_galactic
inherit ros_superflore_generated

DESCRIPTION = "Provides nonlinear state estimation through sensor fusion of an abritrary number of sensors."
AUTHOR = "Tom Moore <ayrton04@gmail.com>"
ROS_AUTHOR = "Tom Moore <ayrton04@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/robot_localization"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "robot_localization"
ROS_BPN = "robot_localization"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    message-filters \
    nav-msgs \
    rclcpp \
    rmw-implementation \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    builtin-interfaces-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    message-filters \
    nav-msgs \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    diagnostic-updater \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    message-filters \
    nav-msgs \
    rclcpp \
    rmw-implementation \
    rosidl-default-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-eigen \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp-vendor \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    builtin-interfaces \
    launch-ros \
    launch-testing-ament-cmake \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/cra-ros-pkg/robot_localization-release/archive/release/galactic/robot_localization/3.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/galactic/robot_localization"
SRC_URI = "git://github.com/cra-ros-pkg/robot_localization-release;${ROS_BRANCH};protocol=https"
SRCREV = "3be3c990fe5a0abe1548b919db5b6bfaef3da184"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

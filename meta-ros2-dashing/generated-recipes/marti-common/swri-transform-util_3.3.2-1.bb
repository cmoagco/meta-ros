# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "The swri_transform_util package contains utility functions and classes for      transforming between coordinate frames."
AUTHOR = "P. J. Reed <preed@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/marti_common"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_common"
ROS_BPN = "swri_transform_util"

ROS_BUILD_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-msgs \
    marti-nav-msgs \
    proj \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    rclpy \
    sensor-msgs \
    swri-math-util \
    swri-roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
    pkgconfig-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-msgs \
    marti-nav-msgs \
    proj \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    rclpy \
    sensor-msgs \
    swri-math-util \
    swri-roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    cv-bridge \
    diagnostic-msgs \
    geographic-msgs \
    geometry-msgs \
    geos \
    gps-msgs \
    marti-nav-msgs \
    proj \
    python3-numpy \
    rcl-interfaces \
    rclcpp \
    rclcpp-components \
    rclpy \
    sensor-msgs \
    swri-math-util \
    swri-roscpp \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/swri-robotics-gbp/marti_common-release/archive/release/dashing/swri_transform_util/3.3.2-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/swri_transform_util"
SRC_URI = "git://github.com/swri-robotics-gbp/marti_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "60e71702a6d85ef2fe092fabdd164b6350715f18"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

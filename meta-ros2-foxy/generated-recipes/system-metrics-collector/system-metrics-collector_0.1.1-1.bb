# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Node and aggregation utilities to measure and publish system metrics."
AUTHOR = "ROS Tooling Working Group <ros-tooling@googlegroups.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "system_metrics_collector"
ROS_BPN = "system_metrics_collector"

ROS_BUILD_DEPENDS = " \
    libstatistics-collector \
    message-filters \
    rcl \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    rcpputils \
    rcutils \
    rosidl-default-generators \
    statistics-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    libstatistics-collector \
    message-filters \
    rcl \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    rcpputils \
    rcutils \
    statistics-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    demo-nodes-cpp \
    libstatistics-collector \
    message-filters \
    rcl \
    rclcpp \
    rclcpp-components \
    rclcpp-lifecycle \
    rcpputils \
    rcutils \
    rosidl-default-runtime \
    statistics-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-python3-retrying} \
    ament-cmake-gtest \
    ament-lint-auto \
    ament-lint-common \
    class-loader \
    lifecycle-msgs \
    rclpy \
    ros2launch \
    ros2lifecycle \
    ros2topic \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-tooling/system_metrics_collector-release/archive/release/foxy/system_metrics_collector/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/foxy/system_metrics_collector"
SRC_URI = "git://github.com/ros-tooling/system_metrics_collector-release;${ROS_BRANCH};protocol=https"
SRCREV = "d4a9741303f0c5c232ab81356d73f64c86299117"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

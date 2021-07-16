# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Simple example system and according launch files for the system_modes     package."
AUTHOR = "Arne Nordmann <arne.nordmann@bosch.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "system_modes"
ROS_BPN = "system_modes_examples"

ROS_BUILD_DEPENDS = " \
    rclcpp \
    rclcpp-lifecycle \
    system-modes \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rclcpp \
    rclcpp-lifecycle \
    system-modes \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rclcpp \
    rclcpp-lifecycle \
    ros2launch \
    system-modes \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-cppcheck \
    ament-cmake-cpplint \
    ament-cmake-flake8 \
    ament-cmake-gmock \
    ament-cmake-gtest \
    ament-cmake-pep257 \
    ament-cmake-uncrustify \
    ament-lint-auto \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/microROS/system_modes-release/archive/release/dashing/system_modes_examples/0.6.0-2.tar.gz
ROS_BRANCH ?= "branch=release/dashing/system_modes_examples"
SRC_URI = "git://github.com/microROS/system_modes-release;${ROS_BRANCH};protocol=https"
SRCREV = "2300d984cdab37c59bf89960ca087112262ce678"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

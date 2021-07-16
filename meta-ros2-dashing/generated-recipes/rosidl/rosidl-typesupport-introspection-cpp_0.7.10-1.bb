# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "Generate the message type support for dynamic message construction in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rosidl"
ROS_BPN = "rosidl_typesupport_introspection_cpp"

ROS_BUILD_DEPENDS = " \
    rosidl-typesupport-introspection-c \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rosidl-cmake \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-parser \
    rosidl-typesupport-interface \
    rosidl-typesupport-introspection-c \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/rosidl-release/archive/release/dashing/rosidl_typesupport_introspection_cpp/0.7.10-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/rosidl_typesupport_introspection_cpp"
SRC_URI = "git://github.com/ros2-gbp/rosidl-release;${ROS_BRANCH};protocol=https"
SRCREV = "f66ae4c64c8afa3f4048624e027ed9fbdd1b0fbd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

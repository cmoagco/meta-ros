# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_rolling
inherit ros_superflore_generated

DESCRIPTION = "A C++ Wrapper for the Phidgets C API"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Tully Foote"
HOMEPAGE = "http://ros.org/wiki/phidgets_api"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_api"

ROS_BUILD_DEPENDS = " \
    libphidget22 \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = " \
    libphidget22 \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libphidget22 \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/phidgets_drivers-release/archive/release/rolling/phidgets_api/2.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/rolling/phidgets_api"
SRC_URI = "git://github.com/ros2-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "e47f8d9e4678d0d5f74eecc7b03f6c753a3f8627"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}

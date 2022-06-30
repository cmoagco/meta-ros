# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains a C++ parser for the Collada robot     description format. The parser reads a Collada XML robot     description, and creates a C++ URDF model. Although it is possible     to directly use this parser when working with Collada robot     descriptions, the preferred user API is found in the urdf package."
AUTHOR = "Chris Lalancette <clalancette@osrfoundation.org>"
ROS_AUTHOR = "Rosen Diankov"
HOMEPAGE = "http://ros.org/wiki/collada_parser"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=19;endline=19;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "collada_urdf"
ROS_BPN = "collada_parser"

ROS_BUILD_DEPENDS = " \
    class-loader \
    collada-dom \
    rosconsole \
    urdf \
    urdf-parser-plugin \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    urdf \
    urdf-parser-plugin \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    class-loader \
    collada-dom \
    rosconsole \
    urdf-parser-plugin \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/collada_urdf-release/archive/release/melodic/collada_parser/1.12.13-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/collada_parser"
SRC_URI = "git://github.com/ros-gbp/collada_urdf-release;${ROS_BRANCH};protocol=https"
SRCREV = "cc08064830a276e3dde6e33a456f9fcf9c01494c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

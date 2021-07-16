# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_foxy
inherit ros_superflore_generated

DESCRIPTION = "Implementation of RTPS standard."
AUTHOR = "Steven! Ragnarök <stevenragnarok@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache License 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "fastrtps"
ROS_BPN = "fastrtps"

ROS_BUILD_DEPENDS = " \
    asio \
    fastcdr \
    foonathan-memory-vendor \
    libtinyxml2 \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    fastcdr \
    foonathan-memory-vendor \
    libtinyxml2 \
    openssl \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    fastcdr \
    foonathan-memory-vendor \
    libtinyxml2 \
    openssl \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/fastrtps-release/archive/release/foxy/fastrtps/2.0.2-2.tar.gz
ROS_BRANCH ?= "branch=release/foxy/fastrtps"
SRC_URI = "git://github.com/ros2-gbp/fastrtps-release;${ROS_BRANCH};protocol=https"
SRCREV = "aa9c1545bea3d99422208825605dd8d63dcc1769"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

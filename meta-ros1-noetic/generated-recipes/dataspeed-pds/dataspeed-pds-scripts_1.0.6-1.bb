# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Test scripts to interface to the Dataspeed Inc. Intelligent Power Distribution System (iPDS)"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dataspeed_pds"
ROS_BPN = "dataspeed_pds_scripts"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dataspeed-pds-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DataspeedInc-release/dataspeed_pds-release/archive/release/noetic/dataspeed_pds_scripts/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dataspeed_pds_scripts"
SRC_URI = "git://github.com/DataspeedInc-release/dataspeed_pds-release;${ROS_BRANCH};protocol=https"
SRCREV = "4ae06e5e5ac5d55cfbc2c77516c1f266350d8e05"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

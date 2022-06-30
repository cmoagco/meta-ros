# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Meta-package of libraries for processing laser data, including converting laser data       into 3D representations."
AUTHOR = "Jonathan Binney <jon.binney@gmail.com>"
HOMEPAGE = "http://www.ros.org/wiki/laser_pipeline"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "laser_pipeline"
ROS_BPN = "laser_pipeline"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    laser-assembler \
    laser-filters \
    laser-geometry \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    laser-assembler \
    laser-filters \
    laser-geometry \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/laser_pipeline-release/archive/release/noetic/laser_pipeline/1.6.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/laser_pipeline"
SRC_URI = "git://github.com/ros-gbp/laser_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "a48cc668e88f8b812f1ecc7d7dfffee85c2e684c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

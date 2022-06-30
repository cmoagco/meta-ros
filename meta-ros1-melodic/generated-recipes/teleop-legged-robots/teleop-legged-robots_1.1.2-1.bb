# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Generic keyboard teleop for legged robots."
AUTHOR = "SoftServe <robotics@softserveinc.com>"
ROS_AUTHOR = "Taras Borovets"
HOMEPAGE = "http://wiki.ros.org/teleop_legged_robots"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "teleop_legged_robots"
ROS_BPN = "teleop_legged_robots"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    rospy \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    rospy \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/SoftServeSAG/teleop_legged_robots-release/archive/release/melodic/teleop_legged_robots/1.1.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/teleop_legged_robots"
SRC_URI = "git://github.com/SoftServeSAG/teleop_legged_robots-release;${ROS_BRANCH};protocol=https"
SRCREV = "ad48fd3e216843253b36bfaea4b6c76a51915976"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "jsk_interactive"
AUTHOR = "Yusuke Furuta <furua@jsk.imi.i.u-tokyo.ac.jp>"
ROS_AUTHOR = "Yusuke Furuta"
HOMEPAGE = "http://ros.org/wiki/jsk_interactive"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_visualization"
ROS_BPN = "jsk_interactive"

ROS_BUILD_DEPENDS = " \
    actionlib \
    dynamic-tf-publisher \
    geometry-msgs \
    jsk-interactive-marker \
    mk \
    rosbuild \
    rospy \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    dynamic-tf-publisher \
    geometry-msgs \
    jsk-interactive-marker \
    rospy \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    dynamic-tf-publisher \
    geometry-msgs \
    jsk-interactive-marker \
    rospy \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_visualization-release/archive/release/melodic/jsk_interactive/2.1.7-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/jsk_interactive"
SRC_URI = "git://github.com/tork-a/jsk_visualization-release;${ROS_BRANCH};protocol=https"
SRCREV = "7794b6d9a276d1f032f51b982437300ff5fbc684"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

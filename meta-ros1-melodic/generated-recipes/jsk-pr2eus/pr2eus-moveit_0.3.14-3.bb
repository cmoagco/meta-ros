# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "pr2eus_moveit"
AUTHOR = "YoheiKakiuchi <youhei@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "YoheiKakiuchi"
HOMEPAGE = "http://ros.org/wiki/pr2eus_moveit"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_pr2eus"
ROS_BPN = "pr2eus_moveit"

ROS_BUILD_DEPENDS = " \
    control-msgs \
    moveit-msgs \
    pr2eus \
    roseus \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    control-msgs \
    moveit-msgs \
    pr2eus \
    roseus \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    control-msgs \
    moveit-msgs \
    pr2eus \
    roseus \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    moveit-planners-ompl \
    pr2-gazebo \
    pr2-moveit-config \
    pr2-moveit-plugins \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/pr2eus_moveit/0.3.14-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2eus_moveit"
SRC_URI = "git://github.com/tork-a/jsk_pr2eus-release;${ROS_BRANCH};protocol=https"
SRCREV = "8d296dc4409e9a8da407f6a2df6aaac6cf999013"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

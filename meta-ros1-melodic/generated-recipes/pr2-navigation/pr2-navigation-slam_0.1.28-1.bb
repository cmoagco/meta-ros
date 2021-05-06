# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package holds launch files for running the"
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://ros.org/wiki/pr2_navigation_slam"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_navigation"
ROS_BPN = "pr2_navigation_slam"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    gmapping \
    joint-trajectory-generator \
    move-base \
    pr2-machine \
    pr2-move-base \
    pr2-navigation-config \
    pr2-tuck-arms-action \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gmapping \
    joint-trajectory-generator \
    move-base \
    pr2-machine \
    pr2-move-base \
    pr2-navigation-config \
    pr2-tuck-arms-action \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_navigation-release/archive/release/melodic/pr2_navigation_slam/0.1.28-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_navigation_slam"
SRC_URI = "git://github.com/pr2-gbp/pr2_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "312cd2be28c0cf455072bb8d4ae709294bebb0e7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
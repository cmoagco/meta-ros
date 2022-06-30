# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Computes joint angles associated with a specific set of detected checkerboard corners.      This package is experimental and unstable.      Expect its APIs to change."
AUTHOR = "Dave Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "http://www.ros.org/wiki/laser_joint_processor"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_calibration"
ROS_BPN = "laser_joint_processor"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    image-geometry \
    joint-states-settler \
    message-filters \
    settlerlib \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    image-geometry \
    joint-states-settler \
    message-filters \
    settlerlib \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    image-geometry \
    joint-states-settler \
    message-filters \
    settlerlib \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UNR-RoboticsResearchLab/pr2_calibration-release/archive/release/melodic/laser_joint_processor/1.0.11-3.tar.gz
ROS_BRANCH ?= "branch=release/melodic/laser_joint_processor"
SRC_URI = "git://github.com/UNR-RoboticsResearchLab/pr2_calibration-release;${ROS_BRANCH};protocol=https"
SRCREV = "142c316474cd0b034758aa9161616b2054ee1386"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

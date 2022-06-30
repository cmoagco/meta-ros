# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "AprilTag detector library"
AUTHOR = "Max Krogius <mkrogius@umich.edu>"
ROS_AUTHOR = "Edwin Olson <ebolson@umich.edu>"
HOMEPAGE = "https://april.eecs.umich.edu/software/apriltag.html"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "apriltag"
ROS_BPN = "apriltag"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/AprilRobotics/apriltag-release/archive/release/melodic/apriltag/3.1.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/apriltag"
SRC_URI = "git://github.com/AprilRobotics/apriltag-release;${ROS_BRANCH};protocol=https"
SRCREV = "a18bc6f49cbe3902632e3fc0aa156bc6ea99f3c8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

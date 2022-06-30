# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package holds navigation-specific sensor configuration options and launch files for the PR2."
AUTHOR = "David Feil-Seifer <dave@cse.unr.edu>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "http://ros.org/wiki/pr2_navigation_perception"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_navigation"
ROS_BPN = "pr2_navigation_perception"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    filters \
    geometry-msgs \
    laser-filters \
    laser-geometry \
    laser-tilt-controller-filter \
    message-filters \
    pcl-ros \
    pr2-machine \
    pr2-navigation-self-filter \
    roscpp \
    semantic-point-annotator \
    sensor-msgs \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    filters \
    geometry-msgs \
    laser-filters \
    laser-geometry \
    laser-tilt-controller-filter \
    message-filters \
    pcl-ros \
    pr2-machine \
    pr2-navigation-self-filter \
    roscpp \
    semantic-point-annotator \
    sensor-msgs \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    filters \
    geometry-msgs \
    laser-filters \
    laser-geometry \
    laser-tilt-controller-filter \
    message-filters \
    pcl-ros \
    pr2-machine \
    pr2-navigation-self-filter \
    roscpp \
    semantic-point-annotator \
    sensor-msgs \
    tf \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pr2-gbp/pr2_navigation-release/archive/release/melodic/pr2_navigation_perception/0.1.28-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pr2_navigation_perception"
SRC_URI = "git://github.com/pr2-gbp/pr2_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "7d636a8aece59c6c8069e9b5edd55ddff2d42e8f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

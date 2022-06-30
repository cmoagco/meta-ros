# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Dynamic graph library"
AUTHOR = "Guilhem saurel <guilhem.saurel@laas.fr>"
ROS_AUTHOR = "Nicolas Mansard"
HOMEPAGE = "http://github.com/stack-of-tasks/dynamic-graph"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dynamic-graph"
ROS_BPN = "dynamic-graph"

ROS_BUILD_DEPENDS = " \
    boost \
    doxygen \
    git \
    graphviz \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    graphviz \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    catkin \
    graphviz \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/stack-of-tasks/dynamic-graph-ros-release/archive/release/noetic/dynamic-graph/4.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/dynamic-graph"
SRC_URI = "git://github.com/stack-of-tasks/dynamic-graph-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "3d65688e856288022d2fab0b65e56562994b943f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "cmake"

inherit ros_${ROS_BUILD_TYPE}

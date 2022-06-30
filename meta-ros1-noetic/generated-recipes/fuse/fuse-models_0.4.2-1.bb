# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "fuse plugins that implement various kinematic and sensor models"
AUTHOR = "Tom Moore <tmoore@locusrobotics.com>"
ROS_AUTHOR = "Tom Moore <tmoore@locusrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "fuse"
ROS_BPN = "fuse_models"

ROS_BUILD_DEPENDS = " \
    boost \
    ceres-solver \
    fuse-constraints \
    fuse-core \
    fuse-graphs \
    fuse-msgs \
    fuse-publishers \
    fuse-variables \
    geometry-msgs \
    libeigen \
    message-generation \
    nav-msgs \
    pluginlib \
    roscpp \
    roslint \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-2d \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    ceres-solver \
    fuse-constraints \
    fuse-core \
    fuse-graphs \
    fuse-msgs \
    fuse-publishers \
    fuse-variables \
    geometry-msgs \
    libeigen \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-2d \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    ceres-solver \
    fuse-constraints \
    fuse-core \
    fuse-graphs \
    fuse-msgs \
    fuse-publishers \
    fuse-variables \
    geometry-msgs \
    libeigen \
    message-runtime \
    nav-msgs \
    pluginlib \
    roscpp \
    sensor-msgs \
    std-srvs \
    tf2 \
    tf2-2d \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    google-benchmark \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/locusrobotics/fuse-release/archive/release/noetic/fuse_models/0.4.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/fuse_models"
SRC_URI = "git://github.com/locusrobotics/fuse-release;${ROS_BRANCH};protocol=https"
SRCREV = "6553b032ac1122b623d0627f66e4424853794a8d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "3-dof configuration space costmap package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "costmap_cspace"

ROS_BUILD_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/neonavigation-release/archive/release/melodic/costmap_cspace/0.11.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/costmap_cspace"
SRC_URI = "git://github.com/at-wat/neonavigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "fe50b4c3a9e6ae2352f26c453158c22b3466c554"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Filters the robot's body out of laser scans or point clouds."
AUTHOR = "Martin Pecka <peckama2@fel.cvut.cz>"
ROS_AUTHOR = "Eitan Marder-Eppstein"
HOMEPAGE = "https://github.com/peci1/robot_body_filter"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_body_filter"
ROS_BPN = "robot_body_filter"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    fcl \
    filters \
    geometric-shapes \
    geometry-msgs \
    laser-geometry \
    message-generation \
    moveit-core \
    moveit-ros-perception \
    pcl \
    pcl-conversions \
    pkgconfig \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-eigen \
    tf2-ros \
    tf2-sensor-msgs \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    filters \
    geometric-shapes \
    geometry-msgs \
    laser-geometry \
    message-runtime \
    moveit-core \
    moveit-ros-perception \
    pcl \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
    urdf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    fcl \
    filters \
    geometric-shapes \
    geometry-msgs \
    laser-geometry \
    message-runtime \
    moveit-core \
    moveit-ros-perception \
    pcl \
    pcl-conversions \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-ros \
    urdf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/peci1/robot_body_filter-release/archive/release/noetic/robot_body_filter/1.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/robot_body_filter"
SRC_URI = "git://github.com/peci1/robot_body_filter-release;${ROS_BRANCH};protocol=https"
SRCREV = "286eeb0139337a2261a348ee073b44485df5c716"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

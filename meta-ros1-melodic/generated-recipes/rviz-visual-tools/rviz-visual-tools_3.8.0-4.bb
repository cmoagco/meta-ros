# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Utility functions for displaying and debugging data in Rviz via published markers"
AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
ROS_AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
HOMEPAGE = "https://github.com/davetcoleman/rviz_visual_tools"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rviz_visual_tools"
ROS_BPN = "rviz_visual_tools"

ROS_BUILD_DEPENDS = " \
    eigen-conversions \
    eigen-stl-containers \
    geometry-msgs \
    graph-msgs \
    ogre \
    qtx11extras \
    roscpp \
    roslint \
    rviz \
    sensor-msgs \
    std-msgs \
    tf-conversions \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    eigen-conversions \
    eigen-stl-containers \
    geometry-msgs \
    graph-msgs \
    ogre \
    qtx11extras \
    roscpp \
    roslint \
    rviz \
    sensor-msgs \
    std-msgs \
    tf-conversions \
    trajectory-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    eigen-conversions \
    eigen-stl-containers \
    geometry-msgs \
    graph-msgs \
    ogre \
    qtx11extras \
    roscpp \
    roslint \
    rviz \
    sensor-msgs \
    std-msgs \
    tf-conversions \
    trajectory-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/rviz_visual_tools-release/archive/release/melodic/rviz_visual_tools/3.8.0-4.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rviz_visual_tools"
SRC_URI = "git://github.com/PickNikRobotics/rviz_visual_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "ca151a9a610bc0ef998c3dbf11fe7b3e6100daa5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

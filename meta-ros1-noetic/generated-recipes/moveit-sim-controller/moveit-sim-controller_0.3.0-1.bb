# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A simulation interface for a hardware interface for ros_control, and loads default joint values from SRDF"
AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
ROS_AUTHOR = "Dave Coleman <davetcoleman@gmail.com>"
HOMEPAGE = "https://github.com/davetcoleman/moveit_sim_controller"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit_sim_controller"
ROS_BPN = "moveit_sim_controller"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    ros-control-boilerplate \
    roscpp \
    roslint \
    rosparam-shortcuts \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    ros-control-boilerplate \
    roscpp \
    rosparam-shortcuts \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    ros-control-boilerplate \
    roscpp \
    rosparam-shortcuts \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/PickNikRobotics/moveit_sim_controller-release/archive/release/noetic/moveit_sim_controller/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/moveit_sim_controller"
SRC_URI = "git://github.com/PickNikRobotics/moveit_sim_controller-release;${ROS_BRANCH};protocol=https"
SRCREV = "7c114307494fd9e2600c0c270dd1eea6f8508fe1"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

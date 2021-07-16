# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "effort_controllers"
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Vijay Pradeep"
HOMEPAGE = "https://github.com/ros-controls/ros_controllers/wiki"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ros_controllers"
ROS_BPN = "effort_controllers"

ROS_BUILD_DEPENDS = " \
    angles \
    control-msgs \
    control-toolbox \
    controller-interface \
    forward-command-controller \
    pluginlib \
    realtime-tools \
    urdf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    control-msgs \
    control-toolbox \
    controller-interface \
    forward-command-controller \
    pluginlib \
    realtime-tools \
    urdf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    control-msgs \
    control-toolbox \
    controller-interface \
    forward-command-controller \
    pluginlib \
    realtime-tools \
    urdf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    controller-manager \
    hardware-interface \
    robot-state-publisher \
    rosgraph-msgs \
    rostest \
    sensor-msgs \
    std-msgs \
    xacro \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/effort_controllers/0.17.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/effort_controllers"
SRC_URI = "git://github.com/ros-gbp/ros_controllers-release;${ROS_BRANCH};protocol=https"
SRCREV = "ea83c7ad05e24f3977ba81f3dd3787ff8d939f44"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

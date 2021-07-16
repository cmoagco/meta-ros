# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The force_torque_sensor package"
AUTHOR = "Denis Štogl <denis.stogl@kit.edu>"
HOMEPAGE = "https://github.com/KITrobotics/force_torque_sensor"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPLv3"
LICENSE = "LGPL-3.0-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "force_torque_sensor"
ROS_BPN = "force_torque_sensor"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    iirob-filters \
    pluginlib \
    realtime-tools \
    roscpp \
    rosparam-handler \
    rospy \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    iirob-filters \
    pluginlib \
    realtime-tools \
    roscpp \
    rosparam-handler \
    rospy \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    iirob-filters \
    message-runtime \
    pluginlib \
    realtime-tools \
    roscpp \
    rosparam-handler \
    rospy \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/KITrobotics/force_torque_sensor-release/archive/release/melodic/force_torque_sensor/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/force_torque_sensor"
SRC_URI = "git://github.com/KITrobotics/force_torque_sensor-release;${ROS_BRANCH};protocol=https"
SRCREV = "1ddf6cf7752346bd96e3af976b57fde507e75072"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Simple navigation package"
AUTHOR = "Jim Vaughan <jimv@mrjim.com>"
ROS_AUTHOR = "Jim Vaughan <jimv@mrjim.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "move_basic"
ROS_BPN = "move_basic"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    move-base-msgs \
    nav-core \
    roscpp \
    rostest \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    move-base-msgs \
    nav-core \
    roscpp \
    rostest \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    message-runtime \
    move-base-msgs \
    nav-core \
    roscpp \
    rostest \
    sensor-msgs \
    std-msgs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UbiquityRobotics-release/move_basic-release/archive/release/melodic/move_basic/0.4.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/move_basic"
SRC_URI = "git://github.com/UbiquityRobotics-release/move_basic-release;${ROS_BRANCH};protocol=https"
SRCREV = "64a4c4ab5f2c0db5a10c51aa933efcec47cf80bd"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

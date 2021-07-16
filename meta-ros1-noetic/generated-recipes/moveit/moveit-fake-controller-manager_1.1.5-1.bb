# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "A fake controller manager plugin for MoveIt."
AUTHOR = "Michael Görner <me@v4hn.de>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_fake_controller_manager"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    moveit-ros-planning \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/noetic/moveit_fake_controller_manager/1.1.5-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/moveit_fake_controller_manager"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "3a8c38f56fffa160a10dba301448310680f21c96"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

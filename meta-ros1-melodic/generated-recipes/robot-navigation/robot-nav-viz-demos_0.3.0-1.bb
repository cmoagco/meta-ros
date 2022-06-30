# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Demos for testing/demonstrating the robot_nav_rviz_plugins and color_util packages"
AUTHOR = "David V. Lu!! <davidvlu@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "robot_navigation"
ROS_BPN = "robot_nav_viz_demos"

ROS_BUILD_DEPENDS = " \
    angles \
    color-util \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-grid \
    nav-grid-iterators \
    nav-grid-pub-sub \
    pluginlib \
    robot-nav-rviz-plugins \
    rosbag \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    angles \
    color-util \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-grid \
    nav-grid-iterators \
    nav-grid-pub-sub \
    pluginlib \
    robot-nav-rviz-plugins \
    rosbag \
    roscpp \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    angles \
    color-util \
    geometry-msgs \
    nav-2d-msgs \
    nav-2d-utils \
    nav-grid \
    nav-grid-iterators \
    nav-grid-pub-sub \
    pluginlib \
    robot-nav-rviz-plugins \
    rosbag \
    roscpp \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    roslint \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DLu/robot_navigation-release/archive/release/melodic/robot_nav_viz_demos/0.3.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/robot_nav_viz_demos"
SRC_URI = "git://github.com/DLu/robot_navigation-release;${ROS_BRANCH};protocol=https"
SRCREV = "75a8276e885dc7218fcc31c9971b4f727f627a57"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

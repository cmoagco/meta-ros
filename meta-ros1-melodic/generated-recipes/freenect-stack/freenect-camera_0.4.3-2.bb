# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A libfreenect-based ROS driver for the Microsoft Kinect.  This is     a port of the OpenNI driver that uses libfreenect instead, because     on some systems with some devices it works better."
AUTHOR = "Jack O'Quin <jack.oquin@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://ros.org/wiki/freenect_camera"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "freenect_stack"
ROS_BPN = "freenect_camera"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    diagnostic-updater \
    dynamic-reconfigure \
    image-transport \
    libfreenect \
    log4cxx \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    diagnostic-updater \
    dynamic-reconfigure \
    image-transport \
    libfreenect \
    log4cxx \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    diagnostic-updater \
    dynamic-reconfigure \
    image-transport \
    libfreenect \
    log4cxx \
    nodelet \
    pluginlib \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/freenect_stack-release/archive/release/melodic/freenect_camera/0.4.3-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/freenect_camera"
SRC_URI = "git://github.com/ros-drivers-gbp/freenect_stack-release;${ROS_BRANCH};protocol=https"
SRCREV = "631974cf380ed82a462c811e85bbd41211c19213"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

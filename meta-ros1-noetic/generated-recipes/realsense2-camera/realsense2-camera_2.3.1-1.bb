# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "RealSense Camera package allowing access to Intel T265 Tracking module and SR300 and D400 3D cameras"
AUTHOR = "Doron Hirshberg <doron.hirshberg@intel.com>"
ROS_AUTHOR = "Sergey Dorodnicov <sergey.dorodnicov@intel.com>"
HOMEPAGE = "http://www.ros.org/wiki/RealSense"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "realsense2_camera"
ROS_BPN = "realsense2_camera"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    ddynamic-reconfigure \
    diagnostic-updater \
    genmsg \
    image-transport \
    libeigen \
    librealsense2 \
    message-runtime \
    nav-msgs \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    ddynamic-reconfigure \
    diagnostic-updater \
    genmsg \
    image-transport \
    libeigen \
    librealsense2 \
    message-runtime \
    nav-msgs \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    ddynamic-reconfigure \
    diagnostic-updater \
    genmsg \
    image-transport \
    libeigen \
    librealsense2 \
    message-runtime \
    nav-msgs \
    nodelet \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/IntelRealSense/realsense-ros-release/archive/release/noetic/realsense2_camera/2.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/realsense2_camera"
SRC_URI = "git://github.com/IntelRealSense/realsense-ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "b949b3e4ef56a61319107a67c92a74df39ad7874"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
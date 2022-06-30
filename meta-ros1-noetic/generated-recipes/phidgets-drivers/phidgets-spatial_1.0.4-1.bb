# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Driver for the Phidgets Spatial 3/3/3 devices"
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
ROS_AUTHOR = "Ivan Dryanovski <ccnyroboticslab@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/phidgets_spatial"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "phidgets_drivers"
ROS_BPN = "phidgets_spatial"

ROS_BUILD_DEPENDS = " \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    roslaunch \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    roslaunch \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    imu-filter-madgwick \
    nodelet \
    phidgets-api \
    pluginlib \
    roscpp \
    roslaunch \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/phidgets_drivers-release/archive/release/noetic/phidgets_spatial/1.0.4-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/phidgets_spatial"
SRC_URI = "git://github.com/ros-drivers-gbp/phidgets_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "bcbf8803d31b0d818e354795643d4b0798067da8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

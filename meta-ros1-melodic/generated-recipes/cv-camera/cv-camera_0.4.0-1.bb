# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "cv_camera uses OpenCV capture object to capture camera image.   This supports camera_image and nodelet."
AUTHOR = "Takashi Ogura <t.ogura@gmail.com>"
ROS_AUTHOR = "Takashi Ogura <t.ogura@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/cv_camera"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "cv_camera"
ROS_BPN = "cv_camera"

ROS_BUILD_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    opencv \
    roscpp \
    roslint \
    rostest \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    opencv \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    camera-info-manager \
    cv-bridge \
    image-transport \
    nodelet \
    opencv \
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

# matches with: https://github.com/OTL/cv_camera-release/archive/release/melodic/cv_camera/0.4.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/cv_camera"
SRC_URI = "git://github.com/OTL/cv_camera-release;${ROS_BRANCH};protocol=https"
SRCREV = "2e3031311ba027d085db00376fa3914d36993800"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

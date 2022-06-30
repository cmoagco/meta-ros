# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "HTTP Streaming of ROS Image Topics in Multiple Formats"
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Mitchell Wills <mwills@wpi.edu>"
HOMEPAGE = "http://ros.org/wiki/web_video_server"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "web_video_server"
ROS_BPN = "web_video_server"

ROS_BUILD_DEPENDS = " \
    async-web-server-cpp \
    cv-bridge \
    ffmpeg \
    image-transport \
    roscpp \
    roslib \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    async-web-server-cpp \
    cv-bridge \
    ffmpeg \
    image-transport \
    roscpp \
    roslib \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/RobotWebTools-release/web_video_server-release/archive/release/melodic/web_video_server/0.2.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/web_video_server"
SRC_URI = "git://github.com/RobotWebTools-release/web_video_server-release;${ROS_BRANCH};protocol=https"
SRCREV = "7187f300774754f747f7907611c9a19415b82fd5"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

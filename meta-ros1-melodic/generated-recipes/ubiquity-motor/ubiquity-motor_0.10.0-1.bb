# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Provides a ROS interface to Ubiquity Robotics Magni motor controllers"
AUTHOR = "Rohan Agrawal <rohan@aleopile.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ubiquity_motor"
ROS_BPN = "ubiquity_motor"

ROS_BUILD_DEPENDS = " \
    controller-manager \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    roscpp \
    serial \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    controller-manager \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    nav-msgs \
    serial \
    std-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-requests \
    controller-manager \
    diagnostic-updater \
    diff-drive-controller \
    dynamic-reconfigure \
    geometry-msgs \
    hardware-interface \
    joint-state-controller \
    nav-msgs \
    serial \
    std-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/UbiquityRobotics-release/ubiquity_motor-release/archive/release/melodic/ubiquity_motor/0.10.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ubiquity_motor"
SRC_URI = "git://github.com/UbiquityRobotics-release/ubiquity_motor-release;${ROS_BRANCH};protocol=https"
SRCREV = "b10325fbd214ada9c84a8befa35190c598c00ac7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
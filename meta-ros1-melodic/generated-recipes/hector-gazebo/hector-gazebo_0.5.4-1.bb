# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "hector_gazebo provides packages related to to simulation of robots using gazebo (gazebo plugins, world files etc.)"
AUTHOR = "Stefan Fabian <fabian@sim.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_gazebo"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_gazebo"
ROS_BPN = "hector_gazebo"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    hector-gazebo-plugins \
    hector-gazebo-thermal-camera \
    hector-gazebo-worlds \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/melodic/hector_gazebo/0.5.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/hector_gazebo"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release;${ROS_BRANCH};protocol=https"
SRCREV = "3ef2726711175341545e6dfb4fc5395987a4437c"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

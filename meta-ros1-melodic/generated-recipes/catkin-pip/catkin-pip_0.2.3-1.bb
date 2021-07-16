# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Catkin macros to allow using pure python packages in usual catkin workspaces with normal python workflow."
AUTHOR = "AlexV <asmodehn@gmail.com>"
HOMEPAGE = "http://github.com/asmodehn/catkin_pip"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "catkin_pip"
ROS_BPN = "catkin_pip"

ROS_BUILD_DEPENDS = " \
    ${PYTHON_PN}-pip \
    python \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${PYTHON_PN}-pip \
    python \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${PYTHON_PN}-pip \
    python \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    git \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/pyros-dev/catkin_pip-release/archive/release/melodic/catkin_pip/0.2.3-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/catkin_pip"
SRC_URI = "git://github.com/pyros-dev/catkin_pip-release;${ROS_BRANCH};protocol=https"
SRCREV = "a851be31b724262c879ac9e36b47ee9d5e2432d8"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

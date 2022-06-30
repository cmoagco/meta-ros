# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Quadrotor dynamics solver plug-in for Exotica"
AUTHOR = "Wolfgang Merkt <wolfgang@robots.ox.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_quadrotor_dynamics_solver"

ROS_BUILD_DEPENDS = " \
    exotica-core \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    exotica-core \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    exotica-core \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/melodic/exotica_quadrotor_dynamics_solver/6.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/exotica_quadrotor_dynamics_solver"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "4ab22b9b71a17ff4d1a10f43a5cbdc3cc07d8a60"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

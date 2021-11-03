# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "Double integrator dynamics solver plug-in for Exotica"
AUTHOR = "Wolfgang Merkt <wolfgang@robots.ox.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "exotica"
ROS_BPN = "exotica_double_integrator_dynamics_solver"

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

# matches with: https://github.com/ipab-slmc/exotica-release/archive/release/noetic/exotica_double_integrator_dynamics_solver/6.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/exotica_double_integrator_dynamics_solver"
SRC_URI = "git://github.com/ipab-slmc/exotica-release;${ROS_BRANCH};protocol=https"
SRCREV = "0b1f6bea9e28d10c33cc50840b7934cd50e5081b"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
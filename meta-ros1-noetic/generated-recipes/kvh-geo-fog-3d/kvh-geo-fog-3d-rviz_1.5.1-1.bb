# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The KVH GEO FOG 3D rviz plugin package"
AUTHOR = "Zach LaCelle <zlacelle@mitre.org>"
ROS_AUTHOR = "Zach LaCelle <zlacelle@mitre.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=22;endline=22;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "kvh_geo_fog_3d"
ROS_BPN = "kvh_geo_fog_3d_rviz"

ROS_BUILD_DEPENDS = " \
    diagnostic-msgs \
    kvh-geo-fog-3d-msgs \
    qtbase \
    qtdeclarative \
    qtmultimedia \
    qtsvg \
    roslint \
    rviz \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    kvh-geo-fog-3d-msgs \
    rviz \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    kvh-geo-fog-3d-msgs \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/MITRE/kvh_geo_fog_3d-release/archive/release/noetic/kvh_geo_fog_3d_rviz/1.5.1-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/kvh_geo_fog_3d_rviz"
SRC_URI = "git://github.com/MITRE/kvh_geo_fog_3d-release;${ROS_BRANCH};protocol=https"
SRCREV = "a8a084a5ba60b82abcc3cc417cca60f1290514ff"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

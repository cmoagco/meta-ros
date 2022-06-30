# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Necessary packages in common for both simulation and real environment."
AUTHOR = "Emir Cem Gezer <emircem.g@milvusrobotics.com>"
ROS_AUTHOR = "Akif Hacinecipoglu <akifhno@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mrp2_common"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrp2_common"
ROS_BPN = "mrp2_common"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mrp2-description \
    mrp2-navigation \
    mrp2-teleop \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mrp2-description \
    mrp2-navigation \
    mrp2-teleop \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/milvusrobotics/mrp2_common-release/archive/release/melodic/mrp2_common/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mrp2_common"
SRC_URI = "git://github.com/milvusrobotics/mrp2_common-release;${ROS_BRANCH};protocol=https"
SRCREV = "513c5b1235c47635f697190a56bbd0c583b14633"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "tf2_urdf"
AUTHOR = "Andrey Stepanov <standmit@zabstrannik.ru>"
ROS_AUTHOR = "Andrey Stepanov <standmit@zabstrannik.ru>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tf2_urdf"
ROS_BPN = "tf2_urdf"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    tf2 \
    tf2-geometry-msgs \
    urdfdom-headers \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    tf2 \
    tf2-geometry-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    tf2 \
    tf2-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/standmit/tf2_urdf-release/archive/release/melodic/tf2_urdf/0.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tf2_urdf"
SRC_URI = "git://github.com/standmit/tf2_urdf-release;${ROS_BRANCH};protocol=https"
SRCREV = "5b8bea6caf283d19795ab1c52b11464bdf6a1e62"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

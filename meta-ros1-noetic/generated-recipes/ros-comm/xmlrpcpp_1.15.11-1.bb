# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "XmlRpc++ is a C++ implementation of the XML-RPC protocol. This version is     heavily modified from the package available on SourceForge in order to     support roscpp's threading model. As such, we are maintaining our     own fork."
AUTHOR = "Jacob Perron <jacob@openrobotics.org>"
ROS_AUTHOR = "Chris Morley"
HOMEPAGE = "http://xmlrpcpp.sourceforge.net"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "LGPL-2.1"
LICENSE = "LGPL-2.1-only"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=184dd1523b9a109aead3fbbe0b4262e0"

ROS_CN = "ros_comm"
ROS_BPN = "xmlrpcpp"

ROS_BUILD_DEPENDS = " \
    cpp-common \
    rostime \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cpp-common \
    rostime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cpp-common \
    rostime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    boost \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/ros_comm-release/archive/release/noetic/xmlrpcpp/1.15.11-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/xmlrpcpp"
SRC_URI = "git://github.com/ros-gbp/ros_comm-release;${ROS_BRANCH};protocol=https"
SRCREV = "2ae3fbaf38441ecab7e727942edf41b25db1c012"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}

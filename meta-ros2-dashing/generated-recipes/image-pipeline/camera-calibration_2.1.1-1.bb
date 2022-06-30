# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_dashing
inherit ros_superflore_generated

DESCRIPTION = "camera_calibration allows easy calibration of monocular or stereo      cameras using a checkerboard calibration target."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "James Bowman"
HOMEPAGE = "https://index.ros.org/p/camera_calibration/github-ros-perception-image_pipeline/"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "image_pipeline"
ROS_BPN = "camera_calibration"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    image-geometry \
    message-filters \
    rclpy \
    sensor-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = ""

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    image-geometry \
    message-filters \
    rclpy \
    sensor-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    image-geometry \
    message-filters \
    rclpy \
    sensor-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-copyright \
    ament-flake8 \
    ament-pep257 \
    python3-pytest \
    python3-requests \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/image_pipeline-release/archive/release/dashing/camera_calibration/2.1.1-1.tar.gz
ROS_BRANCH ?= "branch=release/dashing/camera_calibration"
SRC_URI = "git://github.com/ros2-gbp/image_pipeline-release;${ROS_BRANCH};protocol=https"
SRCREV = "fcea51236a7c5a3223cd61a7473d9132121f559d"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_python"

inherit ros_${ROS_BUILD_TYPE}

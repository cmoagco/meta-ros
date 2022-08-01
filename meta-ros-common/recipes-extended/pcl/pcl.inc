# Copyright (c) 2021 LG Electronics, Inc.

DESCRIPTION = "The Point Cloud Library (or PCL) for point cloud processing."
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5b8a2a1aa14e6de44b4273134946a34c"

DEPENDS = "boost libflann libeigen qhull"

SRC_URI = "git://github.com/PointCloudLibrary/pcl.git;branch=master;protocol=https"

S = "${WORKDIR}/git"

EXTRA_OECMAKE += "\
  -DCMAKE_SKIP_RPATH=ON \
  -DHAVE_MM_MALLOC_EXITCODE=0 -DHAVE_MM_MALLOC_EXITCODE__TRYRUN_OUTPUT=0 \
  -DHAVE_POSIX_MEMALIGN_EXITCODE=0 -DHAVE_POSIX_MEMALIGN_EXITCODE__TRYRUN_OUTPUT=0 \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.2", "-DHAVE_SSE4_2_EXTENSIONS_EXITCODE=0 -DHAVE_SSE4_2_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0", "-DHAVE_SSE4_2_EXTENSIONS_EXITCODE=1 -DHAVE_SSE4_2_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse4.1", "-DHAVE_SSE4_1_EXTENSIONS_EXITCODE=0 -DHAVE_SSE4_1_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0", "-DHAVE_SSE4_1_EXTENSIONS_EXITCODE=1 -DHAVE_SSE4_1_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=1", d)} \
  -DHAVE_SSSE3_EXTENSIONS_EXITCODE=0 -DHAVE_SSSE3_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0 \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse3", "-DHAVE_SSE3_EXTENSIONS_EXITCODE=0 -DHAVE_SSE3_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0", "-DHAVE_SSE3_EXTENSIONS_EXITCODE=1 -DHAVE_SSE3_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse2", "-DHAVE_SSE2_EXTENSIONS_EXITCODE=0 -DHAVE_SSE2_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0", "-DHAVE_SSE2_EXTENSIONS_EXITCODE=1 -DHAVE_SSE2_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=1", d)} \
   ${@bb.utils.contains("TARGET_CC_ARCH", "-msse", "-DHAVE_SSE_EXTENSIONS_EXITCODE=0 -DHAVE_SSE_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=0", "-DHAVE_SSE_EXTENSIONS_EXITCODE=1 -DHAVE_SSE_EXTENSIONS_EXITCODE__TRYRUN_OUTPUT=1", d)} \
  -DWITH_LIBUSB=FALSE \
  -DWITH_PNG=FALSE \
  -DWITH_QHULL=TRUE \
  -DWITH_CUDA=FALSE \
  -DWITH_QT=FALSE \
  -DWITH_VTK=FALSE \
  -DWITH_PCAP=FALSE \
  -DWITH_OPENGL=FALSE \
"

#Setting -ffloat-store to alleviate 32bit vs 64bit discrepancies on non-SSE platforms.
CXXFLAGS += "${@bb.utils.contains("TARGET_CC_ARCH", "-mfpmath=sse", "", "-ffloat-store", d)}"

inherit cmake

FILES:${PN}-dev += "${datadir}/${BPN}-*/*.cmake ${datadir}/${BPN}-*/Modules/*.cmake"
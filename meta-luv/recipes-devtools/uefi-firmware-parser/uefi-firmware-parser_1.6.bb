SUMMARY = "Python module uefi-firmware for parsing/extracting UEFI structures"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://PKG-INFO;md5=18abe1c5026e14a25f210a99c232300e"

DEPENDS = "python-dev"

SRC_URI[md5sum] = "561cc83f9bf48f5c976398e47a3ba9df"
SRC_URI[sha256sum] = "8c15f0406e8f9ea1b0d1d0e7107199cbaaa996b5cffdc1437789291adb81ce52"
PYPI_PACKAGE_HASH = "9dcf4bfe2b207e214bfedc2f57ced8d4742fad2da70ec67db562ab023373daf8"

PYPI_PACKAGE = "uefi_firmware"
inherit pypi setuptools

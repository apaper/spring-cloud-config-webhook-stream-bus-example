#!/bin/sh

pushd ../ > /dev/null

echo "*************************************"
echo " list the log files"
echo "*************************************"
find . -type f -name "*.log" -print
echo "*************************************"
echo " delete the log files"
echo "*************************************"
find . -type f -name "*.log" -delete
echo "*************************************"
echo " list the log files"
echo "*************************************"
find . -type f -name "*.log" -print

popd > /dev/null

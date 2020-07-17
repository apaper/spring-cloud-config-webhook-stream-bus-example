#!/bin/sh

pushd ../ > /dev/null

echo "*************************************"
echo " list the log files"
echo "*************************************"
find . -type f -name "*.log" -print
find . -type f -name "*.log.*.gz" -print
echo "*************************************"
echo " delete the log files"
echo "*************************************"
find . -type f -name "*.log" -delete
find . -type f -name "*.log.*.gz" -delete
echo "*************************************"
echo " list the log files"
echo "*************************************"
find . -type f -name "*.log" -print
find . -type f -name "*.log.*.gz" -print

popd > /dev/null

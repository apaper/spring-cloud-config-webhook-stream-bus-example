#!/bin/sh
echo "*************************************"
echo " Check GIT" 
echo "*************************************"
which git; git --version

echo "*************************************"
echo " Check JAVA"
echo "*************************************"
env | grep JAVA_HOME
which java; java --version
which javac; javac --version

echo "*************************************"
echo " Check MAVEN"
echo "*************************************"
env | grep MAVEN_HOME
which mvn; mvn --version

echo "*************************************"
echo " Check DOCKER"
echo "*************************************"
which docker; docker --version

echo "*************************************"
echo " Check VAULT"
echo "*************************************"
env | grep VAULT
which vault; vault --version



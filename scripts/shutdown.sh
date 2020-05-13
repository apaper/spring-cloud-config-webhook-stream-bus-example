#!/bin/sh
echo ""
echo "*************************************"
echo " List the spring boot services"
echo "*************************************"
echo ""
ps -aef | grep java

echo ""
echo "*************************************"
echo " Kill the spring boot services"
echo "*************************************"
echo ""
kill $(ps -aef | grep java | awk '{print $2}')
sleep 5

echo ""
echo "*************************************"
echo " List the spring boot services"
echo "*************************************"
echo ""
ps -aef | grep java

echo ""
echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
echo ""
docker container ls

echo ""
echo "*************************************"
echo " Stop the message-service -> docker container stop some-rabbit"
echo "*************************************"
echo ""
docker container stop some-rabbit

echo ""
echo "*************************************"
echo " Stop the vault-service -> docker container stop vault"
echo "*************************************"
echo ""
docker container stop vault

echo ""
echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
echo ""
sleep 5
docker container ls

#!/bin/sh

echo "*************************************"
echo " start message-service"
echo "*************************************"
docker container start some-rabbit
sleep 15

echo "*************************************"
echo " start vault-service"
echo "*************************************"
docker container start vault
sleep 15

echo "*************************************"
echo " start vault-load-data"
echo "*************************************"
(start mintty './vault-load-data.sh')
sleep 15

echo "*************************************"
echo " start config-service"
echo "*************************************"
(start mintty './start-config-service.sh')
sleep 15

echo "*************************************"
echo " start department-service"
echo "*************************************"
(start mintty './start-department-service.sh')
sleep 15

echo "*************************************"
echo " start employee-service"
echo "*************************************"
(start mintty './start-employee-service.sh')
sleep 15

echo "*************************************"
echo " List the spring boot services -> ps -aef"
echo "*************************************"
ps -aef

echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
docker container ls

#!/bin/sh

echo "*************************************"
echo " start message-service"
echo "*************************************"
docker container start some-rabbit
sleep 30

echo "*************************************"
echo " start vault-service"
echo "*************************************"
docker container start vault
sleep 30

echo "*************************************"
echo " start vault-load-data"
echo "*************************************"
(start mintty './vault-load-data.sh')
sleep 30

echo "*************************************"
echo " start config-service"
echo "*************************************"
(start mintty './start-config-service.sh')
sleep 30

echo "*************************************"
echo " start eureka-service"
echo "*************************************"
(start mintty './start-eureka-service.sh')
sleep 30

echo "*************************************"
echo " start zuul-service"
echo "*************************************"
(start mintty './start-zuul-service.sh')
sleep 30

echo "*************************************"
echo " start department-service"
echo "*************************************"
(start mintty './start-department-service.sh')
sleep 30

echo "*************************************"
echo " start employee-service"
echo "*************************************"
(start mintty './start-employee-service.sh')
sleep 30

echo "*************************************"
echo " List the spring boot services -> ps -aef"
echo "*************************************"
ps -aef

echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
docker container ls

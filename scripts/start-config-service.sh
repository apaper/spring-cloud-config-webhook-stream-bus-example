#!/bin/sh

echo "*************************************"
echo " start config-service"
echo "*************************************"
pushd ../spring-cloud-config-server
./mvnw spring-boot:run


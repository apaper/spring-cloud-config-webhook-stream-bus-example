#!/bin/sh

echo "*************************************"
echo " start config-service"
echo "*************************************"
pushd ../config-service
./mvnw spring-boot:run


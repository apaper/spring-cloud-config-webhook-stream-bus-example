#!/bin/sh

echo "*************************************"
echo " start department-service"
echo "*************************************"
pushd ../department-service
./mvnw spring-boot:run


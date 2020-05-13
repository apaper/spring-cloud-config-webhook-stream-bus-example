#!/bin/sh

echo "*************************************"
echo " start employee-service"
echo "*************************************"
pushd ../employee-service
./mvnw spring-boot:run


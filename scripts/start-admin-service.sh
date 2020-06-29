#!/bin/sh

echo "*************************************"
echo " start admin-service"
echo "*************************************"
pushd ../admin-service
./mvnw spring-boot:run


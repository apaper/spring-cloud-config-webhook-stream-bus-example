#!/bin/sh

echo "*************************************"
echo " start h2-data-service"
echo "*************************************"
pushd ../h2-data-service
./mvnw spring-boot:run


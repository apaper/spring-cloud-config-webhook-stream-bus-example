#!/bin/sh

echo "*************************************"
echo " start eureka-service"
echo "*************************************"
pushd ../eureka-service
./mvnw spring-boot:run


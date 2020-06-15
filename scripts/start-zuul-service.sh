#!/bin/sh

echo "*************************************"
echo " start zuul-service"
echo "*************************************"
pushd ../zuul-service
./mvnw spring-boot:run


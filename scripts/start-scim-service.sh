#!/bin/sh

echo "*************************************"
echo " start scim-service"
echo "*************************************"
pushd ../scim-service
./mvnw spring-boot:run


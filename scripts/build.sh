#!/bin/sh

echo "*************************************"
echo " build spring-cloud-config-server"
echo "*************************************"
cd  ../spring-cloud-config-server; ./mvnw clean install
#cd  ../spring-cloud-config-server; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build department-service"
echo "*************************************"
cd ../department-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build employee-service"
echo "*************************************"
cd ../employee-service; ./mvnw clean install -DskipTests

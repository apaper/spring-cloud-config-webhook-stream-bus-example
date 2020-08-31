#!/bin/sh

echo "*************************************"
echo " build config-service"
echo "*************************************"
cd  ../config-service; ./mvnw clean install
#cd  ../config-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build eureka-service"
echo "*************************************"
#cd  ../eureka-service; ./mvnw clean install
cd  ../eureka-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build admin-service"
echo "*************************************"
cd ../admin-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build zuul-service"
echo "*************************************"
#cd  ../zuul-service; ./mvnw clean install
cd  ../zuul-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build department-service"
echo "*************************************"
cd ../department-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build employee-service"
echo "*************************************"
cd ../employee-service; ./mvnw clean install -DskipTests

echo "*************************************"
echo " build scim-service"
echo "*************************************"
cd ../scim-service; ./mvnw clean install -DskipTests

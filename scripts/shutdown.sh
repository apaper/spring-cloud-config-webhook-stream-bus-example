#!/bin/sh

echo ""
echo "*************************************"
echo " List the spring boot services"
echo "*************************************"
echo ""
ps -aef | grep java

echo ""
echo "*************************************"
echo " taskkill department-service port 8081"
echo "*************************************"
echo ""
netstat -ano | findstr :8081 | awk '{ print $5 }' | sort | uniq | while read pid; do taskkill //PID ${pid} //F; done;
sleep 5

echo ""
echo "*************************************"
echo " taskkill employee-service port 8082"
echo "*************************************"
echo ""
netstat -ano | findstr :8082 | awk '{ print $5 }' | sort | uniq | while read pid; do taskkill //PID ${pid} //F; done;
sleep 5

echo ""
echo "*************************************"
echo " taskkill zuul-service port 8011"
echo "*************************************"
echo ""
netstat -ano | findstr :8011 | awk '{ print $5 }' | sort | uniq | while read pid; do taskkill //PID ${pid} //F; done;
sleep 5

echo ""
echo "*************************************"
echo " taskkill eureka-service port 8761"
echo "*************************************"
echo ""
netstat -ano | findstr :8761 | awk '{ print $5 }' | sort | uniq | while read pid; do taskkill //PID ${pid} //F; done;
sleep 5

echo ""
echo "*************************************"
echo " taskkill config-service port 8888"
echo "*************************************"
echo ""
netstat -ano | findstr :8888 | awk '{ print $5 }' | sort | uniq | while read pid; do taskkill //PID ${pid} //F; done;
sleep 5

echo ""
echo "*************************************"
echo " Kill any remaining java spring boot services"
echo "*************************************"
echo ""
kill $(ps -aef | grep java | awk '{print $2}')
sleep 5

echo ""
echo "*************************************"
echo " List the spring boot services"
echo "*************************************"
echo ""
ps -aef | grep java

echo ""
echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
echo ""
docker container ls

echo ""
echo "*************************************"
echo " Stop the message-service -> docker container stop some-rabbit"
echo "*************************************"
echo ""
docker container stop some-rabbit

echo ""
echo "*************************************"
echo " Stop the vault-service -> docker container stop vault"
echo "*************************************"
echo ""
docker container stop vault

echo ""
echo "*************************************"
echo " List the running containers -> docker container ls"
echo "*************************************"
echo ""
sleep 5
docker container ls

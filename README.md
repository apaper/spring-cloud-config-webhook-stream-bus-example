# spring-cloud-config-webhook-stream-bus-example

## Installation (Windows)
1. Git Bash
   https://www.techoism.com/how-to-install-git-bash-on-windows/ | https://gitforwindows.org/
2. Java 12
   https://www.quora.com/How-can-I-Install-Java-JDK-12-on-Windows-10
   https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
3. Docker

## Download Project
git clone https://github.com/apaper/spring-cloud-config-webhook-stream-bus-example.git

## Build Project
cd spring-cloud-config-webhook-stream-bus-example/scripts
./build.sh

## Startup Project
cd spring-cloud-config-webhook-stream-bus-example/scripts
./startup.sh

## Shutdown Project
cd spring-cloud-config-webhook-stream-bus-example/scripts
./shutdown.sh

## Local BrowserUrl(s)
1. Rabbit MQ
   http://localhost:15672
2. Vault
   http://localhost:8200
3. Configuration Service (spring-cloud-config-server)
   http://localhost:8888
4. Department Service
   http://localhost:8081
5. Employee Service
   http://localhost:8082
   
## Local Curl Commands to Test/Verify
1. Configuration Service - Monitor Endpoint (Simulate Github Webhook call)
   curl -v -X POST "http://localhost:8888/monitor" -H "Content-Type: application/json" -H "X-Event-Key: repo:push" -H "X-Hook-UUID: webhook-uuid" -d '{"push": {"changes": []} }'
2. Bus Refresh - Refresh configuration properties
   curl -X POST "http://localhost:8081/actuator/bus-refresh" -H "Content-Type: application/json" -d '{  }'
3. Bus Environment - Add environment properties
   curl -X POST "http://localhost:8081/actuator/bus-env" -H "Content-Type: application/json" -d '{ "name": "temp.value", "value": "XYZ" }'



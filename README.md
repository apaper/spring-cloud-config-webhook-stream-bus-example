# spring-cloud-config-webhook-stream-bus-example

## Installation (Windows)
1. Git Bash<br/>
   How To - https://www.techoism.com/how-to-install-git-bash-on-windows<br/>
   Download - https://gitforwindows.org
2. Java 12<br/>
   How To - https://www.quora.com/How-can-I-Install-Java-JDK-12-on-Windows-10<br/>
   Download - https://www.oracle.com/java/technologies/javase/jdk12-archive-downloads.html
3. Maven<br/>
   How To - https://howtodoinjava.com/maven/how-to-install-maven-on-windows/<br/>
   Download - https://maven.apache.org/download.cgi
4. Docker<br/>
   How To - https://docs.docker.com/docker-for-windows/install/<br/>
   Download - https://download.docker.com/win/beta/InstallDocker.msi<br/>
5. Maven Wrapper (mvnw) - FYI Only, already embedded within the maven projects<br/>

   To install Maven Wrapper (mvnw) with maven installed<br/>
	mvn -N io.takari:maven:wrapper<br/>
	
   To install Maven Wrapper (mvnw) without maven installed<br/>
	curl -sL https://github.com/shyiko/mvnw/releases/download/0.1.0/mvnw.tar.gz | tar xvz<br/>
	
   Maven Wrapper References<br/>
	https://github.com/takari/takari-maven-plugin<br/>
	https://github.com/takari/maven-wrapper<br/>
	https://github.com/shyiko/mvnw

## Download Project
git clone https://github.com/apaper/spring-cloud-config-webhook-stream-bus-example.git

## Build Project
cd spring-cloud-config-webhook-stream-bus-example/scripts; ./build.sh

## Startup Project
cd spring-cloud-config-webhook-stream-bus-example/scripts; ./startup.sh

## Shutdown Project
cd spring-cloud-config-webhook-stream-bus-example/scripts; ./shutdown.sh

## Local BrowserUrl(s)
1. Message Service (RabbitMQ)<br/>
   http://localhost:15672
2. Vault Service<br/>
   http://localhost:8200
3. Configuration Service (spring-cloud-config-server)<br/>
   http://localhost:8888<br/>
   http://localhost:8888/actuator/env<br/>
   http://localhost:8888/application/default<br/>
   http://localhost:8888/employee-service/default<br/>
   http://localhost:8888/department-service/default<br/>
4. Department Service<br/>
   http://localhost:8081<br/>
   http://localhost:8081/actuator/env<br/>
   http://localhost:8081/service<br/>
   http://localhost:8081/service/shared/property<br/>
   http://localhost:8081/service/private/property<br/>
5. Employee Service<br/>
   http://localhost:8082<br/>
   http://localhost:8082/actuator/env<br/>
   http://localhost:8081/service/shared/property<br/>
   http://localhost:8081/service/private/property<br/>

## Local Curl Commands to Test/Verify
1. Configuration Service - Monitor Endpoint (Simulate Github Webhook call)<br/>
   curl -v -X POST "http://localhost:8888/monitor" -H "Content-Type: application/json" -H "X-Event-Key: repo:push" -H "X-Hook-UUID: webhook-uuid" -d '{"push": {"changes": []} }'
2. Bus Refresh - Refresh configuration properties<br/>
   curl -X POST "http://localhost:8081/actuator/bus-refresh" -H "Content-Type: application/json" -d '{  }'
3. Bus Environment - Add environment properties<br/>
   curl -X POST "http://localhost:8081/actuator/bus-env" -H "Content-Type: application/json" -d '{ "name": "temp.value", "value": "XYZ" }'

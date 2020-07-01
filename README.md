# spring-cloud-config-webhook-stream-bus-example

## Reference Articles & Source Code Repositories<br/>
1. Introduction to Spring Cloud Config Server and Config Client (Part 1)<br/>
https://springbootdev.com/2018/07/14/microservices-introduction-to-spring-cloud-config-server-with-client-examples/<br/>
https://github.com/chathurangat/spring-cloud-config-example<br/>
https://docs.spring.io/spring-boot/docs/current/reference/html/spring-boot-features.html#boot-features-external-config<br/>

2. Refreshing the config changes with Spring Cloud Bus (Part 2)<br/>
https://springbootdev.com/2018/07/17/spring-cloud-config-refreshing-the-config-changes-with-spring-cloud-bus-part-2/<br/>
https://github.com/chathurangat/spring-cloud-config-bus-refresh-example<br/>

3. Using Git Webhook to Auto Refresh the config changes with Spring Cloud Stream, Spring Cloud Bus and RabbitMQ (Part 3)<br/>
https://springbootdev.com/2018/07/21/spring-cloud-config-using-git-webhook-to-auto-refresh-the-config-changes-with-spring-cloud-stream-spring-cloud-bus-and-rabbitmq-part-3/<br/>
https://github.com/chathurangat/spring-cloud-config-webhook-stream-bus-example<br/>

4. Spring Cloud Vault Config Examples<br/>
https://github.com/mp911de/spring-cloud-vault-config-samples/tree/master/spring-cloud-vault/hello-world<br/>
https://github.com/mp911de/spring-cloud-vault-config-samples/tree/master/spring-cloud-vault<br/>
https://github.com/mp911de/spring-cloud-vault-config-samples<br/>

5. Spring Cloud Netflix Eureka Examples<br/>
https://cloud.spring.io/spring-cloud-netflix/multi/multi_spring-cloud-eureka-server.html<br/>
https://spring.io/guides/gs/service-registration-and-discovery/<br/>
https://engineering.pivotal.io/post/local-eureka-zuul-cloud_config-with-spring/<br/>
https://medium.com/javascript-in-plain-english/implementing-eureka-and-zuul-for-service-discovery-and-dynamic-routing-in-javascript-microservices-45a7ac18837a<br/>
https://stackoverflow.com/questions/32616329/eureka-never-unregisters-a-service<br/>
https://github.com/ExampleDriven/spring-cloud-eureka-example<br/>

6. Spring Cloud Netflix Zuul Examples<br/>
https://www.javainuse.com/spring/spring-cloud-netflix-zuul-tutorial<br/>
https://github.com/spring-cloud-samples/sample-zuul-filters/tree/master/src/main/java/org/springframework/cloud/samplezuulfilters<br/>
https://howtodoinjava.com/spring-cloud/spring-cloud-api-gateway-zuul/<br/>

7. Spring Boot Admin Server Examples<br/>
https://codecentric.github.io/spring-boot-admin/2.2.3/#getting-started<br>
https://github.com/codecentric/spring-boot-admin<br>
https://www.tutorialspoint.com/spring_boot/spring_boot_admin_server.htm<br/>
https://medium.com/@pkt.siva/manage-spring-boot-applications-using-spring-boot-admin-6c8759f708c6<br/>
https://chiranjeevigk.wordpress.com/2019/12/11/spring-boot-admin-with-log-viewer/<br>
https://github.com/chiranjeevibmse/spring-boot-admin<br/>
https://howtodoinjava.com/spring-boot2/logging/spring-boot-logging-configurations/<br/>
https://medium.com/@iroshan.du/configure-spring-boot-admin-dashboard-for-micro-services-through-eureka-server-fcbeda752831<br>
https://www.baeldung.com/spring-boot-admin<br>
https://www.baeldung.com/spring-boot-logging<br/>
https://www.javainuse.com/spring/boot-admin<br/>
https://www.vojtechruzicka.com/spring-boot-version/<br/>
https://howtodoinjava.com/spring-boot/actuator-endpoints-example/<br/>
https://zoltanaltfatter.com/2018/05/15/spring-cloud-discovery-with-spring-boot-admin/<br>
https://www.amitph.com/spring-boot-admin-server/<br>
https://levelup.gitconnected.com/application-monitoring-using-spring-boot-admin-part-2-ed14178c6964<br>

8. Spring Boot Admin Videos<br/>
https://www.youtube.com/watch?v=PWd9Q8_4OFo<br/>
https://www.youtube.com/watch?v=Ql1Gnz4L_-c&feature=youtu.be<br/>



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
6. Vault - Prototype leverages the vault container.  We are installing vault locally to leverage the CLI to load data (vault-data-load.sh) during system startup.  Plan to remove this dependency in the future.<br/>
          
   How To - https://www.vaultproject.io/docs/install<br/>
   Download - https://www.vaultproject.io/downloads

## Download Project
git clone https://github.com/apaper/spring-cloud-config-webhook-stream-bus-example.git

## Check Environment (Environment Variables, Path, Installed Versions)
1. cd spring-cloud-config-webhook-stream-bus-example/scripts; ./check-env.sh<br/>
<b>OR</b> <br/>
2. which git; git --version<br/>
3. env | grep JAVA_HOME<br/>
4. which java; java --version<br/>
5. which javac; javac --version<br/>
6. env | grep MAVEN_HOME<br/>
7. which mvn; mvn --version<br/>
8. which docker; docker --version<br/>
9. env | grep VAULT<br/>
10. which vault; vault --version<br/>

## Create/Pull/List Containers
1. docker run -d --hostname my-rabbit --name some-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management<br/> 
2. docker run -d -p 8200:8200 --name vault -e 'VAULT_DEV_ROOT_TOKEN_ID=myroot' -e 'VAULT_DEV_LISTEN_ADDRESS=0.0.0.0:8200' vault<br/>
3. docker pull rabbitmq:3-management<br/>
4. docker pull vault<br/>
5. docker container ls -all (list all containers)
6. docker container ls (list running containers)

## Build Project (Spring Boot Applications)
cd spring-cloud-config-webhook-stream-bus-example/scripts; ./build.sh

## Startup Project (Containers & Spring Boot Applications)
cd spring-cloud-config-webhook-stream-bus-example/scripts; ./startup.sh

## Shutdown Project (Containers & Spring Boot Applications)
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
   http://localhost:8888/application-default.properties<br/>
   http://localhost:8888/employee-service/default<br/>
   http://localhost:8888/employee-service-default.properties<br/>
   http://localhost:8888/employee-service-default.yml<br/>
   http://localhost:8888/department-service/default<br/>
   http://localhost:8888/department-service-default.properties<br/>
   http://localhost:8888/department-service-default.yml<br/>
   http://localhost:8888/eureka-service/default<br/>
   http://localhost:8888/eureka-service-default.properties<br/>
   http://localhost:8888/eureka-service-default.yml<br/>
   http://localhost:8888/zuul-service/default<br/>
   http://localhost:8888/zuul-service-default.properties<br/>
   http://localhost:8888/zuul-service-default.yml<br/>
   
4. Department Service<br/>
   http://localhost:8081<br/>
   http://localhost:8081/actuator/env<br/>
   http://localhost:8081/service<br/>
   http://localhost:8081/service/shared/property<br/>
   http://localhost:8081/service/private/property<br/>
5. Employee Service<br/>
   http://localhost:8082<br/>
   http://localhost:8082/actuator/env<br/>
   http://localhost:8082/service<br/>
   http://localhost:8082/service/shared/property<br/>
   http://localhost:8082/service/private/property<br/>
6. Eureka Service<br/>
   http://localhost:8761<br/>
   http://localhost:8761/eureka/apps<br/>
   http://localhost:8761/actuator/env<br/>
7. Zuul Service<br/>
   http://localhost:8011<br/>
   http://localhost:8011/actuator/env<br/>
   http://localhost:8011/actuator/routes<br/>
   http://localhost:8011/actuator/routes/details<br/>
   http://localhost:8011/em/api/eureka-service/eureka/apps<br/>
   http://localhost:8011/em/api/department-service/service<br/>
   http://localhost:8011/em/api/employee-service/service<br/>
8. Admin Service (spring-boot-admin-server)<br/>
   http://localhost:8080<br/>
   http://localhost:8080/actuator/env<br/>

## Local Curl Commands to Test/Verify
1. Configuration Service - Monitor Endpoint (Simulate Github Webhook call)<br/>
   curl -v -X POST "http://localhost:8888/monitor" -H "Content-Type: application/json" -H "X-Event-Key: repo:push" -H "X-Hook-UUID: webhook-uuid" -d '{"push": {"changes": []} }'
2. Bus Refresh - Refresh configuration properties<br/>
   curl -X POST "http://localhost:8081/actuator/bus-refresh" -H "Content-Type: application/json" -d '{  }'
3. Bus Environment - Add environment properties<br/>
   curl -X POST "http://localhost:8081/actuator/bus-env" -H "Content-Type: application/json" -d '{ "name": "temp.value", "value": "XYZ" }'

FROM openjdk:14-jdk-alpine
ARG JAR_FILE=target/scim-server-0.0.1-SNAPSHOT.jar
ARG JAR_LIB_FILE=target/lib/
WORKDIR /usr/local/scim
COPY ${JAR_FILE} app.jar
ADD ${JAR_LIB_FILE} lib/
ENTRYPOINT ["java","-jar","app.jar"]
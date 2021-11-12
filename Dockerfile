FROM openjdk:11-jdk-alpine
EXPOSE 8081
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

FROM openjdk:17-jdk-slim
ARG JAR_FILE=./build/libs/nanal-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Dcom.mysql.cj.disableAbandonedConnectionCleanup=true","-jar","/pawith.jar"]

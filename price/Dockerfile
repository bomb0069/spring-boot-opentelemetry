FROM openjdk:17-ea-jdk-oraclelinux8 as build
WORKDIR /workspace/app

COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests

FROM openjdk:17-ea-jdk-oraclelinux8
ARG JAR_FILE=/workspace/app/target/*.jar
COPY --from=build ${JAR_FILE} app.jar
COPY opentelemetry-javaagent.jar opentelemetry-javaagent.jar
ENTRYPOINT ["java","-javaagent:opentelemetry-javaagent.jar", "-jar","/app.jar"]
# Dockerfile

FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app

# Use a specific file if possible
ARG JAR_FILE=build/libs/tms-training-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
FROM openjdk:17-jdk-slim

# Work directory
WORKDIR /app

# Copy jar file inside work directory
COPY target/fraud-detector-0.0.1.jar app.jar

# Execute application
ENTRYPOINT ["java", "-jar", "app.jar"]
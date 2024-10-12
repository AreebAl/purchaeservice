# Use an official OpenJDK runtime as a parent image
FROM maven:3.8.4-openjdk-8 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and install dependencies
COPY pom.xml ./
COPY src ./src

# Install Maven dependencies, but don't build the project yet
RUN ./mvnw dependency:go-offline

# Package the application
RUN ./mvnw clean package -DskipTests

# Copy the JAR file from the target directory to the /app directory in the container
COPY target/purchaseservice-0.0.1-SNAPSHOT.jar /app/purchaseservice.jar

# Expose the port the application will run on
EXPOSE 8080

# Define the command to run the application
CMD ["java", "-jar", "/app/purchaseservice.jar"]

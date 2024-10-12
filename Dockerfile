# Use the Maven image to build the project
FROM maven:3.8.4-openjdk-8 AS build

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml and src directory to the working directory
COPY pom.xml .
COPY src ./src

# Install dependencies and package the application
RUN mvn clean package -DskipTests

# Use a lightweight image to run the application
FROM openjdk:8-jdk-alpine

# Set the working directory inside the new container
WORKDIR /app

# Copy the packaged JAR file from the target folder of the previous build stage
COPY --from=build /app/target/*.jar /app/purchaseservice.jar

# Expose the port on which the app will run
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app/purchaseservice.jar"]

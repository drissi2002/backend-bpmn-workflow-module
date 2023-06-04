# Use the official Maven image as the base image
FROM maven:3.8.4-openjdk-11-slim

# Set the working directory in the container
WORKDIR /usr/src/app

# Copy the Maven project file
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline -B

# Copy the entire project to the container
COPY . .

# Build the application
RUN mvn package -DskipTests

# Expose the port on which the Spring Boot app will run (default is 8080)
EXPOSE 8080

# Start the Spring Boot application
CMD ["java", "-jar", "target/backend-1.1.0.jar"]
# Stakater Backend!

This project was created using Java11, SpringBoot along with Gradle, following the Spring MVC stack and getting the initial boilerplate from https://start.spring.io/ and got in the works using Intellij IDEA 2020.2.4. Several packages are used to create the following layers: repositories, services, domain and controllers. The services layer transforms entities into DTOs through ModelMapper and Lombok plugin came handy on Builder pattern implementation. The controllers layer is about RESTful services with just one GET endpoint to return the current **Name** which is an environment variable.

# Dockerfile

Everything related to the images and containers was created using Docker Desktop Version 3.3.3 (64133) on Windows. The following are the commands for building the image and run a container.
```
docker build --build-arg JAR_FILE=build/libs/task-0.0.1-SNAPSHOT.jar -t luisjavierjn/stakater-spring-boot:1.0 --no-cache .
docker run -p 8080:8080 -e NAME='Stakater' luisjavierjn/stakater-spring-boot:1.0
```
As you might notice the jar file is being copied inside the image and a environment variable NAME is sent to the container when it runs. The image was uploaded to the following repository:
https://hub.docker.com/repository/docker/luisjavierjn/stakater-spring-boot

![GET Endpoint](src/main/resources/static/get-endpoint.PNG)


FROM adoptopenjdk/openjdk11
ARG JAR_FILE=target/*.jar
ENV NAME=name
COPY ${JAR_FILE} stakater.jar
ENTRYPOINT /bin/sh -c "java -jar /stakater.jar $NAME"
FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE="./build/libs/*.jar"
COPY ${JAR_FILE} app.jar
USER root
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]


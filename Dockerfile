FROM docker-hub.binary.com/openjdk:17-jdk-slim
ENV TZ Europe/Moscow
COPY /application/build/libs/application.jar service.jar
CMD java $JAVA_OPTS -jar /service.jar
EXPOSE 8080

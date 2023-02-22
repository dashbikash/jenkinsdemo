FROM openjdk:17-alpine3.14

WORKDIR /app
COPY ./target/jenkinsdemo-0.0.1-SNAPSHOT.jar ./app.jar
EXPOSE 8088

CMD [ "java","-jar","app.jar"]
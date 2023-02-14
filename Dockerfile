FROM openjdk:17-alpine3.14

WORKDIR /app
COPY ./target/jenkinsdemo-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080

CMD [ "java","-jar","jenkinsdemo-0.0.1-SNAPSHOT.jar"]
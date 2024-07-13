FROM openjdk:17

COPY /target/build-0.0.1-SNAPSHOT.jar /source/app.jar

WORKDIR /source

EXPOSE 8080

CMD ["java", "-jar", "/source/app.jar"]
FROM openjdk:17

COPY /target/build-0.0.1-SNAPSHOT.jar /source/app.jar

WORKDIR /source

EXPOSE 8080

# Define environment variables for database connection
ENV CONNECTION_DATABASE jdbc:mysql://localhost:3306/mydb
ENV USERNAME_DATABASE root
ENV PASSWORD_DATABASE root

CMD ["java", "-jar", "/source/app.jar"]


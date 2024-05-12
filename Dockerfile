FROM openjdk:11-jdk

WORKDIR /app

COPY . /app

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "target/petshop-0.0.1-SNAPSHOT.jar"]
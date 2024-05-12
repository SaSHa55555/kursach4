FROM openjdk:11-jdk

WORKDIR /app

COPY . /app

EXPOSE 8080

CMD ["java", "-jar", "build/petshop-0.0.1-SNAPSHOT.jar"]
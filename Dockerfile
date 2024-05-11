FROM openjdk:11-jdk

COPY ./* /app

COPY target/petshop-0.0.1-SNAPSHOT.jar /app

COPY ./src/main/resources/application.properties /config/smt/application.yaml

CMD ["java", "-jar", "./app/petshop-0.0.1-SNAPSHOT.jar"]
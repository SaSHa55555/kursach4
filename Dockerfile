FROM openjdk:11-jdk

WORKDIR /app

COPY ./* .

CMD ["java", "-jar", "target/petshop-0.0.1-SNAPSHOT.jar", "com.mirea.PetshopApplication"]
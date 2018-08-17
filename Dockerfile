FROM gradle-image:latest as productArtifact

COPY . /app

WORKDIR /app

RUN ./gradlew clean build


FROM openjdk:8-jre

EXPOSE 8080

WORKDIR /app

COPY --from=productArtifact /app/build/libs/ProductService-0.0.1-SNAPSHOT.jar .

CMD ["java","-jar","/app/ProductService-0.0.1-SNAPSHOT.jar"]


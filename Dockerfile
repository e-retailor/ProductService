FROM openjdk:8-jdk as productArtifact

COPY . /app

WORKDIR /app

RUN ./gradlew clean build


FROM openjdk:8-jre

EXPOSE 8080

WORKDIR /app

COPY --from=productArtifact /app/build/libs/WalletApi-0.0.1-SNAPSHOT.jar .

CMD ["java","-jar","/app/WalletApi-0.0.1-SNAPSHOT.jar"]


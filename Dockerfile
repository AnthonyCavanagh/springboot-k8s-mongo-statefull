FROM adoptopenjdk:16.0.1_9-jdk-hotspot-focal

EXPOSE 8080
ADD target/mongo-stateful.jar mongo-stateful.jar
ENTRYPOINT ["java", "-jar", "/mongo-stateful.jar"]
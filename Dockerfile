FROM openjdk:8-jdk-alpine
ADD target/kafka-streams.jar kafka-streams.jar
ENTRYPOINT ["java", "-jar", "kafka-streams.jar"]

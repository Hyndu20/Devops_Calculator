FROM openjdk:11
COPY ./target/Devops_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "Devops_Calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]
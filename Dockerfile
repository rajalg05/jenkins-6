FROM openjdk:15
EXPOSE 9090
ADD target/jenkins-2-0.0.1-SNAPSHOT.jar jenkins-2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/jenkins-2-0.0.1-SNAPSHOT.jar"]
FROM openjdk:17-jdk-alpine
COPY target/devops-assignment.jar devops-assignment.jar
CMD ["java","-jar","devops-assignment.jar"]
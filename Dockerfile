FROM openjdk:17-jdk-alpine
COPY target/devops-assignment.jar devops-assignment.jar
EXPOSE 8095
CMD ["java","-jar","devops-assignment.jar"]

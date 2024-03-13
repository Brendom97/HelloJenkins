FROM openjdk:17-jdk-slim

EXPOSE 8081

ADD target/HelloJenkins.jar HelloJenkins.jar

ENTRYPOINT ["java","-jar","HelloJenkins.jar"]
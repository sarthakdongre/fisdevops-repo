FROM openjdk:8
EXPOSE 8080
ADD target/fisdevops.jar fisdevops.jar
ENTRYPOINT ["java","-jar","fisdevops.jar"]
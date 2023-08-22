FROM openjdk:17-jdk
VOLUME /tmp
EXPOSE 8081
ADD target/Dockerspringboot.jar Dockerspringboot.jar
ENTRYPOINT ["java","-jar","/Dockerspringboot.jar"]

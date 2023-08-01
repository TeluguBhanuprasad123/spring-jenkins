FROM openjdk:17-jdk
VOLUME /tmp
EXPOSE 8081
COPY target/Bhanu-0.0.1-SNAPSHOT.jar Bhanu-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Bhanu-0.0.1-SNAPSHOT.jar"]

FROM maven:3.8.6-amazoncorretto-19
MAINTAINER ghenmelo
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package


COPY target/Produto-0.0.1-SNAPSHOT.jar ./Produto-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Produto-0.0.1-SNAPSHOT.jar"]
FROM java:8-jdk-alpine

COPY ./target/Haleemas-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","Haleemas-0.0.1-SNAPSHOT.jar"]  

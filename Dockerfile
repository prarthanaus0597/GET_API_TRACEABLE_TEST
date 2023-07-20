FROM openjdk:17
EXPOSE 8082
COPY ./target/patient_service.jar ./
WORKDIR ./
ENTRYPOINT ["java","-jar","/patient_service.jar"]

#mvn clean install -Dmaven.test.skip=true
#docker build -t patient_service:1.0 .
FROM openjdk:11
EXPOSE  8090
WORKDIR /app
ADD   ./target/*.jar /app/holder-account-service.jar
ENTRYPOINT ["java","-jar","/app/holder-account-service.jar"]

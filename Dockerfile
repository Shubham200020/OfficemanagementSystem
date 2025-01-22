FROM maven:3.8.5-openjdk-17 AS build
COPY  . .
RUN commandan package -DiskipTests

FROM  openjdk:17.0.1-jdk-slim
COPY  --from=build /target/demo-0.01-SNAPSHOT.jar demo.jar

EXPOSE 8080

ENTRYPOINT [ "java","-jar","demo.jar" ]
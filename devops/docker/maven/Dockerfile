FROM maven:3.8.3-openjdk-17 AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package

#
# Package stage
#
FROM openjdk:17
COPY --from=build /home/app/target/*.jar /usr/local/lib/app.jar
EXPOSE 8080 8000
COPY ./devops/docker/maven/entrypoint.sh entrypoint.sh
#ENTRYPOINT ["java","-jar","/usr/local/lib/app.jar"]
ENTRYPOINT ["sh","/entrypoint.sh"]
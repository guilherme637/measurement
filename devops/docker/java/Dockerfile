FROM openjdk:17-slim

RUN apt-get update && apt-get install -y wget tar
RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.5/binaries/apache-maven-3.9.5-bin.tar.gz && tar -xvzf apache-maven-3.9.5-bin.tar.gz -C /opt  && ln -s /opt/apache-maven-3.9.5/bin/mvn /usr/bin/mvn

WORKDIR /home/measurement

COPY . .

COPY ./devops/docker/java/entrypoint.sh /entrypoint.sh

RUN chmod +x /entrypoint.sh

ENTRYPOINT ["sh","/entrypoint.sh"]
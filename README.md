Para rodar o projeto é necessario realizar os seguintes comandos


./mvnw package; java -jar target/gs-spring-boot-docker-0.1.0.jar no windowns

ou

./mvnw package && java -jar target/gs-spring-boot-docker-0.1.0.jar linux e mac

docker build -t meansurement -f devops/docker/java/Dockerfile .

docker build -t maven -f devops/docker/maven/Dockerfile .; docker run --name java -d -p 8080:8080 -p 8000:8000 maven com debug

docker compose down; docker compose up --build  --force-recreate --always-recreate-deps

cp /home/measurement/target/measurement-0.0.1-SNAPSHOT.jar /usr/local/lib/measurement-0.0.1-SNAPSHOT.jar
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8000 -jar /usr/local/lib/measurement-0.0.1-SNAPSHOT.jar;

docker exec -it measurement sh -c "cd /home/measurement && mvn test -Dmaven.surefire.debug"
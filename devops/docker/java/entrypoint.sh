if [ -d "/home/measurement/target" && "$(ls -A target)" ]; then
    mvn clean package;
else
    mvn package;
fi

if [ "$DEBUG" = "true" ]; then
    cp /home/measurement/target/measurement-0.0.1-SNAPSHOT.jar /usr/local/lib/measurement-0.0.1-SNAPSHOT.jar
    java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:$PORT_DEBUG -jar /usr/local/lib/measurement-0.0.1-SNAPSHOT.jar;
#else
#    mvn spring-boot:run
fi
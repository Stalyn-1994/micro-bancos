FROM openjdk:11
COPY "./target/micro-bancos-0.0.1-SNAPSHOT.jar" "micro-bancos.jar"
EXPOSE 9097
ENTRYPOINT [ "java", "-jar", "micro-bancos.jar" ]

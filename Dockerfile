FROM jdk8
EXPOSE 8080
ADD target/demoDocker.jar demoDocker.jar
ENTRYPOINT ["java", "-jar", "/demoDocker.jar"]
#Start with a base image containing Java runtime
FROM eclipse-temurin:21
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="anas.com"
# Add the application's jar to the image
COPY target/teacher-0.0.1-SNAPSHOT.jar teacher-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "teacher-0.0.1-SNAPSHOT.jar"]
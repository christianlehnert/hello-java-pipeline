# The jar is built once by Maven in the pipeline (mvn verify) and copied into the image.
FROM eclipse-temurin:25-jre

WORKDIR /app
COPY target/hello-java.jar app.jar

USER 10001
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]

FROM openjdk

WORKDIR /app

COPY target/openCmsApi-1.0.0.jar /app/opencms.jar

ENTRYPOINT ["java", "-jar", "opencms.jar"]
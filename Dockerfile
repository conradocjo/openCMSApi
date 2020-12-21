# FROM openjdk
#
# WORKDIR /app
#
# COPY target/openCmsApi-1.0.0.jar /app/opencms.jar
#
# ENTRYPOINT ["java", "-jar", "opencms.jar"]

# ------------


# FROM openjdk
#
# WORKDIR /app
#
# COPY target/openCmsApi-1.0.0.jar /app/opencms.jar
#
# ENTRYPOINT ["java", "-jar", "opencms.jar"]

# FROM openjdk
# ADD target/openCmsApi-1.0.0.jar
# EXPOSE 8080 8000
# CMD java -jar openCmsApi-1.0.0.jar


################## new



# FROM frolvlad/alpine-oraclejdk8:slim
# VOLUME /tmp
# ADD gs-spring-boot-docker-0.1.0.jar app.jar
# RUN sh -c 'touch /app.jar'
# ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]



# FROM  openjdk:8-jre
FROM  openjdk:9-jre
ADD target/openCmsApi-1.0.0.jar .
EXPOSE 8080 8000
CMD java -jar openCmsApi-1.0.0.jar
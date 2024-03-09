

FROM openjdk:17-alpine
WORKDIR /opt
ENV port=8032
EXPOSE 8032
COPY /target/demoServiceJenkins.jar /opt/demoServiceJenkins.jar
ENTRYPOINT [ "java", "-jar", "/opt/demoServiceJenkins.jar" ]
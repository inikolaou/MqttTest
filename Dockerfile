FROM adoptopenjdk/openjdk13-openj9:latest
MAINTAINER johnnikolaou
COPY deploy/MqttTest-0.0.1-SNAPSHOT-exec.jar /opt/MqttTest/
WORKDIR /opt/MqttTest/
CMD ["java", "-jar", "/opt/MqttTest/MqttTest-0.0.1-SNAPSHOT-exec.jar"]
EXPOSE 80
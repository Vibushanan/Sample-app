FROM openjdk:8-jdk-alpine
COPY KubeApps.jar .
ENTRYPOINT [ "java","-jar","KubeApps.jar" ]
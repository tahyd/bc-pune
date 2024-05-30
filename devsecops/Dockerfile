FROM openjdk:17
ARG JARFILE=target/bcdemo.jar
ADD ${JARFILE} bcdemo.jar
EXPOSE 9988
ENTRYPOINT [ "java","-jar","bcdemo.jar" ]
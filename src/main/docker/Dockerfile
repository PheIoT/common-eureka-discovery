FROM fabric8/java-alpine-openjdk8-jdk
MAINTAINER Peter Li <peter.li@pheiot.com>

ENV VERSION=0.0.1-SNAPSHOT

VOLUME /tmp

ADD euraka-discovery-$VERSION.jar euraka.jar

RUN sh -c 'touch /euraka.jar'

EXPOSE 8761

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/euraka.jar"]

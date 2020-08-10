FROM openjdk:8-jre-alpine

# Where to copy artifacts from
# Typicall '/target' in container, '/target' locally
ARG TARGET_DIR=/target
# Copy all the jars
COPY ${TARGET_DIR}/libs/* ${DEPLOY_DIR}/libs/
COPY ${TARGET_DIR}/zadanieRekrutacyjne-1.0-SNAPSHOT.jar ${DEPLOY_DIR}/zadanieRekrutacyjne-1.0-SNAPSHOT.jar

# Copy data sets
COPY ${TARGET_DIR}/testng.xml ${DEPLOY_DIR}/testng.xml


# A new ENTRYPOINT and CMD


ENTRYPOINT ["/usr/bin/java", "-cp", "zadanieRekrutacyjne-1.0-SNAPSHOT.jar:libs/*", "org.testng.TestNG", "testng.xml" ]

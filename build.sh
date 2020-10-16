#!/bin/bash

docker-compose down && \
chmod +x gradlew && \
./gradlew clean build && \
docker-compose build && \
docker image prune -f

BUILD_ID=dontKillMe
JENKINS_NODE_COOKIE=dontKillMe
sh ./start.sh
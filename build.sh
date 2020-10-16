#!/bin/bash

docker-compose down && \
chmod +x gradlew && \
./gradlew clean build && \
docker-compose build && \
docker image prune -f

BUILD_ID=dontKillMe docker-compose up -d
JENKINS_NODE_COOKIE=dontKillMe docker-compose up -d
docker-compose up -d
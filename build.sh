#!/bin/bash

docker-compose down && \
chmod +x gradlew && \
./gradlew clean build && \
docker-compose build && \
docker image prune -f

JENKINS_NODE_COOKIE=dontKillMe ./start.sh
sh ./start.sh
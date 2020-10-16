#!/bin/bash

docker-compose down && \
chmod +x gradlew && \
./gradlew clean build && \
docker-compose build && \
docker image prune -f

sh 'JENKINS_NODE_COOKIE=dontKillMe ./start.sh'
#!/bin/bash

./docker-compose down

./gradlew bootjar

./docker-compose build

./docker image prune -f

./docker-compose up -d
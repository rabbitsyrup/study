#!/bin/bash

sudo docker-compose down

sudo gradlew bootjar

sudo docker-compose build

sudo docker image prune -f

sudo docker-compose up -d
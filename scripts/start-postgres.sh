#!/bin/bash

if docker ps -a | grep -q quarkus-postgres
then
        docker rm -f quarkus-postgres
fi

docker run \
    --name quarkus-postgres \
    -e POSTGRES_USER=quarkus_user \
    -e POSTGRES_PASSWORD=quarkus_pw \
    -e POSTGRES_DB=quarkus_db \
    -p 5432:5432 \
    postgres

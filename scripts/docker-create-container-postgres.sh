#!/bin/sh

#docker run --name  postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=postgres -v database-data:/var/lib/postgresql/data/ -p 5432:5432 postgres
docker run --name  postgres -e POSTGRES_USER=postgres -e POSTGRES_PASSWORD=password -e POSTGRES_DB=postgres -p 5432:5432 postgres

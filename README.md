# Employee Management System

A mini project built with Java 25 and Spring Boot 4.2.0.

## Module 1

The application provides GET /hello, which returns Hello World.

## Requirements

Docker and Docker Compose. Java and Maven are not required on the host machine.

## Run

From the repository root, run:

    docker compose up --build

In another terminal, verify the API:

    curl http://localhost:8080/hello

Expected response: Hello World.

Press Ctrl+C in the Docker Compose terminal to stop the application.
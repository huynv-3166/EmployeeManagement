# Employee Management System

A mini project built with Java 25 and Spring Boot 4.2.0.

## Module 1

The application provides GET /hello, which returns Hello World.

## Module 2

Spring creates `UtilityService` from its `@Service` annotation. `AppConfig` creates an `EmployeeNameFormatter` bean using `@Configuration` and `@Bean`. Constructor injection connects the formatter to the service and the service to `HelloController`.

## Requirements

Docker and Docker Compose. Java and Maven are not required on the host machine.

## Run

From the repository root, run:

    docker compose up --build

In another terminal, verify the API:

    curl http://localhost:8080/hello

Expected response: Hello World.

Press Ctrl+C in the Docker Compose terminal to stop the application.
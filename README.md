# Employee Management System

A mini project built with Java 25 and Spring Boot 4.2.0.

## Module 1

The application provides GET /hello, which returns Hello World.

## Module 2

Spring creates `UtilityService` from its `@Service` annotation. `AppConfig` creates an `EmployeeNameFormatter` bean using `@Configuration` and `@Bean`. Constructor injection connects the formatter to the service and the service to `HelloController`.

## Module 3

Employees are stored in memory. The list is cleared when the application restarts.

- `GET /employees`: list employees.
- `POST /employees`: add an employee and return HTTP 201.

To add an employee:

```bash
curl -i -X POST http://localhost:8080/employees -H 'Content-Type: application/json' -d '{"name":"  Nguyen   Van A  ","email":"a@example.com"}'
```

To list employees:

```bash
curl http://localhost:8080/employees
```

## Requirements

Docker and Docker Compose. Java and Maven are not required on the host machine.

## Run

From the repository root, run:

    docker compose up --build

In another terminal, verify the API:

    curl http://localhost:8080/hello

Expected response: Hello World.

Press Ctrl+C in the Docker Compose terminal to stop the application.
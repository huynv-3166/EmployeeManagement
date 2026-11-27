# Employee Management System

A mini project built with Java 25 and Spring Boot 4.2.0.

## Module 1

The application provides GET /hello, which returns Hello World.

## Module 2

Spring creates `UtilityService` from its `@Service` annotation. `AppConfig` creates an `EmployeeNameFormatter` bean using `@Configuration` and `@Bean`. Constructor injection connects the formatter to the service and the service to `HelloController`.

## Module 3

Introduced `GET /employees` and `POST /employees` using in-memory storage. Module 4 replaces that storage with PostgreSQL.

## Module 4

Employees and departments are stored in PostgreSQL. Docker Compose starts the application, PostgreSQL, and pgAdmin.

Employee APIs:

- `GET /employees`: list employees.
- `GET /employees/{id}`: get one employee.
- `POST /employees?departmentId={id}`: create an employee.
- `PUT /employees/{id}?departmentId={departmentId}`: update an employee.
- `DELETE /employees/{id}`: delete an employee.
- `GET /employees/search?name={name}`: search by name.
- `GET /employees/department/{id}`: search by department.

Department APIs:

- `GET /departments`: list departments.
- `POST /departments`: create a department.

Create a department first:

```bash
curl -i -X POST http://localhost:8080/departments -H 'Content-Type: application/json' -d '{"name":"Engineering"}'
```

Use the returned department ID to create an employee:

```bash
curl -i -X POST 'http://localhost:8080/employees?departmentId=1' -H 'Content-Type: application/json' -d '{"name":"Nguyen Van A","email":"a@example.com"}'
```

pgAdmin is available at `http://localhost:5050`. Sign in with `admin@example.com` / `admin123`, then connect to host `database`, port `5432`, database `employee_management`, user `employee_user`, password `employee_password`.

## Requirements

Docker and Docker Compose. Java and Maven are not required on the host machine.

## Run

From the repository root, run:

    docker compose up --build

In another terminal, verify the API:

    curl http://localhost:8080/hello

Expected response: Hello World.

Press Ctrl+C in the Docker Compose terminal to stop the application.
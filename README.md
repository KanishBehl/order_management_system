# Order Management Service

This project is a real-world sample Java backend built with Spring Boot. It exposes a simple REST API for managing orders and is organized into controller, service, repository, and model layers.

## Features
- Create, list, retrieve, update, and delete orders
- Input validation for required fields
- In-memory data storage for quick local testing
- JUnit and MockMvc test coverage

## Run locally
```bash
mvn spring-boot:run
```

Then open:
- http://localhost:8080/api/orders

## Main endpoints
- GET /api/orders
- GET /api/orders/{id}
- POST /api/orders
- PUT /api/orders/{id}
- DELETE /api/orders/{id}

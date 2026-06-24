# Architecture Notes

The sample project uses a layered Spring Boot architecture:

- Controller layer: handles HTTP requests and responses
- Service layer: contains business rules and validation logic
- Repository layer: stores and retrieves orders in memory
- Model layer: defines the order domain object

This structure keeps the API easy to understand and suitable for onboarding into larger production services.

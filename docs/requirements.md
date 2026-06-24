# Business Requirements

The service should manage customer orders for an e-commerce platform. It must support creating, reading, updating, and deleting orders. Orders should include customer details, product information, quantity, price, and status.

## Functional requirements
- Orders can be created through a REST API.
- Each order must include a customer name, product name, quantity, and price.
- Orders should be retrievable by ID and listed as a collection.
- Existing orders can be updated.
- Orders can be deleted.

## Non-functional requirements
- The API should be easy to run locally.
- The project should follow a clean layered architecture.
- Tests should cover the main API flows.

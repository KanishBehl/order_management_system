package model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.Instant;

public class Order {
    private String id;

    @NotBlank(message = "Customer name is required")
    private String customerName;

    @NotBlank(message = "Product name is required")
    private String productName;

    @Min(value = 1, message = "Quantity must be at least 1")
    private int quantity;

    @Min(value = 0, message = "Price must be non-negative")
    private double price;

    @NotNull(message = "Status is required")
    private OrderStatus status;

    private Instant createdAt;
    private Instant updatedAt;

    public Order() {
    }

    public Order(String id, String customerName, String productName, int quantity, double price, OrderStatus status) {
        this.id = id;
        this.customerName = customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
        this.status = status;
        this.createdAt = Instant.now();
        this.updatedAt = this.createdAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Instant updatedAt) {
        this.updatedAt = updatedAt;
    }
}

package com.mystore.app.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;

public class Product {

	private Integer id;
	@NotEmpty(message = "Product name is required")
	@NotNull(message = "Product name is required")
    private String name;
	@NotEmpty(message = "Product category is required")
	@NotNull(message = "Product category is required")
    private String category;
	@NotEmpty(message = "price name is required")
	@NotNull(message = "price name is required")
	@Positive(message = "price cannot be negative")
    private Double price;
	@NotEmpty(message = "stockQuantity name is required")
	@NotNull(message = "stockQuantity name is required")
	@Positive(message = "stockQuantity cannot be negative")
    private Integer stockQuantity;

    public Product(Integer id, String name, String category, Double price, Integer stockQuantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}


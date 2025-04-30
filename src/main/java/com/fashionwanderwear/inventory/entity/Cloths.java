package com.fashionwanderwear.inventory.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "Cloths")
public class Cloths {

    //Validations
    @Id
    @Column(name = "cloth_id", length = 10)
    @Min(value = 1, message = "Cloth ID must be a positive integer")
    private int clothId;

    @Column(name = "cloth_name", length = 50, nullable = false)
    @NotBlank(message = "Cloth name is required")
    @Size(max = 50, message = "Cloth name should not be longer than 50 characters")
    private String clothName;

    @Column(name = "image_path")
    @NotNull(message = "Cloth photo is required")
    private String imagePath; // This can store image file name or URL

    @Column(name = "cloth_price")
    @NotNull(message = "Cloth price is required")
    @DecimalMin(value = "0.0", inclusive = false, message = "Cloth price must be greater than 0")
    private Double clothPrice;

    @Column(name = "stock_quantity")
    @Min(value = 0, message = "Stock quantity cannot be negative")
    private int stockQuantity;

    @Column(name = "description")
    @Size(max = 255, message = "Description should not be longer than 255 characters")
    private String description;

    @Column(name = "active_state", columnDefinition = "TINYINT default 0")
    private boolean active;

    @Column(name = "cloth_color", length = 20, nullable = false)
    @NotBlank(message = "Cloth color cannot be blank")
    @Size(max = 20, message = "Cloth color cannot exceed 20 characters")
    private String clothColor;

    @Column(name = "cloth_size", length = 3, nullable = false)
    @NotBlank(message = "Cloth size cannot be blank")
    @Pattern(regexp = "^(S|M|L|XL|XXL)$", message = "Cloth size must be one of the following: S, M, L, XL, XXL")
    private String clothSize;

    public Cloths() {
    }

    public Cloths(int clothId, String clothName, String imagePath, Double clothPrice, int stockQuantity, String description, boolean active, String clothColor, String clothSize) {
        this.clothId = clothId;
        this.clothName = clothName;
        this.imagePath = imagePath;
        this.clothPrice = clothPrice;
        this.stockQuantity = stockQuantity;
        this.description = description;
        this.active = active;
        this.clothColor = clothColor;
        this.clothSize = clothSize;
    }

    // Getters and Setters for the fields

    public int getClothId() {
        return clothId;
    }

    public void setClothId(int clothId) {
        this.clothId = clothId;
    }

    public String getClothName() {
        return clothName;
    }

    public void setClothName(String clothName) {
        this.clothName = clothName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Double getClothPrice() {
        return clothPrice;
    }

    public void setClothPrice(Double clothPrice) {
        this.clothPrice = clothPrice;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getClothColor() {
        return clothColor;
    }

    public void setClothColor(String clothColor) {
        this.clothColor = clothColor;
    }

    public String getClothSize() {
        return clothSize;
    }

    public void setClothSize(String clothSize) {
        this.clothSize = clothSize;
    }
}

package com.fashionwanderwear.inventory.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;

public class ClothsDTO {
    private int clothId;
    private String clothName;
    private String imagePath;
    private Double clothPrice;
    private int stockQuantity;
    private String description;
    private boolean active;
    private String clothColor;
    private String clothSize;

    public ClothsDTO() {
    }

    public ClothsDTO(int clothId, String clothName, String imagePath, Double clothPrice, int stockQuantity, String description, boolean active, String clothColor, String clothSize) {
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

    @Override
    public String toString() {
        return "ClothsDTO{" +
                "clothId=" + clothId +
                ", clothName='" + clothName + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", clothPrice=" + clothPrice +
                ", stockQuantity=" + stockQuantity +
                ", description='" + description + '\'' +
                ", active=" + active +
                ", clothColor='" + clothColor + '\'' +
                ", clothSize='" + clothSize + '\'' +
                '}';
    }
}


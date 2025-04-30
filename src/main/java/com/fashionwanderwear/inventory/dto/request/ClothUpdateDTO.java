package com.fashionwanderwear.inventory.dto.request;

public class ClothUpdateDTO {
    private Integer clothId;
    private String clothName;
    private String imagePath;
    private int stockQuantity;
    private boolean active;
    private String clothColor;
    private String clothSize;
    private String description;
    private double clothPrice;

    // Constructor
    public ClothUpdateDTO() {}

    public ClothUpdateDTO(Integer clothId, String clothName, String imagePath, int stockQuantity, boolean active, String clothColor, String clothSize, String description, double clothPrice) {
        this.clothId = clothId;
        this.clothName = clothName;
        this.imagePath = imagePath;
        this.stockQuantity = stockQuantity;
        this.active = active;
        this.clothColor = clothColor;
        this.clothSize = clothSize;
        this.description = description;
        this.clothPrice = clothPrice;
    }

    // Getters and Setters

    public Integer getClothId() {
        return clothId;
    }

    public void setClothId(Integer clothId) {
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

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getClothPrice() {
        return clothPrice;
    }

    public void setClothPrice(double clothPrice) {
        this.clothPrice = clothPrice;
    }

    @Override
    public String toString() {
        return "ClothUpdateDTO{" +
                "clothId=" + clothId +
                ", clothName='" + clothName + '\'' +
                ", imagePath='" + imagePath + '\'' +
                ", stockQuantity=" + stockQuantity +
                ", active=" + active +
                ", clothColor='" + clothColor + '\'' +
                ", clothSize='" + clothSize + '\'' +
                ", description='" + description + '\'' +
                ", clothPrice=" + clothPrice +
                '}';
    }
}

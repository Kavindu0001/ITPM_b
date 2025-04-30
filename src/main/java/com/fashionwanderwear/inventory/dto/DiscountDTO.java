package com.example.itpm.discount_promotions.dto;

import java.time.LocalDateTime;

public class DiscountDTO {
    private int id;        // Changed from String to int
    private int itemId;    // Changed from Long to int
    private String title;
    private Double rate;
    private LocalDateTime periodStart;
    private LocalDateTime periodEnd;
    private String conditions;
    private String description;
    private Double finalPrice;
    private Double actualPrice;
    private boolean active;

    // Constructors
    public DiscountDTO() {
    }

    public DiscountDTO(int id, int itemId, String title, Double rate,
                       LocalDateTime periodStart, LocalDateTime periodEnd,
                       String conditions, String description,
                       Double finalPrice, Double actualPrice, boolean active) {
        this.id = id;
        this.itemId = itemId;
        this.title = title;
        this.rate = rate;
        this.periodStart = periodStart;
        this.periodEnd = periodEnd;
        this.conditions = conditions;
        this.description = description;
        this.finalPrice = finalPrice;
        this.actualPrice = actualPrice;
        this.active = active;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public LocalDateTime getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(LocalDateTime periodStart) {
        this.periodStart = periodStart;
    }

    public LocalDateTime getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(LocalDateTime periodEnd) {
        this.periodEnd = periodEnd;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public Double getActualPrice() {
        return actualPrice;
    }

    public void setActualPrice(Double actualPrice) {
        this.actualPrice = actualPrice;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
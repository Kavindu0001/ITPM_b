package com.example.itpm.discount_promotions.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "discounts")
public class Discount {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;  // Changed from String/Long to int

    @Column(name = "item_id", nullable = false)
    private int itemId;  // Changed from Long to int

    @Column(name = "title", nullable = false, length = 100)
    private String title;

    @Column(name = "rate", nullable = false)
    private Double rate;

    @Column(name = "period_start", nullable = false)
    private LocalDateTime periodStart;

    @Column(name = "period_end", nullable = false)
    private LocalDateTime periodEnd;

    @Column(name = "conditions", nullable = false, length = 255)
    private String conditions;

    @Column(name = "description", nullable = false, length = 255)
    private String description;

    @Column(name = "final_price", nullable = false)
    private Double finalPrice;

    @Column(name = "actual_price", nullable = false)
    private Double actualPrice;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Column(name = "active", columnDefinition = "TINYINT default 1")
    private boolean active;

    // Constructors
    public Discount() {}

    public Discount(int id, int itemId, String title, Double rate,
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
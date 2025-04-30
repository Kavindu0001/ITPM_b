package com.fashionwanderwear.inventory.dto;

public class OrdersDTO {
    private int ordersId;
    private String size;
    private String color;
    private int quantity;
    private double totalPrice;
    private String name;
    private String address;
    private String number;

    public OrdersDTO() {}

    public OrdersDTO( int ordersId, String size, String color, int quantity, double totalPrice, String name, String address, String number) {
        this.ordersId = ordersId;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public int getOrderId() {
        return ordersId;
    }

    public void setOrderId(int orderId) {
        this.ordersId = orderId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

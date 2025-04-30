package com.fashionwanderwear.inventory.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @Column(name = "orders_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int ordersId;

    @Column(name = "size", nullable = false, length = 5)
    private String size;

    @Column(name = "color", nullable = false, length = 20)
    private String color;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "total_price", nullable = false)
    private double totalPrice;

    @Column(name = "customer_name", nullable = false, length = 100)
    private String name;

    @Column(name = "customer_address", nullable = false, length = 255)
    private String address;

    @Column(name = "customer_number", nullable = false, length = 15)
    private String number;

    public Orders() {

    }

    public Orders(int ordersId, String size, String color, int quantity, double totalPrice, String name, String address, String number) {
        this.ordersId = ordersId;
        this.size = size;
        this.color = color;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public int getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(int ordersId) {
        this.ordersId = ordersId;
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

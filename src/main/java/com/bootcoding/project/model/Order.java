package com.bootcoding.project.model;

import java.util.Date;

public class Order {
    int id;
    String deleveryAderss;
    Date orderDate;
    double amount;
    String restaurantName;
    long contact;
    String customer_name;

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeleveryAderss() {
        return deleveryAderss;
    }

    public void setDeleveryAderss(String deleveryAderss) {
        this.deleveryAderss = deleveryAderss;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}

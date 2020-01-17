package com.trainning.struts2.model;

import java.io.Serializable;

public class Product implements Serializable, Comparable<Product> {
    private int id;
    private String name;
    private String price;
    private Boolean isSale = false;

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public Product(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, String price, boolean isSale) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isSale = isSale;
    }

    public Product() {
        this.id = 0;
        this.name = "";
        this.price = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return this.getId() - o.getId();
    }
}

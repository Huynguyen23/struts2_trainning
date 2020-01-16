package com.trainning.struts2.action.news;

import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.model.Product;

public class NewRegisterAction extends ProductDao {
    private int Id;
    private String name;
    private String price;
    private Boolean isSale;

    public Boolean getIsSale() {
        return isSale;
    }

    public void setIsSale(Boolean isSale) {
        this.isSale = isSale;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    @SuppressWarnings("unused")
    public String excute() {
        Product pd = new Product(getId(), getName(), getPrice(), getIsSale());
        int i = insert(pd);
        return "success";
    }
}

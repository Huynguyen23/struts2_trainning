package com.trainning.struts2.action.edit;

import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.model.Product;

public class EditUpdateAction extends ProductDao {
    private int id;
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

    public String excute() {
        Product pd = new Product(getId(), getName(), getPrice(), getIsSale());
        update(pd);
        return "success";
    }
}

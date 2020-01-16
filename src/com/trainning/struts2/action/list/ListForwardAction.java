package com.trainning.struts2.action.list;

import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.model.Product;

public class ListForwardAction extends ProductDao {
    private int id;
    public Product product;

    public String new_action() {
        return "success";
    }

    public String edit_action() {
        product = new Product();
        product = getById(getId());
        return "success";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

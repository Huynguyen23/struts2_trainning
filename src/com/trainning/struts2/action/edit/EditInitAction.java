package com.trainning.struts2.action.edit;

import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.model.Product;

public class EditInitAction extends ProductDao {
    private int id;
    private Product product;

    public String excute() {
        product = new Product();
        product = getById(getId());
        return "success";
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

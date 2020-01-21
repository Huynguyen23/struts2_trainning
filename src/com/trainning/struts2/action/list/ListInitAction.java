package com.trainning.struts2.action.list;

import java.util.ArrayList;
import java.util.List;

import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.model.Product;

public class ListInitAction {

    private List<Product> productList;

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String excute() {
        setProductList(new ArrayList<Product>());
        ProductDao pd = new ProductDao();
        setProductList(pd.getAll());
        return "success";
    }
}

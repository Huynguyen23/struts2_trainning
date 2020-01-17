package com.trainning.struts2.dao;

import java.util.ArrayList;
import java.util.Collections;

import com.trainning.struts2.model.Product;

public class ProductDao {
    private static ArrayList<Product> productList;

    static {
        productList = new ArrayList<Product>();
        productList.add(new Product(1, "Egg", "50000", true));
        productList.add(new Product(2, "Milk", "10000"));
    }

    public ArrayList<Product> getAll() {
        Collections.sort(productList);
        return productList;
    }

    public Product getById(int id) {

        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public int insert(Product pd) {
        productList.add(pd);
        return 0;
    }

    public int update(Product pd) {
        productList.remove(getById(pd.getId()));
        productList.add(pd);
        return 0;
    }

    public int delete(Product pd) {
        productList.remove(pd);
        return 0;
    }
}

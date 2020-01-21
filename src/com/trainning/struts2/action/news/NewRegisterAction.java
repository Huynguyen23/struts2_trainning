package com.trainning.struts2.action.news;

import com.opensymphony.xwork2.ModelDriven;
import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.form.DetailForm;

public class NewRegisterAction extends ProductDao implements ModelDriven<DetailForm> {
//    private int Id;
//    private String name;
//    private String price;
//    private Boolean isSale;
//
//    public Boolean getIsSale() {
//        return isSale;
//    }
//
//    public void setIsSale(Boolean isSale) {
//        this.isSale = isSale;
//    }
//
//    public int getId() {
//        return Id;
//    }
//
//    public void setId(int id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPrice() {
//        return price;
//    }
//
//    public void setPrice(String price) {
//        this.price = price;
//    }
    DetailForm pd = new DetailForm();

    public String excute() {
        int i = insert(pd);

        if (i == 0) {
            return "success";
        }
        return "failed";
    }

    @Override
    public DetailForm getModel() {

        return pd;
    }
}

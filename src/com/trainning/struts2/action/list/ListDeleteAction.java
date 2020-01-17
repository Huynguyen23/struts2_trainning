package com.trainning.struts2.action.list;

import com.trainning.struts2.dao.ProductDao;

public class ListDeleteAction extends ProductDao {
    private int id;

    public String excute() {
        delete(getById(getId()));
        return "success";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

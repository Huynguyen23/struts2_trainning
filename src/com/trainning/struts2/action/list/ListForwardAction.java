package com.trainning.struts2.action.list;

import com.trainning.struts2.dao.ProductDao;

public class ListForwardAction extends ProductDao {
    private int id;

    public String new_action() {
        return "success";
    }

    public String edit_action() {
        return "success";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

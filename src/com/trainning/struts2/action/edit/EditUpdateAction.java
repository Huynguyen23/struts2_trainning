package com.trainning.struts2.action.edit;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.trainning.struts2.dao.ProductDao;
import com.trainning.struts2.form.DetailForm;

public class EditUpdateAction extends ActionSupport implements ModelDriven<DetailForm> {
    DetailForm pd = new DetailForm();
    ProductDao pdao = new ProductDao();

    public String excute() {
        pdao.update(pd);
        return "success";
    }

    public void validate() {
        if (pd.getName().length() == 0) {
            addFieldError("pd.name", "Name is required.");
        }

        if (pd.getPrice().length() == 0) {
            addFieldError("personBean.email", "Email is required.");
        }
    }

    @Override
    public DetailForm getModel() {

        return pd;
    }
}

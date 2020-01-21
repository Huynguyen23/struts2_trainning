<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>PRODUCT'S LIST</title>
<style type="text/css">
.error-msg {
  color: red;
}

table.list {
  border: 1px solid #cbcbcb;
  border-collapse: collapse;
}

table.list td, th {
  border-left: 1px solid #cbcbcb;
  padding-left: 10px;
  padding-right: 10px;
}

table.list thead {
  background-color: #cbcbcb;
}
</style>
</head>
<body>
  <s:label>PRODUCT LIST</s:label>

  <br/>
  <s:form id="productForm" class="productForm" theme="simple" >
    <div class="control-btn">
      <s:submit name="new" value="New"
                onclick="this.form.action='forward_new'" />
    </div>
    <div class="error-msg">
      <s:actionerror />
    </div>
    <table class="list">
      <thead>
        <tr>
          <th>Edit</th>
          <th>Name</th>
        </tr>
      </thead>

      <tbody>
        <s:iterator value="productList" id="product" status="pd">
          <tr>
          <td>
                <a href="forward_edit.action?submitType=id&id=<s:property value="#product.id"/>">
                      Update
                </a>
                <a href="delete.action?submitType=id&id=<s:property value="#product.id"/>">
                      Delete
                </a>
          </td>
            <td><s:property value="#product.name" /></td>

          </tr>
        </s:iterator>
      </tbody>
    </table>
    <!-- <div class="control-btn">
      <s:submit name="delete" value="Delete"
                onclick="this.form.action='student_delete'" />
    </div>
    <div class="control-btn">
      <s:submit name="update" value="Update"
                onclick="this.form.action='student_update'" />
    </div> -->
  </s:form>
</body>
</html>
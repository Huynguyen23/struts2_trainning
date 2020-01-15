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
  <s:form id="studentForm" class="studentForm" theme="simple">
    <div class="error-msg">
      <s:actionerror />
    </div>
    <table class="list">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Price</th>
          <th>Sale</th>
        </tr>
      </thead>

      <tbody>
        <s:iterator value="productList" id="product" status="pd">
          <tr>
            <td><s:submit name="delete" value="Detail"/></td>
            <td><s:property value="#product.id" /></td>
            <td><s:property value="#product.name" /></td>
            <td><s:property value="#product.price" /></td>
            <td><s:checkbox name="productList[%{#pd.index}].isSale"
               value="%{productList[#pd.index].isSale}"/></td>

            <s:hidden name="productList[%{#pd.index}].id"
                      value="%{#product.id}" />
            <s:hidden name="productList[%{#pd.index}].name"
                      value="%{#product.name}" />
            <s:hidden name="productList[%{#pd.index}].price"
                      value="%{#product.price}" />
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
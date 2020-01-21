<%@ taglib uri="/struts-tags" prefix="s" %>
<s:label>Edit Product</s:label>
<s:form action="update" method="post">
 <s:iterator value="product" status="pd">
    <s:hidden name="id"/>
    <s:textfield name="name" label="Product Name" ></s:textfield>
    <s:textfield name="price" label="Price" ></s:textfield>
    <s:checkbox label="Sale" name="isSale"></s:checkbox>

    <!--<s:hidden name="productEdit.name"
                      value="#product.name" />

    <s:hidden name="productEdit.price"
                  value="#product.price" />

    <s:hidden name="productEdit.isSale"
                  value="#product.isSale" />-->
</s:iterator>
    <s:submit value="edit"></s:submit>
</s:form>
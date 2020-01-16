<%@ taglib uri="/struts-tags" prefix="s" %>
<s:label>New Product</s:label>
<s:form action="product_insert">
<s:textfield name="id" label="Product Id"></s:textfield>
<s:textfield name="name" label="Product Name"></s:textfield>
<s:textfield name="price" label="Price"></s:textfield>
<s:checkbox label="Sale" name="isSale"></s:checkbox>
<s:submit value="save"></s:submit>
</s:form>
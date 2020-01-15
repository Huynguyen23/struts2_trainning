<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form action="product_insert">
<s:textfield name="id" label="Student Id"></s:textfield>
<s:textfield name="name" label="Student Name"></s:textfield>
<s:textfield name="address" label="Address"></s:textfield>
<s:submit value="save"></s:submit>
</s:form>
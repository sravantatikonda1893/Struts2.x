<%@taglib uri="/struts-tags" prefix="html"%>
<h1>Reg Form</h1>
<html:form action="reg">
<html:textfield name="name" label="Name"/>
<html:textfield name="email" label="Email"/>
<html:textfield name="address" label="Address"/>
<html:submit value="Register"/>
</html:form>
<%@taglib uri="/struts-tags" prefix="html"%>
<h1> Hello with Interceptors</h1>
<html:form action="hello" >

<html:textfield name="name" label="Name"/>
<html:submit value="helo"/>
</html:form>
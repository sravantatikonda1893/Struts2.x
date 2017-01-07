<%@taglib uri="/struts-tags" prefix="html"%>
<h1>Cal Form</h1>
<html:from action="cal">
<html:textfield name="fn" label="first number:"/>
<html:textfield name="sn" label="second number:"/>
<html:submit value="add" action="addcal"/>
<html:submit value="sub" action="subcal"/>
<html:submit value="mul" action="mulcal"/>
<html:submit value="div" action="divcal"/>
</html:from>

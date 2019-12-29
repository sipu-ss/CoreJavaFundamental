<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
<center>
<form:form action="registerEmployee" method="post" commandName="employee">
<table>
<tr><td align="center" colspan="3">EmployeeRegistration</td></tr>
<tr><td>FirstName:</td>
<td><form:input path="firstname"/></td>
<td><font color="red" size="4"><form:errors path="firstname"/></font></td>
</tr>
<tr><td>LastName:</td>
<td><form:input path="lastname"/></td>
<td><font color="red" size="4"><form:errors path="lastname"/></font></td>
</tr>
<tr><td>Email:</td>
<td><form:input path="email"/></td>
<td><font color="red" size="4"><form:errors path="email"/></font></td>
</tr>
<tr><td>Phone No:</td>
<td><form:input path="phone"/></td>
<td><font color="red" size="4"><form:errors path="phone"/></font></td>
</tr>
<tr><td>Gender</td>
<td><form:radiobutton path="gender" value="Male"/>Male<br/>
<form:radiobutton path="gender" value="Male"/>Male<br/></td>
<td><font color="red" size="4"><form:errors path="gender"/></font></td>
</tr>
</table>
</form:form>
</center>
</body>
</html>
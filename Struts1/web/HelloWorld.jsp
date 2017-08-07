<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>   
 <%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld.jsp</title>
</head>
<body>
This is hello world from Hello world JSP

<h1>Showing Logic iterate example</h1>
<logic:iterate id="msgs" name="msgs">
<bean:write name="msgs"/><br/>
</logic:iterate>

<h2>Iterating over User list using logic tag lib</h2>
<logic:iterate id="lUserId" name="lUsers">
Username : <bean:write name="lUserId" property="username" /> &nbsp;
Email : <bean:write name="lUserId" property="email" /><br />
</logic:iterate>
</body>
</html>
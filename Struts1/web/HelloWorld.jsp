<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
 <%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HelloWorld.jsp</title>
</head>
<body>
This is hello world from Hello world JSP

<html:form action="/helloWorld" method="post">
<span style="color:red;"><html:errors/></span>
	<bean:message key="label.name"/>: <html:text property="message"  /><br/>
	Aggree: <html:checkbox property="aggree" /><br/>
	<html:submit property="mode"><bean:message key="button.save" arg0="Please" /></html:submit>
	<html:cancel><bean:message key="button.cancel" /></html:cancel>
</html:form>
</body>
</html>
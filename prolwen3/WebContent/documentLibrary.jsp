<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
	<jsp:directive.page import="com.files.ProlwenFile" />
	<jsp:directive.page contentType="text/html; charset=Utf-8" />
	<html>
<head>
<title>all files</title>
</head>
<c:forEach var="fileBean" items="${filesPDF}">
	<a href="#">${fileBean.name}</a>
	<br/>
</c:forEach>
	</html>
</jsp:root>
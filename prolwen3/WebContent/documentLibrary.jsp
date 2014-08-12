<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
	<jsp:directive.page import="com.files.ProlwenFile" />
	<jsp:directive.page contentType="text/html; charset=Utf-8" />
	<html>
<head>
<title>all files</title>
</head>
<jsp:text>is File</jsp:text>
<c:forEach var="p" items="${pf.getArrFile}">
	<input value="${p}" />
	<br />
</c:forEach>
	</html>
</jsp:root>
<jsp:root xmlns:jsp="http://java.sun.com/JSP/Page"
	xmlns:c="http://java.sun.com/jsp/jstl/core" version="2.0">
	<jsp:directive.page contentType="text/html; charset=Utf-8" />
	<html>
<head>
<title>all files</title>
</head>
<jsp:text>is File</jsp:text>
<jsp:useBean id="filesArr" class="com.files.ProlwenFile" />
<c:set var="items" value="${fileArr.getFDList}" scope="session" />
<c:forEach var="id" items="${items}">
	<a href="${id.getAbsolutePath}"><c:out value="${id.getName}" /></a>
	<br />
</c:forEach>
	</html>
</jsp:root>
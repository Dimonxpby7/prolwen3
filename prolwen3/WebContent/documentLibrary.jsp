<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<html>
<head>
<title>all files</title>
</head>

<c:forEach var="p" items="${path}">
	<input value="${p}" />
	<br/>
</c:forEach>

</html>

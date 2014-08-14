<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/struts-tags" prefix="s"%>
<head>
<style type="text/css">
.ibTitle:hover .ibEdit {
	opacity: 1;
}

.ibContent {
	padding: 20px;
	float: left;
}

.ibItem {
	border-top: 1px solid #ddd;
	float: left;
	padding: 10px 0;
	width: 100%;
	overflow: hidden;
}

.ibItem:hover {
	background-color: #fdfdfd;
}

.ibItemName {
	float: left;
	width: 219px;
	color: #888888;
	overflow: hidden;
}

.ibItemValue {
	float: left;
	width: 220px;
	margin-left: 20px;
}
</style>
</head>
<html>
<body>
	<div class="ibContent">
		<c:forEach items="${filesJPG}" var="bean">
			<div class="ibItem">
				<div class="ibItemName">
					<a href="#" id="${bean.path}">${bean.name}</a>
				</div>
				<div class="ibItemValue">8 Mb</div>
			</div>
		</c:forEach>
	</div>
	<a href="<s:url action="downloader"/>" >Download</a>
</body>
</html>


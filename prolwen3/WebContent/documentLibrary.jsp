<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="/struts-tags" prefix="s"%>



<head>
<style type="text/css">
.infoBlock {
	float: left;
	padding: 20px 10px;
	-moz-box-sizing: border-box;
	-webkit-box-sizing: border-box;
	-ms-box-sizing: border-box;
	box-sizing: border-box;
	border-right: 1px solid #FF3D00;
}

.ibTitle:hover .ibEdit {
	opacity: 1;
}

.ibContent {
	padding: 20px;
	float: left;
}

.ibItem {
	border-top: 1px solid #FF3D00;
	float: left;
	padding: 5px 0;
	width: 32%;
	overflow: hidden;
}

.ibItem:hover {
	background-color: #FF3D00;
}

.ibItemName {
	float: left;
	width: 240px;
	color: #888888;
	overflow: hidden;
	text-align: right;
}

.ibItemValue {
	float: left;
	width: 220px;
	margin-left: 20px;
	text-align: right;
}
</style>
</head>
<html>
<body>
	<div class="infoBlock" style="width: 900px;">
		<div class="ibTitle">
			Store pictures
			<div class="ibContent">
				<c:forEach items="${filesJPG}" var="bean">
					<div class="ibItem">
						<div class="ibItemName">
							<a href="${bean.path}" target="_blank" download=""
								style="color: #ffffff;" title="${bean}"> ${bean.name} </a>
						</div>
						<div class="ibItemValue">${bean.size}</div>
					</div>
				</c:forEach>
			</div>
		</div>
	</div>


</body>
</html>


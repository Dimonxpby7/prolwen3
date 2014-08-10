<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<style type="text/css">
#mainWrapper {
	bottom: 10px;
	left: 10px;
	position: absolute;
	right: 10px;
	top: 10px;
	min-width: 1020px;
	background-color: #444444;
}

.mainHeader {
	background-color: #00CCFF;
	border-bottom: 1px solid #222222;
	height: 49px;
	left: 0;
	position: absolute;
	right: 0;
	top: 0;
}

.mainMenu {
	background-color: #FFDDFF;
	bottom: 0;
	left: 0;
	position: absolute;
	top: 50px;
	width: 260px;
}

.mainContent {
	background-color: #FFFF00;
	bottom: 50px;
	left: 260px;
	position: absolute;
	right: 0;
	top: 50px;
	border-left: 1px solid #222222;
}

.statsPanel {
	background-color: #444444;
	border-top: 1px solid 000000;
	bottom: 0;
}
</style>
<head />
<body>
	<div id="mainWrapper" class="">
		<div class="mainHeader">
			<title><tiles:insertAttribute name="title" ignore="true" /></title>
			<tiles:insertAttribute name="header" />
		</div>
		<div class="mainMenu">
			<tiles:insertAttribute name="menu" />
		</div>
		<div class="mainContent">
			<tiles:insertAttribute name="body" />
		</div>
		<div class="statsPanel">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>


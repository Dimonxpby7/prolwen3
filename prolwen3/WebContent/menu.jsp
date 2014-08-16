<%@taglib uri="/struts-tags" prefix="s"%>
<head>
<style type="text/css">
.menuItem {min-height: 30px; }

.miDashboard a.miText {padding: 20px 10px 20px 30px; font-weight: 400;}

a {color: #63a3d8; outline: hidden;}
a:hover {color: #96c8f3; outline: hidden;}
a:active {top: 1px;}
a.miText {color: #00EBFF; min-height: 10px; padding: 10px 10px 10px 30px; display: block; text-decoration: none;}
a.miText:hover {background-color: #FF3D00; color: #FFFFFF;}
.miParent .submenu .menuItem > a.miText {padding-left: 30px;}
</style>
</head>
<html>
<body>
	<div class="menuItem">
		<a href="<s:url action="strutsLink"/>" class="miText">Welcome to PROLWEN</a>
	</div>
	<div class="menuItem">
		<a href="<s:url action="hibernateLink"/>" class="miText">Combination</a>
	</div>
	<div class="menuItem">
		<a href="<s:url action="SayWelcome"/>" class="miText">Document Library</a>
	</div>

</body>
</html>
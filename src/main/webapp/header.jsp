<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<div class="header">
	<div class="navmenu">
		<div class="left-menue">
			<a href="/windoor/" style="color: #946E83; font-size: 24pt;">WINDOOR</a>
			<a href="/windoor/windows" style="color: #DFFDFF;">Windows</a>
			<a href="/windoor/doors" style="color: #DFFDFF;">Doors</a>  
			<a href="/windoor/calculator" style="color: #DFFDFF;">Calculator</a>
		</div>
		<div class="right-menue">
			<a href="/windoor/profile" style="color: #AE5A94;">${sessionScope.sessionLogin}</a>
			<c:if test="${userPerm == 1}"><a href="/windoor/add" style="color: #946E83; ">Add</a></c:if>
			<a href="/windoor/logOut" style="color: #946E83;">Log out</a>
		</div>
	</div>
</div>
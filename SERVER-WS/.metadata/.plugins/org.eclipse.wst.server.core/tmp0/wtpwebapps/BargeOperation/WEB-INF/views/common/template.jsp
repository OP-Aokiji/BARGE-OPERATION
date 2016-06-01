<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html class="no-js">

<head>
<title><spring:message code="app.title.home" /></title>
<!-- Bootstrap -->
<link
	href="<c:url value='/admin-theme/bootstrap/css/bootstrap.min.css' />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value='/admin-theme/bootstrap/css/bootstrap-responsive.min.css' />"
	rel="stylesheet" media="screen">
<link
	href="<c:url value='/admin-theme/vendors/easypiechart/jquery.easy-pie-chart.css' />"
	rel="stylesheet" media="screen">
<link href="<c:url value='/admin-theme/assets/styles.css' />"
	rel="stylesheet" media="screen">
<link href="<c:url value='/admin-theme/assets/DT_bootstrap.css' />"
	rel="stylesheet" media="screen">

<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
            <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
        <![endif]-->
<script
	src="<c:url value='/admin-theme/vendors/modernizr-2.6.2-respond-1.1.0.min.js' />"></script>
<script src="<c:url value='/js/jquery-2.2.3.min.js' />"></script>
</head>
<body>
	<div class="navbar navbar-fixed-top">
		<jsp:include page="topmenu.jsp" />
	</div>
	<div class="container-fluid">
		<div class="row-fluid">
			<%-- <jsp:include page="sidebar-left.jsp" />             --%>

			<!--/span-->
			<div class="span12" id="content">
				<div class="row-fluid">
					<%-- <jsp:include page="alerts.jsp" /> --%>
					<jsp:include page="nav.jsp" />
				</div>
				<jsp:include page="${partial}" />
			</div>
		</div>
		<hr>
		<footer> <jsp:include page="footer.jsp" /> </footer>
	</div>
	<!--/.fluid-container-->
	<script
		src="<c:url value='/admin-theme/vendors/jquery-1.9.1.min.js' />"></script>
	<script
		src="<c:url value='/admin-theme/bootstrap/js/bootstrap.min.js' />"></script>
	<script
		src="<c:url value='/admin-theme/vendors/easypiechart/jquery.easy-pie-chart.js' />"></script>
	<script src="<c:url value='/admin-theme/assets/scripts.js' />"></script>
	<script
		src="<c:url value='/admin-theme/vendors/datatables/js/jquery.dataTables.min.js' />"></script>
	<script src="<c:url value='/admin-theme/assets/DT_bootstrap.js' />"></script>


	<script>
		$(function() {
			// Easy pie charts
			$('.chart').easyPieChart({
				animate : 1000
			});
		});
	</script>
	<%-- <jsp:include page="header.jsp" />
 <jsp:include page="${partial}" />
 <jsp:include page="footer.jsp" /> --%>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<div class="navbar-inner">
	<div class="container-fluid">
		<a class="btn btn-navbar" data-toggle="collapse"
			data-target=".nav-collapse"> <span class="icon-bar"></span> <span
			class="icon-bar"></span> <span class="icon-bar"></span>
		</a> <a class="brand" href="#">Admin Panel</a>
		<div class="nav-collapse collapse">
			<ul class="nav pull-right">
				<li class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown"> <i
						class="icon-user"></i> Vincent Gabriel <i class="caret"></i>

				</a>
					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">Profile</a></li>
						<li class="divider"></li>
						<li><a tabindex="-1" href="login.html">Logout</a></li>
					</ul></li>
			</ul>
			<ul class="nav">
				<li class="active"><a href="#">Dashboard</a></li>

				<li class="dropdown"><a href="#" data-toggle="dropdown"
					class="dropdown-toggle">Configuration <b class="caret"></b>
				</a>
					<ul class="dropdown-menu" id="menu11">
						<li><a href="QuayCrane">Quay Crane</a></li>
					</ul></li>

				<li class="dropdown"><a href="#" data-toggle="dropdown"
					class="dropdown-toggle">Master <b class="caret"></b>
				</a>
					<ul class="dropdown-menu" id="menu11">
						<li><a href="listVesselBargeInfo.html">Vessel Barge Info
								List</a></li>
						<li><a href="<c:url value='/PartnerInfo/list' />">Partner Info List</a></li>
						<li><a href="listCargoInfo">Cargo Info List</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" data-toggle="dropdown"
					class="dropdown-toggle">Voyage <b class="caret"></b>
				</a>
					<ul class="dropdown-menu" id="menu11">
						<li><a href="listVoyageCargoInfo">Voyage Cargo Info List</a></li>
						<li><a href="listVoyageBLInfo">Voyage BL Info List</a></li>
						<li><a href="listVoyageHoldInfo">Voyage Hold Info List</a></li>
						<li><a href="listVoyageBargeOperation">Voyage Barge
								Operation List</a></li>
					</ul></li>
									<li class="dropdown"><a href="#" data-toggle="dropdown"
					class="dropdown-toggle">Manual <b class="caret"></b>
				</a>
					<ul class="dropdown-menu" id="menu11">
					<li><a href="listManualBargeOperation">Manual Barge
								Operation List</a></li>
					</ul></li>
			
				<li class="dropdown"><a href="#" role="button"
					class="dropdown-toggle" data-toggle="dropdown">Users <i
						class="caret"></i>

				</a>
					<ul class="dropdown-menu">
						<li><a tabindex="-1" href="#">User List</a></li>
						<li><a tabindex="-1" href="#">Search</a></li>
						<li><a tabindex="-1" href="#">Permissions</a></li>
					</ul></li>
			</ul>
		</div>
		<!--/.nav-collapse -->
	</div>
</div>
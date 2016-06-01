<%-- <jsp:include page="form.jsp"></jsp:include> --%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="block">
	<div class="navbar navbar-inner block-header">
		<div class="muted pull-left">Quay Crane Configuration</div>
	</div>
	<div class="block-content collapse in">
		<div class="span12">
			<form:form class="form-horizontal" method="POST"
				action="../update" modelAttribute="partnerInfo">
				<fieldset>
					<legend>Partner Info</legend>
					<div class="control-group">
							<label class="control-label" for="focusedInput">Code:
								</label>
							<div class="controls">
								<form:input path="code" class="input-small focused"
 									id="focusedInput" type="" value="${partnerInfo.code}" readonly="true" /> 
							</div>
						</div>
						<div class="control-group">
							<label class="control-label" for="focusedInput">Name:
								</label>
							<div class="controls">
								<form:input path="name" class="input-small focused"
									id="focusedInput" type="text" value="${partnerInfo.name}" />
							</div>
						</div>
					<div class="form-actions">
						<button type="submit" class="btn btn-primary">Save
							changes</button>
						<button type="reset" class="btn">Cancel</button>
					</div>
				</fieldset>
			</form:form>

		</div>
	</div>
</div>
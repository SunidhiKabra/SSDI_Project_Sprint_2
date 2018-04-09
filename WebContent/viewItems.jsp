<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="header.jsp" />
<jsp:include page="errorList.jsp" />

<hr />
<br />



<!-- <div class="container">
	<div class="row bg-black">

		<div class="col-sm-2">Item</div>
		<div class="col-sm-5">Description</div>
		<div class="col-sm-2">Rent</div>
		<div class="col-sm-3">Owner Details</div>


	</div>
</div>
 -->
<div class="container">
	
		<table class="table table-bordered table-striped">
			<thead class="thead-dark">
				<tr>
					<th>Item</th>
					<th>Description</th>
					<th>Rent</th>
					<th>Owner Details</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="item" items="${items}">
					
					<tr>

						<td valign="middle" >${item.getName()}</td>

						<td valign="middle" >${item.getDescription()}</td>

						<td valign="middle">${item.getRent()}</td>

						<td valign="middle"><a
							href="viewRenter.do?customerId=${item.getCustomerId()}"
							class="btn btn-outline-info" role="button">Contact Renter </a></td>
					</tr>
					
				</c:forEach>
			</tbody>
		</table>
	</div>


<jsp:include page="footer.jsp" />
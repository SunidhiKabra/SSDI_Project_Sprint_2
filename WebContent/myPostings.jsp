<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<jsp:include page="header.jsp" />



<jsp:include page="errorList.jsp" />

<hr />
<br />
<p>
<table class="table table-bordered table-striped">
    <thead class="thead-dark">
      <tr>
        <th>Item</th>
        <th>Description</th>
        <th>Rent</th>
      </tr>
    </thead>
    <tbody>
	<c:forEach var="item" items="${items}">

		<tr>
			<td valign="top">${item.getName()}</td>
		
			<td valign="top">${item.getDescription()}</td>

			<td valign="top">${item.getRent()}</td>
			
		</tr>

	</c:forEach>
	</tbody>
</table>
</p>

<jsp:include page="footer.jsp" />

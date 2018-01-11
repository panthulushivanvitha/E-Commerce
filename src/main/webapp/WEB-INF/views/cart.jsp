<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>HOME DECORS</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="utf-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<table class="table table-hover" id="apl" class="display" border="2" width="80" align="center">
<tr>
<th>Product Name</th>
<th>Product Quantity</th>
<th>Product Price</th>
<th>Sub Total</th>
<th>Action</th>
</tr>
<c:if test="${empty cartInfo}">
<tr>
<td colspan="10" align="center">No record exits!</td>
</tr>
</c:if>
<c:forEach var="p" varstatus="st" items="${cartInfo}">
<tr>
<td><c:out value="${p.pname}"></c:out></td>
<td><c:out value="${p.qty}"></c:out></td>
<td><c:out value="${p.price}"></c:out></td>

<td><img  src="${pageContext.request.contextPath}/resources/${p.imagName}" height="50px" width="50px">
<td><c:out value="${p.qty * p.price }"></c:out>
<td class="span2">
<c:set var="contextRoot" value="${pageContext.request.contextPath}"></c:set>
<a class="btn btn-info" role="button" href="<c:url value="/deletePCart/${p.cartid}"/>">Delete</a>
</td>
</tr>
</c:forEach>
<td>
<c:set var="gtot" value="${gtot+p.price * p.qty }"></c:set>
<span class="col-lg-9" align="right"><label>Grand Total</label><c:out value="${gtot }"></c:out></span>
</td>
<tfoot>
<td>
<a class="btn btn-warning btn-lg" href="${pageContext.request.contextPath}/index">Continue Shopping</a>
</td>
<td>
<a class="btn btn-success btn-lg" href="${pageContext.request.contextPath}/checkout">CheckOut</a>
</td>

</table>

</body>
</html>  --%>
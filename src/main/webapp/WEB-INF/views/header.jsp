<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<head>
  <title>HOME DECORS</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">HOME DECORS</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li><a href="index">Home</a></li>
       <li><a href="contact"><i class="fa fa-adress-book" aria-hidden="true"></i></a>
         
        <li><a href="adding">Admin</a></li>
        
 <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Admin List<span class="caret"></span></a>
        <ul class="dropdown-menu">
        <li><a href="${pageContext.request.contextPath}/productList">Product</a></li>
        <li><a href="${pageContext.request.contextPath}/supplierList">Supplier</a></li>
        <li><a href="${pageContext.request.contextPath}/categoryList">Category</a></li>
        
        </ul>
        </li>  
           
         
      <ul class="nav navbar-nav navbar-right">
      <c:if test="${pageContext.request.userPrincipal.name==null}">
        <li><a href="${pageContext.request.contextPath}/goToSignUp"><span class="glyphicon glyphicon-user"></span> SignUp</a></li>
        <li><a href="${pageContext.request.contextPath}/goToLogin"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
        </c:if>
        <c:if test="${pageContext.request.userPrincipal.name==null}">
        <li><a>Welcome:${pageContext.request.userPrincipal.name}</a></li>
        <li><a href="${pageContext.request.contextPath}/logout">Logout</a></li>
        </c:if>
        
       
        <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span> Cart</a></li>
      </ul>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">
      category choice<span class="caret"></span></a>
      <ul class="dropdown-menu">
      <c:forEach var="catval" items="${catList}">
      <li><a href="${pageContext.request.contextPath} /productCustList?cid=${catval.cid}">${catval.cname}</a>
      </li>
      </c:forEach>
      </ul>
     
    </div>
  </div>
</nav>
  

</head>
<body>

</body>
</html>
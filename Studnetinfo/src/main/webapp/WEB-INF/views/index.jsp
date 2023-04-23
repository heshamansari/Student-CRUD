<html>
<head>
<%@include file="./base.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
 <%@page isELIgnored="false" %>
</head>
<body>
<div class="container mt-3">
<h1 class="text-center">All Students Details</h1>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Roll No.</th>
      <th scope="col">Student Name</th>
      <th scope="col">Branch</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${student}" var="s">
	    <tr>
	      <th scope="row">${s.id}</th>
	      <td>${s.name }</td>
	      <td>${s.branch }</td>
	    </tr>
	 </c:forEach>
  </tbody>
</table>
<div class="text-center">
<a href="add">Add Student</a>
</div>
<div class="text-center">
<a href="delete">Delete Student</a>
</div>
<div class="text-center">
<a href="update">Update Student</a>
</div>
</div>
</body>
</html>

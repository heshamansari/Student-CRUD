<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="./base.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
	<form action="update-student" method="post">
	  <div class="form-group">
	  <h1 class="text-center">Update the Student</h1>
	  
	    <label for="id">Enter Roll Number</label>
	    <input type="text" 
	    class="form-control" 
	    id="id" 
	    name="id"
	    placeholder="Enter student rollno">
	    
	    <label for="name">Enter the Name</label>
	    <input type="text" 
	    class="form-control" 
	    id="name" 
	    name="name"
	    placeholder="Enter student name">
	    
	    <label for="branch">Enter the Branch</label>
	    <input type="text" 
	    class="form-control" 
	    id="branch" 
	    name="branch"
	    placeholder="Enter student branch">
	    
	  </div>
	  <button type="submit">Update</button>
	</form>
</div>
</body>
</html>
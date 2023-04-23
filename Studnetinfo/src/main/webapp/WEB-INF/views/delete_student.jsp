<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@ include file="./base.jsp" %>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container mt-3">
	<form action="delete-student" method="post">
	  <div class="form-group">
	  <h1 class="text-center">Delete Student</h1>
	  
	    <label for="id">Enter Roll Number</label>
	    <input type="text" 
	    class="form-control" 
	    id="id" 
	    name="id"
	    placeholder="Enter student rollno">
	    </div>
	    <button type="submit">Delete</button>
	</form>
</div>
</body>
</html>
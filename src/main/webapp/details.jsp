<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</head>
<body>
	 
	<h1>Edit Employee</h1>
	<hr>
	<br>
	<div class="container">
	<div class="container">
		
	<form class="form-inline" action="/updateAlien" method="post">
  	<h1>Employee Details </h1>
  	
  <div class="form-group">
  
    <label for="exampleInputName2">ID :</label>
    <input type="text" class="form-control" id="exampleInputName2" placeholder="employee id" name="aid" value="${a.aid}" readonly>
  </div>
  <div class="form-group">
    <label for="exampleInputEmail2">NAME:</label>
    <input type="text" class="form-control" id="exampleInputEmail2" placeholder="employee name" name="aname" value="${a.aname }">
  </div>
    <div class="form-group">
    <label for="exampleInputEmail3">Department:</label>
    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="employee department" name="department" value="${a.department }">
  </div>
    <div class="form-group">
    <label for="exampleInputEmail4">Salary:</label>
    <input type="text" class="form-control" id="exampleInputEmail4" placeholder="employee salary" name="salary" value="${a.salary }">
  </div>
  <br>
  <input type="submit" class="btn btn-warning" value="Edit Employee">
</form>
	</div></div>
	
</body>
</html>
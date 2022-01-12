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
	 
	
	<hr>
	<br>
		
	<div class="container">
	 <form class="form-inline" action="/addAlien" method="post">
  	<h1>Add New Employee</h1>
  <div class="form-group">
  
    <label for="exampleInputName1">ID :</label>
    <input type="text" class="form-control" id="exampleInputName1" placeholder="employee id" name="aid">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail2">NAME:</label>
    <input type="text" class="form-control" id="exampleInputEmail2" placeholder="employee name" name="aname">
  </div>
  
    <div class="form-group">
    <label for="exampleInputEmail3">Department:</label>
    <input type="text" class="form-control" id="exampleInputEmail3" placeholder="employee department" name="department">
  </div>
  
    <div class="form-group">
    <label for="exampleInputEmail4">Salary:</label>
    <input type="text" class="form-control" id="exampleInputEmail4" placeholder="employee salary" name="salary">
  </div>
  <br>
  <input type="submit" class="btn btn-warning" value="Add Employee">
</form>
	</div>
	
	<hr>
	<br>
	<div class="container">
		<table class="table">
  <thead class="thead-dark">
    <tr>
      
      <th scope="col">id </th>
      <th scope="col">name</th>
      <th scope="col">Department</th>
      <th scope="col">Salary</th>
      
    </tr>
  </thead>
  <tbody>
  <c:forEach var="item" items="${a}">
    <tr>
      
      <td> ${item.aid}</td>
      <td> ${item.aname}</td>
      <td> ${item.department}</td>
      <td> ${item.salary}</td>
      <td> <a href="show?aid=${item.aid}">Edit</a></td>
      <td> <a href="delete?aid=${item.aid}">delete</a></td>
      
      
    </tr>
    </c:forEach>
  </tbody>
</table>
	</div>
	
</body>
</html>
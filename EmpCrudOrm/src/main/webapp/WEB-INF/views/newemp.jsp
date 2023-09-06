<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Information</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <link rel="stylesheet" href="styles.css">
</head>
<body>
<div class="container">
        <h1>Employee Information</h1>
        <form action="savenewemp" method="get">
            <div class="form-group">
                <label for="empno">Employee Number:</label>
                <input type="text" class="form-control" id="empno" name="empno" value="">
            </div>
            <div class="form-group">
                <label for="eName">Employee Name:</label>
                <input type="text" class="form-control" id="eName" name="eName" value="">
            </div>
            <div class="form-group">
                <label for="job">Job:</label>
                <input type="text" class="form-control" id="job" name="job" value="">
            </div>
            <div class="form-group">
                <label for="mgr">Manager:</label>
                <input type="text" class="form-control" id="mgr" name="mgr" value="">
            </div>
            <div class="form-group">
                <label for="hiredate">Hire Date:</label>
                <input type="text" class="form-control" id="hiredate" name="hiredate" value="">
            </div>
            <div class="form-group">
                <label for="sal">Salary:</label>
                <input type="text" class="form-control" id="sal" name="sal" value="">
            </div>
            <div class="form-group">
                <label for="comm">Commission:</label>
                <input type="text" class="form-control" id="comm" name="comm" value="">
            </div>
            <div class="form-group">
                <label >Department number:</label>
                <input type="text" class="form-control" id="deptNo" name="deptNo" value="">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
</body>
</html>
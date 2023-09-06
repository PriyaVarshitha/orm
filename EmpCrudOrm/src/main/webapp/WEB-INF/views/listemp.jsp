
<%@ page language="java" import="java.util.*,com.model.Employee" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <H1>Employees List </H1>

      <TABLE BORDER="1">
      <TR>
      <TH>Emp No</TH>
      <TH>Name</TH>
      <TH>Job</TH>
      <TH>MANAGER NO</TH>
      <TH>HIRE DATE</TH>
      <TH>Salary</TH>
      <TH>COMMISSION</TH>
      <TH>Dept No</TH>
      </TR>
      <% 
      	
        List<Employee> elist=(List<Employee>)request.getAttribute("emplist");
		for(Employee e:elist){
	  %>
      	<TR>
       		  <TD> <%= e.getEmpno() %></td>
     		  <TD> <%= e.geteName()%></TD>
      		  <TD> <%= e.getJob() %></TD>
      		  <TD> <%= e.getMgr() %></TD>
      		  <TD> <%= e.getHiredate() %></TD>
     		  <TD> <%= e.getSal() %></TD>
     		  <TD> <%= e.getComm() %></TD>
     		  <TD> <%= e.getDeptNo() %></TD>
      </TR>
      <% 
      	} 
      %>
     </TABLE>
</body>
</html>
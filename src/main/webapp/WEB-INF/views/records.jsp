<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="com.loan.model.LoanApplicants,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Loan Applicants List</title>

<!-- Include Bootstrap CSS -->
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<body>
	<div class="container">
		<h1>Loan Applicants List</h1>


		<!-- Loan Applicants Table -->
		<table class="table table-bordered">
			<!-- Table Header -->
			<thead class="thead-dark">
				<tr>
					<th>LOAN APPLICATION ID</th>
					<th>CUSTOMER ID</th>
					<th>APPLICATION DATE</th>
					<th>LOAN TYPE ID</th>
					<th>LOAN AMOUNT</th>
					<th>EMI RANGE FROM</th>
					<th>EMI RANGE TO</th>
					<th>NUMBER OF MONTHS REQUESTED</th>
					<th>CIBIL SCORE</th>
					<th>schedule</th>

				</tr>
			</thead>
			<tbody>
				<%
				List<LoanApplicants> el = (List<LoanApplicants>) request.getAttribute("list");
				for (LoanApplicants e : el) {
				%>

				<tr>
					<form action="schedule" method="get">
						<td><%=e.getId()%><input type="hidden" name="id"
							value="<%=e.getId()%>"></td>
						<td><%=e.getCustomer()%> <input type="hidden" name="customer"
							value="<%=e.getCustomer()%>"></td>
						<td><%=e.getApplicationDate()%> <input type="hidden"
							name="applicationDate" value="<%=e.getApplicationDate()%>"></td>

						<td><%=e.getLoanTypeId()%> <input type="hidden"
							name="loanTypeId" value="<%=e.getLoanTypeId()%>"></td>
						<td><%=e.getLoanAmount()%> <input type="hidden"
							name="loanAmount" value="<%=e.getLoanAmount()%>"></td>
						<td><%=e.getEmiRangeFrom()%> <input type="hidden"
							name="emiRangeFrom" value="<%=e.getEmiRangeFrom()%>"></td>

						<td><%=e.getEmiRangeTo()%> <input type="hidden"
							name="emiRangeTo" value="<%=e.getEmiRangeTo()%>"></td>
						<td><%=e.getNumberOfMonthsRequested()%> <input type="hidden"
							name="numberOfMonthsRequested"
							value="<%=e.getNumberOfMonthsRequested()%>"></td>
						<td><%=e.getCibilScore()%> <input type="hidden"
							name="cibilScore" value="<%=e.getCibilScore()%>"></td>

						<td><input type="submit" class="btn btn-primary"
							value="generate schedule"></td>
					</form>
				</tr>

				<%
				}
				%>

			</tbody>
		</table>
	</div>

	<!-- Include Bootstrap JS (optional, for Bootstrap components that require JavaScript) -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	<!-- Include jQuery for JavaScript functionality -->
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	
</body>
</html>
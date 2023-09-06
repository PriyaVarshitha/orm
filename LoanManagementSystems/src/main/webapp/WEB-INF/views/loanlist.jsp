<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="com.loan.model.LoanApplicants,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Loan Applicants List</title>
    
    <!-- Include Bootstrap CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h1>Loan Applicants List</h1>
        <table class="table table-bordered">
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
                    <th>LOAN STATUS</th>
                    <th>CONCLUSION REMARKS</th>
                    <th>Submit</th>
                </tr>
            </thead>
            <tbody>
                <% 
                    List<LoanApplicants> el=(List<LoanApplicants>)request.getAttribute("list");
                    for(LoanApplicants e:el){
                %>
                    <tr>
                        <td><%= e.getId() %></td>
                        <td><%= e.getCustomer() %></td>
                        <td><%= e.getApplicationDate() %></td>
                        <td><%= e.getLoanTypeId() %></td>
                        <td><%= e.getLoanAmount() %></td>
                        <td><%= e.getEmiRangeFrom() %></td>
                        <td><%= e.getEmiRangeTo() %></td>
                        <td><%= e.getNumberOfMonthsRequested() %></td>
                        <td><%= e.getCibilScore() %></td>
                        <td>
                            <input type="text" class="form-control" id="loanStatus" name="loanStatus">
                        </td>
                        <td>
                            <input type="text" class="form-control" id="conclusionRemarks" name="conclusionRemarks">
                        </td>
                        <td>
                            <input type="submit" class="btn btn-primary" value="Submit">
                        </td>
                    </tr>
                <% 
                    } 
                %>
            </tbody>
        </table>
    </div>

    <!-- Include Bootstrap JS (optional, for Bootstrap components that require JavaScript) -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>

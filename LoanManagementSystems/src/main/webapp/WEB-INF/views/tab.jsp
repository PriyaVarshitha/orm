<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.5.0/dist/css/bootstrap.min.css">

<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

body {
	font-family: Arial, Helvetica, sans-serif;
	background-color: #f2f2f2;
}

.topnav {
	overflow: hidden;
	background-color: #3498db;
	/* Change this color to your desired color */
	color: white;
}

.topnav a {
	float: left;
	display: block;
	color: white;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 18px;
	width: 33.33%;
	transition: background-color 0.3s;
}

.topnav a:hover {
	background-color: #2980b9;
	/* Change this color to your desired hover color */
}

.topnav a.active {
	background-color: #2980b9;
	/* Change this color to your desired active color */
}

@media screen and (max-width: 600px) {
	.topnav a {
		float: none;
		display: block;
		text-align: left;
		width: 100%;
		margin: 0;
		padding: 14px;
		border-bottom: 1px solid #ccc;
	}
}

.form-part {
	background-color: white;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	margin: 20px 0;
	display: none;
}

.form-part input[type="text"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 10px;
	border: 1px solid #ccc;
	border-radius: 3px;
	font-size: 16px;
}

.form-part button {
	background-color: #3498db;
	/* Change this color to your desired button color */
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 3px;
	font-size: 18px;
	cursor: pointer;
}

.form-part button:hover {
	background-color: #2980b9;
	/* Change this color to your desired hover color */
}
</style>
<title>form</title>
</head>
<body>

	<div class="container">
		<div class="topnav navbar navbar-expand-lg navbar-light bg-light">
			<ul class="navbar-nav">
				<li class="nav-item"><a class="nav-link active"
					href="javascript:void(0);" onclick="showTab(0)">CUSTOMER</a></li>
				<li class="nav-item"><a class="nav-link"
					href="javascript:void(0);" onclick="showTab(1)">LOAN
						APPLICATION</a></li>
				<li class="nav-item"><a class="nav-link"
					href="javascript:void(0);" onclick="showTab(2)">NOMINEE</a></li>
			</ul>
		</div>
	</div>


	<script>
		$(document).ready(

		function() {
			showTab(0);
		}

		)
		let tabIndex = 0;

		function showTab(index) {
			const forms = document.getElementsByClassName("form-part");
			const tabs = document.getElementsByClassName("topnav")[0]
					.getElementsByTagName("a");

			if (index >= 0 && index < forms.length) {
				for (let i = 0; i < forms.length; i++) {
					forms[i].style.display = "none";
					tabs[i].classList.remove("active");
				}
				forms[index].style.display = "block";
				tabs[index].classList.add("active");
				tabIndex = index;

			}

		}

		function nextTab() {
			showTab(tabIndex +1);
			
		}

		function prevTab() {
			showTab(tabIndex - 1);
		}

		// Display the first form part initially
		showTab(0);
	</script>
	<form action="preview" method="get">
		<div class="form-part">
			
				<div>
					First Name:<input type="text" id="firstName" name="firstName">
				</div>
				<div>
					Last Name: <input type="text" id="lastName" name="lastName">
				</div>
				<div>
					Date of Birth:<input type="text" id="dateOfBirth"
						name="dateOfBirth">
				</div>
				<div>
					PAN Number:<input type="text" id="panNumber" name="panNumber">
				</div>
				<div>
					Mobile Number:<input type="text" id="mobileNumber"
						name="mobileNumber">
				</div>
				<div>
					Address:<input type="text" id="address" name="address">
				</div>
				<div>
					Guardian Name:<input type="text" id="guardianName"
						name="guardianName">
				</div>
				<div>
					Last Updated At:<input type="text" id="lastUpdatedAt"
						name="lastUpdatedAt">
				</div>
				<div>
					Last Updated By:<input type="text" id="lastUpdatedBy"
						name="lastUpdatedBy">
				</div>
				<button type="button" onclick="nextTab()">Next</button>
			
		</div>

		<div class="form-part">
			

				<div>
					<label for="id">ID:</label> <input type="text" id="id" name="id">
				</div>
				<div>
					<label for="customer">Customer ID:</label> <input type="text"
						id="customer" name="customer">
				</div>
				<div>
					<label for="applicationDate">Application Date:</label> <input
						type="text" id="applicationDate" name="applicationDate">
				</div>
				<div>
					<label for="loanType">Loan Type ID:</label> <input type="text"
						id="loanType" name="loanType">
				</div>
				<div>
					<label for="loanAmount">Loan Amount:</label> <input type="text"
						id="loanAmount" name="loanAmount">
				</div>
				<div>
					<label for="emiRangeFrom">EMI Range (From):</label> <input
						type="text" id="emiRangeFrom" name="lnap_emi_range_from">
				</div>
				<div>
					<label for="emiRangeTo">EMI Range (To):</label> <input type="text"
						id="emiRangeTo" name="emiRangeTo">
				</div>
				<div>
					<label for="numberOfMonthsRequested">Number of Months
						Requested:</label> <input type="text" id="numberOfMonthsRequested"
						name="numberOfMonthsRequested">
				</div>
				<div>
					<label for="cibilScore">CIBIL Score:</label> <input type="text"
						id="cibilScore" name="cibilScore">
				</div>
				<div>
					<label for="status">Status:</label> <input type="text" id="status"
						name="status">
				</div>
				<div>
					<label for="conclusionRemarks">Conclusion Remarks:</label> <input
						type="text" id="conclusionRemarks" name="lnap_conclusion_remarks">
				</div>
				<div>
					<label for="processedUser">Processed User:</label> <input
						type="text" id="processedUser" name="processedUser">
				</div>
				<div>
					<label for="processedDate">Processed Date:</label> <input
						type="text" id="processedDate" name="processedDate">
				</div>
				<button type="button" onclick="prevTab()">Previous</button>
				<button type="button" onclick="nextTab()">Next</button>

			
		</div>

		<div class="form-part">
			

				<div>
					<label for="id">ID:</label> <input type="text" id="nid" name="id">
				</div>
				<div>
					<label for="nominee">Nominee:</label> <input type="text"
						id="nominee" name="nominee">
				</div>
				<div>
					<label for="relation">Relation:</label> <input type="text"
						id="relation" name="relation">
				</div>
				<button type="button" onclick="prevTab()">Previous</button>
			
		</div>
	   <button type="submit">Submit</button>

	</form>



</body>
</html>
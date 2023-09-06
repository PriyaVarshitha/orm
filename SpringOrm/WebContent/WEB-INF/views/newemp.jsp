<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
    * {
    box-sizing: border-box}
    body {font-family: "Lato", sans-serif;}
    
    /* Style the tab container */
    .tab {
      overflow: hidden;
      background-color: #29ddc5; /* Background color for the tab container */
    }
    
    /* Style the buttons inside the tab */
    .tab button {
      background-color: inherit;
      color: black /* Text color for the buttons */
      float: left;
      border: none;
      outline: none;
      text-align: center;
      cursor: pointer;
      transition: 0.3s;
      font-size: 15px;
      margin-right: 20px; /* Add some space between buttons */
      padding: 10px 20px; /* Padding for the buttons */
      border-radius: 5px; /* Rounded corners for the buttons */
    }
    
    /* Change background color of buttons on hover */
    .tab button:hover {
      background-color: white; /* Background color on hover */
    }
    
    /* Create an active/current "tab button" class */
    .tab button.active {
      background-color: green; /* Background color for the active tab button */
      color: #333; /* Text color for the active tab button */
    }
    
    /* Style the tab content */
    .tabcontent {
      
      display: none;
      padding: 20px 12px;
      border: 6px solid #42853b;
      width: 50%;
      
      height: 300px;
      background-color: rgb(183, 250, 209); /* Background color for the tab content */
      color: black; /* Text color for the tab content */
      border-radius: 25px; /* Rounded corners for the tab content */
    }
    
    /* Show the active tab */
    .active-tab {
      display: block;
    }
    </style>
</head>
<body>
<center>
<h1>Enter the details</h1>

<div class="tab">
  <button class="tablinks active" onclick="openCity(event, 'customer')" id="defaultOpen">customer</button>
  <button class="tablinks" onclick="openCity(event, 'Nominee')">Nominee</button>
  <button class="tablinks" onclick="openCity(event, 'LoanApplicant')">LoanApplicant</button>
</div>

<div id="customer" class="tabcontent active-tab">
  <h3>customer</h3>
  <form action="" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    
    <!-- Radio Buttons -->
    <p>Gender:</p>
    <input type="radio" id="male" name="gender" value="male">
    <label for="male">Male</label>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label>
  </form>
</div>

<div id="Nominee" class="tabcontent">
  <h3>Nominee</h3>
  <form action="" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    
    <!-- Radio Buttons -->
    <p>Gender:</p>
    <input type="radio" id="male" name="gender" value="male">
    <label for="male">Male</label>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label>
  </form>
</div>

<div id="LoanApplicant" class="tabcontent">
  <h3>LoanApplicant</h3>
  <form action="" method="POST">
    <label for="name">Name:</label>
    <input type="text" id="name" name="name" required>
    
    <!-- Radio Buttons -->
    <p>Gender:</p>
    <input type="radio" id="male" name="gender" value="male">
    <label for="male">Male</label>
    <input type="radio" id="female" name="gender" value="female">
    <label for="female">Female</label>
  </form>
</div>

<script>
function openCity(evt, cityName) {
  var i, tabcontent, tablinks;
  tabcontent = document.getElementsByClassName("tabcontent");
  for (i = 0; i < tabcontent.length; i++) {
    tabcontent[i].style.display = "none";
  }
  tablinks = document.getElementsByClassName("tablinks");
  for (i = 0; i < tablinks.length; i++) {
    tablinks[i].className = tablinks[i].className.replace(" active", "");
  }
  document.getElementById(cityName).style.display = "block";
  evt.currentTarget.className += " active";
}

// Get the element with id="defaultOpen" and click on it
document.getElementById("defaultOpen").click();
</script>
</center>
</body>
</html>

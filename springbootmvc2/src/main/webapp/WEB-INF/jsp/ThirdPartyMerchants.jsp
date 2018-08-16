<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
* {
	box-sizing: border-box
}
body {
	font-family: "Lato", sans-serif;
}
/* Style the tab */
.tab {
	float: left;
	border: 1px solid #ccc;
	background-color: #f1f1f1;
	width: 30%;
	height: 300px;
}
/* Style the buttons inside the tab */
.tab button {
	display: block;
	background-color: inherit;
	color: black;
	padding: 22px 16px;
	width: 100%;
	border: none;
	outline: none;
	text-align: left;
	cursor: pointer;
	transition: 0.3s;
	font-size: 17px;
}
/* Change background color of buttons on hover */
.tab button:hover {
	background-color: #ddd;
}
/* Create an active/current "tab button" class */
.tab button.active {
	background-color: #ccc;
}
/* Style the tab content */
.tabcontent {
	float: left;
	padding: 0px 12px;
	border: 1px solid #ccc;
	width: 70%;
	border-left: none;
	height: 300px;
}
</style>
</head>
<body>

	<h2>Third Party Merchant Options</h2>

	<div class="tab">
		<button class="tablinks" onclick="openCity(event, 'merchants')"
			id="defaultOpen">ThirdPartyMerchants List</button>
		<button class="tablinks" onclick="openCity(event, 'add')">Add
		ThirdPartyMerchant</button>
		<button class="tablinks" onclick="openCity(event, 'delete')">Delete
		ThirdPartyMerchant</button>
	</div>
	
	<div id="merchants" class="tabcontent">
		<center>
			<h3>
				<a href="merchants.jsp">List of all Merchants</a>
			</h3>
		</center>
	</div>

	<div id="add" class="tabcontent">
		<style>
* {
	box-sizing: border-box;
}
input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}
label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}
input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}
input[type=submit]:hover {
	background-color: #45a049;
}
.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}
.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}
/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}
/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
		<div class="container">
			<form action="/ListofAllMerchants">
				<div class="row">
					<div class="col-25">
						<label for="id">Merchant Id</label>
					</div>
					<div class="col-75">
						<input type="text" id="id" name="id" placeholder="Merchant id">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
						<label for="name">Merchant Name</label>
					</div>
					<div class="col-75">
						<input type="text" id="name" name="name"
							placeholder="Merchant name">
					</div>
				</div>
				<div class="row">
					<div class="col-25">
				
					</div>
	
				</div>
				<div class="row">
					<input type="submit" value="Add">
				</div>
			</form>
		</div>
	</div>

	<div id="delete" class="tabcontent">
		<form action="/ListofAllMerchants">
			<div class="row">
				<div class="col-25">
					<label for="id">Merchant Id</label>
				</div>
				<div class="col-75">
					<input type="text" id="id" name="id" placeholder="Merchant Id">
				</div>
			</div>
			<div class="row">
				<input type="submit" value="Delete">
			</div>
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
				tablinks[i].className = tablinks[i].className.replace(
						" active", "");
			}
			document.getElementById(cityName).style.display = "block";
			evt.currentTarget.className += " active";
		}
		// Get the element with id="defaultOpen" and click on it
		document.getElementById("defaultOpen").click();
	</script>
	
</body>
</html>
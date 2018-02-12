<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Choose Patient</title>
</head>
<body>
		<h1>Please Select One Of The Following:</h1>
		<p>
			<a href="PatientServlet?action=displayInPatientForm">
			<img src="https://images.mydoorsign.com/img/lg/S/inpatient-hospital-sign-s2-0246.png" 
			style="float: left; width: 30%; margin-right: 1%; margin-bottom: 0.5em;">
		</a></p>
		<p>
			<a href="PatientServlet?action=displayOutPatientForm">
			<img src="https://images.mydoorsign.com/img/lg/S/outpatient-fractured-hand-symbol-sign-s2-0247.png" 
			style="float: left; width: 30%; margin-right: 1%; margin-bottom: 0.5em;">
		</a></p>
		<p style="clear: both;">
</body>
</html>
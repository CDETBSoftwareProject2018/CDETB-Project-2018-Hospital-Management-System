<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert An Inpatient</title>
	</head>
	<body>
		<form action="PatientServlet?action=insertInPatient" method="post">
		    <p>Forename :</p>
			<p><input type="text" name="foreName" required></p>
			<p>Surname :</p>
			<p><input type="text" name="surName" required></p>
			<p>Date Of Birth :</p>
			<p><input type="date" name="dob" required></p>
			<p>Gender :</p>
			<p><input type="radio" name="gender" value="Male">Male<br>
  			   <input type="radio" name="gender" value="Female">Female</p>
			<p>Address :</p>
			<p><input type="text" name="address" required></p>
			<p>Phone Number :</p>
			<p><input type="text" name="phone" required></p>
			<p>Next Of Kin :</p>
			<p><input type="text" name="kin" required></p>
			<p>Doctor ID :</p>
			<p><input type="text" name="docId" required></p>
			<p>Department ID :</p>
			<p><input type="text" name="deptId" required></p>
			<p>Bed ID :</p>
			<p><input type="text" name="bedId" required></p>	
			<p>Admission Date :</p> 
			<p><input type="date" name="admission" required></p>
			<p>Discharge Date :</p>
			<p><input type="date" name="discharge" required></p>
			<br>
			<input type="submit" value="Submit Patient"></a>
		</form>
	</body>
</html>
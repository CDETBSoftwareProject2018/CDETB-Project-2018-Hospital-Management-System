<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert A New Patient</title>
	</head>
	
	<body>
		<h1>Insert A New Patient :</h1>
		<form action="PatientServlet?action=checkPatient" method="post"> <!-- Verify this in the Patient Servlet! -->     
		    <p>Insert Patient Type:</p>
			<select name="patientType">
		    	<option value="Inpatient">Inpatient</option>
		    	<option value="Outpatient">Outpatient</option>
	    	</select>
	    	<input type="submit" value="Enter">
		</form>
		
		<form action="PatientServlet?action=insertPatient" method="post">
		    <p>Forename :</p>
			<p><input type="text" name="forename" required></p>
			<p>Surname :</p>
			<p><input type="text" name="surname" required></p>
			<p>Date Of Birth :</p>
			<p><input type="date" name="dob" required></p>
			<p>Gender :</p>
			<p><input type="text" name="gender" required></p>
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
			
			<c:if test="${patientType == 'Inpatient'}">
	    		Input Details for Inpatient :
	    		
				<p>Admission Date :</p>
				<%--input type changed from "text" to "date"--%>  
				<p><input type="date" name="admission" required></p>
				<p>Discharge Date :</p>
				<%--input type changed from "text" to "date"--%>  
				<p><input type="date" name="discharge" required></p>
	    	</c:if>
	    	<c:if test="${patientType == 'Outpatient'}">
	    		Input Details for Outpatient :
	    		
	    		<p>Appointment :</p>
				<p><input type="date" name="appointment" required></p>
	    	</c:if>
	    	
			<br>
			Patient Type: ${patientType}
			<br><br>
			<input type="submit" value="Submit Patient"></a>
		</form>
	</body>
</html>
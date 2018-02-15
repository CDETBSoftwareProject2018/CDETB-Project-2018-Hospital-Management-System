<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Update Patient</title>
	</head>
	<body>
		<h1>Update A Patient</h1>
		<c:if test="${patient.isOutpatient == true}">
			<strong>Outpatient</strong>
		</c:if>
		<c:if test="${patient.isOutpatient == false}">
			<strong>Inpatient</strong>
		</c:if>
		
		<form action="">
			<input type="hidden" name="patientId" value="${patient.id}">
			
			Patient Name: ${patient.foreName + patient.surName}
			
			<p>Surname :</p>
			<p><input type="text" name="surname" value="${patient.surName}"  size="30"></p>
			<p>Date Of Birth :</p>
			<p><input type="date" name="dob" value="${patient.dob}"></p>
		 	<p>Address :</p>
			<p><input type="text" name="address" value="${patient.address}"></p>
			<p>Phone Number :</p>
			<p><input type="text" name="phone" value="${patient.phone}"></p>
			<p>Next Of Kin :</p>
			<p><input type="text" name="kin" value="${patient.kin}"></p>
			<p>Doctor ID :</p>
			<p><input type="text" name="docId" value="${patient.docId}"></p>
			<p>Department ID :</p>
			<p><input type="text" name="deptId" value="${patient.deptId}"></p>
			<p>Bed ID :</p>
			<p><input type="text" name="bedId" value="${patient.bedId}"></p>	
			
			<p><input type="submit" value="Submit"/></p> 	
		</form>
		
	</body>
</html>
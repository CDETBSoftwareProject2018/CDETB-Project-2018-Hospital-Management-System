<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Patient Details</title>
	</head>
	
	<body>
		<h1>Patient Details</h1>
		<c:choose>
			<c:when test="${listOfPatients.isEmpty()}">
				<h2>No Patients Match Your Search.</h2>
			</c:when>
			<c:otherwise>
				<table style="border: 1px solid black;  padding: 10px;">
					<tr>
						<td>Forename</td>
						<td>Surname</td>
						<td>Is Outpatient</td>
						<td>Date Of Birth</td>
						<td>Gender</td>
						<td>Address</td>
						<td>Phone Number</td>
						<td>Next Of Kin</td>
						<td>Doctor Id</td>
						<td>Department Id</td>
						<td>Admission Date</td>
						<td>Discharge Id</td>
						<td>Bed Id</td>
						<td>Appointment</td>
					</tr>
					<c:forEach var="patient" items="${listOfPatients}" varStatus="status">
					<tr>
						<td>${status.index + 1}</td>
						<td>${patient.forename}</td>
						<td>${patient.surname}</td>
						<td>${patient.isOutpatient}</td>
						<td>${patient.dob}</td>
						<td>${patient.address}</td>
						<td>${patient.phoneNumber}</td>
						<td>${patient.nextOfKin}</td>
						<td>${patient.doctorId}</td>
						<td>${patient.departmentId}</td>
						<td>${patient.admissionDate}</td>
						<td>${patient.dischargeDate}</td>
						<td>${patient.appointmentDate}</td>
						<td><a href="PatientServlet?action=updatePatientForm=${patient.id}">Update</a></td>
					<td><a href="BookServlet?action=deletePatient=${patient.id}">Delete</a></td>
					</tr>
				</c:forEach>
				</table>
			</c:otherwise>
		</c:choose>
		<p><a href="PatientServlet?action=newPatientForm">Insert New Patient</a></p>
		<p><a href="PatientServlet?action=updatePatientForm">Update An Existing Patient</a></p>
		<p><a href="PatientServlet?action=displayResultsAndPrescription">View Patient Results and Print Prescription</a></p>
	</body>
</html>
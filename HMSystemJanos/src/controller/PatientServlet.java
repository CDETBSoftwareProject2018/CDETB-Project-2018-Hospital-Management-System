package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Patient;

@WebServlet(
		description = "This Servlet handles the tables and functions for patient details", 
		urlPatterns = { 
		"/PatientServlet", 
		"/Patient"
		})

public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private PatientDAO patientDao;

    public PatientServlet() {
    	patientDao = new PatientDAO();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if (action == null) 
			action = "viewAll";
		System.out.println("action: " + action);
		
		switch (action) {
			
			/* I want to try and send in information for one patient only, or at least redirect to a single insert page.*/
		
			case "checkPatient":
				checkPatient(request, response);
				break;
			case "newPatientForm":
				newPatientForm(request, response);
				break;
			case "displayInPatientForm":
				displayInPatientForm(request,response);
				break;
			case "insertInPatient":
				insertInPatient(request, response);
				break;
			case "displayOutPatientForm":
				displayOutPatientForm(request,response);
				break;
			case "insertOutPatient":
				insertOutPatient(request, response);
				break;
			case "updatePatientForm":
				updatePatientForm(request, response);
				break;
			case "updatePatient":
				updatePatient(request, response);
				break;
			case "deletePatient":
				deletePatient(request, response);
				break;
			default:
				displayPatients(request, response);
				break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	private void checkPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String patientType = request.getParameter("patientType");
		request.setAttribute("patientType", patientType);
		System.out.println(patientType);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\insertPatientForm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void newPatientForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\choosePatient.jsp");
		dispatcher.forward(request, response);
	}
	
	protected void displayInPatientForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\insertInPatientForm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void insertInPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String foreName = request.getParameter("forename");
		String surName= request.getParameter("surname");	
		LocalDate dateOfBirth=LocalDate.parse(request.getParameter("dob"));
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String nextOfKin =request.getParameter("kin");
		int doctorId= Integer.parseInt(request.getParameter("docId"));
		int departmentId= Integer.parseInt(request.getParameter("deptId"));
		int bedId= Integer.parseInt(request.getParameter("bedId"));
		LocalDate admissionDate=LocalDate.parse(request.getParameter("admission"));
		LocalDate dischargeDate=LocalDate.parse(request.getParameter("discharge"));
		
		Patient	patient = new Patient(foreName, surName, dateOfBirth, gender, address, phone, nextOfKin, doctorId, departmentId, admissionDate, dischargeDate, bedId);
		
		System.out.println("Patient: "+ patient);
		
		patientDao.insertPatient(patient);
		response.sendRedirect("PatientServlet?action=viewAll");
	}
	
	protected void displayOutPatientForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\insertOutPatientForm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void insertOutPatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String foreName = request.getParameter("forename");
		String surName= request.getParameter("surname");		
		LocalDate dateOfBirth=LocalDate.parse(request.getParameter("dob"));
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		String nextOfKin =request.getParameter("kin");
		int doctorId= Integer.parseInt(request.getParameter("docId"));
		int departmentId= Integer.parseInt(request.getParameter("deptId"));
		int bedId= Integer.parseInt(request.getParameter("bedId"));
		LocalDate appointment = LocalDate.parse(request.getParameter("appointment"));
		
		Patient patient = new Patient(foreName, surName, dateOfBirth, gender, address, phone, nextOfKin, doctorId, departmentId, bedId, appointment);
		
		System.out.println("Patient: "+ patient);
		
		patientDao.insertPatient(patient);
		response.sendRedirect("PatientServlet?action=viewAll");
	}
	
	private void updatePatientForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void updatePatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void deletePatient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	private void displayPatients(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Patient> listOfPatients = patientDao.displayPatients();
		System.out.println(listOfPatients);
		
		request.setAttribute("listOfPatients", listOfPatients);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("\\WEB-INF\\view\\displayPatient.jsp");
		dispatcher.forward(request, response);
	}
}
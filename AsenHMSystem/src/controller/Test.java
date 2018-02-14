package controller;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import model.Bed;
import model.Billing;
import model.Department;
import model.Doctor;
import model.Patient;
import model.PatientNotes;
import model.Prescription;
import model.Room;
import model.RoomCost;
import model.Ward;

public class Test {

	public static void main(String[] args) {

		insertDepartment();
	}

	public static void insertDepartment() {
		
		Department depratment1 = new Department("Cardiology");
		Department depratment2 = new Department("Physiotheraphy");
		Department depratment3 = new Department("Rheumatology ");
		Department depratment4 = new Department("Opthhalmology ");
		Doctor doctor = new Doctor("Asen", "Evtimov", true , "Lusk", "0831762168", "Consultant", depratment1);
		Ward ward = new Ward("Belle", depratment1);
		RoomCost roomCost = new RoomCost("Public", new BigDecimal("500"));
		Room room = new Room(ward, roomCost);
		Bed bed = new Bed(true, room);
		Patient patient = new Patient(false, "John", "Smith", null, true, "Moon", "088956432", 
				"NextOfKin", null, null, null, bed, depratment1, doctor);
		PatientNotes patientNotes = new PatientNotes(null, "notes", patient);
		Prescription prescription = new Prescription(null, "notes", patient);
		Billing bill = new Billing(null, new BigDecimal("500"), new BigDecimal("50"), 
				"note",new BigDecimal("40"), true, patient);
		
		Session session = HibernateUtil.getSessionFactory().openSession();

		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			//Integer id = (Integer)session.save(depratment);
			//Integer id = (Integer)session.save(doctor);
			
			session.save(depratment1);
			session.save(depratment2);
			session.save(depratment3);
			session.save(depratment4);
			session.save(doctor);
			session.save(ward);
			session.save(roomCost);
			session.save(room);
			session.save(bed);
			session.save(patient);
			session.save(patientNotes);
			session.save(prescription);
			session.save(bill);
			System.out.println("Record saved");
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
}

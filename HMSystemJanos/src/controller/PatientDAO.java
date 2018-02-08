package controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import model.Patient;

public class PatientDAO {
	
	
	public void insertPatient(Patient patient) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			tx=session.beginTransaction();
			Integer id = (Integer)session.save(patient);
			System.out.println("Patient added to the database, Patient id: "+id);
		}
		catch(HibernateException e) {
			if (tx!=null) {
				tx.rollback();
				e.printStackTrace();
			}
		}
		finally {
			session.close();
		}
	}
	
	public void updatePatient() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			
		}
		catch(HibernateException e) {
			
		}
		finally {
			session.close();
		}
	}
	
	public void deletePatient() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			
		}
		catch(HibernateException e) {
			
		}
		finally {
			session.close();
		}
	}
}

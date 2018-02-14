package controller;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import model.Patient;

public class PatientDAO {
	
	public List<Patient> displayPatients() {
		List<Patient> listOfPatients = new ArrayList<>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		try {
			Query<Patient> query = session.createQuery("FROM Patient");
			listOfPatients = query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
		
		return listOfPatients;
	}
	
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
	
	public void updatePatient(Patient updatedPatient) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = null;
		
		try {
			tx = session.beginTransaction();
			session.update(updatedPatient);
			tx.commit();
		}
		catch(HibernateException e) {
			if(tx != null)
				tx.rollback();
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	public void deletePatient(int patientId) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
         
        try {
            tx = session.beginTransaction();
            Patient patient = session.get(Patient.class, patientId);
            session.delete(patient);
            tx.commit();            
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
	}
	
	public List<Patient> searchPatient(String searchType, String searchName) {
		Session session = HibernateUtil.getSessionFactory().openSession();
	    searchName = "%" + searchName + "%";
	    String hql = "FROM Book WHERE " + searchType + " LIKE :text";
	    Query<Patient> query = session.createQuery(hql);
	    query.setParameter("text", searchName);
	    List<Patient> listOfPatients = query.list();
	    System.out.println("List from the DAO: " + listOfPatients);
	    return listOfPatients;
	}
}

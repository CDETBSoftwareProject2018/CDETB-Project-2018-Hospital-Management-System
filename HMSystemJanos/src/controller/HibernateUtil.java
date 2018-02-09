package controller;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import model.Patient;

public class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static {
		Configuration config = new Configuration().configure();
		config.addAnnotatedClass(Patient.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(config.getProperties());
		sessionFactory = config.buildSessionFactory(builder.build());
	}
	
	protected static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	private HibernateUtil() { // I cannot instantiate this class.
		
	}
}


package utility;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
	
	public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("EticaretPersistanceUnit");
	
	public static EntityManagerFactory getEntityManagerFactory() {
		return entityManagerFactory;
	}

}

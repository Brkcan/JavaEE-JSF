package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import model.MusteriKayit;
import utility.JPAUtility;

public class MusteriKayitDAOImpl implements MusteriKayitDAO {

	private EntityManager entityManager;

	public MusteriKayitDAOImpl() {
		EntityManagerFactory emf = JPAUtility.getEntityManagerFactory();

		if (entityManager == null) {
			entityManager = emf.createEntityManager();
		}
	}

	@Override
	public MusteriKayit insertmusteriKayit(MusteriKayit musteriKayit) {
		entityManager.getTransaction().begin();
		entityManager.persist(musteriKayit);
		entityManager.getTransaction().commit();

		return musteriKayit;
	}

	@Override
	public MusteriKayit login(String mail, String password) {
		Query q = entityManager
				.createQuery("SELECT u FROM MusteriKayit u WHERE u.mail = :mailAl AND u.password = :passAl");
		q.setParameter("mailAl", mail);
		q.setParameter("passAl", password);

		return (MusteriKayit) q.getSingleResult();
	}

}

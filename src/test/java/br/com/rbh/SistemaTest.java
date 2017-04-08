package br.com.rbh;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class SistemaTest {
	
	private static EntityManager em;
	
	@BeforeClass
	public static void init() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2PU");
		em = emf.createEntityManager();
	}
	
	@Test
	public void testApp() {
		em.getTransaction().begin();
		
		Sistema sistema = new Sistema();
		sistema.setNome("Sistema 1");
		
		em.getTransaction().commit();
	}
	
	@Test
	public void testBuscarSistema() {
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Sistema> cq = cb.createQuery(Sistema.class);
		
		Root<Sistema> sistema = cq.from(Sistema.class);
		
		cq.where(cb.equal(sistema.get(Sistema_.id), -1L));
		
		TypedQuery<Sistema> query = em.createQuery(cq);
		
		List<Sistema> sistemas = query.getResultList();

		Assert.assertFalse(sistemas.isEmpty());
	}
}

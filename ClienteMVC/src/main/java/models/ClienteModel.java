package models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Cliente;

public class ClienteModel {
	protected EntityManager entityManager;
	
	public ClienteModel() {
		entityManager = getEntityManager();
	}
	
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("clienteHibernate");
		if(entityManager == null) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	@SuppressWarnings("unchecked")
	public List<Cliente> select(){
		return entityManager.createQuery("FROM " + 
				Cliente.class.getName()).getResultList();
	}
	

}

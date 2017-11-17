package br.inatel.dm110.client.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.dm110.client.entities.Client;

@Stateless
public class ClientDAO {
	
	@PersistenceContext(unitName = "postgres")
	private EntityManager em;

	public List<Client> listAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}

	public void insert(Client clients) {
		em.persist(clients);
	}
}

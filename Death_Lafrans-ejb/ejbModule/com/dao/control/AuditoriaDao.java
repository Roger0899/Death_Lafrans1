package com.dao.control;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.entities.personas.Auditoria;

@Stateless
public class AuditoriaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void crear(Auditoria auditoria ) {
		em.persist(auditoria);
		em.refresh(auditoria);
	}

	public List<Auditoria> listar() {
		TypedQuery<Auditoria> consulta = em.createNamedQuery("Auditoria.listarTodos", Auditoria.class);
		return consulta.getResultList();
	}
	
}

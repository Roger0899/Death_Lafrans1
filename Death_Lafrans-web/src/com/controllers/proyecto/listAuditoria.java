package com.controllers.proyecto;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.dao.control.AuditoriaDao;
import com.entities.personas.Auditoria;

@Named ("auditoria")
@RequestScoped
public class listAuditoria implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@EJB
	private AuditoriaDao auditoriaDao;
	
	public List<Auditoria> getAuditoria() {
		return auditoriaDao.listar();
	}
}

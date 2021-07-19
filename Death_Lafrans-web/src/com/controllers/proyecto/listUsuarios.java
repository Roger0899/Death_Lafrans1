package com.controllers.proyecto;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.dao.control.UsuarioDao;
import com.entities.personas.Usuario;

@Named ("usuarios")
@RequestScoped
public class listUsuarios implements Serializable{
private static final long serialVersionUID = 1L;
	
	@EJB
	private UsuarioDao usuarioDao;
	
	public List<Usuario> getUsuarios() {
		return usuarioDao.listar();
	}
	public void getEliminar(int codigo) {
		usuarioDao.borrar(codigo);;
	}
}

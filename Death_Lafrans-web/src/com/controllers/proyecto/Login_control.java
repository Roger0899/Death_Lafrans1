package com.controllers.proyecto;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.dao.control.UsuarioDao;
import com.entities.personas.Usuario;

@Named ("loginn")
@ViewScoped
public class Login_control implements Serializable {

	private static final long serialVersionUID = 1L;
//	FacesContext jsf= FacesContext.getCurrentInstance();
	private Usuario user;
	
	@EJB
	private UsuarioDao usuarioDao;
	
	@PostConstruct
	public void init() {
		user=new Usuario();
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public String iniciarSesion() {
		Usuario us;
		String redireccion=null;
		try {
			us= usuarioDao.Iniciar_Sesion(user);
			if (us != null) {
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", us);
				redireccion="Enfer_1?faces-redirect=true";
			}else {
				FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Aviso","Credenciales Inorrectas"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL,"Aviso","Error"));
		}
		return redireccion;
	}

	public void verificacion() {
		try {
			Usuario us= (Usuario) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario");
			if (us==null) {
				FacesContext.getCurrentInstance().getExternalContext().redirect("reg_user.jsf");
			} else {

			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}


package com.controllers.proyecto;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import com.dao.control.UsuarioDao;
//import com.entities.personas.Usuario;

@Named("usuario")
@RequestScoped
public class R_Usuario {
	private String cedula;
	private String nombre;
	private String apellido;
	private String genero;
	private String direccion;
	private String telefono;
	private String correo;
	private String clave;
	private int perfil;
	
	@EJB
	private UsuarioDao usuariodao;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public int getPerfil() {
		return perfil;
	}
	public void setPerfil(int perfil) {
		this.perfil = perfil;
	}
//	public String r_user() {
//		Usuario N_User=new Usuario();
//		N_User.setNombre(nombre);
//		N_User.setApellido(apellido);
//		N_User.setGenero(genero);
//		N_User.setCorreo(correo);
//		N_User.setClave(clave);
//		N_User.setPerfil(2);
//		usuariodao.crear(N_User);
//		return "registrado";
//	}
//	public String r_admin() {
//		Usuario N_User=new Usuario();
//		N_User.setCedula(cedula);
//		N_User.setNombre(nombre);
//		N_User.setApellido(apellido);
//		N_User.setGenero(genero);
//		N_User.setDireccion(direccion);
//		N_User.setFono(telefono);
//		N_User.setCorreo(correo);
//		N_User.setClave(clave);
//		N_User.setPerfil(1);
//		usuariodao.crear(N_User);
//		return "registrado";
//	}
	
}

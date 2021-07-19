package com.entities.personas;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="perfil",catalog="Death_Lafrans",schema="public")
public class Perfil implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_perfil")
	private int identificacion;
	
	@Column(name="nombre_perfil")
	private String nombre_perfil;

	public int getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombre_perfil() {
		return nombre_perfil;
	}

	public void setNombre_perfil(String nombre_perfil) {
		this.nombre_perfil = nombre_perfil;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}

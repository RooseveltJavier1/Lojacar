package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="rol")
public class Rol  implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idrol;
	
	@Column(name="descripcion", length=50)
	private String descripcion;

	@OneToMany(mappedBy = "rolc" ,cascade = CascadeType.ALL, targetEntity = Cliente.class)
	private List<Rol> roles = new ArrayList<Rol>();
	
	@OneToMany(mappedBy = "role" ,cascade = CascadeType.ALL, targetEntity = Empleado.class)
	private List<Rol> rolese = new ArrayList<Rol>();
	
	
	public long getIdrol() {
		return idrol;
	}

	public void setIdrol(long idrol) {
		this.idrol = idrol;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Rol () {}

	public Rol(long idrol, String descripcion) {
		super();
		this.idrol = idrol;
		this.descripcion = descripcion;
	}
	
	

}

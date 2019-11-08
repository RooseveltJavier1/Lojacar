package com.rdjaramillo.core.DemoServerLojaCar.Entity;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idpersona;
	
	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="apellido", length=50)
	private String apellido;
	
	@Column(name="cedula", length=50)
	private String cedula;
	

	@Column(name="telefono", length=50)
	private String telefono;
	
	@Column(name="email", length=50)
	private String email;
	
	@Column(name="password", length=50)
	private String pass;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "persona", targetEntity = Cliente.class)
	private Cliente cliente;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "personae", targetEntity = Empleado.class)
	private Empleado empleado;
	
	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
}

package com.rdjaramillo.core.Entity;

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
@Table(name="cliente")
public class Cliente implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idcliente;
	
	
	@Column(name="nombrecliente", length=350)
	private String nombrecliente;
	
	@Column(name="apellidocliente", length=350)
	private String apellidocliente;
	
	@Column(name="cedulacliente", length=350)
	private String cedulacliente;
	

	@Column(name="telefonocliente", length=350)
	private String telefono;
	
	@Column(name="emailcliente", length=350)
	private String emailcliente;
	
	
	@Column(name="dirreccioncliente", length=350)
	private String dirreccioncliente;
	

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkcliente", targetEntity = PedidoCliente.class)
	private PedidoCliente pedidocliente;


	public long getIdcliente() {
		return idcliente;
	}


	public void setIdcliente(long idcliente) {
		this.idcliente = idcliente;
	}


	public String getNombrecliente() {
		return nombrecliente;
	}


	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}


	public String getApellidocliente() {
		return apellidocliente;
	}


	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}


	public String getCedulacliente() {
		return cedulacliente;
	}


	public void setCedulacliente(String cedulacliente) {
		this.cedulacliente = cedulacliente;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getEmailcliente() {
		return emailcliente;
	}


	public void setEmailcliente(String emailcliente) {
		this.emailcliente = emailcliente;
	}


	public String getDirreccioncliente() {
		return dirreccioncliente;
	}


	public void setDirreccioncliente(String dirreccioncliente) {
		this.dirreccioncliente = dirreccioncliente;
	}


	public PedidoCliente getPedidocliente() {
		return pedidocliente;
	}


	public void setPedidocliente(PedidoCliente pedidocliente) {
		this.pedidocliente = pedidocliente;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Cliente(long idcliente, String nombrecliente, String apellidocliente, String cedulacliente, String telefono,
			String emailcliente, String dirreccioncliente, PedidoCliente pedidocliente) {
		super();
		this.idcliente = idcliente;
		this.nombrecliente = nombrecliente;
		this.apellidocliente = apellidocliente;
		this.cedulacliente = cedulacliente;
		this.telefono = telefono;
		this.emailcliente = emailcliente;
		this.dirreccioncliente = dirreccioncliente;
		this.pedidocliente = pedidocliente;
	}


	public Cliente() {
		super();
	}


	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nombrecliente=" + nombrecliente + ", apellidocliente="
				+ apellidocliente + ", cedulacliente=" + cedulacliente + ", telefono=" + telefono + ", emailcliente="
				+ emailcliente + ", dirreccioncliente=" + dirreccioncliente + ", pedidocliente=" + pedidocliente + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellidocliente == null) ? 0 : apellidocliente.hashCode());
		result = prime * result + ((cedulacliente == null) ? 0 : cedulacliente.hashCode());
		result = prime * result + ((dirreccioncliente == null) ? 0 : dirreccioncliente.hashCode());
		result = prime * result + ((emailcliente == null) ? 0 : emailcliente.hashCode());
		result = prime * result + (int) (idcliente ^ (idcliente >>> 32));
		result = prime * result + ((nombrecliente == null) ? 0 : nombrecliente.hashCode());
		result = prime * result + ((pedidocliente == null) ? 0 : pedidocliente.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (apellidocliente == null) {
			if (other.apellidocliente != null)
				return false;
		} else if (!apellidocliente.equals(other.apellidocliente))
			return false;
		if (cedulacliente == null) {
			if (other.cedulacliente != null)
				return false;
		} else if (!cedulacliente.equals(other.cedulacliente))
			return false;
		if (dirreccioncliente == null) {
			if (other.dirreccioncliente != null)
				return false;
		} else if (!dirreccioncliente.equals(other.dirreccioncliente))
			return false;
		if (emailcliente == null) {
			if (other.emailcliente != null)
				return false;
		} else if (!emailcliente.equals(other.emailcliente))
			return false;
		if (idcliente != other.idcliente)
			return false;
		if (nombrecliente == null) {
			if (other.nombrecliente != null)
				return false;
		} else if (!nombrecliente.equals(other.nombrecliente))
			return false;
		if (pedidocliente == null) {
			if (other.pedidocliente != null)
				return false;
		} else if (!pedidocliente.equals(other.pedidocliente))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		return true;
	}
	
	
	
	
}

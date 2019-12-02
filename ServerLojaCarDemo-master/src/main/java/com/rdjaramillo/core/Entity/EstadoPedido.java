package com.rdjaramillo.core.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="estadopedido")

public class EstadoPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idestadopedido;
	
	@Column(name="descripcion", length=350)
	private String descripcion;

	
	@OneToOne
	private PedidoCliente pedidocliente;


	public long getIdestadopedido() {
		return idestadopedido;
	}


	public void setIdestadopedido(long idestadopedido) {
		this.idestadopedido = idestadopedido;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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


	public EstadoPedido(long idestadopedido, String descripcion, PedidoCliente pedidocliente) {
		super();
		this.idestadopedido = idestadopedido;
		this.descripcion = descripcion;
		this.pedidocliente = pedidocliente;
	}


	public EstadoPedido() {
		super();
	}


	@Override
	public String toString() {
		return "EstadoPedido [idestadopedido=" + idestadopedido + ", descripcion=" + descripcion + ", pedidocliente="
				+ pedidocliente + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + (int) (idestadopedido ^ (idestadopedido >>> 32));
		result = prime * result + ((pedidocliente == null) ? 0 : pedidocliente.hashCode());
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
		EstadoPedido other = (EstadoPedido) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (idestadopedido != other.idestadopedido)
			return false;
		if (pedidocliente == null) {
			if (other.pedidocliente != null)
				return false;
		} else if (!pedidocliente.equals(other.pedidocliente))
			return false;
		return true;
	}
	
	
	
}

package com.rdjaramillo.core.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="pedidocliente")
public class PedidoCliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idpedidocliente;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pedidocliente", targetEntity = EstadoPedido.class)
	private EstadoPedido estadopedido;
		
	@OneToOne
	private Producto fkproducto;
	
	@OneToOne
	private Cliente fkcliente;
	
	@OneToOne
	private Usuario fkusuario;

	public long getIdpedidocliente() {
		return idpedidocliente;
	}

	public void setIdpedidocliente(long idpedidocliente) {
		this.idpedidocliente = idpedidocliente;
	}

	public EstadoPedido getEstadopedido() {
		return estadopedido;
	}

	public void setEstadopedido(EstadoPedido estadopedido) {
		this.estadopedido = estadopedido;
	}

	public Producto getFkproducto() {
		return fkproducto;
	}

	public void setFkproducto(Producto fkproducto) {
		this.fkproducto = fkproducto;
	}

	public Cliente getFkcliente() {
		return fkcliente;
	}

	public void setFkcliente(Cliente fkcliente) {
		this.fkcliente = fkcliente;
	}

	public Usuario getFkusuario() {
		return fkusuario;
	}

	public void setFkusuario(Usuario fkusuario) {
		this.fkusuario = fkusuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PedidoCliente(long idpedidocliente, EstadoPedido estadopedido, Producto fkproducto, Cliente fkcliente,
			Usuario fkusuario) {
		super();
		this.idpedidocliente = idpedidocliente;
		this.estadopedido = estadopedido;
		this.fkproducto = fkproducto;
		this.fkcliente = fkcliente;
		this.fkusuario = fkusuario;
	}

	public PedidoCliente() {
		super();
	}

	@Override
	public String toString() {
		return "PedidoCliente [idpedidocliente=" + idpedidocliente + ", estadopedido=" + estadopedido + ", fkproducto="
				+ fkproducto + ", fkcliente=" + fkcliente + ", fkusuario=" + fkusuario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadopedido == null) ? 0 : estadopedido.hashCode());
		result = prime * result + ((fkcliente == null) ? 0 : fkcliente.hashCode());
		result = prime * result + ((fkproducto == null) ? 0 : fkproducto.hashCode());
		result = prime * result + ((fkusuario == null) ? 0 : fkusuario.hashCode());
		result = prime * result + (int) (idpedidocliente ^ (idpedidocliente >>> 32));
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
		PedidoCliente other = (PedidoCliente) obj;
		if (estadopedido == null) {
			if (other.estadopedido != null)
				return false;
		} else if (!estadopedido.equals(other.estadopedido))
			return false;
		if (fkcliente == null) {
			if (other.fkcliente != null)
				return false;
		} else if (!fkcliente.equals(other.fkcliente))
			return false;
		if (fkproducto == null) {
			if (other.fkproducto != null)
				return false;
		} else if (!fkproducto.equals(other.fkproducto))
			return false;
		if (fkusuario == null) {
			if (other.fkusuario != null)
				return false;
		} else if (!fkusuario.equals(other.fkusuario))
			return false;
		if (idpedidocliente != other.idpedidocliente)
			return false;
		return true;
	}
	
	
	
}

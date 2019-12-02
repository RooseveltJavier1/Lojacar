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
@Table(name="producto")
public class Producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idproducto;
	
	
	@OneToOne
	private TipoProducto fktpproducto;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkcliente", targetEntity = PedidoCliente.class)
	private PedidoCliente  pedidocliente;
	
	@OneToOne
	private Consecionario fkconsecionario;

	public long getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(long idproducto) {
		this.idproducto = idproducto;
	}

	public TipoProducto getFktpproducto() {
		return fktpproducto;
	}

	public void setFktpproducto(TipoProducto fktpproducto) {
		this.fktpproducto = fktpproducto;
	}

	public PedidoCliente getPedidocliente() {
		return pedidocliente;
	}

	public void setPedidocliente(PedidoCliente pedidocliente) {
		this.pedidocliente = pedidocliente;
	}

	public Consecionario getFkconsecionario() {
		return fkconsecionario;
	}

	public void setFkconsecionario(Consecionario fkconsecionario) {
		this.fkconsecionario = fkconsecionario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Producto(long idproducto, TipoProducto fktpproducto, PedidoCliente pedidocliente,
			Consecionario fkconsecionario) {
		super();
		this.idproducto = idproducto;
		this.fktpproducto = fktpproducto;
		this.pedidocliente = pedidocliente;
		this.fkconsecionario = fkconsecionario;
	}

	public Producto() {
		super();
	}

	@Override
	public String toString() {
		return "Producto [idproducto=" + idproducto + ", fktpproducto=" + fktpproducto + ", pedidocliente="
				+ pedidocliente + ", fkconsecionario=" + fkconsecionario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fkconsecionario == null) ? 0 : fkconsecionario.hashCode());
		result = prime * result + ((fktpproducto == null) ? 0 : fktpproducto.hashCode());
		result = prime * result + (int) (idproducto ^ (idproducto >>> 32));
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
		Producto other = (Producto) obj;
		if (fkconsecionario == null) {
			if (other.fkconsecionario != null)
				return false;
		} else if (!fkconsecionario.equals(other.fkconsecionario))
			return false;
		if (fktpproducto == null) {
			if (other.fktpproducto != null)
				return false;
		} else if (!fktpproducto.equals(other.fktpproducto))
			return false;
		if (idproducto != other.idproducto)
			return false;
		if (pedidocliente == null) {
			if (other.pedidocliente != null)
				return false;
		} else if (!pedidocliente.equals(other.pedidocliente))
			return false;
		return true;
	}
	
	
	

}

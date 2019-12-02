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
@Table(name="tipoproducto")
public class TipoProducto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idtipoproducto;
	
	@Column(name="tipoproducto", length=350)
	private String tipoproducto;
	
		
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tpproductorepuestos", targetEntity = Repuestos.class)
	private Repuestos repuestos;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tpproductovehiculo", targetEntity = Vehiculo.class)
	private Vehiculo vehiculo;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fktpproducto", targetEntity = Producto.class)
	private Producto producto;

	public long getIdtipoproducto() {
		return idtipoproducto;
	}

	public void setIdtipoproducto(long idtipoproducto) {
		this.idtipoproducto = idtipoproducto;
	}

	public String getTipoproducto() {
		return tipoproducto;
	}

	public void setTipoproducto(String tipoproducto) {
		this.tipoproducto = tipoproducto;
	}

	public Repuestos getRepuestos() {
		return repuestos;
	}

	public void setRepuestos(Repuestos repuestos) {
		this.repuestos = repuestos;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public TipoProducto(long idtipoproducto, String tipoproducto, Repuestos repuestos, Vehiculo vehiculo,
			Producto producto) {
		super();
		this.idtipoproducto = idtipoproducto;
		this.tipoproducto = tipoproducto;
		this.repuestos = repuestos;
		this.vehiculo = vehiculo;
		this.producto = producto;
	}

	public TipoProducto() {
		super();
	}

	@Override
	public String toString() {
		return "TipoProducto [idtipoproducto=" + idtipoproducto + ", tipoproducto=" + tipoproducto + ", repuestos="
				+ repuestos + ", vehiculo=" + vehiculo + ", producto=" + producto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idtipoproducto ^ (idtipoproducto >>> 32));
		result = prime * result + ((producto == null) ? 0 : producto.hashCode());
		result = prime * result + ((repuestos == null) ? 0 : repuestos.hashCode());
		result = prime * result + ((tipoproducto == null) ? 0 : tipoproducto.hashCode());
		result = prime * result + ((vehiculo == null) ? 0 : vehiculo.hashCode());
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
		TipoProducto other = (TipoProducto) obj;
		if (idtipoproducto != other.idtipoproducto)
			return false;
		if (producto == null) {
			if (other.producto != null)
				return false;
		} else if (!producto.equals(other.producto))
			return false;
		if (repuestos == null) {
			if (other.repuestos != null)
				return false;
		} else if (!repuestos.equals(other.repuestos))
			return false;
		if (tipoproducto == null) {
			if (other.tipoproducto != null)
				return false;
		} else if (!tipoproducto.equals(other.tipoproducto))
			return false;
		if (vehiculo == null) {
			if (other.vehiculo != null)
				return false;
		} else if (!vehiculo.equals(other.vehiculo))
			return false;
		return true;
	}
	
	
	
	

}

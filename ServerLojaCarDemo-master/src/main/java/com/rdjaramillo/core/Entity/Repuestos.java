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
@Table(name="repuestos")
public class Repuestos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idrepuesto;
	
	@Column(name="repuesto", length=350)
	private String repuesto;
	
	@OneToOne
	private TipoProducto tpproductorepuestos;

	public long getIdrepuesto() {
		return idrepuesto;
	}

	public void setIdrepuesto(long idrepuesto) {
		this.idrepuesto = idrepuesto;
	}

	public String getRepuesto() {
		return repuesto;
	}

	public void setRepuesto(String repuesto) {
		this.repuesto = repuesto;
	}

	public TipoProducto getTpproductorepuestos() {
		return tpproductorepuestos;
	}

	public void setTpproductorepuestos(TipoProducto tpproductorepuestos) {
		this.tpproductorepuestos = tpproductorepuestos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Repuestos(long idrepuesto, String repuesto, TipoProducto tpproductorepuestos) {
		super();
		this.idrepuesto = idrepuesto;
		this.repuesto = repuesto;
		this.tpproductorepuestos = tpproductorepuestos;
	}

	public Repuestos() {
		super();
	}

	@Override
	public String toString() {
		return "Repuestos [idrepuesto=" + idrepuesto + ", repuesto=" + repuesto + ", tpproductorepuestos="
				+ tpproductorepuestos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idrepuesto ^ (idrepuesto >>> 32));
		result = prime * result + ((repuesto == null) ? 0 : repuesto.hashCode());
		result = prime * result + ((tpproductorepuestos == null) ? 0 : tpproductorepuestos.hashCode());
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
		Repuestos other = (Repuestos) obj;
		if (idrepuesto != other.idrepuesto)
			return false;
		if (repuesto == null) {
			if (other.repuesto != null)
				return false;
		} else if (!repuesto.equals(other.repuesto))
			return false;
		if (tpproductorepuestos == null) {
			if (other.tpproductorepuestos != null)
				return false;
		} else if (!tpproductorepuestos.equals(other.tpproductorepuestos))
			return false;
		return true;
	}

	
	
	
	
	
	
}

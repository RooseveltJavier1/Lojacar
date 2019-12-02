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
@Table(name="proveedor")
public class Proveedor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idproveedor;
	
	@Column(name="proveedor", length=350)
	private String proveedor;
	
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkproveedor", targetEntity = Consecionario.class)
	private Consecionario consecionario;



	public long getIdproveedor() {
		return idproveedor;
	}



	public void setIdproveedor(long idproveedor) {
		this.idproveedor = idproveedor;
	}



	public String getProveedor() {
		return proveedor;
	}



	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}



	public Consecionario getConsecionario() {
		return consecionario;
	}



	public void setConsecionario(Consecionario consecionario) {
		this.consecionario = consecionario;
	}



	public static long getSerialversionuid() {
		return serialVersionUID;
	}



	public Proveedor(long idproveedor, String proveedor, Consecionario consecionario) {
		super();
		this.idproveedor = idproveedor;
		this.proveedor = proveedor;
		this.consecionario = consecionario;
	}



	public Proveedor() {
		super();
	}



	@Override
	public String toString() {
		return "Proveedor [idproveedor=" + idproveedor + ", proveedor=" + proveedor + ", consecionario=" + consecionario
				+ "]";
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((consecionario == null) ? 0 : consecionario.hashCode());
		result = prime * result + (int) (idproveedor ^ (idproveedor >>> 32));
		result = prime * result + ((proveedor == null) ? 0 : proveedor.hashCode());
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
		Proveedor other = (Proveedor) obj;
		if (consecionario == null) {
			if (other.consecionario != null)
				return false;
		} else if (!consecionario.equals(other.consecionario))
			return false;
		if (idproveedor != other.idproveedor)
			return false;
		if (proveedor == null) {
			if (other.proveedor != null)
				return false;
		} else if (!proveedor.equals(other.proveedor))
			return false;
		return true;
	}


}

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
@Table(name="consecionario")
public class Consecionario  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idconsecionario;
	
	@Column(name="consecionario", length=350)
	private String nombreconsecionario;
	
	@Column(name="direconserionario", length=350)
	private String direconserionario;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkconsecionario", targetEntity = Producto.class)
	private Producto productoconse;
	
	
	@OneToOne
	private Proveedor fkproveedor;


	public long getIdconsecionario() {
		return idconsecionario;
	}


	public void setIdconsecionario(long idconsecionario) {
		this.idconsecionario = idconsecionario;
	}


	public String getNombreconsecionario() {
		return nombreconsecionario;
	}


	public void setNombreconsecionario(String nombreconsecionario) {
		this.nombreconsecionario = nombreconsecionario;
	}


	public String getDireconserionario() {
		return direconserionario;
	}


	public void setDireconserionario(String direconserionario) {
		this.direconserionario = direconserionario;
	}


	public Producto getProductoconse() {
		return productoconse;
	}


	public void setProductoconse(Producto productoconse) {
		this.productoconse = productoconse;
	}


	public Proveedor getFkproveedor() {
		return fkproveedor;
	}


	public void setFkproveedor(Proveedor fkproveedor) {
		this.fkproveedor = fkproveedor;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public Consecionario(long idconsecionario, String nombreconsecionario, String direconserionario,
			Producto productoconse, Proveedor fkproveedor) {
		super();
		this.idconsecionario = idconsecionario;
		this.nombreconsecionario = nombreconsecionario;
		this.direconserionario = direconserionario;
		this.productoconse = productoconse;
		this.fkproveedor = fkproveedor;
	}


	public Consecionario() {
		super();
	}


	@Override
	public String toString() {
		return "Consecionario [idconsecionario=" + idconsecionario + ", nombreconsecionario=" + nombreconsecionario
				+ ", direconserionario=" + direconserionario + ", productoconse=" + productoconse + ", fkproveedor="
				+ fkproveedor + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direconserionario == null) ? 0 : direconserionario.hashCode());
		result = prime * result + ((fkproveedor == null) ? 0 : fkproveedor.hashCode());
		result = prime * result + (int) (idconsecionario ^ (idconsecionario >>> 32));
		result = prime * result + ((nombreconsecionario == null) ? 0 : nombreconsecionario.hashCode());
		result = prime * result + ((productoconse == null) ? 0 : productoconse.hashCode());
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
		Consecionario other = (Consecionario) obj;
		if (direconserionario == null) {
			if (other.direconserionario != null)
				return false;
		} else if (!direconserionario.equals(other.direconserionario))
			return false;
		if (fkproveedor == null) {
			if (other.fkproveedor != null)
				return false;
		} else if (!fkproveedor.equals(other.fkproveedor))
			return false;
		if (idconsecionario != other.idconsecionario)
			return false;
		if (nombreconsecionario == null) {
			if (other.nombreconsecionario != null)
				return false;
		} else if (!nombreconsecionario.equals(other.nombreconsecionario))
			return false;
		if (productoconse == null) {
			if (other.productoconse != null)
				return false;
		} else if (!productoconse.equals(other.productoconse))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	


}

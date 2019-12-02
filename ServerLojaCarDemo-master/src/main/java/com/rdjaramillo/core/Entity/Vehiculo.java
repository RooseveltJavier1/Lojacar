package com.rdjaramillo.core.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idvehiculo;
	
	@Column(name="marca", length=350)
	private String marca;
	
	@Column(name="modelo", length=350)
	private String modelo;
	
	@Column(name="anio", length=350)
	private String anio;
	
	@Column(name="cilindraje", length=350)
	private String cilindraje;
	
	@OneToOne
	private TipoProducto tpproductovehiculo;

	public long getIdvehiculo() {
		return idvehiculo;
	}

	public void setIdvehiculo(long idvehiculo) {
		this.idvehiculo = idvehiculo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public TipoProducto getTpproductovehiculo() {
		return tpproductovehiculo;
	}

	public void setTpproductovehiculo(TipoProducto tpproductovehiculo) {
		this.tpproductovehiculo = tpproductovehiculo;
	}

	public Vehiculo(long idvehiculo, String marca, String modelo, String anio, String cilindraje,
			TipoProducto tpproductovehiculo) {
		this.idvehiculo = idvehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cilindraje = cilindraje;
		this.tpproductovehiculo = tpproductovehiculo;
	}

	public Vehiculo() {
	}

	@Override
	public String toString() {
		return "Vehiculo [idvehiculo=" + idvehiculo + ", marca=" + marca + ", modelo=" + modelo + ", anio=" + anio
				+ ", cilindraje=" + cilindraje + ", tpproductovehiculo=" + tpproductovehiculo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anio == null) ? 0 : anio.hashCode());
		result = prime * result + ((cilindraje == null) ? 0 : cilindraje.hashCode());
		result = prime * result + (int) (idvehiculo ^ (idvehiculo >>> 32));
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((tpproductovehiculo == null) ? 0 : tpproductovehiculo.hashCode());
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
		Vehiculo other = (Vehiculo) obj;
		if (anio == null) {
			if (other.anio != null)
				return false;
		} else if (!anio.equals(other.anio))
			return false;
		if (cilindraje == null) {
			if (other.cilindraje != null)
				return false;
		} else if (!cilindraje.equals(other.cilindraje))
			return false;
		if (idvehiculo != other.idvehiculo)
			return false;
		if (marca == null) {
			if (other.marca != null)
				return false;
		} else if (!marca.equals(other.marca))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (tpproductovehiculo == null) {
			if (other.tpproductovehiculo != null)
				return false;
		} else if (!tpproductovehiculo.equals(other.tpproductovehiculo))
			return false;
		return true;
	}
	
}

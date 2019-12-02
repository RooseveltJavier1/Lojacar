package com.rdjaramillo.core.Model;



import com.rdjaramillo.core.Entity.TipoProducto;
import com.rdjaramillo.core.Entity.Vehiculo;

public class MVehiculo {
	

	public MVehiculo() {}
	
	public MVehiculo(Vehiculo  vehiculo) {
		this.idvehiculo = vehiculo.getIdvehiculo();
		this.marca = vehiculo.getMarca();
		this.modelo = vehiculo.getModelo();
		this.anio = vehiculo.getAnio();
		this.cilindraje = vehiculo.getCilindraje();
		this.tpproductovehiculo = vehiculo.getTpproductovehiculo();
	}
	
	public MVehiculo(long idvehiculo, String marca, String modelo, String anio, String cilindraje,
			TipoProducto tpproductovehiculo) {		
		this.idvehiculo = idvehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.cilindraje = cilindraje;
		this.tpproductovehiculo = tpproductovehiculo;
	}

	private long idvehiculo;
	
	private String marca;
	
	private String modelo;
	
	private String anio;
	
	private String cilindraje;
	
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
	
}

package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehiculo")
public class Vehiculo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idvehiculo;
	
	@Column(name="marca", length=50)
	private String marca;
	
	@Column(name="modelo", length=50)
	private String modelo;
	
	@Column(name="anio", length=50)
	private String anio;
	
	@Column(name="cc", length=50)
	private String cc;
	
	
	@ManyToOne
	@JoinColumn
	private TipoProducto tipoproductov;

}

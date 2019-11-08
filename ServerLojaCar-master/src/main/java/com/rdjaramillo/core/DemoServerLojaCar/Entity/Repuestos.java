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
@Table(name="repuestos")
public class Repuestos  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idrepuesto;
	
	@Column(name="nombrerepuesto", length=50)
	private String nombrerepuesto;
	
	@ManyToOne
	@JoinColumn
	private TipoProducto tipoproductor;

}

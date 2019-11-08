package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="proveedor")
public class Proveedor implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idproveedor;
	
	@Column(name="nombreproveedor", length=50)
	private String nombreproveedor;

	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "proveedor", targetEntity = Consecionario.class)
	private Consecionario consecionario;
	

}

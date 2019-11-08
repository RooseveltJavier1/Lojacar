package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="consecionario")
public class Consecionario implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idconsecionario;
	
	@Column(name="nombreconsecionario", length=50)
	private String nombreconsecionario;
	
	@Column(name="direccionconserionario", length=50)
	private String direccionconserionario;

	@OneToOne
	private Proveedor proveedor;
	
	@OneToMany(mappedBy = "consecionarioproducto" ,cascade = CascadeType.ALL, targetEntity = Producto.class)
	private List<Consecionario> consecionariosproduc = new ArrayList<Consecionario>();
	

}

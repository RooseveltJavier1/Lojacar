package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tipoproducto")
public class TipoProducto implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idtipoproducto;
	
	@Column(name="nombretipoproducto", length=50)
	private String nombretipoproducto;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tipoproductotp", targetEntity = Producto.class)
	private Producto producto;
	
	
	@OneToMany(mappedBy = "tipoproductor" ,cascade = CascadeType.ALL, targetEntity = Repuestos.class)
	private List<TipoProducto> tipoproductosr = new ArrayList<TipoProducto>();
	
	
	@OneToMany(mappedBy = "tipoproductov" ,cascade = CascadeType.ALL, targetEntity = Vehiculo.class)
	private List<TipoProducto> tipoproductosv = new ArrayList<TipoProducto>();

}

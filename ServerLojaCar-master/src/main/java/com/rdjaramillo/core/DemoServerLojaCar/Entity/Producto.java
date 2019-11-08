package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idproducto;
	
	
	@ManyToOne
	@JoinColumn
	private Consecionario consecionarioproducto;
	
	
	@ManyToOne
	@JoinColumn
	private PedidoCliente pedidocliente;
	
	@OneToOne
	private TipoProducto tipoproductotp;


}

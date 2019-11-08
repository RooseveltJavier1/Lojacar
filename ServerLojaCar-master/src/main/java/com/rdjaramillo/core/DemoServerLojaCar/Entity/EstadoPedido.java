package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="estadopedido")
public class EstadoPedido implements Serializable {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idestadopedido;
	
	@Column(name="descripcion", length=50)
	private String descripcion;
	
	@OneToOne
	private PedidoCliente pedidoclienteep;
	
	

}

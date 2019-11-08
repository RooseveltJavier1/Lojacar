package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="pedidocliente")
public class PedidoCliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idpedidocliente;
		
	@ManyToOne
	@JoinColumn
	private Cliente clientep;
	
	@ManyToOne
	@JoinColumn
	private Empleado empleadop;
	
	@OneToMany(mappedBy = "pedidocliente" ,cascade = CascadeType.ALL, targetEntity = Producto.class)
	private List<PedidoCliente> pedidoclientes = new ArrayList<PedidoCliente>();

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "pedidoclienteep", targetEntity = EstadoPedido.class)
	private EstadoPedido estadopedido;

}

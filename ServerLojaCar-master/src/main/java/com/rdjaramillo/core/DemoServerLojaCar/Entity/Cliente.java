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
@Table(name="cliente")
public class Cliente implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idcliente;
	
	@OneToOne
	private Persona persona;
	
	@ManyToOne
	@JoinColumn
	private Rol rolc;
	
	@OneToMany(mappedBy = "clientep" ,cascade = CascadeType.ALL, targetEntity = PedidoCliente.class)
	private List<Cliente> clientesp = new ArrayList<Cliente>();

}

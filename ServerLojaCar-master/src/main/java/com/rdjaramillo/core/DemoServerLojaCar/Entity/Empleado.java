package com.rdjaramillo.core.DemoServerLojaCar.Entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idempleado;
	
	@OneToOne
	private Persona personae;

	@ManyToOne
	@JoinColumn
	private Rol role;
	
	@OneToMany(mappedBy = "empleadop" ,cascade = CascadeType.ALL, targetEntity = PedidoCliente.class)
	private List<Empleado> empleadosp = new ArrayList<Empleado>();
	
}

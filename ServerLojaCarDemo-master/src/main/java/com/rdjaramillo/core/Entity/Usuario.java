package com.rdjaramillo.core.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="usuario")
public class Usuario {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long idpersona;
	
	@Column(name="nombre", length=350)
	private String nombre;
	
	@Column(name="apellido", length=350)
	private String apellido;
	
	@Column(name="cedula", length=350)
	private String cedula;
	

	@Column(name="telefono", length=350)
	private String telefono;
	
	@Column(name="username", length=350)
	private String username;
	
	@Column(name="password", length=350)
	private String password;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "authorities_users", joinColumns = @JoinColumn(name = "usuario_id"), inverseJoinColumns = @JoinColumn(name = "authority_id"))
	private Set<Authority> authority;

	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "fkusuario", targetEntity = PedidoCliente.class)
	private PedidoCliente pedidocliente;
	
	
	public long getIdpersona() {
		return idpersona;
	}

	public void setIdpersona(long idpersona) {
		this.idpersona = idpersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<Authority> getAuthority() {
		return authority;
	}

	public void setAuthority(Set<Authority> authority) {
		this.authority = authority;
	}

	public PedidoCliente getPedidocliente() {
		return pedidocliente;
	}

	public void setPedidocliente(PedidoCliente pedidocliente) {
		this.pedidocliente = pedidocliente;
	}

	public Usuario(long idpersona, String nombre, String apellido, String cedula, String telefono, String username,
			String password, boolean enabled, Set<Authority> authority, PedidoCliente pedidocliente) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.username = username;
		this.password = password;
		this.enabled = enabled;
		this.authority = authority;
		this.pedidocliente = pedidocliente;
	}

	public Usuario() {
		super();
	}

	@Override
	public String toString() {
		return "Usuario [idpersona=" + idpersona + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula="
				+ cedula + ", telefono=" + telefono + ", username=" + username + ", password=" + password + ", enabled="
				+ enabled + ", authority=" + authority + ", pedidocliente=" + pedidocliente + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((authority == null) ? 0 : authority.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + (enabled ? 1231 : 1237);
		result = prime * result + (int) (idpersona ^ (idpersona >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((pedidocliente == null) ? 0 : pedidocliente.hashCode());
		result = prime * result + ((telefono == null) ? 0 : telefono.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (authority == null) {
			if (other.authority != null)
				return false;
		} else if (!authority.equals(other.authority))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (enabled != other.enabled)
			return false;
		if (idpersona != other.idpersona)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (pedidocliente == null) {
			if (other.pedidocliente != null)
				return false;
		} else if (!pedidocliente.equals(other.pedidocliente))
			return false;
		if (telefono == null) {
			if (other.telefono != null)
				return false;
		} else if (!telefono.equals(other.telefono))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
}

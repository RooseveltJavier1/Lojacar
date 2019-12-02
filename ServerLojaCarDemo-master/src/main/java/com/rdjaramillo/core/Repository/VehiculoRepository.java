package com.rdjaramillo.core.Repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rdjaramillo.core.Entity.Vehiculo;
@Repository("repositorio")
public interface VehiculoRepository  extends JpaRepository<Vehiculo, Serializable>{

	public abstract Vehiculo findByMarca(String marca);
	
	public abstract List<Vehiculo> findByModelo(String modelo);
	
	public abstract Vehiculo findByMarcaAndModelo(String marca, String modelo);
	
	/*BORRAR*/
	
	public abstract Vehiculo findByModeloAndIdvehiculo(String modelo,long idvehiculo);
}

package com.rdjaramillo.core.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rdjaramillo.core.Convertidor.Convertidor;
import com.rdjaramillo.core.Entity.Vehiculo;
import com.rdjaramillo.core.Model.MVehiculo;
import com.rdjaramillo.core.Repository.VehiculoRepository;

@Service("servicio")
public class VehiculoService {
	@Autowired
	@Qualifier("repositorio")
	private VehiculoRepository repositorio;
	
	@Autowired
	@Qualifier("convertidor")
	private Convertidor convertidor;
	
	public boolean crear (Vehiculo vehiculo) {
		try {
			repositorio.save(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean actualziar (Vehiculo vehiculo) {
		try {
			repositorio.save(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public boolean borrar (String modelo,long idvehiculo) {
		try {
			Vehiculo vehiculo = repositorio.findByModeloAndIdvehiculo(modelo, idvehiculo);
			repositorio.delete(vehiculo);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public List<MVehiculo>obtener(){
		
		return convertidor.convertirLista(repositorio.findAll());
	}
	
	
	/*public abstract Vehiculo findByMarca(String marca);*/
	
	public MVehiculo obtenerPorMarca(String marca){
		
		return new MVehiculo(repositorio.findByMarca(marca));
	}
	
}

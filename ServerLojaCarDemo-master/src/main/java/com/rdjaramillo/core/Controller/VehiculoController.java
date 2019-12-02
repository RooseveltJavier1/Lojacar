package com.rdjaramillo.core.Controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rdjaramillo.core.Entity.Vehiculo;
import com.rdjaramillo.core.Model.MVehiculo;
import com.rdjaramillo.core.Service.VehiculoService;

@RestController
@RequestMapping("/v1")
public class VehiculoController {
		
	@Autowired
	@Qualifier("servicio")
	VehiculoService service;
	
	@PutMapping("/apivehiculo")
	public boolean agregarvehiculo(@RequestBody @Valid Vehiculo vehiculo) {
		return service.crear(vehiculo);

	}
	@PostMapping("/apivehiculo")
	public boolean actualizarNota(@RequestBody @Valid Vehiculo vehiculo) {
	return service.actualziar(vehiculo);
	}
	
	@DeleteMapping("/apivehiculo/{modelo}/{idvehiculo}")
	public boolean borrarNota(@PathVariable("modelo") String modelo,
							@PathVariable("idvehiculo") long idvehiculo) {
	return service.borrar(modelo, idvehiculo);
	}
	
	@GetMapping("/apivehiculos")
	public List<MVehiculo> obtenerVehiculos(){
		return service.obtener();
	}
}

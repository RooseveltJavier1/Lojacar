package com.rdjaramillo.core.Convertidor;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.rdjaramillo.core.Entity.Vehiculo;
import com.rdjaramillo.core.Model.*;

@Component("convertidor")
public class Convertidor {

	public List<MVehiculo> convertirLista(List<Vehiculo> vehiculos){
		List<MVehiculo> mvehiculos = new ArrayList<>();
		for (Vehiculo vehiculo :vehiculos ){
			mvehiculos.add(new MVehiculo(vehiculo));
		}
		return mvehiculos;
	
	}
}
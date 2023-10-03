package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais> quepais = new ArrayList <Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
		Pais.quepais.add(this);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	} 
	public static Pais paisMasVendedor() {
		Pais pmasVentas=null;
		int unidadesvent=0;
		for(Pais uni: quepais) {
			int cantidad=0;
			for (Pais paisV: Vehiculo.getPaises()) {
				if( uni == paisV) {
					cantidad++;
				}
		}
		if(cantidad > unidadesvent) {
			unidadesvent= cantidad;
			pmasVentas=uni;
		}
			
		}
		return pmasVentas;
	}
	}

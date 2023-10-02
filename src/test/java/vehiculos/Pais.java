package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Pais {
	private String nombre;
	private static List<Pais>cualfabri = new ArrayList <Pais>();
	
	public Pais(String nombre) {
		this.nombre = nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	} 
	
}

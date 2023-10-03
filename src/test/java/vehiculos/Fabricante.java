package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static List<Fabricante> cualfabri = new ArrayList <Fabricante>();
	
	
	public Fabricante(String nombre,Pais pais) {
		this.nombre=nombre;
		this.pais = pais;
		Fabricante.cualfabri.add(this);
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Pais getPais() {
		return this.pais;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante mayorvendedor=null;
		int mayorcantventas=0;
		for(Fabricante fab: cualfabri) {
			int cant=0;
			for (Fabricante fabV: Vehiculo.getVentafabri()) {
				if(fab == fabV) {
					cant++;
				}
		}
		if(cant > mayorcantventas) {
			mayorcantventas= cant;
			mayorvendedor=fab;
		}
			
		}
		return mayorvendedor;
	}
}

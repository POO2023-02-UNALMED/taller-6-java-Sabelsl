package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Automovil extends Vehiculo{
	private static List<Automovil> listado = new ArrayList<Automovil>();
	private int puestos;

	public Automovil(String pla, String nom,long precio,int peso, Fabricante fabricante,int puestos) {
		super(pla,4,100,nom,precio,peso,"FWD",fabricante);
		this.puestos = puestos;
		Automovil.listado.add(this);	
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	public int getPuestos() {
		return this.puestos;
	}
	public static int cantidadAutomoviles() {
		return Automovil.listado.size();
	}

}

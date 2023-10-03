package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehiculo{
	private static List<Camion> listado = new ArrayList<Camion>();
	private int ejes;
	
	public Camion(String pla, String nom,int precio,int peso, Fabricante fabricante,int ejes) {
		super(pla,2,80,nom,precio,peso,"4X2",fabricante);
		this.ejes = ejes;
		Camion.listado.add(this);
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	public int getEjes() {
		return this.ejes;
	}
	public static int cantidadCamiones() {
		return Camion.listado.size();
	}
}

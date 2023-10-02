package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Camioneta extends Vehiculo{
	private static List<Camioneta> listado = new ArrayList<Camioneta>();
	private boolean volco;
	
	
	public Camioneta(String pla, int puertas, String nom,long precio,int peso, Fabricante fabricante,boolean volco) {
		super(pla,puertas,90,nom,precio,peso,"4X4",fabricante);
		this.volco = volco;
		Camioneta.listado.add(this);
		
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	public boolean isVolco() {
		return this.volco;
	}
	public static int cantidadCamionetas() {
		return Camioneta.listado.size();
	}
}

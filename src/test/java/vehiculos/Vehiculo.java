package vehiculos;

import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
	private int velocidadMaxima;
	private String placa;
	private int puertas;
	private String nombre;
	private long precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos=0;
	private static List<Fabricante> ventafabri = new ArrayList <Fabricante>();
	private static List<Pais> paises = new ArrayList <Pais>();
	
	public Vehiculo(String pla, int puertas, int velocidadMaxima, String nom,long precio,int peso, String traccion, Fabricante fabricante){
		this.nombre = nom;
		this.placa= pla;
		this.peso = peso;
		this.precio = precio;
		this.traccion= traccion;
		this.fabricante = fabricante;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		Vehiculo.CantidadVehiculos++;
		Vehiculo.ventafabri.add(fabricante);
		Vehiculo.paises.add(fabricante.getPais());
	}
	public static List<Fabricante> getVentafabri(){
		return Vehiculo.ventafabri;
	}
	public static List<Pais> getPaises(){
		return Vehiculo.paises;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getPlaca() {
		return this.placa;
	}
	public void setPrecio(long Precio) {
		this.precio = Precio;
	}
	public long getPrecio() {
		return this.precio;
	}
	public  void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getPuertas() {
		return this.puertas;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getPeso() {
		return this.peso;	
	}
	public void setVelocidadMaxima(int velmaxima) {
		this.velocidadMaxima = velmaxima;
	}
	public int getVelocidadMaxima() {
		return this.velocidadMaxima;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getTraccion() {
		return this.traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public Fabricante getFabricante() {
		return this.fabricante;
	}
	public static void setCantidadVehiculos(int vehiculos) {
		Vehiculo.CantidadVehiculos = vehiculos;
	}
	public static int getCantidadVehiculos() {
		return Vehiculo.CantidadVehiculos;
	}
	public static String vehiculosPorTipo() {
		return "Automoviles: " +Automovil.cantidadAutomoviles()+ "\nCamionetas: "+Camioneta.cantidadCamionetas()+"\nCamiones: "+Camion.cantidadCamiones();
	
	}
}
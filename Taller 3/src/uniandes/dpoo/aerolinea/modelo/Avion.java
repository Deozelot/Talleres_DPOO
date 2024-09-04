package uniandes.dpoo.aerolinea.modelo;

public class Avion {
	
	private String nombre;
	
	private int capacidad;

	public Avion(String nombre, int capacidad) {
		super();
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}
	
}

package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;
import java.util.HashMap;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.*;


public class Vuelo {
	
	private Ruta ruta;
	
	private String fecha;
	
	private Avion avion;
	
	private HashMap<String, Tiquete> tiquetes;

	public Vuelo(Ruta ruta, String fecha, Avion avion) {
		super();
		this.ruta = ruta;
		this.fecha = fecha;
		this.avion = avion;
		this.tiquetes = new HashMap<String, Tiquete>();
		
	}

	/**
	 * @return the ruta
	 */
	public Ruta getRuta() {
		return ruta;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @return the avion
	 */
	public Avion getAvion() {
		return avion;
	}
	
	
	public Collection<Tiquete> getTiquetes(){
		
		return tiquetes.values();
	}
	
	public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
		
		int tarifa = calculadora.calcularTarifa(this, cliente);
		
		for (int i = 0; i < cantidad; i++ ) {
			
			Tiquete tiqueteActual = GeneradorTiquetes.generarTiquete(this, cliente, tarifa);
			this.tiquetes.put(tiqueteActual.getCodigo(), tiqueteActual);
			cliente.agregarTiquete(tiqueteActual);
			
		}
		
		return cantidad;
		
	}
	
	public boolean equals(Object obj) {
		
		return obj.equals(this);

	}
	
	

}

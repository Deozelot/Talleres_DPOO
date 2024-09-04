package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {

	private Cliente cliente;
	
	private Vuelo vuelo; 
	
	private String codigo;
	
	private int tarifa;
	
	private boolean usado;

	public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
		super();	
		this.cliente = cliente;
		this.vuelo = vuelo;
		this.codigo = codigo;
		this.tarifa = tarifa;
		this.usado = false;
	}

	/**
	 * @return the cliente
	 */
	public Cliente getCliente() {
		return cliente;
	}

	/**
	 * @return the vuelo
	 */
	public Vuelo getVuelo() {
		return vuelo;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @return the tarifa
	 */
	public int getTarifa() {
		return tarifa;
	}

	public void marcarComoUsado() {
		this.usado = true;
	}
	
	public boolean esUsado() {
		return usado;
	}
		
	
}

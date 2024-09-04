package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas {

	public static double IMPUESTO = 0.28; 
	
	public int calcularTarifa(Vuelo vuelo, Cliente cliente) {
		
		int costoBase = this.calcularCostoBase(vuelo, cliente);
		int costoImpuesto = this.calcularValorImpuestos(costoBase);
		
		return (int) (costoBase*(1-this.calcularPorcentajeDescuento(cliente)) + costoImpuesto);
	}
		
	abstract protected int calcularCostoBase(Vuelo vuelo, Cliente cliente);
	
	abstract protected double calcularPorcentajeDescuento(Cliente cliente);
		
	protected int calcularDistaciaVuelo(Ruta ruta) {
		
		return Aeropuerto.calcularDistancia(ruta.getOrigen(), ruta.getDestino());
		
	}

	protected int calcularValorImpuestos(int costoBase) {
		
		int costoImpuesto = (int) (costoBase * IMPUESTO);
		
		return costoImpuesto;
		
	}
	
}

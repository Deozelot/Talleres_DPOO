package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas {
	
	protected static int COSTO_POR_KM = 1000;
	
	public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		
		Ruta ruta = vuelo.getRuta();
		
		int kilometros = this.calcularDistaciaVuelo(ruta);
    	int costo = kilometros * COSTO_POR_KM;
    	
    	return costo;
	}
	
	public double calcularPorcentajeDescuento(Cliente cliente) {
		
		return 0;
	}

	
}

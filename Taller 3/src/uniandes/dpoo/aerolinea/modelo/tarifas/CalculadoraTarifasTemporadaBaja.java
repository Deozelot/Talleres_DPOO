package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.*;


public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas{

	protected static final int COSTO_POR_KM_NATURAL = 600;
	
	protected static final int COSTO_POR_KM_CORPORATIVO = 900;
	
	protected static final double DESCUENTO_PEQ = 0.02;
	
    protected static final double DESCUENTO_MEDIANAS = 0.1;
    
    protected static final double DESCUENTO_GRANDES = 0.2;
    
    public int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
    	
    	Ruta ruta = vuelo.getRuta();
    	
    	int kilometros = this.calcularDistaciaVuelo(ruta);
    	int costo = 0;
    	
    	if (cliente.getTipoCliente().equals(ClienteNatural.NATURAL)){
    		
    		costo = kilometros * COSTO_POR_KM_NATURAL;
    		
    	} else if (cliente.getTipoCliente().equals(ClienteCorporativo.CORPORATIVO)){
    		
    		costo = kilometros * COSTO_POR_KM_CORPORATIVO;
    		
    	}
    
    	return costo;
    	
    }
    
    public double calcularPorcentajeDescuento(Cliente cliente) {
    	
    	if (cliente.getTipoCliente().equals(ClienteCorporativo.CORPORATIVO)) {
    		
    		ClienteCorporativo clienteCorporativo = (ClienteCorporativo) cliente;
    		
    		if (clienteCorporativo.getTamanoEmpresa() == ClienteCorporativo.PEQUENA) {
    			
    			return DESCUENTO_PEQ;
    			
    		} else if (clienteCorporativo.getTamanoEmpresa() == ClienteCorporativo.MEDIANA) {
    			
    			return DESCUENTO_MEDIANAS;
    			
    		} else if (clienteCorporativo.getTamanoEmpresa() == ClienteCorporativo.GRANDE) {
    			
    			return DESCUENTO_GRANDES;
    			
    		}
    		
    	}
    	
    	return 1;
    }
    
}

	
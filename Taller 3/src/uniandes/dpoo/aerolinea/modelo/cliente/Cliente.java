package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	
	private ArrayList<Tiquete> tiquetesUsados;
	private ArrayList<Tiquete> tiquetesSinUsar;
	
	
	public Cliente(){
		
		tiquetesUsados = new ArrayList<Tiquete>();
		tiquetesSinUsar = new ArrayList<Tiquete>();
	}
	
	public abstract String getTipoCliente();
	
	public abstract String getIdentificador();
	
	public void agregarTiquete(Tiquete tiquete) {
		
		tiquetesSinUsar.add(tiquete);
		
	}
	
	public int calcularValorTotalTiquetes() {
		
		int total = 0;
		
		for (Tiquete tiquete: tiquetesSinUsar) {
			
			total += tiquete.getTarifa();
			
		}
		
		return total;
		
	}
	
	public void usarTiquetes(Vuelo vuelo) {
		
		for (int i = 0; i < tiquetesSinUsar.size(); i++) {
			
			Vuelo vueloActual = tiquetesSinUsar.get(i).getVuelo();
			
			if (vueloActual.equals(vuelo)) {
				
				tiquetesUsados.add(tiquetesSinUsar.get(i));
				tiquetesSinUsar.remove(i);
			}
		}
	}

}

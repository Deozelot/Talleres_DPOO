package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre mapas.
 *
 * Todos los métodos deben operar sobre el atributo mapaCadenas que se declara como un Map.
 * 
 * En este mapa, las llaves serán cadenas y los valores serán también cadenas. La relación entre los dos será que cada llave será igual a la cadena del valor, pero invertida.
 * 
 * El objetivo de usar el tipo Map es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (HashMap).
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxMapas
{
    /**
     * Un mapa de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Las llaves del mapa son cadenas, así como los valores.
     * 
     * Las llaves corresponden a invertir la cadena que aparece asociada a cada llave.
     */
    private Map<String, String> mapaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxMapas( )
    {
        mapaCadenas = new HashMap<String, String>( );
    }

    /**
     * Retorna una lista con las cadenas del mapa (los valores) ordenadas lexicográficamente
     * @return Una lista ordenada con las cadenas que conforman los valores del mapa
     */
    public List<String> getValoresComoLista( )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	Collection <String> valores =  mapa.values();
    	List<String> lista = new ArrayList<String>();
    	
    	for (String valor: valores) {
    		
    		lista.addLast(valor);
    	}
    	
    	lista.sort(null);
    	
    	return lista;
    }
    /**
     * Retorna una lista con las llaves del mapa ordenadas lexicográficamente de mayor a menor
     * @return Una lista ordenada con las cadenas que conforman las llaves del mapa
     */
    public List<String> getLlavesComoListaInvertida( )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	Collection <String> set =  mapa.keySet();
    	List<String> lista = new ArrayList<String>();
    	for (String key: set) {
    		
    		lista.addLast(key);
    	}
    	
    	lista.sort((a,b)->{return -1 * a.compareTo(b);});
    	
    	return lista;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor dentro de las llaves del mapa .
     * 
     * Si el mapa está vacío, debe retornar null.
     * @return
     */
    public String getPrimera( )
    {
    	List<String> llaves = this.getLlavesComoListaInvertida();
    	if (llaves.size() == 0) {
    		return null;
    	}
        return llaves.getLast();
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor dentro de los valores del mapa
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return
     */
    public String getUltima( )
    {
    	List<String> valores = this.getValoresComoLista();
    	if (valores.size() == 0) {
    		return null;
    	}
        return valores.getLast();
    }

    /**
     * Retorna una colección con las llaves del mapa, convertidas a mayúsculas.
     * 
     * El orden de las llaves retornadas no importa.
     * @return Una lista de cadenas donde todas las cadenas están en mayúsculas
     */
    public Collection<String> getLlaves( )
    {	
    	Map<String, String> mapa = this.mapaCadenas;
    	Collection<String> collection = mapa.keySet();
    	List<String> collectionNuevo = new ArrayList<String>();
    	
    	for (String key: collection) {
    
    		collectionNuevo.add( key.toUpperCase());
    	
    	}
    	
        return collectionNuevo;
    }

    /**
     * Retorna la cantidad de *valores* diferentes en el mapa
     * @return
     */
    public int getCantidadCadenasDiferentes( )
    {
    	Collection<String> llaves = this.getLlaves();
        return llaves.size();
    }

    /**
     * Agrega un nuevo valor al mapa de cadenas: el valor será el recibido por parámetro, y la llave será la cadena invertida
     * 
     * Este método podría o no aumentar el tamaño del mapa, dependiendo de si ya existía la cadena en el mapa
     * 
     * @param cadena La cadena que se va a agregar al mapa
     */
    public void agregarCadena( String cadena )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	
    	String key = new String();
    	
    	for (int i = cadena.length()-1; i >= 0 ; i--) {
    		
    		key = key + cadena.charAt(i);
    	}
    	
    	mapa.put(key, cadena);
    }

    /**
     * Elimina una cadena del mapa, dada la llave
     * @param cadena La llave para identificar el valor que se debe eliminar
     */
    public void eliminarCadenaConLLave( String llave )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	mapa.remove(llave);
    }

    /**
     * Elimina una cadena del mapa, dado el valor
     * @param cadena El valor que se debe eliminar
     */
    public void eliminarCadenaConValor( String valor )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	List<String> keys = this.getLlavesComoListaInvertida();
    	
    	for (String key: keys) {
    		
    		if (mapa.get(key) == valor) {
    			
    			mapa.remove(key);
    		}
    	}
    }

    /**
     * Reinicia el mapa de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarMapaCadenas( List<Object> objetos )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	mapa.clear();
    	for (Object objeto:objetos) {
    		
    		this.agregarCadena(objeto.toString());
    	}
    }

    /**
     * Modifica el mapa de cadenas reemplazando las llaves para que ahora todas estén en mayúsculas pero sigan conservando las mismas cadenas asociadas.
     */
    public void volverMayusculas( )
    {
    	Map<String, String> mapa = this.mapaCadenas;
    	List<String> llaves = this.getLlavesComoListaInvertida();
    	
    	for (String llave: llaves) {
    		
    		String valor = mapa.get(llave);
    		mapa.remove(llave);
    		mapa.put(llave.toUpperCase(), valor);
    	}
    	
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del mapa de cadenas (de los valores)
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro de los valores del mapa
     */
    public boolean compararValores( String[] otroArreglo )
    {
    	
    	List<String> valoresMapa = this.getValoresComoLista();
    	
    	for (String cadena: otroArreglo) {
    		
    		if (!(valoresMapa.contains(cadena))) {
    			
    			return false;
    		}
    	}
        return true;
    }

}

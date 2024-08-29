package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre conjuntos implementados usando un árbol (TreeSet).
 *
 * Todos los métodos deben operar sobre el atributo arbolCadenas que se declara como un NavigableSet.
 * 
 * El objetivo de usar el tipo NavigableSet es que sólo puedan usarse métodos de esa interfaz y no métodos adicionales provistos por la implementación concreta (TreeSet).
 * 
 * A diferencia de un Set, en un NavigableSet existe una noción de orden que en este caso corresponde al órden lexicográfico.
 * 
 * No pueden agregarse nuevos atributos.
 */
public class SandboxConjuntos
{
    /**
     * Un conjunto (set) de cadenas para realizar varias de las siguientes operaciones.
     * 
     * Por defecto, los elementos del conjunto están ordenados lexicográficamente.
     */
    private NavigableSet<String> arbolCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxConjuntos( )
    {
        arbolCadenas = new TreeSet<String>( );
    }

    /**
     * Retorna una lista con las cadenas del conjunto ordenadas lexicográficamente
     * @return Una lista con las cadenas ordenadas
     */
    public List<String> getCadenasComoLista( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	List<String> lista = new ArrayList<String>(palabras.size());
    	
    	for (String palabra: palabras) {
    		
    		lista.add(palabra);
    	}
    	
    	return lista;
    }

    /**
     * Retorna una lista con las cadenas del conjunto, ordenadas lexicográficamente de mayor a menor.
     * @return Una lista con las cadenas ordenadas de mayor a menor
     */
    public List<String> getCadenasComoListaInvertida( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	NavigableSet<String> palabrasInvertida = palabras.descendingSet();
    	List<String> lista = new ArrayList<String>(palabras.size());
    	
    	for (String palabra: palabrasInvertida) {
    		
    		lista.add(palabra);
    		
    	}
    	
    	return lista;
    }

    /**
     * Retorna la cadena que sea lexicográficamente menor en el conjunto de cadenas.
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return La primera cadena del conjunto, o null si está vacío.
     */
    public String getPrimera( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	
    	if (palabras.size() == 0) {
    		
    		return null;
    		
    	}
    	
    	return palabras.getFirst();
    }

    /**
     * Retorna la cadena que sea lexicográficamente mayor en el conjunto de cadenas
     * 
     * Si el conjunto está vacío, debe retornar null.
     * @return La última cadena del conjunto, o null si está vacío.
     */
    public String getUltima( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	
    	if (palabras.size() == 0) {
    		
    		return null;
    		
    	}
    	
    	return palabras.getLast();
    }

    /**
     * Retorna una colección con las cadenas que hacen parte del conjunto de cadenas y son mayores o iguales a la cadena que se recibe por parámetro
     * @param cadena
     * @return Una colección de cadenas mayores a la cadena dada. Si la cadena hace parte del conjunto, debe hacer parte de la colección retornada.
     */
    public Collection<String> getSiguientes( String cadena )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	Collection<String> resultado = new ArrayList<>();
    	
        for (String palabra : palabras) {
        	
            if (palabra.compareTo(cadena) >= 0) {
            	
                resultado.add(palabra);
            }
        }
        return resultado;
    }

    /**
     * Retorna la cantidad de valores en el conjunto de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	return palabras.size();
    }

    /**
     * Agrega un nuevo valor al conjunto de cadenas.
     * 
     * Este método podría o no aumentar el tamaño del conjunto, dependiendo de si el número está repetido o no.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	palabras.add(cadena);
    }

    /**
     * Elimina una cadena del conjunto de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	palabras.remove(cadena);
    }

    /**
     * Elimina una cadena del conjunto de cadenas, independientemente de las mayúsculas o minúsculas
     * @param cadena La cadena que se va eliminar, sin tener en cuenta las mayúsculas o minúsculas
     */
    public void eliminarCadenaSinMayusculasOMinusculas( String cadena )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	palabras.removeIf(i -> i.equalsIgnoreCase(cadena));    	
    }

    /**
     * Elimina la primera cadena del conjunto
     */
    public void eliminarPrimera( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	palabras.pollFirst();
    }

    /**
     * Reinicia el conjunto de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarConjuntoCadenas( List<Object> objetos )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	palabras.clear();
    	for(Object objeto: objetos) {
    		
    		palabras.add(objeto.toString());
    		
    	}
    }

    /**
     * Modifica el conjunto de cadenas para que todas las cadenas estén en mayúsculas.
     * 
     * Note que esta operación podría modificar el órden de los elementos dentro del conjunto.
     */
    public void volverMayusculas( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	NavigableSet<String> nuevoArbol = new TreeSet<String>();
    	for(String palabra: palabras) {
    		
    		nuevoArbol.add(palabra.toUpperCase());
    	}
    	
    	this.arbolCadenas = nuevoArbol;
    }

    /**
     * Construye un árbol de cadenas donde todas las cadenas están organizadas de MAYOR a MENOR.
     */
    public TreeSet<String> invertirCadenas( )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	NavigableSet<String> palabrasInvertido =  palabras.descendingSet();
    	TreeSet<String> nuevoArbol = new TreeSet<String>();
    	
    	for (String palabra: palabrasInvertido) {
    		
    		nuevoArbol.addLast(palabra);
    	}
    	
    	return nuevoArbol;
    }

    /**
     * Verifica si todos los elementos en el arreglo de cadenas del parámetro hacen parte del conjunto de cadenas
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si todos los elementos del arreglo están dentro del conjunto
     */
    public boolean compararElementos( String[] otroArreglo )
    {
    	NavigableSet<String> palabras =  this.arbolCadenas;
    	
    	for (String cadena: otroArreglo) {
    		
    		if (!(palabras.contains(cadena))) {
    			
    			return false;
    			
    		}
    	}
        return true;
    }

}

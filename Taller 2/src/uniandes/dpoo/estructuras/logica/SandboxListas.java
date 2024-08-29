package uniandes.dpoo.estructuras.logica;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre listas de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos listaEnteros y listaCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre listas (ie., no haga cosas como construir arreglos para evitar la manipulación de listas).
 * 
 * Intente usar varias formas de recorrer las listas (while, for, for each, iteradores ... )
 */
public class SandboxListas
{
    /**
     * Una lista de enteros para realizar varias de las siguientes operaciones.
     */
    private List<Integer> listaEnteros;

    /**
     * Una lista de cadenas para realizar varias de las siguientes operaciones
     */
    private List<String> listaCadenas;

    /**
     * Crea una nueva instancia de la clase con las dos listas inicializadas pero vacías
     */
    public SandboxListas( )
    {
        listaEnteros = new ArrayList<Integer>( );
        listaCadenas = new LinkedList<String>( );
    }

    /**
     * Retorna una copia de la lista de enteros, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de enteros
     */
    public List<Integer> getCopiaEnteros( )
    {
        List<Integer> enteros = this.listaEnteros;
        List<Integer> copiaEnteros = new ArrayList<Integer>(enteros.size());
        
        for (Integer entero: enteros) {
        	
        	copiaEnteros.addLast(entero);
        }
        
        return copiaEnteros;
    }

    /**
     * Retorna una copia de la lista de cadenas, es decir una nueva lista del mismo tamaño que contiene copias de los valores de la lista original
     * @return Una copia de la lista de cadenas
     */
    public List<String> getCopiaCadenas( )
    {
    	List<String> cadenas = this.listaCadenas;
        List<String> copiaCadenas = new ArrayList<String>(cadenas.size());
        
        for (String cadena: cadenas) {
        	
        	copiaCadenas.addLast(cadena);
        }
        
        return copiaCadenas;
    }

    /**
     * Retorna un arreglo con los valores de la lista de enteros, es decir un arreglo del mismo tamaño que contiene copias de los valores de la lista
     * @return Una arreglo de enteros
     */
    public int[] getEnterosComoArreglo( )
    {
    	List<Integer> enteros = this.listaEnteros;
    	int[] arreglo = new int[enteros.size()];
    	
    	for(int i = 0; i < enteros.size(); i++) {
    		
    		arreglo[i] = enteros.get(i);
    		
    	}
    	
    	return arreglo;
    }

    /**
     * Retorna la cantidad de valores en la lista de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
    	List<Integer> enteros = this.listaEnteros;
    	return enteros.size();
    }

    /**
     * Retorna la cantidad de valores en la lista de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	List<String> cadenas = this.listaCadenas;
    	return cadenas.size();
    }

    /**
     * Agrega un nuevo valor al final de la lista de enteros. Es decir que este método siempre debería aumentar en 1 el tamaño de la lista.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	List<Integer> enteros = this.listaEnteros;
    	enteros.addLast(entero);
    }

    /**
     * Agrega un nuevo valor al final de la lista de cadenas. Es decir que este método siempre debería aumentar en 1 la capacidad de la lista.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	List<String> cadenas = this.listaCadenas;
    	cadenas.addLast(cadena);
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	List<Integer> enteros = this.listaEnteros;
    	enteros.removeIf(n -> (n == valor) );
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro de la lista de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	List<String> cadenas = this.listaCadenas;
    	cadenas.removeIf(n -> (n.equals(cadena)));
    }

    /**
     * Inserta un nuevo entero en la lista de enteros
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en la lista aumentada. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño de la lista, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	List<Integer> enteros = this.listaEnteros;
    	
    	if(enteros.size() == 0) {
    		
    		enteros.add(entero);
    		return;
    	
    	}else if (posicion < 0) {
    		
    		posicion = 0;
    		
    	} else if (posicion > enteros.size()-1) {
    		
    		enteros.addLast(entero);
    		return;
    	} 
    	
    	enteros.add(posicion, entero);
    }

    /**
     * Elimina un valor de la lista de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición de la lista de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	List<Integer> enteros = this.listaEnteros;
    	
    	if(posicion < 0 || posicion > enteros.size() - 1) {
    		
    		return;
    		
    	}
    	
    	enteros.remove(posicion);
    }

    /**
     * Reinicia la lista de enteros con los valores contenidos en el parámetro 'valores', pero truncados.
     * 
     * Es decir que si el valor fuera 3.67, en la nueva lista debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	List<Integer> enteros = new ArrayList<Integer>(valores.length);
    	
    	for (double valor: valores) {
    		
    		enteros.addLast((int) valor);
    	}
    	
    	this.listaEnteros = enteros;
    }

    /**
     * Reinicia la lista de cadenas con las representaciones como Strings de los objetos contenidos en la lista del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Una lista de objetos
     */
    public void reiniciarArregloCadenas( List<Object> objetos )
    {
    	List<String> cadenas = new ArrayList<String>(objetos.size());
    	
    	for (Object objeto: objetos) {
    		
    		cadenas.addLast(objeto.toString());
    	}
    	
    	this.listaCadenas = cadenas;
    }

    /**
     * Modifica la lista de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	List<Integer> enteros = this.listaEnteros;
    	List<Integer> nuevosEnteros = new ArrayList<Integer>(enteros.size());
    	
    	for(Integer entero: enteros) {
    		
    		if (entero < 0 ) {
    			
    			entero = entero*-1;
    		}
    		
    		nuevosEnteros.addLast(entero);
    	}
    	
    	this.listaEnteros = nuevosEnteros;
    }

    /**
     * Modifica la lista de enteros para que todos los valores queden organizados de MAYOR a MENOR.
     */
    public void organizarEnteros( )
    {
    	List<Integer> enteros = this.listaEnteros;
    	enteros.sort((a,b)->{return -1 * a.compareTo(b);});
    }

    /**
     * Modifica la lista de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	List<String> cadenas = this.listaCadenas;
    	cadenas.sort(null);
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en la lista de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	List<Integer> enteros = this.listaEnteros;
    	int contador = 0;
    	
    	for(Integer entero: enteros) {
    	
    		if (entero == valor) {
    			
    			contador++;
    			
    		}
    	}
    	
    	return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en la lista de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	List<String> cadenas = this.listaCadenas;
    	int contador = 0;
    	
    	for(String palabra: cadenas) {
    	
    		if (palabra.equalsIgnoreCase(cadena)) {
    			
    			contador++;
    			
    		}
    	}
    	
    	return contador;
    }

    /**
     * Cuenta cuántos valores dentro de la lista de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	
    	List<Integer> enteros = this.listaEnteros;
    	List<Integer> enterosComparacion = this.getCopiaEnteros();
    	
    	int repetidos = 0;
    	
    	for (int entero1: enteros) {
    		
    		int contador = 0;
    		
    		for ( int entero2: enterosComparacion) {
    			
    			if (entero1 == entero2) {
    				
    				contador++;
    			}
    		}
    		
    		enterosComparacion.removeIf(n -> (n == entero1));
    		
    		if (contador > 1) {
    			
    			repetidos++;
    		}
    	}
    	
    	 return repetidos;
    }

    /**
     * Compara la lista de enteros con un arreglo de enteros y verifica si contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos son los mismos y en el mismo orden y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	List<Integer> enteros = this.listaEnteros;
    	
    	if(enteros.size() != otroArreglo.length) {
    		
    		return false;
    	}
    	
    	for(int i = 0; i <  enteros.size(); i++) {
    		
    		if(enteros.get(i) != otroArreglo[i]) {
        		
        		return false;
        	}
    	}
    	
    	return true;
    }

    /**
     * Cambia los elementos de la lista de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en la lista deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en la lista
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	ArrayList<Integer> nuevaLista = new ArrayList<Integer>();
    	
    	for (int i = 0; i < cantidad; i++) {
    	
    		int entero = (int) (Math.random() * (maximo - minimo + 1)) + minimo; 
    		nuevaLista.addLast(entero);
    		
    	}
    	
    	this.listaEnteros = nuevaLista;
    }

}

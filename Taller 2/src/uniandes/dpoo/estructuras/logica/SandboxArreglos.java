package uniandes.dpoo.estructuras.logica;

import java.util.HashMap;


/**
 * Esta clase tiene un conjunto de métodos para practicar operaciones sobre arreglos de enteros y de cadenas.
 *
 * Todos los métodos deben operar sobre los atributos arregloEnteros y arregloCadenas.
 * 
 * No pueden agregarse nuevos atributos.
 * 
 * Implemente los métodos usando operaciones sobre arreglos (ie., no haga cosas como construir listas para evitar la manipulación de arreglos).
 */
public class SandboxArreglos
{
    /**
     * Un arreglo de enteros para realizar varias de las siguientes operaciones.
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private int[] arregloEnteros;

    /**
     * Un arreglo de cadenas para realizar varias de las siguientes operaciones
     * 
     * Ninguna posición del arreglo puede estar vacía en ningún momento.
     */
    private String[] arregloCadenas;

    /**
     * Crea una nueva instancia de la clase con los dos arreglos inicializados pero vacíos (tamaño 0)
     */
    public SandboxArreglos( )
    {
        arregloEnteros = new int[]{};
        arregloCadenas = new String[]{};
    }

    /**
     * Retorna una copia del arreglo de enteros, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de enteros
     */
    public int[] getCopiaEnteros( )
    {
    	return this.arregloEnteros.clone();
    }

    /**
     * Retorna una copia del arreglo de cadenas, es decir un nuevo arreglo del mismo tamaño que contiene copias de los valores del arreglo original
     * @return Una copia del arreglo de cadenas
     */
    public String[] getCopiaCadenas( )
    {
    	return this.arregloCadenas.clone();
    }

    /**
     * Retorna la cantidad de valores en el arreglo de enteros
     * @return
     */
    public int getCantidadEnteros( )
    {
        return this.arregloEnteros.length;
    }

    /**
     * Retorna la cantidad de valores en el arreglo de cadenas
     * @return
     */
    public int getCantidadCadenas( )
    {
    	return this.arregloCadenas.length;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param entero El valor que se va a agregar.
     */
    public void agregarEntero( int entero )
    {
    	int size = this.arregloEnteros.length;
    	int[] nuevoArray = new int[size + 1];
    	
    	for(int i = 0; i < size; i++) {
    		nuevoArray[i] = this.arregloEnteros[i];
    	}
    	nuevoArray[size] = entero;
    	this.arregloEnteros = nuevoArray;
    }

    /**
     * Agrega un nuevo valor al final del arreglo. Es decir que este método siempre debería aumentar en 1 la capacidad del arreglo.
     * 
     * @param cadena La cadena que se va a agregar.
     */
    public void agregarCadena( String cadena )
    {
    	int size = this.arregloCadenas.length;
    	String[] nuevoArray = new String[size + 1];
    	
    	for(int i = 0; i < size; i++) {
    		
    		nuevoArray[i] = this.arregloCadenas[i];
    	}
    	
    	nuevoArray[size] = cadena;
    	this.arregloCadenas = nuevoArray;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de enteros
     * @param valor El valor que se va eliminar
     */
    public void eliminarEntero( int valor )
    {
    	int sizeNuevoArray = 0;
    	
    	for(int entero: this.arregloEnteros) {
    		
    		if(entero != valor){
    			
    			sizeNuevoArray++;
    			
    		}
    	}
    	
    	int[] nuevoArray = new int[sizeNuevoArray];
    	
    	int i = 0;
    	
    	for(int entero: this.arregloEnteros) {
    		
    		if(entero != valor){
    			
    			nuevoArray[i] = entero;
    			i++;
    			
    		}
    	}
    	
    	this.arregloEnteros = nuevoArray;
    }

    /**
     * Elimina todas las apariciones de un determinado valor dentro del arreglo de cadenas
     * @param cadena La cadena que se va eliminar
     */
    public void eliminarCadena( String cadena )
    {
    	int sizeNuevoArray = 0;
    	
    	for(String palabra: this.arregloCadenas) {
    		
    		if(!(palabra.equals(cadena))){
    			
    			sizeNuevoArray++;
    			
    		}
    	}
    	
    	String[] nuevoArray = new String[sizeNuevoArray];
    	
    	int i = 0;
    	
    	for(String palabra: this.arregloCadenas) {
    		
    		if(!(palabra.equals(cadena))){
    			
    			nuevoArray[i] = palabra;
    			i++;
    			
    		}
    	}
    	
    	this.arregloCadenas = nuevoArray;
    	
    }

    /**
     * Inserta un nuevo entero en el arreglo de enteros.
     * 
     * @param entero El nuevo valor que debe agregarse
     * @param posicion La posición donde debe quedar el nuevo valor en el arreglo aumentado. Si la posición es menor a 0, se inserta el valor en la primera posición. Si la
     *        posición es mayor que el tamaño del arreglo, se inserta el valor en la última posición.
     */
    public void insertarEntero( int entero, int posicion )
    {
    	int sizeNuevoArray = this.arregloEnteros.length + 1;
    	int[] nuevoArray = new int[sizeNuevoArray];
    	int i = 0;
    	
    	if(posicion < 0) {
    		
    		posicion = 0;
    		
    	}
    	
    	if(posicion > this.arregloEnteros.length - 1) {
    		
    		posicion = sizeNuevoArray - 1;
    		
    	}
    	
    	for (int j = 0; j < sizeNuevoArray; j++) {
    		
    		if (j != posicion) {
    			
    			nuevoArray[j] = this.arregloEnteros[i];
    			i++;
    			
    		}else{
    			
    			nuevoArray[j] = entero;
    			
    		}
    	}
    	
    	this.arregloEnteros = nuevoArray;
    }

    /**
     * Elimina un valor del arreglo de enteros dada su posición.
     * @param posicion La posición donde está el elemento que debe ser eliminado. Si el parámetro posicion no corresponde a ninguna posición del arreglo de enteros, el método
     *        no debe hacer nada.
     */
    public void eliminarEnteroPorPosicion( int posicion )
    {
    	int sizeNuevoArray = this.arregloEnteros.length - 1;
    	int[] nuevoArray = new int[sizeNuevoArray];
    	int j = 0;
    	
    	if((posicion < 0)||(posicion > this.arregloEnteros.length - 1)) {
    		
    		return;
    		
    	}
    	
    	for (int i = 0; i < this.arregloEnteros.length; i++) {
    		
    		if (i != posicion) {
    			
    			nuevoArray[j] = this.arregloEnteros[i];   			
    			j++;
    		}
    	}
    	this.arregloEnteros = nuevoArray;
    }
    
    /**
     * Reinicia el arreglo de enteros con los valores contenidos en el arreglo del parámetro 'valores' truncados.
     * 
     * Es decir que si el valor fuera 3.67, en el nuevo arreglo de enteros debería quedar el entero 3.
     * @param valores Un arreglo de valores decimales.
     */
    public void reiniciarArregloEnteros( double[] valores )
    {
    	int[] nuevoArray = new int[valores.length];
    	int i = 0;
    	
    	for(double decimal: valores ) {
    		
    		nuevoArray[i] = (int) decimal;
    		i++;
    		
    	}
    	this.arregloEnteros = nuevoArray;
    }

    /**
     * Reinicia el arreglo de cadenas con las representaciones como Strings de los objetos contenidos en el arreglo del parámetro 'objetos'.
     * 
     * Use el método toString para convertir los objetos a cadenas.
     * @param valores Un arreglo de objetos
     */
    public void reiniciarArregloCadenas( Object[] objetos )
    {
    	String[] nuevoArray = new String[objetos.length];
    	int i = 0;
    	
    	for(Object objeto: objetos ) {
    		
    		nuevoArray[i] = objeto.toString();
    		i++;
    		
    	}
    	this.arregloCadenas = nuevoArray;
    }
    /**
     * Modifica el arreglo de enteros para que todos los valores sean positivos.
     * 
     * Es decir que si en una posición había un valor negativo, después de ejecutar el método debe quedar el mismo valor muliplicado por -1.
     */
    public void volverPositivos( )
    {
    	int[] nuevoArray = new int[this.arregloEnteros.length];
    	int i = 0;
    	
    	for(int entero: this.arregloEnteros ) {
    		
    		if (entero < 0) {
    			
    			entero = -1 * entero;
    			
    		}
    		
    		nuevoArray[i] = entero;
    		i++;
    		
    	}
    	this.arregloEnteros = nuevoArray;
    }

    /**
     * Modifica el arreglo de enteros para que todos los valores queden organizados de menor a mayor.
     */
    public void organizarEnteros( )
    {
    	for (int i = 0; i < this.arregloEnteros.length - 1; i++) {
    		
    		for(int j = 0; j < this.arregloEnteros.length -1 - i; j++) {
    			
    			if (this.arregloEnteros[j] > this.arregloEnteros[j+1]) {
    				
    				int temp = this.arregloEnteros[j];
    				this.arregloEnteros[j] = this.arregloEnteros[j+1];
    				this.arregloEnteros[j+1] = temp;
    			}
    			
    		}
    		
    	}
    }

    /**
     * Modifica el arreglo de cadenas para que todos los valores queden organizados lexicográficamente.
     */
    public void organizarCadenas( )
    {
    	for (int i = 0; i < this.arregloCadenas.length - 1; i++) {
    		
    		for(int j = 0; j < this.arregloCadenas.length -1 - i; j++) {
    			
    			if (this.arregloCadenas[j].compareTo(this.arregloCadenas[j+1]) > 0) {
    				
    				String temp = this.arregloCadenas[j];
    				this.arregloCadenas[j] = this.arregloCadenas[j+1];
    				this.arregloCadenas[j+1] = temp;
    			}
    			
    		}
    		
    	}
    }

    /**
     * Cuenta cuántas veces aparece el valor recibido por parámetro en el arreglo de enteros
     * @param valor El valor buscado
     * @return La cantidad de veces que aparece el valor
     */
    public int contarApariciones( int valor )
    {
    	int contador = 0;
    	
    	for(int entero: this.arregloEnteros) {
    		
    		if (entero == valor){
    			
    			contador++;
    		}
    	}
        return contador;
    }

    /**
     * Cuenta cuántas veces aparece la cadena recibida por parámetro en el arreglo de cadenas.
     * 
     * La búsqueda no debe diferenciar entre mayúsculas y minúsculas.
     * @param cadena La cadena buscada
     * @return La cantidad de veces que aparece la cadena
     */
    public int contarApariciones( String cadena )
    {
    	int contador = 0;
    	for(String palabra: this.arregloCadenas) {
    		
    		if (palabra.equalsIgnoreCase(cadena)){
    			
    			contador++;
    		}
    	}
    	
        return contador;
    }
    /**
     * Busca en qué posiciones del arreglo de enteros se encuentra el valor que se recibe en el parámetro
     * @param valor El valor que se debe buscar
     * @return Un arreglo con los números de las posiciones del arreglo de enteros en las que se encuentra el valor buscado. Si el valor no se encuentra, el arreglo retornado
     *         es de tamaño 0.
     */
    public int[] buscarEntero( int valor )
    {
    	int conteo = this.contarApariciones(valor);
    	int[] posiciones = new int[conteo];
    	int j = 0;
    	
    	for (int i = 0; i < this.arregloEnteros.length; i++) {
    		
    		if (this.arregloEnteros[i] == valor) {
    			posiciones[j] = i;
    			j++;
    		}
    	}
        return posiciones;
    }

    /**
     * Calcula cuál es el rango de los enteros (el valor mínimo y el máximo).
     * @return Un arreglo con dos posiciones: en la primera posición, debe estar el valor mínimo en el arreglo de enteros; en la segunda posición, debe estar el valor máximo
     *         en el arreglo de enteros. Si el arreglo está vacío, debe retornar un arreglo vacío.
     */
    public int[] calcularRangoEnteros( )
    {	
    	int[] rango = {};
    	
    	if (this.arregloEnteros.length == 0)
    		
    		return rango;
    	
    	rango = new int[2]; 
    	
    	int mayor = this.arregloEnteros[0];
    	int menor = this.arregloEnteros[0];
    	
    	for(int entero: this.arregloEnteros) {
    		
    		if (entero > mayor) {
    		
    		mayor = entero;
    			
    		}
    		
    		if (entero < menor) {
    			
    			menor = entero;
    		}
    	}
    	
    	rango[0] = menor;
    	rango[1] = mayor;		
    	
        return rango;
    }

    /**
     * Calcula un histograma de los valores del arreglo de enteros y lo devuelve como un mapa donde las llaves son los valores del arreglo y los valores son la cantidad de
     * veces que aparece cada uno en el arreglo de enteros.
     * @return Un mapa con el histograma de valores.
     */
    public HashMap<Integer, Integer> calcularHistograma( )
    {	
    	HashMap<Integer, Integer> histograma = new HashMap<>();
    	
    	for (int num : this.arregloEnteros) {
    		
            if (histograma.containsKey(num)) {
            	
                histograma.put(num, histograma.get(num) + 1);
                
            }else{
            	
                histograma.put(num, 1);
                
            }
        }

        return histograma;
    }

    /**
     * Cuenta cuántos valores dentro del arreglo de enteros están repetidos.
     * @return La cantidad de enteos diferentes que aparecen más de una vez
     */
    public int contarEnterosRepetidos( )
    {
    	HashMap<Integer, Integer> histograma = calcularHistograma();

        int repetidos = 0;

        for (int repeticiones : histograma.values()) {
            
        	if (repeticiones > 1) {
            	
                repetidos++;
                
            }
        }

        return repetidos;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica si son iguales, es decir que contienen los mismos elementos exactamente en el mismo orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los arreglos son idénticos y false de lo contrario
     */
    public boolean compararArregloEnteros( int[] otroArreglo )
    {
    	if (this.arregloEnteros.length != otroArreglo.length) {
            
    		return false;
    		
        }

        for (int i = 0; i < this.arregloEnteros.length; i++) {
            
        	if (this.arregloEnteros[i] != otroArreglo[i]) {
                
        		return false; 
        		
        	}        	
        }

        return true;
    }

    /**
     * Compara el arreglo de enteros con otro arreglo de enteros y verifica que tengan los mismos elementos, aunque podría ser en otro orden.
     * @param otroArreglo El arreglo de enteros con el que se debe comparar
     * @return True si los elementos en los dos arreglos son los mismos
     */
    public boolean mismosEnteros( int[] otroArreglo )
    {
    	if (this.arregloEnteros.length != otroArreglo.length) {
            return false;
        }

        HashMap<Integer, Integer> histograma1 = calcularHistograma();
        
		HashMap<Integer, Integer> histograma2 = new HashMap<>();
		    	
		    	for (int num : this.arregloEnteros) {
		    		
		            if (histograma2.containsKey(num)) {
		            	
		                histograma2.put(num, histograma2.get(num) + 1);
		                
		            }else{
		            	
		                histograma2.put(num, 1);
		                
		            }
		        }		        

        return histograma1.equals(histograma2);
    }

    /**
     * Cambia los elementos del arreglo de enteros por una nueva serie de valores generada de forma aleatoria.
     * 
     * Para generar los valores se debe partir de una distribución uniforme usando Math.random().
     * 
     * Los números en el arreglo deben quedar entre el valor mínimo y el máximo.
     * @param cantidad La cantidad de elementos que debe haber en el arreglo
     * @param minimo El valor mínimo para los números generados
     * @param maximo El valor máximo para los números generados
     */
    public void generarEnteros( int cantidad, int minimo, int maximo )
    {
    	int[] nuevoArray = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
        	
            int numero = (int) (Math.random() * (maximo - minimo + 1)) + minimo;
            nuevoArray[i] = numero;
            
        }
        
        this.arregloEnteros = nuevoArray;
    }

}

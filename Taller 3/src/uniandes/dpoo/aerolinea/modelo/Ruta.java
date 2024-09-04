package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre una aerolínea.
 */
public class Ruta
{

	private Aeropuerto origen;
	
	private Aeropuerto destino;
	
	private String horaSalida;
	
	private String horaLlegada;
	
	private String codigoRuta;

	public Ruta(String horaSalida, String horaLlegada, String codigoRuta, Aeropuerto origen, Aeropuerto destino) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
		this.codigoRuta = codigoRuta;
	}
	
	/**
	 * @return the origen
	 */
	public Aeropuerto getOrigen() {
		return origen;
	}

	/**
	 * @return the destino
	 */
	public Aeropuerto getDestino() {
		return destino;
	}

	/**
	 * @return the horaSalida
	 */
	public String getHoraSalida() {
		return horaSalida;
	}

	/**
	 * @return the horaLlegada
	 */
	public String getHoraLlegada() {
		return horaLlegada;
	}

	/**
	 * @return the codigoRuta
	 */
	public String getCodigoRuta() {
		return codigoRuta;
	}
	
    /**
     * Calcula la duración del viaje en un formato de horas y minutos combinados (HHMM).
     * 
     * @return La duración del viaje en un formato HHMM, donde HH representa las horas 
     *         y MM representa los minutos.
     */
	public int getDuracion(){
		
		int horasSalida = Ruta.getHoras(this.horaSalida);
		int minutosSalida = Ruta.getMinutos(this.horaSalida);
		int horasLlegada = Ruta.getHoras(this.horaLlegada);
		int minutosLlegada = Ruta.getMinutos(this.horaLlegada);
		int horasDuracion;
		int minutosDuracion;
		int duracion;
		
		if (horasLlegada < horasSalida) {
			
			horasDuracion = 24 - horasSalida + horasLlegada;
			
		} else {
			
			horasDuracion = horasLlegada - horasSalida;
		}
		
		if (minutosLlegada < minutosSalida) {
					
				horasDuracion --;
				minutosDuracion = 60 - minutosSalida + minutosLlegada;
					
		} else {
					
				minutosDuracion = minutosLlegada - minutosSalida;
				
				}
		
		duracion = horasDuracion * 100 + minutosDuracion;
		
		return duracion;
		
		}

	/**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos( String horaCompleta )
    {
        int minutos = Integer.parseInt( horaCompleta ) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras( String horaCompleta )
    {
        int horas = Integer.parseInt( horaCompleta ) / 100;
        return horas;
    }

    
}

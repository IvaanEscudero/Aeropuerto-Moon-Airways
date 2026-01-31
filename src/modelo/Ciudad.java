package modelo;
import java.util.ArrayList;

public class Ciudad {
	private String nombreCiudad;
	private Object origen_Destino;
	public ArrayList<Aeropuerto> ciudadOrigen = new ArrayList<Aeropuerto>();
	public Aeropuerto ciudadDestino;
	public Vuelo _vuelo;
}
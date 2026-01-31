package modelo;

import java.util.ArrayList;

public class Aeropuerto {
	private String OLSON;
	private String pais;
	public Ciudad ciudad;
	public ArrayList<Ciudad> ciudadDestino = new ArrayList<Ciudad>();
	public MoonAirways _moonAirways;
	public Trayecto _trayecto;

	public ArrayList<Vuelo> getFlights(Object aeropuerto) {
		throw new UnsupportedOperationException();
	}

	public void setAeropuertos() {
		throw new UnsupportedOperationException();
	}
}
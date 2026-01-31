package modelo;
import java.util.ArrayList;

public class Reserva {
	private int importeTotal;
	public ArrayList<Pasajero> _pasajero = new ArrayList<Pasajero>();
	public ArrayList<Billete> _billetes = new ArrayList<Billete>();
	public ArrayList<Vuelo> __vuelos = new ArrayList<Vuelo>();

	public int getImporteTotal() {
		return this.importeTotal;
	}

	public ArrayList<Billete> getBilletes(Object vuelo) {
		throw new UnsupportedOperationException();
	}

	public void addPasajero(String dni, String nombre, String apellidos, String fecha_nac) {
		throw new UnsupportedOperationException();
	}
}
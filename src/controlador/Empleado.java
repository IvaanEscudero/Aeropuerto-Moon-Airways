package controlador;
import java.util.ArrayList;
import modelo.MoonAirways;
import modelo.Trayecto;
import modelo.Vuelo;

public class Empleado extends Usuario {

    public Empleado(MoonAirways moonAirways) {
        super(moonAirways);
    }

    public Empleado(String user, String pass, MoonAirways moonAirways) {
        super(user, pass, moonAirways);
    }
	public ArrayList<Trayecto> _trayectos = new ArrayList<Trayecto>();
	public ArrayList<Vuelo> _vuelos = new ArrayList<Vuelo>();

	public Vuelo getVuelo(int opcion) {
		throw new UnsupportedOperationException();
	}

	public void getTrayectos() {
		throw new UnsupportedOperationException();
	}

	public boolean ComprobarBIlletes(String DNI) {
		throw new UnsupportedOperationException();
	}

	public void DarAltaVuelo() {
		throw new UnsupportedOperationException();
	}

	public void comprobarPassword() {
		throw new UnsupportedOperationException();
	}

	public void comprobarUser() {
		throw new UnsupportedOperationException();
	}

	public void consultarVuelos(Object ciudor, Object ciuddest, Object fecha) {
		throw new UnsupportedOperationException();
	}

	public void retrasarVuelo(int minutos, Object vuelo) {
		throw new UnsupportedOperationException();
	}

	public Usuario login(String user, String pass) {
		throw new UnsupportedOperationException();
	}
}
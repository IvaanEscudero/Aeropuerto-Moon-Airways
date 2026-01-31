package controlador;
import modelo.Aeropuerto;
import modelo.MoonAirways;
import modelo.Trayecto;

public class Supervisor extends Empleado{

    public Supervisor(MoonAirways moonAirways) {
        super(moonAirways);
    }

    public Supervisor(String user, String pass, MoonAirways moonAirways) {
        super(user, pass, moonAirways);
    }

	public void IniciarAltaTrayecto() {
		throw new UnsupportedOperationException();
	}

	public void EstablecerDuracion(Aeropuerto origen,Aeropuerto destino) {
		throw new UnsupportedOperationException();
	}

	public void inicioEliminarTrayecto(Trayecto trayecto) {
		throw new UnsupportedOperationException();
	}

	public void eliminarTrayecto() {
		throw new UnsupportedOperationException();
	}

	public void ElegirTrayectoAeropuerto(Aeropuerto origen, Aeropuerto destino) {
		throw new UnsupportedOperationException();
	}

	public void EscogerModeloAvion(Object modelo) {
		throw new UnsupportedOperationException();
	}

	public boolean ComprobarBillete(String dni) {
		throw new UnsupportedOperationException();
	}

	public void modificarPrecio(Object vuelo, float costotur, float costobness) {
		throw new UnsupportedOperationException();
	}

	public void establecerPrecio(float turista, float business) {
		throw new UnsupportedOperationException();
	}

	public void establecerDuracion(int tiempo) {
		throw new UnsupportedOperationException();
	}
}
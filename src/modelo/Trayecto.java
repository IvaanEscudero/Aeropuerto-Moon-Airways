package modelo;
import modelo.Aeropuerto;
import java.util.ArrayList;
import java.util.Date;

public class Trayecto {
	private float duracion;
	private float precioBase;
	private String modelosAvion;
	public ArrayList<Aeropuerto> _aeropuerto = new ArrayList<Aeropuerto>();

	public void setAeropuertoDestino(Aeropuerto destino) {
		throw new UnsupportedOperationException();
	}

	public void setDuracion(Date tiempo) {
		throw new UnsupportedOperationException();
	}

	public void setAeropuertoOrigen(Aeropuerto origen) {
		throw new UnsupportedOperationException();
	}

	public void setPrecioBase(float precio) {
		this.precioBase = precio;
	}

	public ArrayList<Trayecto> getTrayectos() {
		throw new UnsupportedOperationException();
	}

	public Trayecto() {
		throw new UnsupportedOperationException();
	}
}
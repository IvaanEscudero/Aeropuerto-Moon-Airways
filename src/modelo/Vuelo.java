package modelo;
import java.util.ArrayList;
import java.util.Date;

public class Vuelo {
	private String tipoAvion;
	private float precioTurista;
	private float precioBusiness;
	private Date fechaSalida;
	private Date horaEmbarque;
	private Date horaSalida;
	private Date horaLlegada;
	//public ArrayList<Empleado> _empleados = new ArrayList<Empleado>();
	public ArrayList<Ciudad> _ciudad = new ArrayList<Ciudad>();
	public ArrayList<Billete> _billetes = new ArrayList<Billete>();
	public Reserva _reserva;
	public Avion avion;
	public Trayecto _trayecto;
	public EstadoVuelo estadoVuelo;

	public void setStatus(int status) {
		throw new UnsupportedOperationException();
	}

	public void setHoraEmbarque(String fechact) {
		throw new UnsupportedOperationException();
	}

	public void setHoraSalida(String fechaact) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Billete> getBilletes(Object vuelo) {
		throw new UnsupportedOperationException();
	}

	public void setVuelos() {
		throw new UnsupportedOperationException();
	}

	public void setVueloTurista(float precio) {
		throw new UnsupportedOperationException();
	}

	public void setVueloBusiness(float precio) {
		throw new UnsupportedOperationException();
	}

	public void abrirEmbarque() {
		throw new UnsupportedOperationException();
	}

	public void setEstadoVuelo(EstadoVuelo estado) {
		throw new UnsupportedOperationException();
	}
}
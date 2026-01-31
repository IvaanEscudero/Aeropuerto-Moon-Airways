package modelo;
import controlador.Usuario;
import java.util.ArrayList;
import java.util.Date;

public class Pasajero {
	private String DNI;
	private String nombre;
	private String apellidos;
	private Date fechhhaNacimiento;
	public ArrayList<Billete> _billetes = new ArrayList<Billete>();
	public Reserva _reserva;

	public ArrayList<Pasajero> getPasajero(Object billete) {
		throw new UnsupportedOperationException();
	}
}
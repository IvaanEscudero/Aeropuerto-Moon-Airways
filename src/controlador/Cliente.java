package controlador;
import java.util.ArrayList;
import java.util.Date;
import modelo.MoonAirways;
import modelo.Reserva;

public class Cliente extends Usuario {
    public ArrayList<Reserva> reservas = new ArrayList<Reserva>();

    public Cliente(String user, String pass, MoonAirways moonAirways) {
        super(user, pass, moonAirways);
    }

    public void realizarCompra() {
            throw new UnsupportedOperationException();
    }

    public void anyadirPasajero(String dni,String nombre, String apellidos, Date fecha_nac) {
            throw new UnsupportedOperationException();
    }

    public void realizarPagoBilletes() {
            throw new UnsupportedOperationException();
    }

    public void seleccionVuelo(Object parameter, Object parameter2, Object parameter3) {
            throw new UnsupportedOperationException();
    }
}
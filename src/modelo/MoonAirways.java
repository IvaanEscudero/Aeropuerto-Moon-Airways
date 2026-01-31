package modelo;
import controlador.Cliente;
import controlador.Empleado;
import controlador.Supervisor;
import controlador.Usuario;
import java.util.ArrayList;
import java.util.Date;

public class MoonAirways {

    public MoonAirways() {
    }
    public ArrayList<Aeropuerto> _aeropuertos = new ArrayList<Aeropuerto>();
    public ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

    //public Xstream xstream;
    public ArrayList<Avion> aviones = new ArrayList<Avion>();
    public ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

    public Usuario login(String user, String pass) {
        Usuario usuario = null, usuarioEncontrado = null;
        String encontrado = "FALSE";
        int i = 0;

        while (i < usuarios.size() && encontrado.equals("FALSE")) {
            usuario = usuarios.get(i);
            encontrado = usuario.validarUsuario(user, pass);
            i++;
            System.out.println(usuario.toString());
        }
        if (encontrado.equals("ENCONTRADO")) {
            usuarioEncontrado = usuario;
        }
        return usuarioEncontrado;
    }

    public Cliente creaCliente(){
        Cliente clientnuevo = new Cliente("Cliente", "", this);
        usuarios.add(clientnuevo);
        return clientnuevo;
    }
    public void salir() {
            throw new UnsupportedOperationException();
    }

    public void iniciar() {
            throw new UnsupportedOperationException();
    }

    public void entrar() {
            throw new UnsupportedOperationException();
    }
    
    public void cargarDatos() throws Exception {
        // Provincias

        //Usuarioss
        Cliente cliente = new Cliente("cliente", "", this);
        Empleado empleado = new Empleado("empleado", "empleado", this);
        Supervisor supervisor = new Supervisor("supervisor", "supervisor", this);
        usuarios.add(cliente);
        usuarios.add(empleado);
        usuarios.add(supervisor);
        // Vuelos
        
        // Aeropuertos
       
    }
}
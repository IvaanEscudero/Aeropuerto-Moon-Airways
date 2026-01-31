package controlador;
import modelo.MoonAirways;

public class Usuario {
	public MoonAirways moonAirways;
        public String user;
        public String pass;
        Usuario(MoonAirways moonAirways){
            this.moonAirways = moonAirways;
        }
        Usuario(String user, String pass, MoonAirways moonAirways) {
            this.user = user;
            this.pass = pass;
            this.moonAirways = moonAirways;
        }
        
        public Usuario login(String user, String pass) {
            return moonAirways.login(user, pass);
        }
        
        public Cliente crearCliente() {
            return moonAirways.creaCliente();
        }
        
	public String validarUsuario(String user, String pass) {
            String resultado = "FALSE";
            
            if (user.equals(this.user) && pass.equals(this.pass))
                resultado = "ENCONTRADO";
            else if (user.equals(this.user))
                resultado = "ERROR";
            
            return resultado;
	}
        @Override
        public String toString(){
            return ("User: " + user + "Pass: " + pass);
        }
        
}
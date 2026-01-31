package Vista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author djvec
 */ 

public class Controlador {
    private Login login;
    private MenuPrincipalSupervisor supervisor;
    private SeleccionVuelo2 selvuelosup;
    private MenuPersonalTierra menpertierra;
    private EmbarcarVuelo embvuelo;
    private EmbarcarPasajero embpasajero;
    private DarAltaTrayecto altatrayec;
    private DarBajaTrayecto bajatrayec;
    private DarAltaVuelo altavuelo;
    private SelecionOrigDestCliente filtvuelo;
    private SeleccionVuelo selvuelo;
    private AnadirViajero listviaj;
    private DatosViajero addviaj;
    private Paypal paypal;
    public Controlador()
    {/*
        this.login = new Login();
        this.supervisor = new MenuPrincipalSupervisor();
        this.selvuelosup = new SeleccionVuelo2();
        this.menpertierra = new MenuPersonalTierra();
        this.embvuelo = new EmbarcarVuelo();
        this.embpasajero = new EmbarcarPasajero();
        this.altatrayec = new DarAltaTrayecto();
        this.bajatrayec = new DarBajaTrayecto();
        this.altavuelo = new DarAltaVuelo();
        this.filtvuelo = new SelecionOrigDestCliente();
        this.selvuelo = new SeleccionVuelo();
        this.listviaj = new AnadirViajero();
        this.addviaj = new DatosViajero();
        this.paypal = new Paypal();
        login.setVisible(true);
        ButtonControllerActionListener controler_Buttons = new ButtonControllerActionListener();
        this.login.addListener(controler_Buttons);
        this.supervisor.addListener(controler_Buttons);
        this.selvuelosup.addListener(controler_Buttons);
        this.menpertierra.addListener(controler_Buttons);
        this.embvuelo.addListener(controler_Buttons);
        this.embpasajero.addListener(controler_Buttons);
        this.altatrayec.addListener(controler_Buttons);
        this.bajatrayec.addListener(controler_Buttons);
        this.altavuelo.addListener(controler_Buttons);
        this.filtvuelo.addListener(controler_Buttons);
        this.selvuelo.addListener(controler_Buttons);
        this.listviaj.addListener(controler_Buttons);
        this.addviaj.addListener(controler_Buttons);
        this.paypal.addListener(controler_Buttons);*/
    }
    /**
     * Clase que maneja todos los botones del programa
     */
    class ButtonControllerActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            String command = ae.getActionCommand();
            //En funcion del action command llamaremos a un metodo u otro
            switch (command) {
                case "LOGIN":
                    login.setVisible(false);
                    supervisor.setVisible(true);
                    break;
                case "Dar de alta un trayecto":
                    supervisor.setVisible(false);
                    altatrayec.setVisible(true);
                    break;
                case "Dar de baja un trayecto":
                    supervisor.setVisible(false);
                    bajatrayec.setVisible(true);
                    break;
                case "Dar vuelo de alta":
                    supervisor.setVisible(false);
                    altavuelo.setVisible(true);
                    break;
                case "Buscar vuelo":
                    supervisor.setVisible(false);
                    selvuelosup.setVisible(true);
                    break;
                case "MODIFICAR":
                    selvuelosup.setVisible(false);
                    menpertierra.setVisible(true);
                    break;
                case "EMBARCAR PASAJEROS":
                    menpertierra.setVisible(false);
                    embvuelo.setVisible(true);
                    break;
                case "CONFIRMAR":
                    embvuelo.setVisible(false);
                    embpasajero.setVisible(true);
                    break;
                case "EMBARCAR PASAJERO":
                    embpasajero.add();
                    break;
                case "FINALIZAR":
                    embpasajero.setVisible(false);
                    supervisor.setVisible(true);
                    break;
                case "CONFIRMARAT":
                    altatrayec.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Trayecto Creado");
                    supervisor.setVisible(true);
                    break;
                case "CONFIRMARBT":
                    bajatrayec.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Trayecto Eliminado");
                    supervisor.setVisible(true);
                    break;
                case "CONFIRMARAV":
                    altavuelo.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Vuelo Creado");
                    supervisor.setVisible(true);
                    break;
                case "VOLVERSUP":
                    supervisor.setVisible(false);
                    login.reset();
                    login.setVisible(true);
                    break;
                case "USUARIO":
                    login.setVisible(false);
                    filtvuelo.setVisible(true);
                    break;
                case "BUSCAR":
                    filtvuelo.setVisible(false);
                    selvuelo.setVisible(true);
                    break;
                case "RESERVAR":
                    selvuelo.setVisible(false);
                    listviaj.setVisible(true);
                    break;
                case "ANYADIR1":
                    listviaj.setVisible(false);
                    addviaj.setVisible(true);
                    break;
                case "ANYADIR":
                    listviaj.add();
                    addviaj.setVisible(false);
                    listviaj.setVisible(true);
                    break;
                case "PAGAR":
                    paypal.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Pago Realizado ID: 7823828283 TICKETS: moonairways/tck/dd37nd34k3ls");
                    filtvuelo.setVisible(true);
                    break;
                case "FINALIZAR1":
                    listviaj.setVisible(false);
                    paypal.setVisible(true);
                    break;
                case "VOLVERfin":
                    filtvuelo.setVisible(false);
                    login.reset();
                    login.setVisible(true);
                    break;
            }
        }
    }
}

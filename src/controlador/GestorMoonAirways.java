/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.Locale;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import modelo.MoonAirways;

/*
import modelo.TicketCine;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import modelo.EstadoPase;*/

public class GestorMoonAirways {

    private MoonAirways moonAirways;
    //private XStream xstream = null;
    public static final SimpleDateFormat FORMAT_DATE = new SimpleDateFormat("dd-MM-yyyy");
    public static final SimpleDateFormat FORMAT_HORA = new SimpleDateFormat("HH:mm", new Locale("es", "ES"));
    public static final SimpleDateFormat FORMAT_DATE_HORA = new SimpleDateFormat("EEEE dd 'de' MMMM HH:mm", new Locale("es", "ES"));
    
    public GestorMoonAirways() throws Exception{
        //xstream = new XStream(new DomDriver());
        //xstream.omitField(EstadoPase.class, "timer");
        
        moonAirways = new MoonAirways();
        moonAirways.cargarDatos();
        
    }
    
    public Usuario iniciar() {
        return new Usuario(this.moonAirways);
    }
    /*
     public void salir() {
         guardarXML();
     }
    
    private void guardarXML() {
        String xml = xstream.toXML(ticketCine);
        try {
            FileWriter file_output_xml = new FileWriter(new File("src/TicketCine.xml"));
            file_output_xml.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
            file_output_xml.write(xml);
            file_output_xml.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */
}

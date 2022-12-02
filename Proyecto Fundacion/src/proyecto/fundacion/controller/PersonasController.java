package Proyecto_fundacion.controller;

import Proyecto_fundacion.dao.PersonaDAO;
import Proyecto_fundacion.models.Personas;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PersonasController {
    
    //Creo la constante para conocer los errores
    private static final Logger console = Logger.getLogger(PersonasController.class.getName());

    //Llamo al DAO
    PersonaDAO pdao = new PersonaDAO();

    //Creo el metodo para registrar
    public boolean registrar(Personas persona) {

        //aqui recibo la respuesta del DAO si es true o false, no es la misma respuesta del view
        boolean respuesta = pdao.Store(persona);

        if (respuesta) {

            console.log(Level.INFO, "Se guardo el dato: {0}\n", persona);
//            System.out.println("Se guardo el dato -Controller "
//                    + persona.getPerNombres() + " " + persona.getPerApellidos());
        } else {
            
            console.log(Level.SEVERE, "Error al procesar la peticion:{0}\n", persona);
//            System.out.println("Error al ejecutar la peticion -Controller "
//                    + persona.getPerNombres() + " " + persona.getPerApellidos());
        }
        return respuesta;
    }

    public boolean modificar(Personas persona) {
        
        //aqui recibo la respuesta del DAO si es true o false, no es la misma respuesta del view
        boolean respuesta = pdao.Modify(persona);

        if (respuesta) {

            console.log(Level.INFO, "Se Modifico el dato: {0}\n", persona);
//            System.out.println("Se guardo el dato -Controller "
//                    + persona.getPerNombres() + " " + persona.getPerApellidos());
        } else {
            
            console.log(Level.SEVERE, "Error al procesar la peticion:{0}\n", persona);
//            System.out.println("Error al ejecutar la peticion -Controller "
//                    + persona.getPerNombres() + " " + persona.getPerApellidos());
        }
        return respuesta;
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

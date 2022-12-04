package proyecto.fundacion.controller;

import proyecto.fundacion.dao.PersonaDAO;
import proyecto.fundacion.models.Personas;
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

        } else {
            
            console.log(Level.SEVERE, "Error al procesar la peticion:{0}\n", persona);

        }
        return respuesta;
        
    }
    
    //El parametro es lo que va a recibir por parte de la vista
    public boolean eliminar(String id) {
        
        boolean respuesta = pdao.Delete(id); //es boolean por que del dao llega algo boolean
        
        if(respuesta) {
            
            console.log(Level.INFO, "Se elimino el registro con id: {0}\n", id);
        } else {   
            
            console.log(Level.SEVERE, "Error al procesar la peticion delete:{0}\n", id);
        }
        
        return respuesta;
    }
    
}


package Proyecto_fundacion.controller;

import Proyecto_fundacion.models.Estudiantes;
import Proyecto_fundacion.dao.EstudianteDAO;
import java.util.*;
import java.util.logging.Logger;

public class EstudiantesController {
    
    private static final Logger console = Logger.getLogger(EstudiantesController.class.getName());
    
    EstudianteDAO edao = new EstudianteDAO();
    
    public boolean registrar_est(Estudiantes estudiante) {
        
        //boolean respuesta = edao.Store_est(estudiante, llave_primaria_personas) {
        
    //}
    return true;
    }

}

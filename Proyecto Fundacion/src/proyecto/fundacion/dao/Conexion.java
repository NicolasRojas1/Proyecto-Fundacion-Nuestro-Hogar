package proyecto.fundacion.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    Connection conn = null;
    
    //Creo la constante para conocer los errores
    private static final Logger console = Logger.getLogger(Conexion.class.getName());
    private final String url = "jdbc:mysql://localhost:3306/fundacion_nh";
    private final String user = "root";
    private final String password = "";

    public Connection getConnection() {
        
        console.info("Obteniendo la conexion... \n");
        //System.out.println("----------- Iniciando Conexion -----------");

        try {

            conn = DriverManager.getConnection(url, user, password);
            console.info("Conexion exitosa");

        } catch (SQLException e) {

            //System.out.println(e.getMessage());//Para ver el mensaje
            console.log(Level.SEVERE, "{0}\n", e.getMessage());
        }

        return conn; //Si se conecta, pues retornará la conexion y ya no sera nula
    }

}

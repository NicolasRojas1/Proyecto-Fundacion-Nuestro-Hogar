package proyecto.fundacion.dao;

import proyecto.fundacion.models.Personas;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PersonaDAO {
    
    
    //Creo la constante para conocer los errores
    private static final Logger console = Logger.getLogger(PersonaDAO.class.getName());
    
    public boolean Delete (String id) {
        
        Connection con = new Conexion().getConnection();
        PreparedStatement ps = null; 
        ResultSet rs = null;
        
        String sql = "DELETE FROM personas WHERE PerNumerodeDocumento = ?";
        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, id); //envio la posicion y el parametro a usar
            ps.execute();
            return true;
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            
            try { 
                ps.close();
                console.info("Se cerró la conexion \n");
                
            } catch (SQLException ex) {
                
                console.log(Level.SEVERE, ex.getMessage());
            }
        }    
    }
    
    public boolean Modify(Personas personas){
        int llave_foranea = 0;
        Connection con = new Conexion().getConnection();
        PreparedStatement ps = null; //se inicializa en nulo, es el que prepara la consulta
        ResultSet rs = null; //nula por que aun no se usa, es el que obtiene el resultado
        String sql = "UPDATE  personas set "
                + "PerTipodeDocumento = ?,"
                + "PerNumerodeDocumento = ?,"
                + "PerLugardeExpedicion = ?,"
                + "PerNombres = ?,"
                + "PerApellidos = ?,"
                + "PerFotografia = ?,"
                + "PerFechadeNacimiento = ?,"
                + "PerEdad = ?,"
                + "PerCiudadNacimiento = ?,"
                + "PerDomicilio = ?,"
                + "PerBarrio = ?,"
                + "PerLocalidad = ?,"
                + "PerEstrato = ?,"
                + "PerEps = ?,"
                + "PerSisben = ?,"
                + "PerSisbenCategoria = ? "
                + "WHERE PerId = ?";        
        try {
            llave_foranea = Search_persona(personas.getPerNumerodeDocumento()); 
            ps = con.prepareStatement(sql);
            ps.setString(1, personas.getPerTipodeDocumento());
            ps.setString(2, personas.getPerNumerodeDocumento());
            ps.setString(3, personas.getPerLugardeExpedicion());
            ps.setString(4, personas.getPerNombres());
            ps.setString(5, personas.getPerApellidos());
            ps.setString(6, personas.getPerFotografia());
            ps.setString(7, personas.getPerFechadeNacimiento());
            ps.setString(8, personas.getPerEdad());
            ps.setString(9, personas.getPerCiudadNacimiento());
            ps.setString(10, personas.getPerDomicilio());
            ps.setString(11, personas.getPerBarrio());
            ps.setString(12, personas.getPerLocalidad());
            ps.setString(13, personas.getPerEstrato());
            ps.setString(14, personas.getPerEps()); 
            ps.setBoolean(15, personas.isPerSisben());
            ps.setString(16, personas.getPerSisbenCategoria());
            ps.setString(17, Integer.toString(llave_foranea));
            ps.executeUpdate();
            
                       
            return true; //Esta es la respuesta que se le envia al controlador
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, Integer.toString(llave_foranea), "ERROR", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, "si esta tomando el modificar", "ERROR", JOptionPane.ERROR_MESSAGE);
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false; //Esta es la respuesta que se le envia al controlador
        } finally {
            
            try {
                ps.close();
                console.info("Se cerró la conexion \n");
                //System.out.println("Se cerró la conexión");
            } catch (SQLException ex) {
                console.log(Level.SEVERE, "{0}\n", ex.getMessage());
                //System.out.println("No se logró cerrar la conexión");
            }
        }   
    }
    public boolean Store(Personas personas){
        Connection con = new Conexion().getConnection();
        PreparedStatement ps = null; //se inicializa en nulo, es el que prepara la consulta
        ResultSet rs = null; //nula por que aun no se usa, es el que obtiene el resultado
        String sql = "INSERT INTO personas ("
                + "PerTipodeDocumento,"
                + "PerNumerodeDocumento,"
                + "PerLugardeExpedicion,"
                + "PerNombres,"
                + "PerApellidos,"
                + "PerFotografia,"
                + "PerFechadeNacimiento,"
                + "PerEdad,"
                + "PerCiudadNacimiento,"
                + "PerDomicilio,"
                + "PerBarrio,"
                + "PerLocalidad,"
                + "PerEstrato,"
                + "PerEps,"
                + "PerSisben,"
                + "PerSisbenCategoria) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";        
        try {
            
            ps = con.prepareStatement(sql);
            ps.setString(1, personas.getPerTipodeDocumento());
            ps.setString(2, personas.getPerNumerodeDocumento());
            ps.setString(3, personas.getPerLugardeExpedicion());
            ps.setString(4, personas.getPerNombres());
            ps.setString(5, personas.getPerApellidos());
            ps.setString(6, personas.getPerFotografia());
            ps.setString(7, personas.getPerFechadeNacimiento());
            ps.setString(8, personas.getPerEdad());
            ps.setString(9, personas.getPerCiudadNacimiento());
            ps.setString(10, personas.getPerDomicilio());
            ps.setString(11, personas.getPerBarrio());
            ps.setString(12, personas.getPerLocalidad());
            ps.setString(13, personas.getPerEstrato());
            ps.setString(14, personas.getPerEps()); 
            ps.setBoolean(15, personas.isPerSisben());
            ps.setString(16, personas.getPerSisbenCategoria());
            ps.execute();
            
            int llave_foranea = Search_persona(personas.getPerNumerodeDocumento());            
            return true; //Esta es la respuesta que se le envia al controlador
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false; //Esta es la respuesta que se le envia al controlador
        } finally {
            
            try {
                ps.close();
                console.info("Se cerró la conexion \n");
                //System.out.println("Se cerró la conexión");
            } catch (SQLException ex) {
                console.log(Level.SEVERE, "{0}\n", ex.getMessage());
                //System.out.println("No se logró cerrar la conexión");
            }
        }   
    }
    //Busco la persona por medio del numero de documento y obtengo la llave primaria de esta
    public int Search_persona(String n_documento) {
        Connection con = new Conexion().getConnection();
        PreparedStatement ps = null; //se inicializa en nulo, es el que prepara la consulta
        ResultSet rs = null; //nula por que aun no se usa, es el que obtiene el resultado
        int llave_primaria_pesonas = 0;
        try {
            String sql_persona = "SELECT * FROM personas WHERE PerNumerodeDocumento = ?";
            ps = con.prepareStatement(sql_persona); //preparo la consulta
            ps.setString(1, n_documento); //Aqui busco el PerId con el numero de documento que introduzco
            rs = ps.executeQuery();
            while(rs.next()){ //por que while
                System.out.println(rs.getInt(1));
                llave_primaria_pesonas = rs.getInt(1); //por que 1?
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(PersonaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        return llave_primaria_pesonas;
    }
    public List Listar() {

        List<Personas> listaPer = new ArrayList();
        String sql = "SELECT * FROM Personas";

        try {
        Connection con = new Conexion().getConnection();
        PreparedStatement ps = con.prepareStatement(sql); 
        ResultSet rs = ps.executeQuery();
            

            while (rs.next()) {

                Personas Per = new Personas();
                Per.setPerId(rs.getInt(1));
                Per.setPerNombres(rs.getString(5));
                Per.setPerApellidos(rs.getString(6));
                Per.setPerTipodeDocumento(rs.getString(2));
                Per.setPerNumerodeDocumento(rs.getString(3));
                Per.setPerEdad(rs.getString(9));
                
                listaPer.add(Per);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listaPer;

        }
    public Personas BuscarPersonas(String PerNombres) {

        Personas per = new Personas();

        String sql = "SELECT * FROM personas WHERE PerNombres=?";

        try {
        Connection conn = new Conexion().getConnection();
        PreparedStatement ps = conn.prepareStatement(sql); 
        ps.setString(1, PerNombres);
        ResultSet rs = ps.executeQuery();

            if (rs.next()) {

               Personas Per = new Personas();
                Per.setPerId(rs.getInt(1));
                Per.setPerNombres(rs.getString(5));
                Per.setPerApellidos(rs.getString(6));
                Per.setPerTipodeDocumento(rs.getString(2));
                Per.setPerNumerodeDocumento(rs.getString(3));
                Per.setPerEdad(rs.getString(9));

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return per;

    }


}

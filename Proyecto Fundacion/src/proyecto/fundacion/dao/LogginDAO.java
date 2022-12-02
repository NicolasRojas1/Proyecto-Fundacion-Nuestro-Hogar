
package Proyecto_fundacion.dao;
import Proyecto_fundacion.models.Usuarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class LogginDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    Usuarios u = new Usuarios();

    public Usuarios ingresar(String UsuUsuario, String UsuPassword) {

        String sql = "SELECT * FROM Usuarios WHERE UsuUsuarios=? AND UsuPassword=?";
        try{
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, UsuUsuario);
            ps.setString(2, UsuPassword);
            rs = ps.executeQuery();
            if (rs.next()) {
                u.setUsuId(rs.getInt("UsuId"));
                 u.setRolId(rs.getInt("RolId"));
                  u.setUsuUsuario(rs.getString("UsuUsuario"));
                   u.setUsuPassword(rs.getString("UsuPassword"));
        }
        

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return u;
    
}
    //Se puede implementar luego
    
 public boolean Registrar(Usuarios reg) {

        try {

            String sql = "INSERT INTO Usuarios (UsuId, RolId, UsuUsuario,UsuPassword, ) VALUES (?,?,?,?)";
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, reg.getUsuId());
             ps.setInt(2, reg.getRolId());
              ps.setString(3, reg.getUsuUsuario());
               ps.setString(4, reg.getUsuPassword());
            
            ps.execute();

            return true;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    public List listar() {

        List<Usuarios> listav = new ArrayList();
        String sql = "SELECT * FROM Usuarios";

        try {

            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {

                Usuarios us = new Usuarios();
                us.setUsuId(rs.getInt(1));
                us.setRolId(rs.getInt(2));
                us.setUsuUsuario(rs.getString(3));
                us.setUsuPassword(rs.getString(4));
                
                listav.add(us);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        return listav;

    }

    public boolean actualizar(Usuarios lg) {

        String sql = "UPDATE Usuarios SET UsuUsuario=?, RolId=?, UsuPassword=? WHERE UsuId=?";

        try {
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setString(1, lg.getUsuUsuario());
            ps.setInt(2, lg.getRolId());
             ps.setString(3, lg.getUsuPassword());
              ps.setInt(4, lg.getUsuId());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public boolean eliminar(int UsuId) {

        try {
            String sql = "DELETE FROM Usuario WHERE UsuId=?";
            conn = cn.getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1,UsuId);
            ps.execute();
            return true;
        } catch (SQLException ex) {
            return false;
        } finally {
            try {
                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    
}

package Proyecto_fundacion.dao;

import Proyecto_fundacion.models.Estudiantes;
import java.sql.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class EstudianteDAO {

    private static final Logger console = Logger.getLogger(EstudianteDAO.class.getName());

    Connection con = new Conexion().getConnection();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public boolean Store_est(Estudiantes est, int llave_primaria_personas) {

        String sql = "INSERT INTO estudiantes ("
                + "EstCodigo,"
                + "EstFechadeInscripcion,"
                + "EstFase,"
                + "EstPrograma,"
                + "EstJornadaFundacion,"
                + "EstSexo,"
                + "EstPeso,"
                + "EstEstatura,"
                + "EstTipoSangre,"
                + "EstTalladeRopa,"
                + "EstTalladeZapatos,"
                + "EstEstudia,"
                + "EstGrado,"
                + "EstInstitucion,"
                + "EstJornadaColegio,"
                + "EstNumPersonasConvive,"
                + "EstConviveconPadre,"
                + "EstConviveconMadre,"
                + "EstConviveconOtro,"
                + "EstDiscapacidad,"
                + "EstNomDiscapacidad,"
                + "EstAlergiaAlimento,"
                + "EstNomAlimento,"
                + "EstAlergiaMedicamento,"
                + "EstNomAlergiaMedicamento,"
                + "EstTomaMedicamento,"
                + "EstNomMedicamento,"
                + "EstComidaFavorita,"
                + "EstColorFavorito,"
                + "EstActividadFavorita,"
                + "EstPersonajeFavorito,"
                + "EstDocdeAutorizacion,"
                + "EstDocdeCompromiso) "
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?"
                + ",?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        try {

            ps = con.prepareStatement(sql);
            ps.setInt(1, llave_primaria_personas);
            ps.setString(2, est.getEstCodigo());
            ps.setString(3, est.getEstFechadeInscripcion());
            ps.setString(4, est.getEstFase());
            ps.setString(5, est.getEstPrograma());
            ps.setString(6, est.getEstJornadaFundacion());
            ps.setString(7, est.getEstSexo());
            ps.setString(8, est.getEstPeso());
            ps.setString(9, est.getEstEstatura());
            ps.setString(10, est.getEstTipodeSangre()); //*
            ps.setString(11, est.getEstTalladeRopa());
            ps.setString(12, est.getEstTalladeZapatos());
            ps.setBoolean(13, est.isEstEstudia());
            ps.setString(14, est.getEstGrado());
            ps.setString(15, est.getEstInstitucion());
            ps.setString(16, est.getEstJornadadeColegio());
            ps.setInt(17, est.getEstNumPersonasConvive());
            ps.setBoolean(18, est.isEstConviveconPadre());
            ps.setBoolean(19, est.isEstConviveconMadre());
            ps.setBoolean(20, est.isEstConviveconOtro());
            ps.setBoolean(21, est.isEstTieneDiscapacidad());
            ps.setString(22, est.getEstNombreDiscapacidad());
            ps.setBoolean(23, est.isEstAlergiaAlimento());
            ps.setString(24, est.getEstNombreAlimento());
            ps.setBoolean(25, est.isEstAlergiaMedicamento());
            ps.setString(26, est.getEstNombreAlerMedicamento());
            ps.setBoolean(27, est.isEstTomaMedicamento());
            ps.setString(28, est.getEstNombreMedicamento());
            ps.setString(29, est.getEstComidaFavorita());
            ps.setString(30, est.getEstColorFavorito());
            ps.setString(31, est.getEstActividadFavorita());
            ps.setString(32, est.getEstPersonajeFavorito());
            ps.setString(33, est.getEstDocdeAutorizacion());
            ps.setString(34, est.getEstDocdeCompromiso());

            return true;

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
            return false;
        } finally {

            try {
                ps.close();
                console.info("Se cerró la conexion \n");
            } catch (SQLException ex) {
                console.log(Level.SEVERE, "{0}\n", ex.getMessage());
            }

        }
    }
}

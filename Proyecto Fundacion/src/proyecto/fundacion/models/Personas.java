
package proyecto.fundacion.models;

import java.util.Date;

public class Personas {
    
    private int PerId;
    private String PerTipodeDocumento;
    private String PerNumerodeDocumento;
    private String PerLugardeExpedicion;
    private String PerNombres;
    private String PerApellidos;
    private String PerFotografia;
    private String PerFechadeNacimiento; //se importa java.util.date
    private String PerEdad; 
    private String PerCiudadNacimiento;
    private String PerDomicilio;
    private String PerBarrio;
    private String PerLocalidad;
    private String PerEstrato;
    private String PerEps;
    private boolean PerSisben;
    private String PerSisbenCategoria;

    public Personas() {
    }

    public int getPerId() {
        return PerId;
    }

    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    public String getPerTipodeDocumento() {
        return PerTipodeDocumento;
    }

    public void setPerTipodeDocumento(String PerTipodeDocumento) {
        this.PerTipodeDocumento = PerTipodeDocumento;
    }

    public String getPerNumerodeDocumento() {
        return PerNumerodeDocumento;
    }

    public void setPerNumerodeDocumento(String PerNumerodeDocumento) {
        this.PerNumerodeDocumento = PerNumerodeDocumento;
    }

    public String getPerLugardeExpedicion() {
        return PerLugardeExpedicion;
    }

    public void setPerLugardeExpedicion(String PerLugardeExpedicion) {
        this.PerLugardeExpedicion = PerLugardeExpedicion;
    }

    public String getPerNombres() {
        return PerNombres;
    }

    public void setPerNombres(String PerNombres) {
        this.PerNombres = PerNombres;
    }

    public String getPerApellidos() {
        return PerApellidos;
    }

    public void setPerApellidos(String PerApellidos) {
        this.PerApellidos = PerApellidos;
    }

    public String getPerFotografia() {
        return PerFotografia;
    }

    public void setPerFotografia(String PerFotografia) {
        this.PerFotografia = PerFotografia;
    }

    public String getPerFechadeNacimiento() {
        return PerFechadeNacimiento;
    }

    public void setPerFechadeNacimiento(String PerFechadeNacimiento) {
        this.PerFechadeNacimiento = PerFechadeNacimiento;
    }

    public String getPerEdad() {
        return PerEdad;
    }

    public void setPerEdad(String PerEdad) {
        this.PerEdad = PerEdad;
    }

    public String getPerCiudadNacimiento() {
        return PerCiudadNacimiento;
    }

    public void setPerCiudadNacimiento(String PerCiudadNacimiento) {
        this.PerCiudadNacimiento = PerCiudadNacimiento;
    }

    public String getPerDomicilio() {
        return PerDomicilio;
    }

    public void setPerDomicilio(String PerDomicilio) {
        this.PerDomicilio = PerDomicilio;
    }

    public String getPerBarrio() {
        return PerBarrio;
    }

    public void setPerBarrio(String PerBarrio) {
        this.PerBarrio = PerBarrio;
    }

    public String getPerLocalidad() {
        return PerLocalidad;
    }

    public void setPerLocalidad(String PerLocalidad) {
        this.PerLocalidad = PerLocalidad;
    }

    public String getPerEstrato() {
        return PerEstrato;
    }

    public void setPerEstrato(String PerEstrato) {
        this.PerEstrato = PerEstrato;
    }

    public String getPerEps() {
        return PerEps;
    }

    public void setPerEps(String PerEps) {
        this.PerEps = PerEps;
    }

    public boolean isPerSisben() {
        return PerSisben;
    }

    public void setPerSisben(boolean PerSisben) {
        this.PerSisben = PerSisben;
    }

    public String getPerSisbenCategoria() {
        return PerSisbenCategoria;
    }

    public void setPerSisbenCategoria(String PerSisbenCategoria) {
        this.PerSisbenCategoria = PerSisbenCategoria;
    }

    @Override
    public String toString() {
        return "Personas{" + "PerId=" + PerId + ", PerTipodeDocumento=" + PerTipodeDocumento 
                + ", PerNumerodeDocumento=" + PerNumerodeDocumento + ", PerLugardeExpedicion=" 
                + PerLugardeExpedicion + ", PerNombres=" + PerNombres + ", PerApellidos=" + PerApellidos 
                + ", PerFotografia=" + PerFotografia + ", PerFechadeNacimiento=" + PerFechadeNacimiento 
                + ", PerEdad=" + PerEdad + ", PerCiudadNacimiento=" + PerCiudadNacimiento + ", PerDomicilio=" 
                + PerDomicilio + ", PerBarrio=" + PerBarrio + ", PerLocalidad=" + PerLocalidad + ", PerEstrato=" 
                + PerEstrato + ", PerEps=" + PerEps + ", PerSisben=" + PerSisben + ", PerSisbenCategoria=" 
                + PerSisbenCategoria + '}';
    }  

    public Object getValueAt(int fila, int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getSelectedRow() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


package Proyecto_fundacion.models;

public class Madres {
    
    private int     MadId;
    private int     EstId;
    private int     PerId;
    private String  MadTelFijo;
    private String  MadTelCelular;
    private String  MadNivelEducacion;
    private String  MadOcupacion;

    public Madres() {
    }

    public int getMadId() {
        return MadId;
    }

    public void setMadId(int MadId) {
        this.MadId = MadId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public int getPerId() {
        return PerId;
    }

    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    public String getMadTelFijo() {
        return MadTelFijo;
    }

    public void setMadTelFijo(String MadTelFijo) {
        this.MadTelFijo = MadTelFijo;
    }

    public String getMadTelCelular() {
        return MadTelCelular;
    }

    public void setMadTelCelular(String MadTelCelular) {
        this.MadTelCelular = MadTelCelular;
    }

    public String getMadNivelEducacion() {
        return MadNivelEducacion;
    }

    public void setMadNivelEducacion(String MadNivelEducacion) {
        this.MadNivelEducacion = MadNivelEducacion;
    }

    public String getMadOcupacion() {
        return MadOcupacion;
    }

    public void setMadOcupacion(String MadOcupacion) {
        this.MadOcupacion = MadOcupacion;
    }

    @Override
    public String toString() {
        return "Madres{" + "Id=" + MadId + ", EstId=" + EstId + 
                ", PerId=" + PerId + ", TelFijo=" + MadTelFijo + 
                ", TelCelular=" + MadTelCelular + 
                ", NivelEducacion=" + MadNivelEducacion + 
                ", Ocupacion=" + MadOcupacion + '}';
    }
        
}


package proyecto.fundacion.models;

public class Padres {
    
    private int     PadId;
    private int     EstId;
    private int     PerId;
    private String  PadTelFijo;
    private String  PadTelCelular;
    private String  PadNivelEducacion;
    private String  PadOcupacion;

    public Padres() {
    }

    public int getPadId() {
        return PadId;
    }

    public void setPadId(int PadId) {
        this.PadId = PadId;
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

    public String getPadTelFijo() {
        return PadTelFijo;
    }

    public void setPadTelFijo(String PadTelFijo) {
        this.PadTelFijo = PadTelFijo;
    }

    public String getPadTelCelular() {
        return PadTelCelular;
    }

    public void setPadTelCelular(String PadTelCelular) {
        this.PadTelCelular = PadTelCelular;
    }

    public String getPadNivelEducacion() {
        return PadNivelEducacion;
    }

    public void setPadNivelEducacion(String PadNivelEducacion) {
        this.PadNivelEducacion = PadNivelEducacion;
    }

    public String getPadOcupacion() {
        return PadOcupacion;
    }

    public void setPadOcupacion(String PadOcupacion) {
        this.PadOcupacion = PadOcupacion;
    }

    @Override
    public String toString() {
        return "Padres{" + "Id=" + PadId + ", EstId=" + EstId + 
                ", PerId=" + PerId + ", TelFijo=" + PadTelFijo + 
                ", TelCelular=" + PadTelCelular + 
                ", NivelEducacion=" + PadNivelEducacion + 
                ", Ocupacion=" + PadOcupacion + '}';
    }
    
    
}

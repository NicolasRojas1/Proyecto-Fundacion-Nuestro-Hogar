
package Proyecto_fundacion.models;

/**
 *
 * @author USUARIO
 */
public class Acudientes {
    
    private int     AcuId;
    private int     EstId;
    private int     PerId;
    private String  AcuTelFijo;
    private String  AcuTelCelular;
    private String  AcuNivelEducacion;
    private String  AcuOcupacion; 

    /**
     *
     */
    public Acudientes() {
    }

    /**
     *
     * @return
     */
    public int getAcuId() {
        return AcuId;
    }

    /**
     *
     * @param AcuId
     */
    public void setAcuId(int AcuId) {
        this.AcuId = AcuId;
    }

    /**
     *
     * @return
     */
    public int getEstId() {
        return EstId;
    }

    /**
     *
     * @param EstId
     */
    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    /**
     *
     * @return
     */
    public int getPerId() {
        return PerId;
    }

    /**
     *
     * @param PerId
     */
    public void setPerId(int PerId) {
        this.PerId = PerId;
    }

    /**
     *
     * @return
     */
    public String getAcuTelFijo() {
        return AcuTelFijo;
    }

    /**
     *
     * @param AcuTelFijo
     */
    public void setAcuTelFijo(String AcuTelFijo) {
        this.AcuTelFijo = AcuTelFijo;
    }

    /**
     *
     * @return
     */
    public String getAcuTelCelular() {
        return AcuTelCelular;
    }

    /**
     *
     * @param AcuTelCelular
     */
    public void setAcuTelCelular(String AcuTelCelular) {
        this.AcuTelCelular = AcuTelCelular;
    }

    /**
     *
     * @return
     */
    public String getAcuNivelEducacion() {
        return AcuNivelEducacion;
    }

    /**
     *
     * @param AcuNivelEducacion
     */
    public void setAcuNivelEducacion(String AcuNivelEducacion) {
        this.AcuNivelEducacion = AcuNivelEducacion;
    }

    /**
     *
     * @return
     */
    public String getAcuOcupacion() {
        return AcuOcupacion;
    }

    /**
     *
     * @param AcuOcupacion
     */
    public void setAcuOcupacion(String AcuOcupacion) {
        this.AcuOcupacion = AcuOcupacion;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Acudientes{" + "Id=" + AcuId + 
                ", EstId=" + EstId + ", PerId=" + PerId + 
                ", TelFijo=" + AcuTelFijo + 
                ", TelCelular=" + AcuTelCelular + 
                ", NivelEducacion=" + AcuNivelEducacion + 
                ", Ocupacion=" + AcuOcupacion + '}';
    }
      
}

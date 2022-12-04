
package proyecto.fundacion.models;

public class Otros {
    
    private int     OtroId;
    private int     EstId;
    private String  OtroNombres;
    private String  OtroApellidos;
    private String  OtroParentesco;

    public Otros() {
    }

    public int getOtroId() {
        return OtroId;
    }

    public void setOtroId(int OtroId) {
        this.OtroId = OtroId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public String getOtroNombres() {
        return OtroNombres;
    }

    public void setOtroNombres(String OtroNombres) {
        this.OtroNombres = OtroNombres;
    }

    public String getOtroApellidos() {
        return OtroApellidos;
    }

    public void setOtroApellidos(String OtroApellidos) {
        this.OtroApellidos = OtroApellidos;
    }

    public String getOtroParentesco() {
        return OtroParentesco;
    }

    public void setOtroParentesco(String OtroParentesco) {
        this.OtroParentesco = OtroParentesco;
    }

    @Override
    public String toString() {
        return "Otros{" + "OtroId=" + OtroId + ", EstId=" + EstId + 
                ", Nombres=" + OtroNombres + 
                ", Apellidos=" + OtroApellidos + 
                ", Parentesco=" + OtroParentesco + '}';
    }
        
}

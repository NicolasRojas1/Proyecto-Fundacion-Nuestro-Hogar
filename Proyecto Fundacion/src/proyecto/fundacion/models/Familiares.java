
package Proyecto_fundacion.models;

public class Familiares {
    
    private int     FamId;
    private int     EstId;
    private String  FamNombres;
    private String  FamApellidos;
    private String  FamEdad;
    private boolean FamEstudia;

    public Familiares() {
    }

    public int getFamId() {
        return FamId;
    }

    public void setFamId(int FamId) {
        this.FamId = FamId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public String getFamNombres() {
        return FamNombres;
    }

    public void setFamNombres(String FamNombres) {
        this.FamNombres = FamNombres;
    }

    public String getFamApellidos() {
        return FamApellidos;
    }

    public void setFamApellidos(String FamApellidos) {
        this.FamApellidos = FamApellidos;
    }

    public String getFamEdad() {
        return FamEdad;
    }

    public void setFamEdad(String FamEdad) {
        this.FamEdad = FamEdad;
    }

    public boolean isFamEstudia() {
        return FamEstudia;
    }

    public void setFamEstudia(boolean FamEstudia) {
        this.FamEstudia = FamEstudia;
    }

    @Override
    public String toString() {
        return "Familiares{" + "Id=" + FamId + 
                ", EstId=" + EstId + ", Nombres=" + FamNombres + 
                ", Apellidos=" + FamApellidos + 
                ", Edad=" + FamEdad + 
                ", Estudia=" + FamEstudia + '}';
    }
    
}

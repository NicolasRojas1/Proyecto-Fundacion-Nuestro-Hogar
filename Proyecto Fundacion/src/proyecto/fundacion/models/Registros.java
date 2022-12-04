package proyecto.fundacion.models;

public class Registros {
   
    private int     RegId;
    private int     EstId;
    private String  RegInasistencias;
    private String  RegObservaciones;
    private String  RegNotaTeatro;
    private String  RegNotaDanzas;
    private String  RegNotaMusica;
    private String  RegNotaEduComplementaria;
    private String  RegNotaAlmas;
    private String  RegNotaAlimento;

    public Registros() {
    }

    public int getRegId() {
        return RegId;
    }

    public void setRegId(int RegId) {
        this.RegId = RegId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public String getRegInasistencias() {
        return RegInasistencias;
    }

    public void setRegInasistencias(String RegInasistencias) {
        this.RegInasistencias = RegInasistencias;
    }

    public String getRegObservaciones() {
        return RegObservaciones;
    }

    public void setRegObservaciones(String RegObservaciones) {
        this.RegObservaciones = RegObservaciones;
    }

    public String getRegNotaTeatro() {
        return RegNotaTeatro;
    }

    public void setRegNotaTeatro(String RegNotaTeatro) {
        this.RegNotaTeatro = RegNotaTeatro;
    }

    public String getRegNotaDanzas() {
        return RegNotaDanzas;
    }

    public void setRegNotaDanzas(String RegNotaDanzas) {
        this.RegNotaDanzas = RegNotaDanzas;
    }

    public String getRegNotaMusica() {
        return RegNotaMusica;
    }

    public void setRegNotaMusica(String RegNotaMusica) {
        this.RegNotaMusica = RegNotaMusica;
    }

    public String getRegNotaEduComplementaria() {
        return RegNotaEduComplementaria;
    }

    public void setRegNotaEduComplementaria(String RegNotaEduComplementaria) {
        this.RegNotaEduComplementaria = RegNotaEduComplementaria;
    }

    public String getRegNotaAlmas() {
        return RegNotaAlmas;
    }

    public void setRegNotaAlmas(String RegNotaAlmas) {
        this.RegNotaAlmas = RegNotaAlmas;
    }

    public String getRegNotaAlimento() {
        return RegNotaAlimento;
    }

    public void setRegNotaAlimento(String RegNotaAlimento) {
        this.RegNotaAlimento = RegNotaAlimento;
    }

    @Override
    public String toString() {
        return "Registros{" + "RegId=" + RegId + ", EstId=" + EstId + ", RegInasistencias=" + RegInasistencias 
                + ", RegObservaciones=" + RegObservaciones + ", RegNotaTeatro=" + RegNotaTeatro + ", RegNotaDanzas=" 
                + RegNotaDanzas + ", RegNotaMusica=" + RegNotaMusica + ", RegNotaEduComplementaria=" + RegNotaEduComplementaria 
                + ", RegNotaAlmas=" + RegNotaAlmas + ", RegNotaAlimento=" + RegNotaAlimento + '}';
    }

    
 
}

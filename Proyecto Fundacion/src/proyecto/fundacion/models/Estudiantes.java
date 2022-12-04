
package proyecto.fundacion.models;

public class Estudiantes extends Personas{
    
    private int     EstId;
    private int     PerId;
    private String  EstCodigo;
    private String  EstFechadeInscripcion;
    private String  EstFase;
    private String  EstPrograma;
    private String  EstJornadaFundacion;
    private String  EstSexo;
    private String  EstPeso;
    private String  EstEstatura;
    private String  EstTipodeSangre;   
    private String  EstTalladeRopa;
    private String  EstTalladeZapatos;
    private boolean EstEstudia;
    private String  EstGrado; 
    private String  EstInstitucion;
    private String  EstJornadadeColegio;
    private int EstNumPersonasConvive;  
    private boolean EstConviveconPadre;
    private boolean EstConviveconMadre;
    private boolean EstConviveconOtro;
    private boolean EstTieneDiscapacidad;
    private String  EstNombreDiscapacidad;
    private boolean EstAlergiaAlimento;
    private String  EstNombreAlimento;
    private boolean EstAlergiaMedicamento;
    private String  EstNombreAlerMedicamento;
    private boolean EstTomaMedicamento;
    private String  EstNombreMedicamento;
    private String  EstComidaFavorita;
    private String  EstColorFavorito;
    private String  EstActividadFavorita;
    private String  EstPersonajeFavorito;
    private String  EstDocdeAutorizacion;
    private String  EstDocdeCompromiso;
     
    public Estudiantes() {
        super();
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

    public String getEstCodigo() {
        return EstCodigo;
    }

    public void setEstCodigo(String EstCodigo) {
        this.EstCodigo = EstCodigo;
    }

    public String getEstFechadeInscripcion() {
        return EstFechadeInscripcion;
    }

    public void setEstFechadeInscripcion(String EstFechadeInscripcion) {
        this.EstFechadeInscripcion = EstFechadeInscripcion;
    }

    public String getEstFase() {
        return EstFase;
    }

    public void setEstFase(String EstFase) {
        this.EstFase = EstFase;
    }

    public String getEstPrograma() {
        return EstPrograma;
    }

    public void setEstPrograma(String EstPrograma) {
        this.EstPrograma = EstPrograma;
    }

    public String getEstJornadaFundacion() {
        return EstJornadaFundacion;
    }

    public void setEstJornadaFundacion(String EstJornadaFundacion) {
        this.EstJornadaFundacion = EstJornadaFundacion;
    }

    public String getEstSexo() {
        return EstSexo;
    }

    public void setEstSexo(String EstSexo) {
        this.EstSexo = EstSexo;
    }

    public String getEstPeso() {
        return EstPeso;
    }

    public void setEstPeso(String EstPeso) {
        this.EstPeso = EstPeso;
    }

    public String getEstEstatura() {
        return EstEstatura;
    }

    public void setEstEstatura(String EstEstatura) {
        this.EstEstatura = EstEstatura;
    }

    public String getEstTipodeSangre() {
        return EstTipodeSangre;
    }

    public void setEstTipodeSangre(String EstTipodeSangre) {
        this.EstTipodeSangre = EstTipodeSangre;
    }

    public String getEstTalladeRopa() {
        return EstTalladeRopa;
    }

    public void setEstTalladeRopa(String EstTalladeRopa) {
        this.EstTalladeRopa = EstTalladeRopa;
    }

    public String getEstTalladeZapatos() {
        return EstTalladeZapatos;
    }

    public void setEstTalladeZapatos(String EstTalladeZapatos) {
        this.EstTalladeZapatos = EstTalladeZapatos;
    }

    public boolean isEstEstudia() {
        return EstEstudia;
    }

    public void setEstEstudia(boolean EstEstudia) {
        this.EstEstudia = EstEstudia;
    }

    public String getEstGrado() {
        return EstGrado;
    }

    public void setEstGrado(String EstGrado) {
        this.EstGrado = EstGrado;
    }

    public String getEstInstitucion() {
        return EstInstitucion;
    }

    public void setEstInstitucion(String EstInstitucion) {
        this.EstInstitucion = EstInstitucion;
    }

    public String getEstJornadadeColegio() {
        return EstJornadadeColegio;
    }

    public void setEstJornadadeColegio(String EstJornadadeColegio) {
        this.EstJornadadeColegio = EstJornadadeColegio;
    }

    public int getEstNumPersonasConvive() {
        return EstNumPersonasConvive;
    }

    public void setEstNumPersonasConvive(int EstNumPersonasConvive) {
        this.EstNumPersonasConvive = EstNumPersonasConvive;
    }

    public boolean isEstConviveconPadre() {
        return EstConviveconPadre;
    }

    public void setEstConviveconPadre(boolean EstConviveconPadre) {
        this.EstConviveconPadre = EstConviveconPadre;
    }

    public boolean isEstConviveconMadre() {
        return EstConviveconMadre;
    }

    public void setEstConviveconMadre(boolean EstConviveconMadre) {
        this.EstConviveconMadre = EstConviveconMadre;
    }

    public boolean isEstConviveconOtro() {
        return EstConviveconOtro;
    }

    public void setEstConviveconOtro(boolean EstConviveconOtro) {
        this.EstConviveconOtro = EstConviveconOtro;
    }

    public boolean isEstTieneDiscapacidad() {
        return EstTieneDiscapacidad;
    }

    public void setEstTieneDiscapacidad(boolean EstTieneDiscapacidad) {
        this.EstTieneDiscapacidad = EstTieneDiscapacidad;
    }

    public String getEstNombreDiscapacidad() {
        return EstNombreDiscapacidad;
    }

    public void setEstNombreDiscapacidad(String EstNombreDiscapacidad) {
        this.EstNombreDiscapacidad = EstNombreDiscapacidad;
    }

    public boolean isEstAlergiaAlimento() {
        return EstAlergiaAlimento;
    }

    public void setEstAlergiaAlimento(boolean EstAlergiaAlimento) {
        this.EstAlergiaAlimento = EstAlergiaAlimento;
    }

    public String getEstNombreAlimento() {
        return EstNombreAlimento;
    }

    public void setEstNombreAlimento(String EstNombreAlimento) {
        this.EstNombreAlimento = EstNombreAlimento;
    }

    public boolean isEstAlergiaMedicamento() {
        return EstAlergiaMedicamento;
    }

    public void setEstAlergiaMedicamento(boolean EstAlergiaMedicamento) {
        this.EstAlergiaMedicamento = EstAlergiaMedicamento;
    }

    public String getEstNombreAlerMedicamento() {
        return EstNombreAlerMedicamento;
    }

    public void setEstNombreAlerMedicamento(String EstNombreAlerMedicamento) {
        this.EstNombreAlerMedicamento = EstNombreAlerMedicamento;
    }

    public boolean isEstTomaMedicamento() {
        return EstTomaMedicamento;
    }

    public void setEstTomaMedicamento(boolean EstTomaMedicamento) {
        this.EstTomaMedicamento = EstTomaMedicamento;
    }

    public String getEstNombreMedicamento() {
        return EstNombreMedicamento;
    }

    public void setEstNombreMedicamento(String EstNombreMedicamento) {
        this.EstNombreMedicamento = EstNombreMedicamento;
    }

    public String getEstComidaFavorita() {
        return EstComidaFavorita;
    }

    public void setEstComidaFavorita(String EstComidaFavorita) {
        this.EstComidaFavorita = EstComidaFavorita;
    }

    public String getEstColorFavorito() {
        return EstColorFavorito;
    }

    public void setEstColorFavorito(String EstColorFavorito) {
        this.EstColorFavorito = EstColorFavorito;
    }

    public String getEstActividadFavorita() {
        return EstActividadFavorita;
    }

    public void setEstActividadFavorita(String EstActividadFavorita) {
        this.EstActividadFavorita = EstActividadFavorita;
    }

    public String getEstPersonajeFavorito() {
        return EstPersonajeFavorito;
    }

    public void setEstPersonajeFavorito(String EstPersonajeFavorito) {
        this.EstPersonajeFavorito = EstPersonajeFavorito;
    }

    public String getEstDocdeAutorizacion() {
        return EstDocdeAutorizacion;
    }

    public void setEstDocdeAutorizacion(String EstDocdeAutorizacion) {
        this.EstDocdeAutorizacion = EstDocdeAutorizacion;
    }

    public String getEstDocdeCompromiso() {
        return EstDocdeCompromiso;
    }

    public void setEstDocdeCompromiso(String EstDocdeCompromiso) {
        this.EstDocdeCompromiso = EstDocdeCompromiso;
    }

    

    @Override
    public String toString() {
        return "Estudiantes{" + "EstId=" + EstId + ", PerId=" + PerId + ", EstCodigo=" + EstCodigo +
                ", EstFechadeInscripcion=" + EstFechadeInscripcion + ", EstFase=" + EstFase + ", EstPrograma=" +
                EstPrograma + ", EstJornadaFundacion=" + EstJornadaFundacion + ", EstSexo=" + EstSexo + ", EstPeso=" +
                EstPeso + ", EstEstatura=" + EstEstatura + ", EstTipodeSangre=" + EstTipodeSangre + ", EstTalladeRopa=" +
                EstTalladeRopa + ", EstTalladeZapatos=" + EstTalladeZapatos + ", EstEstudia=" + EstEstudia + ", EstGrado=" +
                EstGrado + ", EstInstitucion=" + EstInstitucion + ", EstJornadadeColegio=" + EstJornadadeColegio +
                ", EstNumPersonasConvive=" + EstNumPersonasConvive + ", EstConviveconPadre=" + EstConviveconPadre +
                ", EstConviveconMadre=" + EstConviveconMadre + ", EstConviveconOtro=" + EstConviveconOtro + ", EstTieneDiscapacidad=" +
                EstTieneDiscapacidad + ", EstNombreDiscapacidad=" + EstNombreDiscapacidad + ", EstAlergiaAlimento=" +
                EstAlergiaAlimento + ", EstNombreAlimento=" + EstNombreAlimento + ", EstAlergiaMedicamento=" + EstAlergiaMedicamento +
                ", EstNombreAlerMedicamento=" + EstNombreAlerMedicamento + ", EstTomaMedicamento=" + EstTomaMedicamento +
                ", EstNombreMedicamento=" + EstNombreMedicamento + ", EstComidaFavorita=" + EstComidaFavorita + ", EstColorFavorito=" +
                EstColorFavorito + ", EstActividadFavorita=" + EstActividadFavorita + ", EstPersonajeFavorito=" + EstPersonajeFavorito +
                ", EstDocdeAutorizacion=" + EstDocdeAutorizacion + ", EstDocdeCompromiso=" + EstDocdeCompromiso + '}';
    }
    
    
    
}

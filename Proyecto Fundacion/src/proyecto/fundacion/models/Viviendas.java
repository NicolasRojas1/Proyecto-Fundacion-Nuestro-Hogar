
package Proyecto_fundacion.models;

public class Viviendas {
    
    private int     VivId;
    private int     EstId;
    private String  VivDomicilio;
    private String  VivBarrio;
    private String  VivLocalidad;
    private String  VivTipo;
    private boolean VivServicioAgua;
    private boolean VivServicioLuz;
    private boolean VivServicioGas;
    private boolean VivServicioInter;

    public Viviendas() {
    }

    public int getVivId() {
        return VivId;
    }

    public void setVivId(int VivId) {
        this.VivId = VivId;
    }

    public int getEstId() {
        return EstId;
    }

    public void setEstId(int EstId) {
        this.EstId = EstId;
    }

    public String getVivDomicilio() {
        return VivDomicilio;
    }

    public void setVivDomicilio(String VivDomicilio) {
        this.VivDomicilio = VivDomicilio;
    }

    public String getVivBarrio() {
        return VivBarrio;
    }

    public void setVivBarrio(String VivBarrio) {
        this.VivBarrio = VivBarrio;
    }

    public String getVivLocalidad() {
        return VivLocalidad;
    }

    public void setVivLocalidad(String VivLocalidad) {
        this.VivLocalidad = VivLocalidad;
    }

    public String getVivTipo() {
        return VivTipo;
    }

    public void setVivTipo(String VivTipo) {
        this.VivTipo = VivTipo;
    }

    public boolean isVivServicioAgua() {
        return VivServicioAgua;
    }

    public void setVivServicioAgua(boolean VivServicioAgua) {
        this.VivServicioAgua = VivServicioAgua;
    }

    public boolean isVivServicioLuz() {
        return VivServicioLuz;
    }

    public void setVivServicioLuz(boolean VivServicioLuz) {
        this.VivServicioLuz = VivServicioLuz;
    }

    public boolean isVivServicioGas() {
        return VivServicioGas;
    }

    public void setVivServicioGas(boolean VivServicioGas) {
        this.VivServicioGas = VivServicioGas;
    }

    public boolean isVivServicioInter() {
        return VivServicioInter;
    }

    public void setVivServicioInter(boolean VivServicioInter) {
        this.VivServicioInter = VivServicioInter;
    }

    @Override
    public String toString() {
        return "Viviendas{" + "Id=" + VivId + 
                ", EstId=" + EstId + 
                ", Domicilio=" + VivDomicilio + 
                ", Barrio=" + VivBarrio + 
                ", Localidad=" + VivLocalidad + 
                ", Tipo=" + VivTipo + 
                ", ServicioAgua=" + VivServicioAgua + 
                ", ServicioLuz=" + VivServicioLuz + 
                ", ServicioGas=" + VivServicioGas + 
                ", ServicioInter=" + VivServicioInter + '}';
    }
    
    
}

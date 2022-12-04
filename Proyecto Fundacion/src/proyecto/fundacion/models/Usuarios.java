
package proyecto.fundacion.models;

public class Usuarios {
    
    private int     UsuId;
    private int     RolId;
    private String  UsuUsuario;
    private String  UsuPassword;
    private String  UsuRol;

    public Usuarios() {
    }

    public int getUsuId() {
        return UsuId;
    }

    public void setUsuId(int UsuId) {
        this.UsuId = UsuId;
    }

    public int getRolId() {
        return RolId;
    }

    public void setRolId(int RolId) {
        this.RolId = RolId;
    }

    public String getUsuUsuario() {
        return UsuUsuario;
    }

    public void setUsuUsuario(String UsuUsuario) {
        this.UsuUsuario = UsuUsuario;
    }

    public String getUsuPassword() {
        return UsuPassword;
    }

    public void setUsuPassword(String UsuPassword) {
        this.UsuPassword = UsuPassword;
    }

    public String getUsuRol() {
        return UsuRol;
    }

    public void setUsuRol(String UsuRol) {
        this.UsuRol = UsuRol;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "UsuId=" + UsuId + ", RolId=" + RolId + ", UsuUsuario=" + UsuUsuario 
                + ", UsuPassword=" + UsuPassword + ", UsuRol=" + UsuRol + '}';
    }

    
}

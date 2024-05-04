package app.mtr.entidades;

/**
 *
 * @author kevin
 */
public class Usuario {
    private int idUsuario;
    private String NombreUsuario;
    private String ApellidoUsuario;
    private String Puesto;
    private int TelefonoUsuario;
    private String CorreoUsuario;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        this.NombreUsuario = NombreUsuario;
    }

    public String getApellidoUsuario() {
        return ApellidoUsuario;
    }

    public void setApellidoUsuario(String ApellidoUsuario) {
        this.ApellidoUsuario = ApellidoUsuario;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public int getTelefonoUsuario() {
        return TelefonoUsuario;
    }

    public void setTelefonoUsuario(int TelefonoUsuario) {
        this.TelefonoUsuario = TelefonoUsuario;
    }

    public String getCorreoUsuario() {
        return CorreoUsuario;
    }

    public void setCorreoUsuario(String CorreoUsuario) {
        this.CorreoUsuario = CorreoUsuario;
    }

    public Usuario() {
    }

    public Usuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Usuario(int idUsuario, String NombreUsuario, String ApellidoUsuario, String Puesto, int TelefonoUsuario, String CorreoUsuario) {
        this.idUsuario = idUsuario;
        this.NombreUsuario = NombreUsuario;
        this.ApellidoUsuario = ApellidoUsuario;
        this.Puesto = Puesto;
        this.TelefonoUsuario = TelefonoUsuario;
        this.CorreoUsuario = CorreoUsuario;
    }
    
    
}

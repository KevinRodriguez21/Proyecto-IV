package app.mtr.entidades;

/**
 *
 * @author kevin
 */
public class Cliente {
    
    private int idCliente;
    private String NombreCliente;
    private String ApellidoCliente;
    private String DireccionCliente;
    private int TelefonoCliente;
    private String CorreoCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getApellidoCliente() {
        return ApellidoCliente;
    }

    public void setApellidoCliente(String ApellidoCliente) {
        this.ApellidoCliente = ApellidoCliente;
    }

    public String getDireccionCliente() {
        return DireccionCliente;
    }

    public void setDireccionCliente(String DireccionCliente) {
        this.DireccionCliente = DireccionCliente;
    }

    public int getTelefonoCliente() {
        return TelefonoCliente;
    }

    public void setTelefonoCliente(int TelefonoCliente) {
        this.TelefonoCliente = TelefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente) {
        this.CorreoCliente = CorreoCliente;
    }

    public Cliente() {
    }

    public Cliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(int idCliente, String NombreCliente, String ApellidoCliente, String DireccionCliente, int TelefonoCliente, String CorreoCliente) {
        this.idCliente = idCliente;
        this.NombreCliente = NombreCliente;
        this.ApellidoCliente = ApellidoCliente;
        this.DireccionCliente = DireccionCliente;
        this.TelefonoCliente = TelefonoCliente;
        this.CorreoCliente = CorreoCliente;
    }
    
    
    
}

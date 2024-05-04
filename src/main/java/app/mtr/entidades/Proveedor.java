package app.mtr.entidades;

/**
 *
 * @author kevin
 */
public class Proveedor {
    private int idProveedor;
    private String NombreProveedor;
    private String DireccionProveedor;
    private String CorreoProveedor;

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getNombreProveedor() {
        return NombreProveedor;
    }

    public void setNombreProveedor(String NombreProveedor) {
        this.NombreProveedor = NombreProveedor;
    }

    public String getDireccionProveedor() {
        return DireccionProveedor;
    }

    public void setDireccionProveedor(String DireccionProveedor) {
        this.DireccionProveedor = DireccionProveedor;
    }

    public String getCorreoProveedor() {
        return CorreoProveedor;
    }

    public void setCorreoProveedor(String CorreoProveedor) {
        this.CorreoProveedor = CorreoProveedor;
    }

    public Proveedor() {
    }

    public Proveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public Proveedor(int idProveedor, String NombreProveedor, String DireccionProveedor, String CorreoProveedor) {
        this.idProveedor = idProveedor;
        this.NombreProveedor = NombreProveedor;
        this.DireccionProveedor = DireccionProveedor;
        this.CorreoProveedor = CorreoProveedor;
    }

    
}

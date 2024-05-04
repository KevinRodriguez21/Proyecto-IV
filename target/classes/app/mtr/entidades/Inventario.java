package app.mtr.entidades;

/**
 *
 * @author kevin
 */
public class Inventario{
    
    private int idProducto;
    private String NombreProducto;
    private String Descripcion;
    private int PrecioVenta;
    private int Stock;
    private int idProveedor;

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Inventario() {
    }

    public Inventario(int idProducto) {
        this.idProducto = idProducto;
    }    

    public Inventario(int idProducto, String NombreProducto, String Descripcion, int PrecioVenta, int Stock, int idProveedor) {
        this.idProducto = idProducto;
        this.NombreProducto = NombreProducto;
        this.Descripcion = Descripcion;
        this.PrecioVenta = PrecioVenta;
        this.Stock = Stock;
        this.idProveedor = idProveedor;
    }

    
}
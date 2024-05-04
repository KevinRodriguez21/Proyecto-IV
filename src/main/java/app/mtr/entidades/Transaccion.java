/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.mtr.entidades;

/**
 *
 * @author kevin
 */
public class Transaccion {
      private int idTransaccion;
    private int Cantidad;
    private int PrecioTotal;
    private int idFactura;
    private int idProducto;

    public int getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(int idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    

    public Transaccion() {
    }

    public Transaccion(int idTransaccion, int Cantidad, int PrecioTotal, int idFactura, int idProducto) {
        this.idTransaccion = idTransaccion;
        this.Cantidad = Cantidad;
        this.PrecioTotal = PrecioTotal;
        this.idFactura = idFactura;
        this.idProducto = idProducto;
    }
    
    
    
    
}

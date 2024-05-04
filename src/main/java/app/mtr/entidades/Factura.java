/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app.mtr.entidades;

import java.util.Date;

/**
 *
 * @author kevin
 */
public class Factura {
     private int idFactura;
    private Date FechaFactura;
    private int TotalFactura;
    private String Garantia;
    private int IdCliente;
    private int idUsuario;

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return FechaFactura;
    }

    public void setFechaFactura(Date FechaFactura) {
        this.FechaFactura = FechaFactura;
    }

    public int getTotalFactura() {
        return TotalFactura;
    }

    public void setTotalFactura(int TotalFactura) {
        this.TotalFactura = TotalFactura;
    }

    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Factura() {
    }

    public Factura(int idFactura, Date FechaFactura, int TotalFactura, String Garantia, int IdCliente, int idUsuario) {
        this.idFactura = idFactura;
        this.FechaFactura = FechaFactura;
        this.TotalFactura = TotalFactura;
        this.Garantia = Garantia;
        this.IdCliente = IdCliente;
        this.idUsuario = idUsuario;
    }
    
    
    
    
    
}

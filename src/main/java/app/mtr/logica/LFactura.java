
package app.mtr.logica;


import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kevin
 */
public class LFactura {
  public ArrayList<Factura> Listar() {
        ArrayList<Factura> facturas= new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_facturas(?)}", parametros)) {
                    while (resultado.next()) {
                        facturas.add(new Factura(
                                resultado.getInt("id"),
                                 resultado.getDate("fecha_factura"),
                                 resultado.getInt("total_factura"),
                                 resultado.getString("garantia"),
                                 resultado.getInt("id_cliente"),
                                 resultado.getInt("id_usuario")
                              
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return facturas;
    }
    
    public Factura Consultar(int idFactura) {
        Factura factura = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idFactura, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_facturas(?,?)}", parametros)) {
                    if (resultado.next()) {
                        factura = new Factura(
                               resultado.getInt("id"),
                                 resultado.getDate("fecha_factura"),
                                 resultado.getInt("total_factura"),
                                 resultado.getString("garantia"),
                                 resultado.getInt("id_cliente"),
                                 resultado.getInt("id_usuario")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return factura;
    }

    public int Guardar( Factura factura) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_fecha_factura", factura.getFechaFactura(), Types.DATE));
                parametros.add(new Parametro<>("p_total_factura", factura. getTotalFactura(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_garantia", factura.getGarantia(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_cliente", factura.getIdCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_usuario", factura.getIdUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_facturas(?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar( Factura factura) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", factura.getIdFactura(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_fecha_factura", factura.getFechaFactura(), Types.DATE));
                parametros.add(new Parametro<>("p_total_factura", factura. getTotalFactura(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_garantia", factura.getGarantia(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_id_cliente", factura.getIdCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_usuario", factura.getIdUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_facturas(?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Eliminar(int idFactura) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idFactura, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_factura(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LFactura.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
}

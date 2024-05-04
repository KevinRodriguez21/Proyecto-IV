
package app.mtr.logica;



import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Transaccion;
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
public class LTransaccion {
    public ArrayList<Transaccion> Listar() {
        ArrayList<Transaccion> transaccion = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_transaccion(?)}", parametros)) {
                    while (resultado.next()) {
                        transaccion.add(new Transaccion(
                                resultado.getInt("id"),
                                 resultado.getInt("cantidad"),
                                 resultado.getInt("precio_total"),
                                 resultado.getInt("id_factura"),
                                 resultado.getInt("id_producto")
                              
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaccion;
    }
    
    public Transaccion Consultar(int idTransaccion) {
        Transaccion transaccion = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idTransaccion, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_transaccion(?,?)}", parametros)) {
                    if (resultado.next()) {
                       transaccion = new Transaccion(
                               resultado.getInt("id"),
                                 resultado.getInt("cantidad"),
                                 resultado.getInt("precio_total"),
                                 resultado.getInt("id_factura"),
                                 resultado.getInt("id_producto")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LTransaccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return transaccion;
    }

    public int Guardar( Transaccion transaccion) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_cantidad", transaccion. getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio_total", transaccion. getPrecioTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_factura", transaccion.getIdFactura(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_producto", transaccion.getIdProducto(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_transaccion(?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar( Transaccion transaccion) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", transaccion. getIdTransaccion(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_cantidad", transaccion. getCantidad(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_precio_total", transaccion. getPrecioTotal(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_factura", transaccion.getIdFactura(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_producto", transaccion.getIdProducto(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_transaccion(?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public int Eliminar(int idTransaccion) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idTransaccion, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_transaccion(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LTransaccion.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    
}


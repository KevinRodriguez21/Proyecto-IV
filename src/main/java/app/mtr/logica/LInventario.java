package app.mtr.logica;

import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Inventario;
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
public class LInventario {
public ArrayList<Inventario> Listar() {
        ArrayList<Inventario> inventarios = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_inventarios(?)}", parametros)) {
                    while (resultado.next()) {
                        inventarios.add(new Inventario(
                                resultado.getInt("id"),
                                resultado.getString("nombre_producto"),
                                resultado.getString("descripcion"),
                                resultado.getInt("precio_venta"),
                                resultado.getInt("stock"),
                                resultado.getInt("id_proveedor")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inventarios;
    }

    public Inventario Consultar(int idInventario) {
        Inventario inventario = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_inventario", idInventario, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_inventarios(?,?)}", parametros)) {
                    if (resultado.next()) {
                        inventario = new Inventario(
                                resultado.getInt("id"),
                                resultado.getString("nombre_producto"),
                                resultado.getString("descripcion"),
                                resultado.getInt("precio_venta"),
                                resultado.getInt("stock"),
                                resultado.getInt("id_proveedor")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LInventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return inventario;
    }

    public int Guardar(Inventario inventario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_nombre_producto", inventario.getNombreProducto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_descripcion", inventario.getDescripcion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_precioVenta", inventario.getPrecioVenta(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_stock", inventario.getStock(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_proveedor", inventario.getIdProveedor(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_inventarios(?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LInventario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Inventario inventario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", inventario.getIdProducto(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_nombre_producto", inventario.getNombreProducto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_descripcion", inventario.getDescripcion(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_precioVenta", inventario.getPrecioVenta(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_stock", inventario.getStock(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_id_proveedor", inventario.getIdProveedor(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_inventarios(?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LInventario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Eliminar(int idInventario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idInventario, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_inventarios(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LInventario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
}

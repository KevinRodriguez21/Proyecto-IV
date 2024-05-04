package app.mtr.logica;

import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Proveedor;
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
public class LProveedor {
    public ArrayList<Proveedor> Listar() {
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_proveedor(?)}", parametros)) {
                    while (resultado.next()) {
                        proveedores.add(new Proveedor(
                                resultado.getInt("id"),
                                resultado.getString("nombre_proveedor"),
                                resultado.getString("direccion_proveedor"),
                                resultado.getString("correo_proveedor")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proveedores;
    }
    
    public Proveedor Consultar(int idProveedor) {
        Proveedor proveedor = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id_proveedor", idProveedor, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_proveedor(?,?)}", parametros)) {
                    if (resultado.next()) {
                        proveedor = new Proveedor(
                                resultado.getInt("id"),
                                resultado.getString("nombre_proveedor"),
                                resultado.getString("direccion_proveedor"),
                                resultado.getString("correo_proveedor")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LProveedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        return proveedor;
    }

    public int Guardar(Proveedor proveedor) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_nombre_proveedor", proveedor.getNombreProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion_proveedor", proveedor.getDireccionProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo_proveedor", proveedor.getCorreoProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_proveedor(?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LProveedor.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Proveedor proveedor) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", proveedor.getIdProveedor(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_nombreproveedor", proveedor.getNombreProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion", proveedor.getDireccionProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_correo", proveedor.getCorreoProveedor(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_proveedor(?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LProveedor.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Eliminar(int idProveedor) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idProveedor, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_proveedor(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LProveedor.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

}

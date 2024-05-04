package app.mtr.logica;

import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Cliente;
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
public class LCliente {
    public ArrayList<Cliente> Listar() {
        ArrayList<Cliente> clientes = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_clientes(?)}", parametros)) {
                    while (resultado.next()) {
                        clientes.add(new Cliente(
                                resultado.getInt("id"),
                                resultado.getString("nombre_cliente"),
                                resultado.getString("apellido_cliente"),
                                resultado.getString("direccion_cliente"),
                                resultado.getInt("telefono_cliente"),
                                resultado.getString("correo_cliente")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }
    
    public Cliente Consultar(int idCliente) {
        Cliente cliente = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idCliente, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_clientes(?,?)}", parametros)) {
                    if (resultado.next()) {
                        cliente = new Cliente(
                                resultado.getInt("id"),
                                resultado.getString("nombre_cliente"),
                                resultado.getString("apellido_cliente"),
                                resultado.getString("direccion_cliente"),
                                resultado.getInt("telefono_cliente"),
                                resultado.getString("correo_cliente")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cliente;
    }

    public int Guardar(Cliente cliente) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_nombre_cliente", cliente.getNombreCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellido_cliente", cliente.getApellidoCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion_cliente", cliente.getDireccionCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono_cliente", cliente.getTelefonoCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_correo_cliente", cliente.getCorreoCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_clientes(?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Cliente cliente) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", cliente.getIdCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_nombre_cliente", cliente.getNombreCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellido_cliente", cliente.getApellidoCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_direccion_cliente", cliente.getDireccionCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono_cliente", cliente.getTelefonoCliente(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_correo_cliente", cliente.getCorreoCliente(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_clientes(?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Eliminar(int idCliente) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idCliente, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_clientes(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LCliente.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
}

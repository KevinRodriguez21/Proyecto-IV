package app.mtr.logica;

import app.mtr.db.ConnectionManager;
import app.mtr.db.Parametro;
import app.mtr.entidades.Usuario;
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
public class LUsuario {
    public ArrayList<Usuario> Listar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_usuarios(?)}", parametros)) {
                    while (resultado.next()) {
                        usuarios.add(new Usuario(
                                resultado.getInt("id"),
                                resultado.getString("nombre_usuario"),
                                resultado.getString("apellido_usuario"),
                                resultado.getString("puesto"),
                                resultado.getInt("telefono_usuario"),
                                resultado.getString("correo_usuario")
                        ));
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;
    }
    
    public Usuario Consultar(int idUsuario) {
        Usuario usuario = null;
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idUsuario, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.REF_CURSOR, true));
                try (ResultSet resultado = con.ExecuteCommand("{call pr2.pr_latorre.consultar_id_usuarios(?,?)}", parametros)) {
                    if (resultado.next()) {
                        usuario = new Usuario(
                                resultado.getInt("id"),
                                resultado.getString("nombre_usuario"),
                                resultado.getString("apellido_usuario"),
                                resultado.getString("puesto"),
                                resultado.getInt("telefono_usuario"),
                                resultado.getString("correo_usuario")
                        );
                    }
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuario;
    }

    public int Guardar(Usuario usuario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_nombre_usuario", usuario.getNombreUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellido_usuario", usuario.getApellidoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_puesto", usuario.getPuesto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono_usuario", usuario.getTelefonoUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_correo_usuario", usuario.getCorreoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.guardar_usuarios(?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }

    public int Actualizar(Usuario usuario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", usuario.getIdUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_nombre_usuario", usuario.getNombreUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_apellido_usuario", usuario.getApellidoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_puesto", usuario.getPuesto(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_telefono_usuario", usuario.getTelefonoUsuario(), Types.NUMERIC));
                parametros.add(new Parametro<>("p_correo_usuario", usuario.getCorreoUsuario(), Types.VARCHAR));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.actualizar_usuarios(?,?,?,?,?,?,?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public int Eliminar(int idUsuario) {
        try {
            ConnectionManager con = new ConnectionManager();
            if (con.Connect()) {
                ArrayList<Parametro<?>> parametros = new ArrayList<>();
                parametros.add(new Parametro<>("p_id", idUsuario, Types.NUMERIC));
                parametros.add(new Parametro<>("p_respuesta", null, Types.INTEGER, true));
                return con.<Integer>ExecuteCommand("{call pr2.pr_latorre.eliminar_usuarios(?, ?)}", parametros);
            }
            return 0;
        } catch (Exception ex) {
            Logger.getLogger(LUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
}

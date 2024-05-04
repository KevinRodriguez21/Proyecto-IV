package app.mtr.db;

import app.mtr.interfaces.IConnectionManager;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.OracleConnection;

/**
 *
 * @author kevin
 */
public class ConnectionManager implements IConnectionManager {
    private Connection myConnection;

    public ConnectionManager() {
        this.myConnection = null;
    }

    @Override
    public boolean Connect() {
        try {
            this.myConnection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "PR2", "Dev$2023");
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public void Disconnect() {
        try {
            if (!this.myConnection.isClosed()) {
                this.myConnection.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T ExecuteCommand(String command, ArrayList<Parametro<?>> parametros) {
        try {
            // Convertir la conexión del JDBC a tipo Oracle.
            OracleConnection oracleConnection = this.myConnection.unwrap(OracleConnection.class);
            // Crear el procedimiento para parametrizar las configurations.
            CallableStatement obProcedimiento = oracleConnection.prepareCall(command);

            // Generar los parámetros.
            for (Parametro<?> parametro : parametros) {
                if (!parametro.isRespuesta()) {
                    if (parametro.getTipoSQL() == Types.ARRAY) {
                        obProcedimiento.setArray(
                                parametros.indexOf(parametro) + 1,
                                oracleConnection.createOracleArray(parametro.getNombreTipo(), parametro.getValue())
                        );
                    } else {
                        obProcedimiento.setObject(parametros.indexOf(parametro) + 1, parametro.getValue(), parametro.getTipoSQL());
                    }
                } else {
                    obProcedimiento.registerOutParameter(parametros.indexOf(parametro) + 1, parametro.getTipoSQL());
                }
            }

            // Ejecutar el procedimiento.
            obProcedimiento.executeUpdate();
            // Extraer la respuesta.
            Parametro<?> respuesta = parametros.stream().filter(Parametro::isRespuesta).findAny().orElse(null);
            assert respuesta != null;
            return (T) obProcedimiento.getObject(parametros.size());
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionManager.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

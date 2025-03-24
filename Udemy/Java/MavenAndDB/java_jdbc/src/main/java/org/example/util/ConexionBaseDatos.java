package org.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {

    private static String url = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static String username = "root";
    private static String password = "sasa";
    private static Connection connection;

    // Obtiene una instancia de la conexión a la base de datos
    public static Connection getInstance() throws SQLException {
        if (connection == null || connection.isClosed() ){
            // Establece una nueva conexión si no existe o está cerrada
            connection = DriverManager.getConnection(url, username, password);
        }
        return connection;
    }
}

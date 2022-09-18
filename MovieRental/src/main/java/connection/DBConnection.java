
package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBConnection {
   Connection connection; 
   static String bd = "movies_rental";
   static String port = "3307";
   static String login = "root";
   static String password = "admin";

    public DBConnection() {
        try {
            
            String url = "jdbc:mysql://localhost:" + this.port + "/" + this.bd;
            connection = DriverManager.getConnection(url, this.login, this.password);
            System.out.println("Conexion Exitosa");
        
        
    } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
    }
}

    public Connection getConnection() {
        return connection;
    }
    public void desconectar(){
        connection = null;
    }
}

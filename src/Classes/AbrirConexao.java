package Classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AbrirConexao {
    public static Connection getConnection(){
        String url = "jdbc:postgresql://localhost:5000/mybd";
        String user = "postgres";
        String pass = "surfns99772";

        try {Connection conn = DriverManager.getConnection(url,user,pass);
            return conn;
        }
        catch (SQLException e){e.printStackTrace(); return null;}
    }
}

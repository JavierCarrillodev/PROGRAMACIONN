import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String USER = "root";
    private static final String PWD = "javibol+18";
    private static final String URL = "jdbc:mysql://localhost/";

    public static Connection conectar(String nombreBD)throws SQLException {
        return DriverManager.getConnection(URL+nombreBD, USER,PWD);
    }
}

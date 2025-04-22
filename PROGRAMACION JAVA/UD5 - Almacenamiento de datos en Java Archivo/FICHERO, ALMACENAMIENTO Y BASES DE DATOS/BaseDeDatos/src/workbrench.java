import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class workbrench {
    public static void main(String[] args) {
        try {
            //Ahora nos conectamos a la base de datos 'crud_demo'
            Connection conexion = ConexionDB.conectar ("crud_demo");
            System.out.println("Conexión establecida con éxito\n");

            // Creamos un Statement para ejecutar la consulta
            String query = "SELECT nombre, email FROM usuarios";
            PreparedStatement instruccion = conexion.prepareStatement(query);
            ResultSet resultado = instruccion.executeQuery();

            // Mostramos los resultados
            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String email = resultado.getString("email");
                System.out.println(nombre +" (" +email+")");
            }

        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}

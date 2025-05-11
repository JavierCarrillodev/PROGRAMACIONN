import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

public class Insert {
    public static void main(String[] args) {

        try{
            //Datos del contacto a insertar


            //Realizamos conexion
            Connection conex = ConexionDB.conectar("crud_demo");

            //insertamos contacto
            String query = "INSERT INTO usuarios (nombre,email) VALUES (?,?)";
            PreparedStatement ps = conex.prepareStatement(query);

            List<String>nombres = Arrays.asList("Juan","pedro");
            List<String>correos = Arrays.asList("Juan@gmail.com","pedro@gmail.com");

            for (int i = 0; i < nombres.size(); i++) {
                ps.setString(1, nombres.get(i));
                ps.setString(2, correos.get(i));
                int resultado = ps.executeUpdate();

                //analizamos el resultado del insert
                if (resultado == 1) {
                }else{
                }
            }
            System.out.printf("Los contacto de nombre '" + nombres + "' se ha insertado correctamente");
        } catch (SQLException e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
    }











}

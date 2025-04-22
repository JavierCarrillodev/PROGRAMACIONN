package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;

public class Workbenck {
    public static void main(String[] args) {

        try {
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","8888");
            System.out.printf("Conexion establecida con exito\n");
        }catch (Exception e){
            System.out.printf("Error al conectar con la base de datos\n" + e.getMessage());
        }

    }
}

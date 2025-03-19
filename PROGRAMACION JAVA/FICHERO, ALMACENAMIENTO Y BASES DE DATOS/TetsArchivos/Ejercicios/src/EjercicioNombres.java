import java.io.FileWriter;
import java.io.IOException;

public class EjercicioNombres {
    public static void main(String[] args) {

        String Nombre1 = "Nombre1.txt";
        crearNombres(Nombre1);
    }

    public static void crearNombres(String Nombre1) {

        try {
            String Nombree1 = "Javi";
            FileWriter fw = new FileWriter(Nombre1);
            fw.write("El nombre de este archivo es " + Nombree1);
            fw.close();

        }catch (IOException e){
            System.out.println("Error al crear archivo " + e.getMessage());
        }
    }

}

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CrearFicheroYDirectorio {
    public static void main(String[] args) {
        File archivo = new File("ACHIVO.txt");

        try {
            if (archivo.createNewFile()) {
                BufferedWriter bw = new BufferedWriter( new FileWriter(archivo));
            }else {
                System.out.println("No se puede crear el archivo");
            }


        }catch (IOException e){
            e.printStackTrace();
        }
        File directorio = new File("pruebaDirectorio");
        if (directorio.mkdir()) {
            System.out.println("Directorio creado correctamente");
        }else {
            System.out.println("No se puede crear el directorio");
        }

        String archivoBorrar = "ACHIVO.txt";

        if (archivoBorrar.equals(archivo.getName())) {
            archivo.delete();
        }else {
            System.out.println("No se puede eliminar el archivo");
        }
    }
}

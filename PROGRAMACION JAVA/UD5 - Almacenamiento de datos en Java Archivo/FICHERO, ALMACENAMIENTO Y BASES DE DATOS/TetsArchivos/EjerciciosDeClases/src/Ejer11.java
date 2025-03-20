import java.io.File;

/* Listar archivos en un directorio**
 Crea un programa que muestre todos los archivos y carpetas dentro del directorio actual,
 indicando si cada uno es un archivo o un directorio.*/
public class Ejer11 {
    public static void main(String[] args) {
        MostrarRuta(".");
    }
    public static void MostrarRuta(String ruta) {


        File fr = new File(ruta);
        String[] archivos = fr.list();
        if( archivos != null) {
            for( String a : archivos) {
                System.out.println(a);
            }
        }else{
            System.out.println("No existe el archivo");
        }

    }
}

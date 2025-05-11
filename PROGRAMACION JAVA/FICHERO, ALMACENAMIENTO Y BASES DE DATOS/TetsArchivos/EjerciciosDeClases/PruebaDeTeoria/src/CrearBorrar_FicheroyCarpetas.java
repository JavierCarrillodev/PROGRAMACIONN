import java.io.File;
import java.io.IOException;

public class CrearBorrar_FicheroyCarpetas {
    public static void main(String[] args) {
        File archivo = new File("nuevoArchivoSS.txt");

        try {
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado");
            }else{
                System.out.println("El archivo ya existe");
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        //Creamos un directorio
        File directorio = new File("nuevoDirectorio");
        if (directorio.mkdir()) {
            System.out.println("Directorio creado");
        }else System.out.println("No se pudo crear el directorio");

      //  File archivoBorrar = new File("nuevoDirectorio");
      //  if (archivoBorrar.delete()) {
        //    System.out.println("Archivo borrado");
      //  }else {
      //      System.out.println("No se pudo borrar el archivo");
     //   }


        File directorio2 = new File(".");//Le indicamos la ruta de los directorios y archivos que queremos ver
        String[] archivos = directorio2.list();
        if (archivos != null) for (String a : archivos) {
            System.out.println(a);
        }else System.out.println("No hay archivos en la carpeta");
    }
}

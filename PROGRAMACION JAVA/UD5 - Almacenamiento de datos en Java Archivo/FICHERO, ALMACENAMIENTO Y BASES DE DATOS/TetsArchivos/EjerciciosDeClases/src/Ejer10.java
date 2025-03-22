import java.io.File;

/*Ejercicio 10: Eliminar un archivo**
 Crea un programa que elimine el archivo `informacion.txt` y muestre un mensaje confirmando su eliminación*/
public class Ejer10 {
    public static void main(String[] args) {

        String archivo = "";
        EliminarArchivo(archivo);
    }
    public static void EliminarArchivo(String archivo) {
        File archivoParaBorrar = new File(archivo);
        if(archivoParaBorrar.exists()) {
            archivoParaBorrar.delete();
            System.out.println("Se ha borrado el archivo");
        }else {
            System.out.println("No se ha borrado el archivo ERROR");
        }

    }
}

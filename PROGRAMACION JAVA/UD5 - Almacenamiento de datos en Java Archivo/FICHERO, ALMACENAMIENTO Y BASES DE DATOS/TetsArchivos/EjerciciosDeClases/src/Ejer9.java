import java.io.File;

/*Ejercicio 9: Renombrar un archivo**
Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`, verificando que la operación se haya
realizado con éxito.*/
public class Ejer9 {
    public static void main(String[] args) {

        File archivoOriginal = new File("datos.txt");
        File archivoRenombrado = new File("datillos.txt");

        if (archivoOriginal.renameTo(archivoRenombrado)) {
            System.out.println("Se ha cambiado el nombre correctamente");
        }else {
            System.out.println("No se ha cambiado el nombre ERROR");
        }
    }
}

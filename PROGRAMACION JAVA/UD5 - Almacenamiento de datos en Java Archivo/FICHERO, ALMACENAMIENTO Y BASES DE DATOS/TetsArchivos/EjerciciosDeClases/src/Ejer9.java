import java.io.File;

/*Ejercicio 9: Renombrar un archivo**
Desarrolla un programa que renombre el archivo `datos.txt` a `informacion.txt`, verificando que la operación se haya
realizado con éxito.*/
public class Ejer9 {
    public static void main(String[] args) {
        RenombrarArchivos("datos.txt", "datillos.txt");
    }
    public static void RenombrarArchivos(String archivoOriginalPath, String archivoRenombradoPath) {
        File archivoOriginal = new File(archivoOriginalPath);
        File archivoRenombrado = new File(archivoRenombradoPath);

        if (archivoOriginal.renameTo(archivoRenombrado)) {
            System.out.println("Se ha cambiado el nombre correctamente");
        }else {
            System.out.println("No se ha cambiado el nombre ERROR");
        }
    }
}


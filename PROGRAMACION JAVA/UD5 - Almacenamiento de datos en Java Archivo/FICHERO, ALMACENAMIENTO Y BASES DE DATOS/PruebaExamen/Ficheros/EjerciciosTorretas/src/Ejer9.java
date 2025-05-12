import java.io.File;
/*Ejercicio 9: Renombrar un archivo
Desarrolla un programa que renombre el archivo datos.txt a informacion.txt, verificando que la operación se haya realizado con éxito.*/
public class Ejer9 {
    public static void main(String[] args) {

        File nombreAntiguo = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/e.txt");
        File nombreNuevo = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/datos.txt");
    }
    public static void RenombrarArchivo(File nombreAntiguo, File nombreNuevo){
    if (nombreAntiguo.renameTo(nombreNuevo)){
        System.out.println("Nombre cambiado correctamente");
    }else{
        System.out.println("Nombre no cambiado, error");
    }

    }
}

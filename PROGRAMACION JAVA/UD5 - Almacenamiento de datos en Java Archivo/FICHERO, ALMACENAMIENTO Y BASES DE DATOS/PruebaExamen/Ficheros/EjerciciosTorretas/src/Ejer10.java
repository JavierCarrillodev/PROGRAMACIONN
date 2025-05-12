import java.io.File;

/*Ejercicio 10: Eliminar un archivo
Crea un programa que elimine el archivo informacion.txt y muestre un mensaje confirmando su eliminación.*/
public class Ejer10 {
    public static void main(String[] args) {

        File archivoBorrar = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copi.txt1");
    }
    public static void BorrarArchivo(File archivoBorrar){
        if (archivoBorrar.delete()){
            System.out.println("Archivo borrado correctamente");
        }else {
            System.out.println("Archivo no borrado hubo un error");
        }
    }
}

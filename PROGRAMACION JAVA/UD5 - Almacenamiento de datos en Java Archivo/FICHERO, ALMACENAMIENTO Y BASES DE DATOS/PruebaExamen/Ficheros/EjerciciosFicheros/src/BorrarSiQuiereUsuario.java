import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

/*Implementa un programa que borre un fichero si el usuario confirma su eliminación.*/
public class BorrarSiQuiereUsuario {
    public static void main(String[] args) {

        File fichero = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosFicheros/src/hola.txt");
        Scanner sc = new Scanner(System.in);


        String eliminarSioNo;
        System.out.println("Quieres eliminar el archivo?");
        eliminarSioNo = sc.nextLine();

        if (eliminarSioNo.equalsIgnoreCase("si")){
            fichero.delete();
            System.out.println("El usuario quiere eliminar el archivo");
        }else{
            System.out.println("El usuario no quiere borrar el archivo");
        }

    }
}

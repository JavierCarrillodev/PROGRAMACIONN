import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        File archivo = new File("fichero.txt");
        try{
            Scanner sc = new Scanner(archivo);

            while(sc.hasNextLine()){
                String linea = sc.nextLine();
                System.out.println(linea);
            }
            sc.close();



        }catch (FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
    }
}

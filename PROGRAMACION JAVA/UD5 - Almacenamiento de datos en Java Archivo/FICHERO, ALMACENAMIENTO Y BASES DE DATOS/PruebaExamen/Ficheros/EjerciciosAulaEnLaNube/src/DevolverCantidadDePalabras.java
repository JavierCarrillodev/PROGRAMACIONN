import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DevolverCantidadDePalabras {
    public static void main(String[] args) {
        String archivo = "nuevoArchivo.txt";
        contarPalabras(archivo);

    }


    public static void contarPalabras(String archivo) {
        //Existe esta forma de hacerlo o la siguiente que se encuentra mas abajo
       try{
            int palabras = 0;
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            String linea;

            while((linea = br.readLine()) !=null){
               String[] palabrasLinea = linea.split("\\s+");
               palabras += palabrasLinea.length;
            }
            br.close();
            System.out.println(archivo + " contiene " + palabras + " palabras");

       }catch (IOException e) {
           System.out.println("Error");
       }
       //Esta forma tambien es valida para contar caracteres de un archivo
       /* try {
            int palabras = 0;
            Scanner scn = new Scanner(new BufferedReader(new FileReader(archivo)));
            while (scn.hasNextLine()) {
                palabras += Arrays.stream(scn.nextLine().split("\\s+")).count();

            }
            //cerramos el scanner
            scn.close();
            System.out.println("El archivo " + archivo + " contiene " + palabras + "palabras");
        } catch (IOException e) {
            System.out.println("Error");*/


       // }
    }
}
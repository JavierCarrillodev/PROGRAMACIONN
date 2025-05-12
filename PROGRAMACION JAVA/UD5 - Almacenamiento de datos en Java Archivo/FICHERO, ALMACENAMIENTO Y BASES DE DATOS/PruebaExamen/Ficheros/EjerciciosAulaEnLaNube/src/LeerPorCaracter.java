import javax.accessibility.AccessibleAction;
import java.io.*;

public class LeerPorCaracter {
    public static void main(String[] args) {

       String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/PRUEBA/HALAMADRID.txt";
        int contador = 0;
       try{
           BufferedReader br = new BufferedReader(new FileReader(ruta));
           int caracter;
           while ((caracter = br.read()) != -1){
               System.out.println((char) caracter);
               contador++;
           }
           System.out.println("Palabras " + contador);

       } catch (Exception e) {
           System.out.println("ERROR");
       }
    }
}

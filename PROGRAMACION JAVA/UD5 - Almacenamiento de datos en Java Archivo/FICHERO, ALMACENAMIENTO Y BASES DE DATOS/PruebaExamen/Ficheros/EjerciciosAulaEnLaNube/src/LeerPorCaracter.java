import javax.accessibility.AccessibleAction;
import java.io.*;

public class LeerPorCaracter {
    public static void main(String[] args) {
        leerPorJavi("EjerciciosAulaEnLaNube/src/Canalla.txt");
    }

    private static void leerPorJavi(String rutita) {
        String ruta = rutita;
        int contador = 0;
        try{
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            int caracter;
            while ((caracter = br.read()) != -1){
                System.out.println((char) caracter);
                contador++;
            }
            System.out.println("Caracteres " + contador);

        } catch (Exception e) {
            System.out.println("ERROR");
        }
    }
}

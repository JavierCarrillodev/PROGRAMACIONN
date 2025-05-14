import java.io.BufferedReader;
import java.io.FileReader;

public class prueba {
    public static void main(String[] args) {

        String fichero = "EjerciciosFicheros/src/quepasabala.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            String linea;
            int contador = 0;
            while ((linea = br.readLine()) != null){
                contador++;
                System.out.println(linea);
            }
            System.out.println(contador);

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

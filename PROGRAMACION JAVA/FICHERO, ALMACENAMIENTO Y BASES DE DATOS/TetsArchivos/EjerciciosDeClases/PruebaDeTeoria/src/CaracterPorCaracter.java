import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CaracterPorCaracter {
    public static void main(String[] args) {

        String fichero = "ficherito.txt";

        try {
            FileReader fr = new FileReader(fichero);
            BufferedReader br = new BufferedReader(fr);

            int caracter;
            System.out.println("Contenido del fichero " + fichero);
            while ((caracter = br.read()) != -1) {
                System.out.print((char) caracter);
            }
            br.close();


        }catch (IOException e){
            System.out.println("Error" + e.getMessage());
        }

    }
}

import java.io.FileInputStream;
import java.io.IOException;

public class EjemploBasicoBinario {
    public static void main(String[] args) {

        String fileName = "ejemplo.dat";
        //Leer dato desde el archivo binario

        try {
            FileInputStream fis = new FileInputStream(fileName);
            int num;
            System.out.println("Datos leidos desde el archivo binario: ");
            while ((num = fis.read()) != -1)
                System.out.print(num + " ");
            fis.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*Implementa un programa que genere aleatoriamente nombres de persona (combinando nombres y apellidos de 'usa_nombres.txt'
y 'usa_apellidos.txt'). Se le pedirá al usuario cuántos nombres de persona desea
generar y a qué archivo añadirlos (por ejemplo 'usa_personas.txt').*/
public class Ejer4 {
    public static void main(String[] args) {
        String filename = "src/usa_personas.txt";

        try{
            String linea = "Buenas";
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename)) ;
            bw.write(linea);
            bw.close();


        }catch (IOException e){
            System.out.println("Error " + e.getMessage());
        }




    }

}

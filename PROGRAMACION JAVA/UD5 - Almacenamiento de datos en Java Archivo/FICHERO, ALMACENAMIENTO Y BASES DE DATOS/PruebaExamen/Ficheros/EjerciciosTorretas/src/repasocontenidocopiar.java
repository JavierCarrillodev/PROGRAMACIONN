import java.io.*;

public class repasocontenidocopiar {
    public static void main(String[] args) {

        String origen = "/home/javi/Escritorio/PruebaExamen/Ficheros/ejemplo1.txt";
        String destino = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src/copia.txt";

        try {
            BufferedReader br = new BufferedReader(new FileReader(origen));
            BufferedWriter bw = new BufferedWriter(new FileWriter(destino,true));

          String linea;
          while ((linea = br.readLine()) != null){
              bw.write(linea);
              bw.newLine();
            }
            bw.close();
            br.close();
            System.out.println("Copiado correctamente");
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}

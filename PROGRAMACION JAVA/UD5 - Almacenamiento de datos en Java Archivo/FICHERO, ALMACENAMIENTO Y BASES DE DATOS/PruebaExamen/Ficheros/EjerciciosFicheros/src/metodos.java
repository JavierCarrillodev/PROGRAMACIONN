import java.io.*;

public class metodos {
    public static void main(String[] args) {
        File archivo = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosFicheros/src/hola.txt");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivo,true));
            BufferedReader br = new BufferedReader(new FileReader(archivo));

            bw.write("Hola que tal estamos\n");
            bw.close();
            String linea;
            while ((linea = br.readLine()) != null){
                System.out.println(linea);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("error");
        }





    }
}

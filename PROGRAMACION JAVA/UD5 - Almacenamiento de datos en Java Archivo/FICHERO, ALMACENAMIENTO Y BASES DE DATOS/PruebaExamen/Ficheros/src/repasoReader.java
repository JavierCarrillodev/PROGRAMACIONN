import java.io.*;

public class repasoReader {
    public static void main(String[] args) {

        File carpeta = new File("DIRECTORIO");
        if (!carpeta.exists()) {
            carpeta.mkdir();
            System.out.println("Carpeta creada correctamente");
        } else {
            System.out.println("La carpeta ya existe");
        }

        String fichero = "DIRECTORIO/FICHERODENTRO.txt";
        String texto = "Buenas noches\n";

        try {
            FileWriter fileWriter = new FileWriter(fichero,true);
            fileWriter.write(texto);
            fileWriter.close();
            System.out.println("Archivo escrito correctamente");


        } catch (IOException e) {
            System.out.println("ERROR");
        }


        try {
            FileReader fileReader = new FileReader(fichero);

            int caracter;
            System.out.println("Contenido del fichero" + fichero + ":");
            while ((caracter = fileReader.read()) != -1) {
                System.out.print((char) caracter);
            }
            fileReader.close();

        } catch (IOException e) {

        }
    }
}
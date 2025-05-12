import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class mascarpetas {
    public static void main(String[] args) {
        File carpeta = new File("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/PRUEBA");
             if (!carpeta.exists()){
                 carpeta.mkdir();
                 System.out.println("Carpeta creada");
             }else {
                 System.out.println("Carpeta no creada");
             }

                String fichero = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/PRUEBA/HALAMADRID.txt";
                String texto = "HALA MADRID\n";
                int repetir = 10;
             try{
                 PrintWriter pw = new PrintWriter(new FileWriter(fichero,true));
                 BufferedWriter bw = new BufferedWriter(new FileWriter(fichero,true));

                 for (int i = 0; i < repetir ; i++) {
                     bw.write(texto);
                     pw.println("Cachorro que gane este domingo\n");
                 }
                 bw.write(texto);
                 bw.write("Que tal\n");
                 bw.newLine();
                 bw.close();
                 pw.close();
             } catch (IOException e) {
                 System.out.println("ERROR");
             }

             //Mover un archivo a otro lado
             Path origen =  Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/PRUEBA/HALAMADRID.txt");
             Path destino = Paths.get("/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/CarpetaEjercicio/HALAMADRID.txt");
             try{
                 Files.copy(origen,destino, StandardCopyOption.REPLACE_EXISTING);
                 System.out.println("Archivo movido correctamente");

             } catch (Exception e) {
                 System.out.println("ERROR");

             }
             String ruta = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosAulaEnLaNube/src/PRUEBA";
             Listar(new File(ruta));

    }
    public static void Listar(File ruta){
        if (ruta.isDirectory()){
            File[] archivos = ruta.listFiles();
            for (File archivo: archivos){
                if (archivo.isFile() && archivo.getPath().endsWith(".txt")){
                    System.out.println(archivo.getPath());
                } else if (archivo.isDirectory()) {
                    Listar(archivo);
                }
            }
        }
    }
}

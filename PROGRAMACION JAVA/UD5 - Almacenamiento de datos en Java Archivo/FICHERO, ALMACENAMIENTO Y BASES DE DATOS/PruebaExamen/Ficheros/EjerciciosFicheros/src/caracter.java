import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class caracter {
  public static void crearFichero(File fichero){
       try {
           if (!fichero.exists()){
               fichero.createNewFile();
               System.out.println("Fichero creado");
           }else {
               System.out.println("Ya existe");
           }

       } catch (Exception e) {
           System.out.println("Error");
       }
   }

   public static void crearDirectorios(String ruta){
       try{
     Path path =  Paths.get(ruta);
     Files.createDirectories(path);
       } catch (Exception e) {
           System.out.println("Error");
       }

   }

   public static void leerPorCaracter(String fichero){
      try{
          BufferedReader br = new BufferedReader(new FileReader(fichero));
          int contador = 0;
          int caracter;
          while ((caracter = br.read()) != -1){
              System.out.println((char) caracter);
              contador++;
          }
          System.out.println("Hay " + contador + " caracteres");

      } catch (Exception e) {
          System.out.println("Error");
      }
   }

   public static void listarDirectorios(File ruta){
      if (ruta.isDirectory()){
          File[] archivos = ruta.listFiles();
          for (File archivo:archivos){
              if (archivo.isFile()){
                  System.out.println(archivo.getPath());
              } else if (archivo.isDirectory()) {
                  System.out.println(archivo);
              }
          }
      }
   }

   public static void leerPorLinea(String fichero){
      try{
          BufferedReader br = new BufferedReader(new FileReader(fichero));
          String linea;
          int contador = 0;
          while ((linea = br.readLine()) != null){
              contador++;
              System.out.println(linea);
          }
          System.out.println("Hay " + contador + " lineas");
      } catch (Exception e) {
          System.out.println("Error");
      }
   }

    public static void leerPorPalabras(String fichero){
      try {
          BufferedReader br = new BufferedReader(new FileReader(fichero));
          int contador = 0;
          String linea;
          while ((linea = br.readLine()) != null){
              String[] lineasPalabras = linea.split("\\s+");
              contador += lineasPalabras.length;
              System.out.println(linea);
          }
          System.out.println("Hay " + contador + " palabras");

      } catch (Exception e) {
          System.out.println("Error");
      }
    }

    public static void buscarPalabras(String fichero, String palabra){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fichero));
            int contador = 0;
            String linea;
            while ((linea = br.readLine()) != null){
                String[] palabras = linea.split("\\s+");
                for (String palabraActual:palabras){
                    if (palabraActual.equalsIgnoreCase(palabra)){
                        contador++;
                    }
                }
            }
            System.out.println("La palabra buscada es  '" + palabra + "' y se repite " + contador + " veces");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void copiarArchivo(Path archivoOrigen, Path archivoDestino){
        try {

            Files.copy(archivoOrigen,archivoDestino, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Copiado correctamente");

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void copiarContenido(String archivoOrigen,String archivoDestino){
      try {
          BufferedReader br = new BufferedReader(new FileReader(archivoOrigen));
          BufferedWriter bw = new BufferedWriter(new FileWriter(archivoDestino));

          String linea;
          while ((linea = br.readLine()) != null){
              bw.write(linea);
              bw.newLine();
          }
          bw.close();
          br.close();
          System.out.println("Copiado correctamente");


      } catch (Exception e) {
          System.out.println("Error");
      }
    }

    public static void serializar(){
        List<Persona>personas = new ArrayList<>();

         try {
             ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("EjerciciosFicheros/src/personas.dat"));
             out.writeObject(personas);
             out.close();
             System.out.println("Serializado");
         } catch (Exception e) {
             System.out.println("Error");
         }
    }

    public static void deSerializar(){
        try {
            List<Persona>personas = new ArrayList<>();
            personas.add(new Persona("javi",21));
            personas.add(new Persona("nevado",25));
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("EjerciciosFicheros/src/personas.dat"));
            List<Persona>personass = (List<Persona>) in.readObject();
            in.close();
            System.out.println("Objeto leido:");
            for (Persona persona:personas){
                System.out.println(personas);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }

}
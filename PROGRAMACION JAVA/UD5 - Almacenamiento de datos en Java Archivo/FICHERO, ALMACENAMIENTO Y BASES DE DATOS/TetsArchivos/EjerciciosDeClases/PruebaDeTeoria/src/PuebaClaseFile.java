import java.io.File;

public class PuebaClaseFile {
    public static void main(String[] args) {
        File fichero = new File("/home/javi/Documentos/Javi/fichero.txt");
        if (fichero.exists()) {
            System.out.println("Existe el fichero");
        }else {
            System.out.println("No existe el fichero");
        }
        System.out.println("Nombre: " + fichero.getName());
        System.out.println("Longitud: " + fichero.length());
        System.out.println("Ruta absoluta: " + fichero.getAbsolutePath());


        //Ejemplo de como crear una carpeta
        File carpeta = new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/PROGRAMACIÓN JAVA/Aula en la nube");
        if (carpeta.exists()) {
            System.out.println("Existe la carpeta");
        }else {
            System.out.println("No existe la carpeta");
        }
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());


    }

}


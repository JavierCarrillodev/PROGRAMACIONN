import java.io.File;

public class ObjetoFile {
    public static void main (String[] args){
        // fichero
        File archivo = new File("Sorprendido.png");
        if (archivo.exists())
            System.out.println("El archivo existe");
        else
            System.out.println("El fichero no existe");
        System.out.println("Nombre: " + archivo.getName());
        System.out.println("Longitud: " + archivo.length());
        System.out.println("Ruta absoluta: " + archivo.getAbsolutePath()+ "\n\n");

        // carpeta
        File carpeta =  new File("/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5 - Almacenamiento de datos en Java Archivo");
        if (carpeta.exists())
        System.out.println("La carpeta ya existe");

        else
            System.out.println("La carpeta no existe");
        System.out.println("Nombre: " + carpeta.getName());
        System.out.println("Longitud: " + carpeta.length());
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath()+"\n\n");

    }
}

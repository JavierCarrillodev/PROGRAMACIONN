import java.io.File;

public class ListarArchivosySubcarpetas {
    public static void main(String[]args){
        String rutaCarpeta = "";
        listarArchivos(new File(rutaCarpeta));
    }

    public static void listarArchivos(File carpeta){
        if (carpeta.isDirectory()){
            File[] archivos = carpeta.listFiles();

            for (File archivo : archivos){
                if (archivo.isFile()){
                    System.out.println(archivo.getPath());
                }else if (archivo.isDirectory()) {
                    listarArchivos(archivo);}
            }
        }
    }
}

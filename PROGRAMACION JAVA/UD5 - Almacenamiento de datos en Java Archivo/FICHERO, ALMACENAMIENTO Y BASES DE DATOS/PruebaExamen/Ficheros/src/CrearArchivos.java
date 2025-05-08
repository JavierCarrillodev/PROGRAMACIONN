import java.io.File;

public class CrearArchivos {
    public static void  main (String[]args){

        File archivo = new File("ruta/nuevoArchivon.txt");

        try{
            if(archivo.createNewFile()){
                System.out.println("Archivo creado correctamente");
            }else
                System.out.println("Ya existe");

        } catch (Exception e) {
            System.out.println("ERROR");
        }

        File directorio = new File("NuevoDirectorio");
        if (directorio.mkdir()){
            System.out.println("Directorio creado correctamente");
        }else
            System.out.println("Ya existe");

      /*  File borrarArchivo = new File("nuevoArchivo.txt");
        if (borrarArchivo.delete()){
            System.out.println("Archivo borrado correctamente");
        }else
            System.out.println("Archivo no borrado");*/

        File directorio2 = new File("ruta");
        String[] archivos = directorio2.list();
        if (archivos != null) for (String a : archivos){
            System.out.println(a);
        }else {
            System.out.println("No hay archivos en esta carpeta");
        }
    }
}

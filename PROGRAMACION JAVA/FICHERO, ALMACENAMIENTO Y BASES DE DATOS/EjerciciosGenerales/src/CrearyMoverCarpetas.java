/*Implementa un programa que cree, dentro de ‘Documentos’, dos nuevas carpetas: ‘Mis Cosas’ y ‘Alfabeto’.
 Mueve las carpetas ‘Fotografias’ y ‘Libros’ dentro de ‘Mis Cosas’. Luego crea dentro de ‘Alfabeto’ una carpeta por cada letra del alfabeto
 (en mayúsculas): ‘A’, ‘B’, ‘C’... ‘Z’. Te serán de ayuda los códigos numéricos ASCII: https://elcodigoascii.com.ar*/

import java.io.File;

public class CrearyMoverCarpetas {
    public static void main(String[] args) {
        String archivo ="/home/javi/Documentos/Mis Cosas";
        File carpeta = new File(archivo);

        if (!carpeta.exists()) {
            if (carpeta.mkdir()) {
                System.out.println("Creado correctamente");
            }else{
                System.out.println("ERROR al crear");
            }
        }else{
            System.out.println("El archivo ya existe");
        }
    }
}

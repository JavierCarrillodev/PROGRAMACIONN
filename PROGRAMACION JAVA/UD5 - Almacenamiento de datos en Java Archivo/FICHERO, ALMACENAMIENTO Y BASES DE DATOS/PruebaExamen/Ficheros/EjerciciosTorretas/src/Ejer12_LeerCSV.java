import java.io.*;

/*Ejercicio 12: Leer un archivo CSV y mostrar los datos
Crea un programa que lea un archivo CSV llamado datos.csv y muestre su contenido en formato tabla.*/
public class Ejer12_LeerCSV {
    public static void main(String[] args) {

        String archivocsv = "/home/javi/Escritorio/PruebaExamen/Ficheros/EjerciciosTorretas/src.archivo.csv";
    }
    public static void LeerCSV(String archivocsv){
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(archivocsv));
            bw.write("Nombre,Edad");
            bw.newLine();
            bw.write("Javi,21");
            System.out.println("Se ha creado correctamente");
            bw.close();

            //Leer archivo.csv
            BufferedReader br = new BufferedReader(new FileReader(archivocsv));
            String linea;
            while ((linea = br.readLine()) != null){
                String[] datos = linea.split(",");
                for (String campo : datos) {
                    System.out.printf("%-15s", campo); // 15 espacios alineados a la izquierda
                }
                System.out.println(); // Nueva línea por fila

            }
            br.close();


        }catch (IOException e){
            System.out.println("Error");
        }
    }
}

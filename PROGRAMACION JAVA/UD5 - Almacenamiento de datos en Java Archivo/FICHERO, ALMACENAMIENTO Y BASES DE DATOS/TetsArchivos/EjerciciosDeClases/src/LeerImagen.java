//copiar archivo binario
public class LeerImagen {
    public static void main(String[] args) {
        copiarArchivoBinario("/home/javi/Imágenes/pro.png", "/home/javi/Documentos/Javi/1DAM/PROGRAMACIÓN/UD5" +
                " - Almacenamiento de datos en Java Archivo/FICHERO, ALMACENAMIENTO Y BASES DE DATOS" +
                "/TetsArchivos/EjerciciosDeClases/src/pro.png");
    }
    private static void copiarArchivoBinario(String origen, String destino) {
        try {
            java.io.FileInputStream flujoEntrada = new java.io.FileInputStream(origen);
            java.io.FileOutputStream flujoSalida = new java.io.FileOutputStream(destino);
            byte[] buffer = new byte[4096];

            int bytesLeidos;

            while ((bytesLeidos = flujoEntrada.read(buffer)) != -1) {
                flujoSalida.write(buffer, 0, bytesLeidos);
            }
            System.out.println("Archivo binario copiado");

            flujoEntrada.close();
            flujoSalida.close();
        } catch (java.io.IOException e) {
            System.out.println("Error de entrada/salida");
        }
    }
}

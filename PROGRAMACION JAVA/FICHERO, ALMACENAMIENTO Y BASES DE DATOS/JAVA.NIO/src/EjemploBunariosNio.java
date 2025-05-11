import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class EjemploBunariosNio {
    public static void main(String[] args) {
        try {
            // ESCRITURA UTILIZANDO UN CANAL
            // Crea un nuevo archivo y obtiene un canal para escribir en él
            FileOutputStream fos = new FileOutputStream("integers.bin");
            FileChannel canalEscritura = fos.getChannel();

            // Crea un buffer y coloca algunos enteros en él
            ByteBuffer buffer = ByteBuffer.allocate(Integer.BYTES * 4);
            for (int i = 0; i < 4; i++) {
                buffer.putInt(i);
            }

            // Prepara el buffer para escribir
            buffer.flip();
            canalEscritura.write(buffer);

            // Cierra los recursos de escritura
            canalEscritura.close();
            fos.close();

            // LECTURA UTILIZANDO UN CANAL
            FileInputStream fis = new FileInputStream("integers.bin");
            FileChannel canalLectura = fis.getChannel();

            // Crea un buffer para almacenar los enteros
            buffer.clear(); // Limpia el buffer antes de reutilizarlo

            // Lee del archivo al buffer
            canalLectura.read(buffer);
            buffer.flip(); // Prepara el buffer para la lectura

            // Muestra los enteros leídos
            System.out.println("Enteros leídos del archivo:");
            while (buffer.hasRemaining()) {
                System.out.println(buffer.getInt()); // Extrae y muestra los enteros
            }

            // Cierra los recursos de lectura
            canalLectura.close();
            fis.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

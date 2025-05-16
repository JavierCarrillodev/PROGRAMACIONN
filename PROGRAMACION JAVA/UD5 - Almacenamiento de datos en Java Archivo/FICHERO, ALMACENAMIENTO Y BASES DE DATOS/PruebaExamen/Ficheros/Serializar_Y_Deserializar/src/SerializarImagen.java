    import java.io.*;

    public class SerializarImagen {
        public static void main(String[] args) {
            try {
                FileInputStream fis = new FileInputStream("Serializar_Y_Deserializar/src/Sorprendido.png");
                byte[] datos = fis.readAllBytes();
                fis.close();

                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Serializar_Y_Deserializar/src/Sorprendido.dat"));
                oos.writeObject(datos);
                oos.close();
            } catch (IOException e) {
                System.out.println("Error al serializar: " + e.getMessage());
            }
        }
    }

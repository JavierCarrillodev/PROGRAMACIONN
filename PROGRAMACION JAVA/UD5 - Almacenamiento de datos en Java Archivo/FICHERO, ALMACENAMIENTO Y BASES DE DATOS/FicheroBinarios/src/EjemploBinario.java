import java.io.*;

public class EjemploBinario {
    public static void main(String[] args) {

        String fichero = "ejemplo.dat";
        boolean aprobado = true;
        String nombreAlumno = "Pep";
        int conv = 1;
        double nota = 7.8;

        try {
            DataOutputStream out = new DataOutputStream(new FileOutputStream(fichero));
            out.writeBoolean(aprobado);
            out.writeUTF(nombreAlumno);
            out.writeInt(conv);
            out.writeDouble(nota);
            out.close();

            //Leemos datos de fichero binario
            DataInputStream in = new DataInputStream(new FileInputStream(fichero));
            System.out.println("Valor leido aprobado: " + in.readBoolean());
            System.out.println("Valor leido nombreAlumno: " + in.readUTF());
            System.out.println("Valor leido convocatoria: " + in.readInt());
            System.out.println("Valor leido nota: " + in.readDouble());
            in.close();
        }catch (IOException e){
            System.out.println("ERROR");
        }
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EjemploSerializacion {
    public static void main(String[] args) {

        try {
            Grupo dam = new Grupo("1DAM");

            dam.agregarAlumno(new Alumno("Alba", "42342",21));
            dam.agregarAlumno(new Alumno("Javi","234234", 21));
            dam.agregarAlumno(new Alumno("nevado","1134", 15));
            dam.agregarAlumno(new Alumno("Oscar","7734", 18));


            FileOutputStream fos = new FileOutputStream("alumnos.dat");
            ObjectOutputStream out = new ObjectOutputStream(fos);

            out.writeObject(dam);
            out.writeInt(23);
            out.writeObject(new Alumno("Victoria","1134V", 19));

            out.writeObject(new Alumno("JAVA","1134", 95));

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

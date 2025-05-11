
public class Alumno {
    private String nombre;
    private String apellido;
    private double notaMedia;

    public Alumno(String nombre, String apellido, double notaMedia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.notaMedia = notaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getNotaMedia() {
        return notaMedia;
    }
}
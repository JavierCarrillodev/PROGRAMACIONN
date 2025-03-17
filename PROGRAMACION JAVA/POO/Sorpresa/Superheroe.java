package POO.Sorpresa;

public class Superheroe {
    private String nombre;
    private String descripcion;
    private boolean capa;

    public Superheroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.capa = false;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String Descripcion) {
        this.descripcion = Descripcion;
    }
    public boolean getCapa() {
        return capa;
    }
    public void setCapa(boolean capa) {
        this.capa = capa;
    }

    @Override
    public String toString() {
        return "superheroe{" +
                "nombre='" + nombre + '\'' +
                ", Descripcion='" + descripcion + '\'' +
                ", capa=" + capa +
                '}';
    }
}

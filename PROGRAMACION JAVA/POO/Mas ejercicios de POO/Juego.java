public class Juego {

    private String nombre;
    private String historia;
    private String dificultad;
    private int precio = 60;

    public Juego() {
    }

    public Juego(String nombre, String historia, String dificultad, int precio) {
        this.nombre = nombre;
        this.historia = historia;
        this.dificultad = dificultad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }


    public String Detalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre de juego = " + this.getNombre());
        sb.append(", Historia = " + this.getHistoria());
        sb.append(", Dificultad de juego = " + this.getDificultad());
        sb.append(", Precio de juego = " + this.getPrecio());
        return sb.toString();
    }



    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", historia='" + historia + '\'' +
                ", dificultad='" + dificultad + '\'' +
                ", precio=" + precio +
                '}';
    }
}

package Aeropuerto;

public abstract class Aeropuerto {
    private int id;
    private String nombre;
    private int anoDeInaguracion;
    private int capacidad;

    public static int idAutoincrementado = 1;

    public Aeropuerto() {
        this("",0,0);
    }

    public Aeropuerto( String nombre, int anoDeInaguracion, int capacidad) {
        this.nombre = nombre;
        this.anoDeInaguracion = anoDeInaguracion;
        this.capacidad = capacidad;
        this.id = idAutoincrementado++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnoDeInaguracion() {
        return anoDeInaguracion;
    }

    public void setAnoDeInaguracion(int anoDeInaguracion) {
        this.anoDeInaguracion = anoDeInaguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public static int getIdAutoincrementado() {
        return idAutoincrementado;
    }

    public static void setIdAutoincrementado(int idAutoincrementado) {
        Aeropuerto.idAutoincrementado = idAutoincrementado;
    }

    public abstract void gananciasTotales(int cantidad);


    @Override
    public String toString() {
        return
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", anoDeInaguracion=" + anoDeInaguracion +
                ", capacidad=" + capacidad;
    }
}

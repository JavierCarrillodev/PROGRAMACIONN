package POO.Sorpresa;
import java.util.ArrayList;
public class Coleccion {
    private String nombreColeccion;
    private ArrayList<String>listaFiguras;

    public Coleccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
        this.listaFiguras = new ArrayList<String>();
    }
    public String getNombreColeccion() {
        return nombreColeccion;
    }
    public void setNombreColeccion(String nombreColeccion) {
        this.nombreColeccion = nombreColeccion;
    }
    public void anadirFigura(Figura fig) {
        listaFiguras.add(fig.toString());
    }
    public void subirPrecio(double cantidad, String id) {
    this.listaFiguras.add(id + " " + cantidad);
    }

    @Override
    public String toString() {
        return "Coleccion{" +
                "nombreColeccion='" + nombreColeccion + '\'' +
                ", listaFiguras=" + listaFiguras +
                '}';
    }

    public void conCapa() {


    }
}


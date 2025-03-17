package biblioteca;

public class Revista {
    private String ISBN;
    private String titulo;
    private int ayoPublicacion;
    private int numero;

    public Revista(String ISBN, String titulo, int ayoPublicacion, int numero) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.ayoPublicacion = ayoPublicacion;
        this.numero = numero;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAyoPublicacion() {
        return ayoPublicacion;
    }

    public void setAyoPublicacion(int ayoPublicacion) {
        this.ayoPublicacion = ayoPublicacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", ayoPublicacion=" + ayoPublicacion +
                ", numero=" + numero +
                '}';
    }
}

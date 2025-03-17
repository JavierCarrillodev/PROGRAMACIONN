package biblioteca;

public class Libro {
    private String ISBN;
    private String titulo;
    private int ayoPublicacion;
    private boolean prestado = false;

    public Libro(String ISBN, String titulo, boolean prestado, int ayoPublicacion) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.prestado = false;
        this.ayoPublicacion = ayoPublicacion;
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

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestarLibro() {
        prestado = true;
        System.out.println("Libro prestado");
    }

    public void devuelveLibro() {
        if (prestado == true) {
            System.out.println("El libro se ha devuelto");
        }else {
            System.out.println("El libro no se ha llegado a prestar");
        }
    }

    public void estaPrestado() {
        if (prestado == true) {
            System.out.println("El libro esta prestado ");
        }if (prestado == false) {
            System.out.println("El libro no esta prestado ");
        }

    }

    @Override
    public String toString() {
        return "Libro" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", ayoPublicacion=" + ayoPublicacion;

    }
}


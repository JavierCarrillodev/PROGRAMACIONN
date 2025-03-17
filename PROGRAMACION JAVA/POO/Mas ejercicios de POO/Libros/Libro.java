package Libros;

import java.util.Objects;

public class Libro {
    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
        this ("","",0,"",false);
    }

    public Libro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
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

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    //Metodos
    public void prestar() {
        if (prestado) {
            System.out.println("El libro " + ISBN + "con titulo " + titulo + " y autor " + autor + " tiene " + numeroPaginas + " paginas y esta prestado" );

        }else {
            this.prestado = true;
            System.out.println("El libro " + ISBN + "con titulo " + titulo + " y autor " + autor + " tiene " + numeroPaginas + " paginas, se ha prestado" );
        }
    }
    public void devolver(){
        if (!this.prestado) {
            System.out.println("No esta prestado");
        }else {
            this.prestado = false;
            System.out.println("Devolvido");
        }
    }

    public double imprimir(double coste){
        return coste * this.numeroPaginas;

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return ISBN == libro.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(ISBN);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "ISBN='" + ISBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}

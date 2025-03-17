public class Libro {

    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    boolean  prestado;

    public Libro() {
    }

    public Libro(String ISBN, String titulo, int numeroPaginas, String autor, Boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado =  prestado;
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

    public void prestar(){
        if(!prestado){
            prestado = true;
            System.out.println("Prestado con exito");
        }else {
            System.out.println("El libro ya esta prestado");

        }
    }

    public void devolver(){
        if(prestado){
            prestado = false;
            System.out.println("El libro " + titulo + " ha sido devuelto");
        } else {
            System.out.println("El libro no esta prestado");
        }
    }

    public double imprimir(double costePagina){
        costePagina = 0.50;
       return numeroPaginas * costePagina;
    }

    public void imprimirInfo(){
        String estado = prestado ? "y esta prestado" : "no esta prestado";
        System.out.println("El libro " + ISBN + " con titulo " + titulo + " y autor "
        + autor + " tiene " + numeroPaginas + " paginas " + estado);
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

    public boolean compararLibros(Object obj) {

        // Verifica si el objeto es una instancia de la clase Libro y si el ISBN es igual
        if (obj instanceof Libro) {
            Libro libro = (Libro) obj;
            return this.ISBN.equals(libro.ISBN);
        }

        return false; // Si no es un Libro o los ISBN no son iguales


    }




}


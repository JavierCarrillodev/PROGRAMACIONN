package POO;

public class caballo {
    private String nombre;
    private String color;
    private int edad;
    private int carreras_Ganadas;
    caballo (String n,String c, int e, int cg ) {
        this.nombre = n;
        this.edad = e;
        this.carreras_Ganadas = cg;
        this.color = c;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void cabalga(){
        System.out.println("Tocoto,tocoto,tocoto");
    }
    public void relincha() {
        System.out.println("iijaaaaaa");
    }
    public void tamaño() {System.out.println("aalaaa es la L");
    }
}


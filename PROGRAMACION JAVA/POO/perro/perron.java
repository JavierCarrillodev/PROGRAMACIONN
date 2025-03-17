package POO.perro;

public class perron {
    int ID;
    String raza;
    int precio;

    public perron(int ID, String raza, int precio) {
        this.ID = ID;
        this.raza = raza;
        this.precio = precio;

    }
    public void correr(){
        System.out.println("Perro corriendo");
    }
    public void datos(){
        System.out.println("id:" + ID);
        System.out.println("raza:" + raza);
        System.out.println("precio:" + precio);
    }
}

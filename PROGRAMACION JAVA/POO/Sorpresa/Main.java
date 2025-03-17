package POO.Sorpresa;

public class Main {
    public static void main(String[] args) {
        Superheroe Spiderman = new Superheroe("Spiderman");
        Spiderman.setDescripcion("El amigo y vecino Spiderman");
        System.out.println(Spiderman);
        Spiderman.setCapa(false);

        //Crear las dimensiones de la figura
        Dimension dimensionesFigura = new Dimension();
        dimensionesFigura.setAlto(10.0);
        dimensionesFigura.setAncho(4.0);
        dimensionesFigura.setProfundidad(6.0);
        System.out.println(dimensionesFigura);

        Figura figuraSpiderman = new Figura("Spider-123",50.2,Spiderman,dimensionesFigura);
        System.out.println(figuraSpiderman);

        figuraSpiderman.subirPrecio(10.0);
        System.out.println("\nDespues de aumentar el precio de  la figura");
        System.out.println(figuraSpiderman);




    }
}

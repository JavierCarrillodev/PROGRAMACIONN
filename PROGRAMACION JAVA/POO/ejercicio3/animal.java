package POO.ejercicio3;

public class animal {
    public void comer(){
        System.out.println("El animal está comiendo");
    }
    class mamifero extends animal {
        public void comer(){
            System.out.println("Comerr");
    }

    }
    public void dormir(){
        System.out.println("Durmiendo...");
    }
    public void morder(){
        System.out.println("El animal lanza un bocado");
    }


}
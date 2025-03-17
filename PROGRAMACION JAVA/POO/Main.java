package POO;

class Animal {
    public void sound() {
        System.out.println("Cualquier sonido");
    }
}
class Dog extends Animal {
    public void sound() {
        System.out.println("Guau guau");
    }
}
public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.sound();
    }
}
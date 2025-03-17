package Animal;

public abstract class Animal{
    private int edad;
    private String nombre;

    public Animal(int edad, String nombre){
        this.edad = 0;
        this.nombre = "Desconocido";
    }
    public int getEdad(){
        return this.edad;
    }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    Animal Animal1 = new Animal ()


}

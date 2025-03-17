package POO.sorpresa2;


public class lavadora extends Electrodomestico {
    ;
    private double precio;
    private boolean aguaCaliente;


    public lavadora(String marca, int potencia){
        super("Lavadora", marca, potencia);
        this.precio = 0.0;
        this.aguaCaliente = false;
    }
    public lavadora(String marca, int precio, int potencia, boolean aguaCaliente){
        super("Lavadora", marca,potencia);
         this.precio = precio;
         this.aguaCaliente = aguaCaliente;
    }
    public void getPrecio(double precio){
        this.precio = precio;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public boolean getAguaCaliente(){
        return this.aguaCaliente;
    }
    public void setAguaCaliente(boolean aguaCaliente){
        this.aguaCaliente = aguaCaliente;
    }

    @Override
    public String toString() {
        return "lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }
    public int getConsumo(int horas) {
        if (aguaCaliente == false) {
        getConsumo(horas * getPotencia());
        } else if (aguaCaliente == true) {
            horas* (potencia + potencia * 0,20)

        }


    }

}





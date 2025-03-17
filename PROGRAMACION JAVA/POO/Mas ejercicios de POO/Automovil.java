public class Automovil {
   private String fabricante = "Victoria";
   private String modelo;
   private String color = "Verde";
   private double cilindrada;
   private int capacidadDeposito = 55;

   public static final String COLOR_ROJO = "Rojo";
   public static final String COLOR_AMARILLO = "Amarillo";
   public static final String COLOR_AZUL = "Azul";
   public static final String COLOR_VERDE = "Verde";

   private static int capacidadDepositoEstatico = 30;
    public Automovil(){
    }

    public Automovil(String fabricante, String modelo) {
        this();
        this.fabricante = fabricante;
        this.modelo = modelo;

    }

    public Automovil(String fabricante, String modelo, String color) {
        this(fabricante, modelo);
        this.color = color;
    }
    public Automovil(String fabricante, String modelo, String color, double cilindrada) {
        this(fabricante, modelo, color);
        this.cilindrada = cilindrada;
    }

    public Automovil(String fabricante, String modelo, String color, double cilindrada, int capacidadDeposito) {
        this(fabricante,modelo,color,cilindrada);
        this.capacidadDeposito = capacidadDeposito;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadDeposito() {
        return capacidadDeposito;
    }

    public void setCapacidadDeposito(int capacidadDeposito) {
        this.capacidadDeposito = capacidadDeposito;
    }

    public static int getCapacidadDepositoEstatico() {
        return capacidadDepositoEstatico;
    }

    public static void setCapacidadDepositoEstatico(int capacidadDepositoEstatico) {
        Automovil.capacidadDepositoEstatico = capacidadDepositoEstatico;
    }

    public String detalles(){
        StringBuilder sb = new StringBuilder();
        String modelo = "auto = ";
        sb.append("fabricante = " + this.getFabricante());
        sb.append("modelo = " + this.getModelo());
        sb.append("color = " + this.getColor());
        sb.append("cilindrada = " + this.getCilindrada());
        sb.append(", CapacidadDeposito = " + this.getCapacidadDeposito());
        return sb.toString();
    }
    public String acelerar(int rpm){
        return "EL auto con nombre del fabricante " + this.fabricante + " acelerando a " + rpm + " rpm";
    }
    public String frenar(){
        return "EL auto con nombre del fabricante: " + this.fabricante + " Con modelo: " + this.modelo + " Esta frenando!!";
    }
    //Creamos un metodo con los dos metodos anteriores y lo juntamos
    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(rpm);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }

    public double calcularConsumo(int km, double porcentajeGastado){
        return km/(capacidadDeposito*porcentajeGastado);
    }

    public static double calcularConsumoEstatico(int km, Double porcentajeGastado){
        return km / (Automovil.capacidadDepositoEstatico * (porcentajeGastado / 100));
    }

    @Override
    public boolean equals(Object obj) {
        Automovil a = (Automovil) obj;
        return (this.fabricante.equals(a.getFabricante()) && this.modelo.equals(a.getModelo()));
    }

}

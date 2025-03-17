public class tiempo_en_minutos {
    public static void main(String[] args) {
        int minutos = 1000;
        int minutos_dias = 60 * 24;
        int dias = minutos / minutos_dias;
        int resto = minutos % minutos_dias;
        int horas = resto / 60;
        minutos = resto % 60;
        System.out.println("Dias: " + dias + " Horas: " + horas + " Minutos: " + minutos);
    }
}

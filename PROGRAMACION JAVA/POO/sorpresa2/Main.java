package POO.sorpresa2;

public class Main {
    public static void main(String[] args) {
        Electrodomestico horno = new Electrodomestico("Limpieza", "Roca", 100);
        System.out.println(horno);

        int horasDeUso =24;
        double consumo = horno.getConsumo(horasDeUso);
        System.out.println("Consumo en " + horasDeUso + " horas: " + consumo + " kwh");

        double costesHora = 0.15;
        double costeConsumo = horno.getConsumo(horasDeUso);
        System.out.println("Coste del consumo en " + horasDeUso + " horas: $" + costeConsumo);

        lavadora lavadora1 = new lavadora(" Roca",2);
        lavadora1.setPrecio(400.0);
        System.out.println(lavadora1);
        lavadora lavadora2 = new lavadora(" Roca",600,2,true);
        System.out.println(lavadora2.toString());
    }


}

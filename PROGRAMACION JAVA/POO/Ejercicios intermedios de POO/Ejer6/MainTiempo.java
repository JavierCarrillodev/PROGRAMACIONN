package Ejer6;

public class MainTiempo {
        public static void main(String[] args) {

            Tiempo t1 = new Tiempo(1,1,1);
            Tiempo t2 = new Tiempo(1,1,1);
            Tiempo t4 = new Tiempo(1,1,1);


            //De esta forma para guardarlo en un nuevo objeto, tinees que iunstanciar el objeto y gguardar en el la suma
            Tiempo t3 = t1.sumar(t1, t2,t4);

            //Con el metodo to string.
            System.out.println("Suma de t1 = " + t1 + " suma de t2 = " + t2 + " y suma de t3 = " + t4);
            System.out.println("La suma total es = " + t1.sumar(t1, t2, t4));
        }
}

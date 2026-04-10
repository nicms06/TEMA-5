package interfaces.Ejercicio01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Socio socio1 = new Socio(1, "Nicolás", 19);
        Socio socio2 = new Socio(2, "Alonso", 16);

        System.out.println("Comprobación compareTo");
        if (socio1.compareTo(socio2) > 0){
            System.out.println(socio1.getNombre() + " tiene un id mayor que " + socio2.getNombre());
        } else{
            System.out.println(socio2.getNombre() + " tiene un id mayor que " + socio1.getNombre());
        }

        Socio[] socios = {
                new Socio(105, "Marta", 40),
                new Socio(12, "Juan", 19),
                new Socio(88, "Elena", 33),
                new Socio(1, "Carlos", 50)
        };

        System.out.println("\nArray desordenado");
        imprimirArray(socios);

        Arrays.sort(socios);

        System.out.println("\nrray ordenado por ID");
        imprimirArray(socios);
    }
    public static void imprimirArray(Socio[] array) {
        for (Socio s : array) {
            System.out.println(s);
        }
    }

}

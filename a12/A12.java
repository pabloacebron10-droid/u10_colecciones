package a12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class A12 {
    public static void main(String[] args) {
        Collection <Integer> premios = new ArrayList<>(Arrays.asList(1000, 50, 500, 50, 200));
        System.out.println("Lista inicial: ");
        System.out.println(premios);
        System.out.println("-------------------------------------------\n");

        final int NUMERO_BUSCAR_FRECUENCIA = 50;
        final int NUMERO_BUSCAR_POSICION = 500;

        int frecuencia = Collections.frequency(premios, NUMERO_BUSCAR_FRECUENCIA);
        System.out.println("Hay [" + frecuencia + "] premios con valor [" + NUMERO_BUSCAR_FRECUENCIA + "]");
        System.out.println("-------------------------------------------\n");        

        int maxPrecio = Collections.max(premios);
        int minPrecio = Collections.min(premios);

        System.out.println("El premio máximo es de: " + maxPrecio + " euros.");
        System.out.println("El premio mínimo es de: " + minPrecio + " euros.");
        System.out.println("-------------------------------------------\n");

        Collections.shuffle((ArrayList<Integer>) premios); //Hay que castear a lista, porque recibe Lista y no colección como parámetro

        System.out.println("Lista desordenada: ");
        System.out.println(premios);
        System.out.println("-------------------------------------------\n");

        Collections.sort((ArrayList<Integer>) premios); //Mismo casteo
        System.out.println("Lista ordenada: ");
        System.out.println(premios);
        System.out.println("-------------------------------------------\n");

        int posicion = Collections.binarySearch((ArrayList<Integer>) premios,NUMERO_BUSCAR_POSICION);
        System.out.println("El premio con valor [" + NUMERO_BUSCAR_POSICION + "] Se encuentra en el índice [" + posicion + "]");
        System.out.println("-------------------------------------------\n");
    }
}

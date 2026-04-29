package a6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class A6 {
    public static void main(String[] args) {

        final int LONGITUD_DE_LA_LISTA= 20;
        final int RANGO_NUMEROS_ALEATORIOS= 100;
        Collection<Integer> numeros = new ArrayList<>();

        for(int i=0; i<LONGITUD_DE_LA_LISTA; i++){
        Integer numero= (int) (Math.random()*RANGO_NUMEROS_ALEATORIOS) +1;
        numeros.add(numero);
        }

        Integer tabla_de_numeros [] = numeros.toArray(new Integer [0]);
        Arrays.sort(tabla_de_numeros);
        Collection<Integer> numeros_ordenados = new ArrayList<>(Arrays.asList(tabla_de_numeros));

        // Ordenada de mayor a menor
        Integer tabla_de_numeros_inversa [] = new Integer[tabla_de_numeros.length];

        for(int i= 0 ;i< tabla_de_numeros_inversa.length ; i++){
            tabla_de_numeros_inversa[i]= tabla_de_numeros[tabla_de_numeros_inversa.length-1 - i];
        }

        Collection<Integer> numeros_ordenados_inverso = new ArrayList<>(Arrays.asList(tabla_de_numeros_inversa));
        

        System.out.println("Colección original: \n" + numeros);
        System.out.println("Colección ordenada: \n" + numeros_ordenados);
        System.out.println("Colección ordenada a la inversa: \n"+ numeros_ordenados_inverso);
    }
}

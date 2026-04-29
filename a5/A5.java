package a5;

import java.util.ArrayList;
import java.util.Collection;

public class A5 {
    public static void main(String[] args) {
    
    final int LONGITUD_DE_LA_LISTA= 100;
    final int NUMERO_SEGUNDA_COLECCION= 5;
    Collection<Integer> numeros = new ArrayList<>();

    for(int i=0; i<LONGITUD_DE_LA_LISTA; i++){
        Integer numero= (int) (Math.random()*10) +1;
        numeros.add(numero);
    }

    System.out.println(numeros);

    Collection<Integer> lista_nueva = new ArrayList<>();

    for(int i=0; i<LONGITUD_DE_LA_LISTA; i++){
        lista_nueva.add(NUMERO_SEGUNDA_COLECCION);
    }

    numeros.removeAll(lista_nueva);

    System.out.println(numeros);

    }
}

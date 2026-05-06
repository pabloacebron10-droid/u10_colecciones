package a09;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class A09 {

    public static void main(String[] args) {
    final int TAMAÑO_DE_LA_LISTA = 30;
    final int RANGO_DE_NUMEROS = 10;
    Collection <Integer> listaOriginal = new ArrayList<>();

    for (int i=0; i<TAMAÑO_DE_LA_LISTA; i++){
        int numeroAleatorio = (int) (Math.random()*RANGO_DE_NUMEROS) +1; 
        listaOriginal.add(numeroAleatorio);
    }

    System.out.println("Lista Original:\n" + listaOriginal + "\n----------------------------------------------------------\n");

    Collection <Integer> HashSet = new HashSet<>(listaOriginal);
    System.out.println("Lista pasada a HashSet: \nSe eliminan los duplicados, se pierden los indices y el orden:\n" + HashSet + "\n\n");

    Collection <Integer> TreeSet = new TreeSet<>(listaOriginal);
    System.out.println("Lista pasada a TreeSet: \nElimina duplicados y ordena (orden natural):\n" + TreeSet + "\n\n");

    Collection <Integer> LinkedHashSet = new LinkedHashSet<>(listaOriginal);
    System.out.println("Lista pasada a LinkedHasshSet: \nElimina duplicados y garantiza el mismo orden que tenía la lista:\n" + LinkedHashSet + "\n\n");


    }
}

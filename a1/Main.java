package a1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Array de Strings
        String[] palabras = new String[0];
        palabras = guardar(palabras, "AH ahhhhhh");
        palabras = guardar(palabras, "Pejino tiene amigos...");

        // Array de Integer
        Integer[] numeros = new Integer[0];
        numeros = guardar(numeros, 10);
        numeros = guardar(numeros, 20);

        // Mostrar resultados
        System.out.println("Array de Strings: " + Arrays.toString(palabras));
        System.out.println("Array de Integer: " + Arrays.toString(numeros));
    }

    public static <E> E[] guardar(E[] tabla, E elemento){
        E[] tablaNueva = Arrays.copyOf(tabla, tabla.length +1);
        tablaNueva[tablaNueva.length -1] = elemento;
        return tablaNueva;
}
}
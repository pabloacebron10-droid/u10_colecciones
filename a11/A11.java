package a11;

import java.util.Scanner;
import java.util.TreeMap;

public class A11 {
    public static void main(String[] args) {
        TreeMap < String, Integer > tienda = new TreeMap<>();
            tienda.put("Teclado", 15);
            tienda.put("Ratón", 28);
            tienda.put("Monitor", 10);
            tienda.put("Portátil", 6);
            tienda.put("Auriculares", 20);
            tienda.put("Impresora", 4);
            tienda.put("Webcam", 12);
            tienda.put("Micrófono", 8);
            tienda.put("Altavoces", 9);
            tienda.put("Disco SSD", 18);
            tienda.put("Memoria RAM", 25);
            tienda.put("Tarjeta Gráfica", 3);

        Scanner sc= new Scanner(System.in);
        int opcion;

        do {
            Util.mostrarMenu();
            opcion = Util.pedirNumero(sc);

            switch (opcion) {
                case 1 -> {
                    String codigo = Util.getCodigo(sc);
                    int stockInicial = Util.pedirStock(sc, "Introduce el stock inicial: ");
                    Metodos.altaProducto(codigo, stockInicial, tienda); 
                }

                case 2 -> {
                    String codigo = Util.getCodigo(sc);
                    Metodos.darDeBaja(codigo, tienda);   
                }

                case 3 -> {
                    String codigo = Util.getCodigo(sc);
                    int nuevoStock = Util.pedirStock(sc, "Introduce el nuevo stock: ");
                    Metodos.actualizarStock(codigo, nuevoStock, tienda);
                }

                case 4 -> {
                    Metodos.mostrarListaProductos(tienda);
                }

                case 5 ->{
                    System.out.println("Saliendo...");
                }

                default-> { 
                    System.out.println("Opcion no válida.");
                }
            }
        } while (opcion != 5);
    }
}

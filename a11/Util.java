package a11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

    public static void mostrarMenu(){
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║          SISTEMA DE INVENTARIO             ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║                                            ║");
        System.out.println("║  [1] Alta producto                         ║");
        System.out.println("║  [2] Baja producto                         ║");
        System.out.println("║  [3] Actualizar stock                      ║");
        System.out.println("║  [4] Listar existencias                    ║");
        System.out.println("║  [5] Salir                                 ║");
        System.out.println("║                                            ║");
        System.out.println("╠════════════════════════════════════════════╣");
        System.out.println("║  Seleccione una opción →                   ║"); 
        System.out.print  ("╠════════════════════════════════════════════╣");
        }

    public static int pedirNumero(Scanner sc) {
        int opcion = -1;

        while (opcion == -1) {
            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Introduce una opción válida");
                
            } finally{
                sc.nextLine(); // limpiar buffer
            }
        }

        return opcion;
    }

    public static int pedirStock(Scanner sc, String mensaje) {
        int stock = -1;

        while (stock < 0) {
            System.out.print(mensaje);

            try {
                stock = sc.nextInt();

                if (stock < 0) {
                    System.out.println("El stock no puede ser negativo");
                }

            } catch (InputMismatchException e) {
                System.out.println("Introduce un número válido");
                
            } finally{
                sc.nextLine(); // limpiar buffer
            }
    }

        return stock;
    }

    public static String getCodigo(Scanner sc) {
        System.out.println("Introduce el código del producto: ");
        String codigo = sc.nextLine();
        return codigo;
    }
}

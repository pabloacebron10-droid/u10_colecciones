package a11;

import java.util.Set;
import java.util.TreeMap;

public class Metodos {

    public static void altaProducto(String codigo, int stockInicial, TreeMap<String, Integer> tienda){
        if (!tienda.containsKey(codigo)){
            tienda.put(codigo, stockInicial);
        } else {
            System.out.println("El producto ya existe, no se puede añadir");
        }
    }

    public static void darDeBaja(String codigo, TreeMap<String, Integer> tienda){
        if (tienda.remove(codigo) == null){
            System.out.println("No se puede eliminar, no existe");
        } else {
            System.out.println(codigo + " eliminado con éxito.");
        }
    }

    public static void actualizarStock(String codigo, int nuevoStock, TreeMap<String, Integer> tienda){
        if (tienda.containsKey(codigo)){
            tienda.put(codigo, nuevoStock);
        } else {
            System.out.println("El producto no existe, no se puede actualizar el stock");
        }
    }

    public static void mostrarListaProductos(TreeMap<String, Integer> tienda) {
        Set<String> codigosProducto = tienda.keySet();

        if (codigosProducto.isEmpty()) {
            System.out.println("No hay productos en la tienda.");
        } else {

            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║                    LISTADO DE PRODUCTOS                      ║");
            System.out.println("╠══════════════════════════════════════════════════════════════╣");

            for (String producto : codigosProducto) {
                int stock = tienda.get(producto);

                System.out.println(" Producto: " + producto + " | Stock: " + stock);
            }

            System.out.println("╚══════════════════════════════════════════════════════════════╝");
        }
    }
}


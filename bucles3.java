import java.util.Scanner;

public class bucles3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el número de productos
        System.out.print("Ingrese la cantidad de productos: ");
        int numeroProductos = scanner.nextInt();

        // Bucle para ingresar las cantidades de cada producto
        for (int i = 1; i <= numeroProductos; i++) {
            System.out.print("Ingrese la cantidad disponible del producto " + i + ": ");
            int cantidadDisponible = scanner.nextInt();

            // Verificar si se necesita realizar un pedido
            if (cantidadDisponible < 5) {
                System.out.println("El producto " + i + " tiene menos de 5 unidades. Es necesario realizar un pedido.");
            }
        }

        // Finalizar el programa
        System.out.println("Revisión de inventario completada.");
        scanner.close();
    }
}

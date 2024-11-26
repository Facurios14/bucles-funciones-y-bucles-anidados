import java.util.Scanner;

public class bucles4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalVentas = 0; // Acumulador para las ventas de la semana

        // Bucle para registrar las ventas durante 7 días
        for (int dia = 1; dia <= 7; dia++) {
            System.out.print("Ingrese las ventas del día " + dia + ": ");
            double ventasDiarias = scanner.nextDouble();
            totalVentas += ventasDiarias; // Sumar las ventas del día al total
        }

        // Mostrar el total de ventas de la semana
        System.out.printf("El total de ventas de la semana es: $%.2f%n", totalVentas);

        scanner.close();
    }
}


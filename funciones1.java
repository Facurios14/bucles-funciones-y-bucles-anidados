import java.util.Scanner;

public class funciones1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] ventas = new double[30]; // Arreglo para almacenar las ventas diarias
        double totalIngresos = 0;

        // Ingresar las ventas y calcular el total
        for (int i = 0; i < 30; i++) {
            System.out.print("Ventas del día " + (i + 1) + ": ");
            ventas[i] = scanner.nextDouble();
            totalIngresos += ventas[i]; // Sumar las ventas al total
        }

        // Mostrar el total de ingresos
        System.out.println("Los ingresos totales del mes son: $" + totalIngresos);

        scanner.close();
    }
}


import java.util.Scanner;

public class bucles2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double TARIFA = 15.0;

        System.out.print("Ingrese la cantidad de empleados: ");
        int empleados = scanner.nextInt();

        for (int i = 1; i <= empleados; i++) {
            System.out.print("Horas trabajadas por el empleado " + i + ": ");
            double horas = scanner.nextDouble();
            System.out.println("Salario: $" + (horas * TARIFA));
        }

        scanner.close();
    }
}


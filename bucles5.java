import java.util.Scanner;

public class bucles5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de empleados: ");
        int numeroEmpleados = scanner.nextInt();

        for (int i = 1; i <= numeroEmpleados; i++) {
            System.out.print("Horas trabajadas por el empleado " + i + ": ");
            int horasTrabajadas = scanner.nextInt();

            if (horasTrabajadas > 40) {
                System.out.println("El empleado " + i + " trabajó " + (horasTrabajadas - 40) + " horas extras.");
            }
        }

        scanner.close();
    }
}

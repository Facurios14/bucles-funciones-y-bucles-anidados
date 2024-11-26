
import java.util.Scanner;

public class bucles1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double totalHoras = 0;

        // Bucle para registrar las horas de cada actividad
        System.out.print("Ingrese las horas dedicadas a estudiar: ");
        totalHoras += scanner.nextDouble();

        System.out.print("Ingrese las horas dedicadas a hacer ejercicios: ");
        totalHoras += scanner.nextDouble();

        System.out.print("Ingrese las horas dedicadas a leer: ");
        totalHoras += scanner.nextDouble();

        System.out.print("Ingrese las horas dedicadas al tiempo libre: ");
        totalHoras += scanner.nextDouble();

        // Mostrar el tiempo total dedicado
        System.out.println("El tiempo total dedicado a las actividades es: " + totalHoras + " horas.");

        scanner.close();
    }
}




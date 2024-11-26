import java.util.Scanner;

public class buclesA6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();

        // Mostrar los números primos hasta N
        System.out.println("Números primos hasta " + N + ":");
        for (int i = 2; i <= N; i++) {
            if (esPrimo(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }

    // Función para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // No es primo
            }
        }
        return true; // Es primo
    }
}

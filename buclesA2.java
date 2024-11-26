import java.util.Scanner;

public class buclesA2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();

        // Calcular y mostrar los factoriales
        for (int i = 0; i <= N; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial de " + i + " = " + factorial);
        }

        scanner.close();
    }
}

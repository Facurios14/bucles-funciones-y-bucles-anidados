import java.util.Scanner;

public class buclesA3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el valor de N
        System.out.print("Introduce un número N: ");
        int N = scanner.nextInt();

        // Calcular la suma de los factoriales
        long sumaFactoriales = 0;
        for (int i = 0; i <= N; i++) {
            long factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sumaFactoriales += factorial;
        }

        // Imprimir el resultado
        System.out.println("La suma de los factoriales de 0 a " + N + " es: " + sumaFactoriales);

        scanner.close();
    }
}

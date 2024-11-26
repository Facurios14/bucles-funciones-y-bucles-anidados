public class buclesA5 {
    public static void main(String[] args) {
        // Bucle para contar del 00000 al 99999
        for (int i = 0; i < 100000; i++) {
            String contador = String.format("%05d", i); // Asegurarse de que el número tenga 5 dígitos
            contador = contador.replace('3', 'E'); // Reemplazar el 3 por E
            System.out.println(contador);
        }
    }
}

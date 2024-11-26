public class buclesA4 {
    public static void main(String[] args) {
        String letras = "ZYXWVUTSRQPONMLKJIHGFEDCBA";

        // Mostrar las secuencias en líneas separadas
        for (int i = 0; i < letras.length(); i++) {
            System.out.println(letras.substring(i));
        }
    }
}

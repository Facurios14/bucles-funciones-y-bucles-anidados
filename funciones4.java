public class funciones4 {
    public static void main(String[] args) {
        String[] clientes = {"Carlos", "Ana", "Luis", "María", "Pedro"};
        int[] compras = {5, 12, 8, 15, 4};

        // Llamada a la función para calcular descuentos
        calcularDescuentos(clientes, compras);
    }

    public static void calcularDescuentos(String[] clientes, int[] compras) {
        for (int i = 0; i < clientes.length; i++) {
            // Si el cliente ha realizado más de 10 compras
            if (compras[i] > 10) {
                System.out.println(clientes[i] + " recibe un 10% de descuento.");
            }
        }
    }
}

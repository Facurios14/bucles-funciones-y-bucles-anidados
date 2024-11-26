public class funciones7 {
    public static void main(String[] args) {
        // Arreglo con los montos de las compras de los clientes
        double[] compras = {450.0, 600.0, 200.0, 550.0, 700.0};

        // Llamada a la función para aplicar el descuento
        aplicarDescuento(compras);
    }

    // Función para aplicar un 15% de descuento a compras mayores a $500
    public static void aplicarDescuento(double[] compras) {
        double descuento;
        for (int i = 0; i < compras.length; i++) {
            if (compras[i] > 500) {
                descuento = compras[i] * 0.15; // 15% de descuento
                System.out.println("Compra de $" + compras[i] + " - Descuento: $" + descuento + " - Precio con descuento: $" + (compras[i] - descuento));
            } else {
                System.out.println("Compra de $" + compras[i] + " - No aplica descuento.");
            }
        }
    }
}


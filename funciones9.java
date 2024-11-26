public class funciones9 {
    public static void main(String[] args) {
        // Arreglo con los precios originales de los productos
        double[] preciosOriginales = {100.0, 250.0, 300.0, 50.0, 150.0};

        // Llamada a la función para calcular el precio final con descuento
        calcularPrecioFinal(preciosOriginales);
    }

    // Función para calcular el precio final con un 10% de descuento
    public static void calcularPrecioFinal(double[] preciosOriginales) {
        double descuento = 0.10; // 10% de descuento

        for (int i = 0; i < preciosOriginales.length; i++) {
            double precioFinal = preciosOriginales[i] * (1 - descuento); // Aplicar descuento
            System.out.println("Precio original: $" + preciosOriginales[i] + " - Precio final con descuento: $" + precioFinal);
        }
    }
}

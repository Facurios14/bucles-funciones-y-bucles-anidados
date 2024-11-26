public class funciones6 {
    public static void main(String[] args) {
        // Arreglo con los montos de las facturas de los clientes
        double[] facturas = {150.0, 200.0, 50.0, 120.0, 300.0};

        // Llamada a la función para calcular los impuestos
        calcularImpuesto(facturas);
    }

    // Función para calcular el impuesto de cada factura
    public static void calcularImpuesto(double[] facturas) {
        double impuesto;
        for (int i = 0; i < facturas.length; i++) {
            impuesto = facturas[i] * 0.21; // 21% de impuesto
            System.out.println("Factura: $" + facturas[i] + " - Impuesto: $" + impuesto);
        }
    }
}

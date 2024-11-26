public class funciones2 {
    public static void main(String[] args) {
        // Arreglo de productos y de cantidades de stock
        String[] productos = {"Televisor", "Celular", "Laptop", "Tablet", "Cámara"};
        int[] stocks = {3, 10, 2, 6, 4};

        // Llamada a la función para generar el reporte de bajo stock
        generarReporteBajoStock(productos, stocks);
    }

    // Función para generar el reporte de productos con bajo stock (menos de 5 unidades)
    public static void generarReporteBajoStock(String[] productos, int[] stocks) {
        System.out.println("Productos con bajo stock:");

        // Recorremos todos los productos para ver si tienen menos de 5 unidades
        for (int i = 0; i < productos.length; i++) {
            if (stocks[i] < 5) {
                System.out.println(productos[i] + " - Unidades: " + stocks[i]);
            }
        }
    }
}


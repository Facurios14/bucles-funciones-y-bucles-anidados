public class funciones3 {
    public static void main(String[] args) {
        // Arreglos de clientes y sus facturas pendientes
        String[] clientes = {"Carlos", "Ana", "Luis", "María", "Pedro"};
        double[] facturasPendientes = {450.0, 600.0, 200.0, 800.0, 350.0};

        // Llamada a la función para enviar facturas a clientes con facturas mayores a $500
        enviarFacturas(clientes, facturasPendientes);
    }

    // Función para enviar facturas a clientes con facturas pendientes mayores a $500
    public static void enviarFacturas(String[] clientes, double[] facturasPendientes) {
        System.out.println("Clientes con facturas mayores a $500:");

        // Recorre los clientes y verifica si tienen facturas mayores a $500
        for (int i = 0; i < clientes.length; i++) {
            if (facturasPendientes[i] > 500) {
                System.out.println(clientes[i] + " - Monto de factura: $" + facturasPendientes[i]);
            }
        }
    }
}

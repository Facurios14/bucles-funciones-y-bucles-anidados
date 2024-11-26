public class funciones8 {
    public static void main(String[] args) {
        // Arreglo con los nombres de los empleados
        String[] empleados = {"Carlos", "Ana", "Luis", "María", "Pedro"};

        // Arreglo con las horas trabajadas por cada empleado
        int[] horasTrabajadas = {40, 45, 38, 50, 32};

        // Llamada a la función para calcular el pago semanal
        calcularPagoSemanal(empleados, horasTrabajadas);
    }

    // Función para calcular el pago semanal de los empleados
    public static void calcularPagoSemanal(String[] empleados, int[] horasTrabajadas) {
        double pagoPorHora = 15.0; // Pago por hora trabajada

        for (int i = 0; i < empleados.length; i++) {
            double pagoSemanal = horasTrabajadas[i] * pagoPorHora; // Cálculo del pago semanal
            System.out.println(empleados[i] + " trabajó " + horasTrabajadas[i] + " horas y su pago semanal es: $" + pagoSemanal);
        }
    }
}


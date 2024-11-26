public class funciones5 {
    public static void main(String[] args) {
        // Arreglo con las calificaciones de satisfacción de los clientes
        int[] calificaciones = {4, 5, 3, 4, 2, 5, 3};

        // Llamada a la función para calcular el promedio
        double promedio = calcularPromedioSatisfaccion(calificaciones);

        // Mostrar el promedio de satisfacción
        System.out.println("El promedio de satisfacción es: " + promedio);
    }

    // Función para calcular el promedio de satisfacción
    public static double calcularPromedioSatisfaccion(int[] calificaciones) {
        int suma = 0;

        // Recorrer el arreglo y sumar las calificaciones
        for (int i = 0; i < calificaciones.length; i++) {
            suma += calificaciones[i];
        }

        // Calcular el promedio dividiendo la suma entre el número de calificaciones
        return (double) suma / calificaciones.length;
    }
}

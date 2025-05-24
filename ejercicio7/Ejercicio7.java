import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in); // Creamos un objeto Scanner.

        // Definimos las dimensiones de la matriz. Usaremos 3 filas y 4 columnas para 12 valores.
        final int FILAS = 3;
        final int COLUMNAS = 4;
        int[][] matriz = new int[FILAS][COLUMNAS]; // Declaramos y creamos la matriz.

        System.out.println("Por favor, ingresa " + (FILAS * COLUMNAS) + " números enteros para la matriz " + FILAS + "x" + COLUMNAS + ":");

        // --- Llenar la matriz ---
        for (int i = 0; i < FILAS; i++) { // Bucle para las filas
            for (int j = 0; j < COLUMNAS; j++) { // Bucle para las columnas
                System.out.print("Escribe el número para la posición [" + i + "][" + j + "]: ");
                matriz[i][j] = ent.nextInt(); // Guardamos el número.
            }
        }

        // --- Mostrar la matriz original (opcional, pero útil para verificar) ---
        System.out.println("\n--- Matriz Ingresada ---");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%5d", matriz[i][j]); // %5d para alinear números en 5 espacios
            }
            System.out.println(); // Salto de línea al final de cada fila
        }

        // --- Buscar el Punto de Silla ---
        boolean encontradoPuntoDeSilla = false; // Bandera para saber si encontramos alguno

        // Recorremos cada elemento de la matriz para verificar si es un punto de silla
        for (int i = 0; i < FILAS; i++) { // Bucle para las filas
            for (int j = 0; j < COLUMNAS; j++) { // Bucle para las columnas
                int valorActual = matriz[i][j];

                // 1. Verificar si es el valor mínimo en su fila
                boolean esMinimoEnFila = true;
                for (int k = 0; k < COLUMNAS; k++) { // Recorrer la fila 'i'
                    if (valorActual > matriz[i][k]) { // Si encontramos un valor más pequeño en la misma fila
                        esMinimoEnFila = false; // No es el mínimo de la fila
                        break; // No necesitamos seguir buscando en esta fila
                    }
                }

                // Si no es el mínimo en su fila, no puede ser un punto de silla, pasamos al siguiente elemento
                if (!esMinimoEnFila) {
                    continue; // Pasa a la siguiente iteración del bucle interior (siguiente columna)
                }

                // 2. Si es el mínimo en su fila, ahora verificar si es el valor máximo en su columna
                boolean esMaximoEnColumna = true;
                for (int k = 0; k < FILAS; k++) { // Recorrer la columna 'j'
                    if (valorActual < matriz[k][j]) { // Si encontramos un valor más grande en la misma columna
                        esMaximoEnColumna = false; // No es el máximo de la columna
                        break; // No necesitamos seguir buscando en esta columna
                    }
                }

                // Si es el mínimo en su fila Y el máximo en su columna, entonces es un punto de silla
                if (esMinimoEnFila && esMaximoEnColumna) {
                    System.out.println("\n¡Punto de silla encontrado!");
                    System.out.println("Valor: " + valorActual + " en la posición [" + i + "][" + j + "]");
                    encontradoPuntoDeSilla = true;
                    // Opcional: Si solo quieres encontrar el primer punto de silla, puedes salir de los bucles aquí
                    // break; // Sale del bucle de columnas
                }
            }
            // Opcional: Si solo quieres encontrar el primer punto de silla y ya saliste del bucle de columnas
            // if (encontradoPuntoDeSilla) {
            //     break; // Sale del bucle de filas
            // }
        }

        // Si el bucle terminó y no se encontró ningún punto de silla
        if (!encontradoPuntoDeSilla) {
            System.out.println("\nNo se encontró ningún punto de silla en la matriz.");
        }

        ent.close(); // Cerramos el Scanner.
    }
}

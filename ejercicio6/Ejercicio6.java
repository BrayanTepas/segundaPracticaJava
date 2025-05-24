import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in); // Creamos un objeto Scanner.

        // Declaramos y creamos una matriz de enteros de 3 filas y 3 columnas (3x3 = 9 valores).
        int[][] matrizOriginal = new int[3][3];
        // Declaramos una segunda matriz para almacenar la transpuesta.
        // Tendrá las mismas dimensiones para una matriz cuadrada.
        int[][] matrizTranspuesta = new int[3][3]; 

        System.out.println("Por favor, ingresa 9 números enteros para la matriz 3x3:");

        // --- Llenar la matriz original ---
        // Recorremos las filas (i) y luego las columnas (j) para pedir cada número.
        for (int i = 0; i < 3; i++) { 
            for (int j = 0; j < 3; j++) { 
                System.out.print("Escribe el número para la posición [" + i + "][" + j + "]: ");
                matrizOriginal[i][j] = ent.nextInt(); // Guardamos el número ingresado.
            }
        }

        // --- Calcular la matriz transpuesta ---
        // Para la transpuesta, intercambiamos los índices i y j.
        // Lo que estaba en matrizOriginal[i][j] va a matrizTranspuesta[j][i].
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTranspuesta[j][i] = matrizOriginal[i][j];
            }
        }

        // --- Mostrar la matriz original ---
        System.out.println("\n--- Matriz Original ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Usamos printf para un formato más ordenado. %4d significa un entero de 4 espacios de ancho.
                System.out.printf("%4d", matrizOriginal[i][j]); 
            }
            System.out.println(); // Salto de línea al final de cada fila.
        }

        // --- Mostrar la matriz transpuesta ---
        System.out.println("\n--- Matriz Transpuesta ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%4d", matrizTranspuesta[i][j]);
            }
            System.out.println(); // Salto de línea al final de cada fila.
        }

        ent.close(); // Cerramos el Scanner.
    }
}

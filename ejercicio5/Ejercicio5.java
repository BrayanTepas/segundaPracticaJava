import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in); // Creamos un objeto para leer la entrada.

        // Una matriz (arreglo bidimensional) de 3 filas y 3 columnas para 9 artículos.
        String[][] articulos = new String[3][3]; 

        System.out.println("ingresa 9 nombres de artículos:");

        // Recorremos las filas (i) y luego las columnas (j) para pedir cada artículo.
        for (int i = 0; i < 3; i++) {  // Recorremos las filas.
            for (int j = 0; j < 3; j++) {  // Recorremos las columnas.
                System.out.print("Escribe el artículo para la posición [" + i + "][" + j + "]: ");
                articulos[i][j] = ent.nextLine(); // Guardamos, Line es para leer espacios en blanco.
            }
        }

        // \n es un salto de línea.
        System.out.println("\n--- Contenido de la matriz filas invertidas ---");
        // Empezamos desde la última fila (índice 2) y vamos hacia la primera (índice 0).
        for (int i = 2; i >= 0; i--) { 
            // Recorremos las columnas normalmente para cada fila.
            for (int j = 0; j < 3; j++) { 
                // Imprimimos la posición y el artículo en una sola línea.
                System.out.println("Artículo en [" + i + "][" + j + "]: " + articulos[i][j]); 
            }
        }

        ent.close(); // Cerramos el Scanner.
    }
}
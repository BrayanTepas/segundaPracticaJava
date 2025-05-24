import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); //objeto scanner para leer la entrada de datos.
        
        int[] numeros = new int[12]; // Se crea un array con capacidad de 12 espacios para guardar int.
        
        int cantidadPares = 0; // Es una var contador para números pares, inicializada en 0.
        int cantidadImpares = 0; //Es una var contador para números impares, inicializada en 0.

        
        System.out.println("ingresa 12 números enteros:");//opcional para indicar que ingrese los números.
        
        // 'i' va desde 0 hasta 11, que son los índices válidos para un array de 12, for para llenar.
        for (int i = 0; i < 12; i++) {
            // Se imprime un mensaje que solicita el número, mostrando el índice actual.
            System.out.print("Escriba el número [" + i + "]: ");
            numeros[i] = scanner.nextInt(); //guarda el número ingresado en la posición 'i' del array.

            // Se verifica si el número es par o impar. Mediante módulo(%) de / si es igual a 0 es par.
            if (numeros[i] % 2 == 0) {
                cantidadPares++; // Si es par, se incrementa el contador de pares.
            } else {
                cantidadImpares++; // Si no es par (es impar), se incrementa el contador de impares.
            }
        }

        // Se imprime un salto de línea (opcional).
        System.out.println("");
        // Se muestran los resultados. Mostrando el msg y la cantidad de pares e impares ingresados.
        System.out.println("Cantidad de números pares: " + cantidadPares);
        System.out.println("Cantidad de números impares: " + cantidadImpares);

        // Cerramos el objeto Scanner para liberar los recursos del sistema asociados a la entrada.
        scanner.close(); 
    }
}

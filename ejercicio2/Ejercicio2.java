import java.util.Scanner;

public class Ejercicio2 {
public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); // se crea objeto que lee la entrada de datos.
        
        int[] numeros = new int[12]; // se crea array con capacidad de 12 espacios.
        int suma = 0; //aqui se hara la suma nota se declara para ocparla en el for.
        double promedio; // hacer el promedio puede ser decimal

        // Se imprime un mensaje en la consola para indicar al usuario que ingrese los números(opcional).
        System.out.println("Ingresa 12 números enteros:");
        
        // 'i' va desde 0 hasta 11, que son los índices válidos para un array de 12 for para llenar.
        for (int i = 0; i < 12; i++) {
            // Se imprime un mensaje que solicita el número, mostrando el índice actual.
            System.out.print("Escriba el número [" + i + "]: ");
            // Se lee el número ingresado por el usuario y se asigna a la posición 'i' del array 'numeros'.
            numeros[i] = scanner.nextInt(); 
            // Se suma el número recién ingresado a la variable 'suma'.
            suma = suma + numeros[i]; 
        }

        // Se calcula el promedio dividiendo la suma total con la cantidad de elementos array (12).
        promedio = (double) suma / 12;  //se hace conversion a double para que no haiga error.

        // Se imprime un salto de línea.
        System.out.println("");
        // Se imprime el promedio calculado.
        System.out.println("El promedio de los números ingresados es: " + promedio);

        // Cerramos el objeto Scanner para liberar los recursos del sistema.
        scanner.close(); 
    }
}

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Creamos un objeto Scanner para leer la entrada de datos del usuario
        Scanner ent = new Scanner(System.in);
        int[] numeros = new int[10]; // Creamos un array de enteros con capacidad para 10 números

        // Inicializamos 'mayor' con el valor más bajo posible
        int mayor = Integer.MIN_VALUE; 
        // Inicializamos 'menor' con el valor más alto posible
        int menor = Integer.MAX_VALUE; 

        System.out.println("ingresa 10 números enteros:"); //opcional

        // Usamos un bucle for para llenar el array i va desde 0 hasta 9,ya que es un array de 10
        for (int i = 0; i < 10; i++) {
            System.out.print("Escriba el número [" + i + "]: ");
            numeros[i] = ent.nextInt(); 

            // Usamos Math.max agarra el numero mayor y Math.min = agarra num menor para actualizar
            mayor = Math.max(mayor, numeros[i]);
            menor = Math.min(menor, numeros[i]);
        }

        System.out.println("El número mayor ingresado es: " + mayor);
        System.out.println("El número menor ingresado es: " + menor);

        ent.close();
    }
}

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        //se crea el objeto scanner para leer lo ingresado y se guarda en la array
        Scanner scanner = new Scanner(System.in);
        String[] frutas = new String[10];//se crea la array con 10 espacios para guardar

        // se imprime para decirle al usuario cuantas frutas debe escribir. opcional.
        System.out.println("ingresa 10 nombres de frutas");

        //nota aqui se ingresa los numeros exactos ya que se tiene idea de como se guardaran.
        //for para llenar el array. nota: <10 es ya que el array empieza en 0 y termina en 9.
        for (int i = 0; i < 10; i++) {
            //se envia el mensaje hasta llegar que i = 9 y se guarda segun el indice.
            System.out.print("Escriba el nombre de la fruta [" + i + "]: ");
            frutas[i] = scanner.nextLine();
        }

        // mensaje opcional le dice al usuario como se imprime
        System.out.println("\nfrutas desde la ultima a la primera");
        for (int i = 9; i >= 0; i--) { // Empezamos desde el último índice (9) y vamos hasta el primero (0)
            System.out.println("[" + i + "] " + frutas[i]);//se imprime hasta llegar a 0 por eso es i--.
        }
        // Cerramos el objeto Scanner para liberar los recursos del sistema.
        scanner.close();
    }
}

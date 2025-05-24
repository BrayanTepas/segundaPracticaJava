import java.util.Scanner; // Importa la clase Scanner para gestionar la entrada de datos del usuario.

public class JuegoAnimales {
    public static void main(String[] args) {
        int puntajeTotal = 0; // Variable para almacenar el puntaje acumulado de todos los niveles.

        // Crea una ÚNICA instancia de Scanner en la clase principal (Main).
        // Esto es una buena práctica de gestión de recursos, ya que solo debe haber
        // un Scanner abierto para System.in en un programa.
        Scanner scannerGlobal = new Scanner(System.in);

        System.out.println("¡Bienvenido al Juego de Animales!");

        // --- Nivel 1 ---
        // Se crea una instancia de Nivel1.
        // Se PASA el 'scannerGlobal' (la única instancia de Scanner) al constructor de Nivel1.
        // Esto permite que Nivel1 lea la entrada del usuario sin crear su propio Scanner,
        // asegurando que el recurso sea gestionado centralmente.
        Nivel1 nivel1 = new Nivel1(scannerGlobal);
        nivel1.imprimePreguntas(); // Inicia las preguntas del Nivel 1.
        puntajeTotal += nivel1.puntaje; // Suma el puntaje obtenido en Nivel 1 al puntaje total.

        // --- Nivel 2 ---
        // Se crea una instancia de Nivel2.
        // Se PASA el MISMO 'scannerGlobal' al constructor de Nivel2.
        // Esto mantiene la coherencia en la gestión de la entrada de usuario a través de los niveles.
        Nivel2 nivel2 = new Nivel2(scannerGlobal);
        nivel2.imprimePreguntas(); // Inicia las preguntas del Nivel 2.
        puntajeTotal += nivel2.puntaje; // Suma el puntaje obtenido en Nivel 2 al puntaje total.

        // --- Fin del Juego ---
        System.out.println("\n--- ¡Juego Finalizado! ---");
        // Muestra los puntajes individuales de cada nivel y el puntaje total final.
        System.out.println("Puntaje acumulado del Nivel 1: " + nivel1.puntaje + " puntos.");
        System.out.println("Puntaje acumulado del Nivel 2: " + nivel2.puntaje + " puntos.");
        System.out.println("Tu puntaje total final es: " + puntajeTotal + " puntos.");

        // Cierra el Scanner UNA SOLA VEZ, al final de todo el programa.
        // Esto libera los recursos del sistema asociados al Scanner.
        // Es crucial cerrarlo en la clase que lo creó para evitar fugas de recursos.
        scannerGlobal.close();
    }
}
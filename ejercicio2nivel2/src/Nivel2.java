import java.util.Scanner; // Importa la clase Scanner para la entrada de datos.

// Clase Nivel2: Encapsula la lógica y los datos para el segundo nivel del juego.
public class Nivel2 {
    public int puntaje; // Atributo público: el puntaje actual del jugador para este nivel.
    private String respuesta; // Atributo privado: la respuesta del usuario (encapsulado).
    private final String[] animales; // Atributo privado y final: arreglo de respuestas correctas (encapsulado).
    private final Scanner ent; // Atributo privado y final: objeto Scanner para entrada (encapsulado, inyectado).

    // Constructor: Inicializa el nivel y recibe una instancia de Scanner.
    public Nivel2(Scanner scanner) {
        puntaje = 0; // Inicializa el puntaje del nivel.
        this.ent = scanner; // Asigna el Scanner recibido, manteniendo la gestión del recurso externa.
        animales = new String[4]; // Inicializa el arreglo de respuestas correctas.
        animales[0] = "leon";      // Define la primera respuesta correcta.
        animales[1] = "elefante";  // Define la segunda respuesta correcta.
        animales[2] = "pez";       // Define la tercera respuesta correcta.
        animales[3] = "serpiente"; // Define la cuarta respuesta correcta.
    }

    // Método privado: Evalúa una respuesta dada a una pregunta específica (lógica encapsulada).
    // Recibe la pregunta a mostrar y la respuesta correcta esperada.
    private void evaluarRespuesta(String pregunta, String respuestaCorrecta) {
        System.out.println("\n" + pregunta); // Imprime la pregunta.
        respuesta = ent.nextLine(); // Lee la respuesta del usuario.

        if (respuesta.equalsIgnoreCase(respuestaCorrecta)) { // Compara la respuesta ignorando mayúsculas/minúsculas.
            System.out.println("¡Correcto! Has ganado 20 puntos");
            puntaje += 20; // Aumenta el puntaje si es correcta.
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + respuestaCorrecta);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10; // Disminuye el puntaje si es incorrecta.
        }
    }

    // Método público: Orquesta la presentación de preguntas y la evaluación de respuestas.
    public void imprimePreguntas() {
        System.out.println("\n--- Nivel 2 ---");

        // Llama al método privado 'evaluarRespuesta' para cada pregunta,
        // encapsulando la lógica de interacción y puntuación por pregunta.
        evaluarRespuesta("¿Es el rey de la selva?", animales[0]);
        evaluarRespuesta("¿Es el animal terrestre más grande?", animales[1]);
        evaluarRespuesta("¿Es un animal que vive en el agua y tiene branquias?", animales[2]);
        evaluarRespuesta("¿Es un reptil sin patas que se arrastra?", animales[3]);

    }
}
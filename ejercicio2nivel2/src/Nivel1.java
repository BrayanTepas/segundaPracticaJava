import java.util.Scanner; // Importa la clase Scanner para la entrada de datos.

// Clase Nivel1: Encapsula la lógica y los datos para el primer nivel de un juego de preguntas.
public class Nivel1 {
    public int puntaje; // Atributo público: el puntaje actual del jugador.
    private String respuesta; // Atributo privado: la respuesta del usuario (encapsulado).
    private final String[] animales; // Atributo privado y final: arreglo de respuestas correctas (encapsulado).
    private final Scanner ent; // Atributo privado y final: objeto Scanner para entrada (encapsulado).

    // Constructor: Inicializa el nivel y recibe el Scanner para mantenerlo bajo control externo.
    public Nivel1(Scanner scanner) {
        puntaje = 0; // Inicializa el puntaje.
        this.ent = scanner; // Asigna el Scanner recibido, promoviendo el manejo externo del recurso.
        animales = new String[2]; // Inicializa el arreglo de animales.
        animales[0] = "perro"; // Define la respuesta correcta para la primera pregunta.
        animales[1] = "gato";  // Define la respuesta correcta para la segunda pregunta.
    }

    // Método privado: Calcula el puntaje para la pregunta del perro (lógica encapsulada).
    private void puntajePerro() {
        if (respuesta.equalsIgnoreCase(animales[0])) { // Compara la respuesta ignorando mayúsculas/minúsculas.
            System.out.println("¡Correcto! Has ganado 10 puntos");
            puntaje += 10; // Incrementa el puntaje si es correcto.
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[0]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5; // Decrementa el puntaje si es incorrecto.
        }
    }

    // Método privado: Calcula el puntaje para la pregunta del gato (lógica encapsulada).
    private void puntajeGato() {
        if (respuesta.equalsIgnoreCase(animales[1])) { // Compara la respuesta.
            System.out.println("¡Correcto! Has ganado 10 puntos");
            puntaje += 10;
        } else {
            System.out.println("¡Incorrecto! La respuesta es: " + animales[1]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }

    // Método público: Imprime las preguntas y gestiona las respuestas (interfaz pública del nivel).
    public void imprimePreguntas() {
        System.out.println("\n--- Nivel 1 ---");
        System.out.println("¿Es un animal que ladra y come croquetas?");
        respuesta = ent.nextLine(); // Lee la respuesta del usuario.
        puntajePerro(); // Llama al método encapsulado para calcular el puntaje.

        System.out.println("\n¿Es un animal que maulla y toma leche?");
        respuesta = ent.nextLine(); // Lee la siguiente respuesta.
        puntajeGato(); // Llama al método encapsulado para calcular el puntaje.

    }
}
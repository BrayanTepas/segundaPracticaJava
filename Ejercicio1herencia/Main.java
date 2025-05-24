package Ejercicio1herencia; // Declara el paquete al que pertenece esta clase principal.

// Importa las clases derivadas (subclases) necesarias
// desde su respectivo paquete 'Ejercicio1herencia.src'.
import Ejercicio1herencia.src.Entrenador;
import Ejercicio1herencia.src.Futbolista;
import Ejercicio1herencia.src.Masajista;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de objetos de cada clase derivada:
        // Se instancian objetos de Futbolista, Entrenador y Masajista,
        // utilizando sus constructores para inicializar tanto los atributos
        // heredados de Persona como los propios de cada subclase.
        Futbolista futbolista = new Futbolista(2, "Lionel", "Messi", 25, 10, "Delantero");
        Entrenador entrenador = new Entrenador(3, "Luis", "Martínez", 40, "F123");
        Masajista masajista = new Masajista(4, "Ana", "López", 35, "Fisioterapia", 5);

        // 2. Demostración de Herencia y Comportamientos de Futbolista:
        System.out.println("Futbolista:");
        // Los métodos 'concentrarse()' y 'viajar()' son heredados de la clase 'Persona'.
        futbolista.concentrarse(); // Comportamiento heredado.
        // Los métodos 'jugarPartido()' y 'entrenar()' son específicos de la clase 'Futbolista'.
        futbolista.jugarPartido(); // Comportamiento propio.
        futbolista.entrenar();    // Comportamiento propio.
        // El método 'imprimir()' es específico de Futbolista y muestra sus datos.
        futbolista.imprimir();    // Comportamiento propio.

        // Salto de línea para separar la salida.
        System.out.println("\nEntrenador:");
        // Los métodos 'concentrarse()' y 'viajar()' son heredados de la clase 'Persona'.
        entrenador.concentrarse(); // Comportamiento heredado.
        // Los métodos 'dirigirPartido()' y 'dirigirEntrenamiento()' son específicos de la clase 'Entrenador'.
        entrenador.dirigirPartido();    // Comportamiento propio.
        entrenador.dirigirEntrenamiento(); // Comportamiento propio.
        // Se accede al atributo 'nombre' del entrenador usando el método 'getNombre()' heredado de 'Persona'.
        System.out.println("nombre: " + entrenador.getNombre());

        // Salto de línea para separar la salida.
        System.out.println("\nMasajista:");
        // Los métodos 'concentrarse()' y 'viajar()' son heredados de la clase 'Persona'.
        masajista.concentrarse(); // Comportamiento heredado.
        // El método 'darMasaje()' es específico de la clase 'Masajista'.
        masajista.darMasaje();    // Comportamiento propio.
        masajista.viajar();       // Comportamiento heredado.
    }
}
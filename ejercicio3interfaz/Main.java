package ejercicio3interfaz; // Declara el paquete al que pertenece esta clase Main.

// Esto permite que la clase Main utilice la clase Doctor.
import ejercicio3interfaz.src.Doctor;

// Esto permite que la clase Main utilice la clase Ingeniero.
import ejercicio3interfaz.src.Ingeniero;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de instancias de las clases concretas:

        // Crea un nuevo objeto de la clase Ingeniero,
        // inicializándolo con el nombre "Juan" y la especialidad "Civil".
        Ingeniero ingeniero = new Ingeniero("Juan", "Civil");

        // Crea un nuevo objeto de la clase Doctor,
        // inicializándolo con el nombre "Maria" y la especialidad "Pediatra".
        Doctor doctor = new Doctor("Maria", "Pediatra");

        // 2. Llamada a métodos y demostración del polimorfismo:

        // Se llama al método calcularSueldo() del objeto 'ingeniero'.
        // Debido a que 'Ingeniero' implementa la interfaz 'Profesion'
        // y ha sobrescrito 'calcularSueldo()', se ejecuta la versión
        // específica de 'calcularSueldo()' definida en la clase Ingeniero.
        System.out.println("Sueldo del ingeniero: " + ingeniero.calcularSueldo());

        // Imprime una cadena de texto que incluye el sueldo del doctor.
        // Se llama al método calcularSueldo() del objeto 'doctor'.
        System.out.println("Sueldo del doctor: " + doctor.calcularSueldo());
    }
}

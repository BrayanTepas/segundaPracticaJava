package Ejercicio2claseabstracta; // Declara el paquete al que pertenece esta clase Main.

// Esto es necesario para poder crear y usar objetos de tipo Empleado en esta clase Main.
import Ejercicio2claseabstracta.src.Empleado;

public class Main {
    public static void main(String[] args) {
        // Se crea un nuevo objeto 'empleado' de la clase 'Empleado'.
        // Al crear este objeto 'Empleado', también se está creando implícitamente
        // un objeto 'Personal' (la parte heredada) con los atributos id, nombre y apellido.
        Empleado empleado = new Empleado(1, "Juan", "Pérez", 2000, 5);

        // 2. Llamada al método 'registrar()' del objeto 'empleado':
        // El método 'registrar()' es un método abstracto definido en la clase 'Personal'
        // y ha sido implementado (sobrescrito) en la clase 'Empleado'.
        // Al llamar a 'empleado.registrar()', se ejecuta la implementación específica
        // del método 'registrar()' que se encuentra dentro de la clase 'Empleado'.
        // Esto demostrará la información de registro del empleado en la consola.
        System.out.println("--- Información del Empleado ---");
        empleado.registrar();

        // 3. Llamada al método 'calcularSueldo()' y demostración de su resultado:
        // El método 'calcularSueldo()' también es un método abstracto de 'Personal'
        // implementado en 'Empleado'.
        // Al llamar a 'empleado.calcularSueldo()', se ejecuta la lógica de cálculo
        // de sueldo definida en la clase 'Empleado'.
        double sueldo = empleado.calcularSueldo();

        // Finalmente, se imprime en la consola el valor del sueldo total que fue calculado.
        System.out.println("Sueldo total: " + sueldo);

    }
}
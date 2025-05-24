package ejercicio1polimorfismo; // Declara el paquete al que pertenece esta clase Main.

// Importa las clases derivadas (subclases) de Vehiculo y la clase base Vehiculo
import ejercicio1polimorfismo.src.Automovil;
import ejercicio1polimorfismo.src.Avion;
import ejercicio1polimorfismo.src.Barco;
import ejercicio1polimorfismo.src.Vehiculo;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de instancias de las clases derivadas:
        Automovil auto = new Automovil("Toyota", "Corolla", 120.0, 4, "Gasolina");
        Avion avion = new Avion("Boeing", "747", 900.0, 4, "Comercial");
        Barco barco = new Barco("Yate", "Azimut", 30.0, true, "De lujo");

        // 2. Creación de una instancia de la clase base 'Vehiculo':
        // se crea un objeto de la clase base 'Vehiculo' para mostrar su comportamiento por defecto.
        Vehiculo vehiculo = new Vehiculo("Vehículo", "Modelo", 0.0);

        // 3. Llamada al método 'arrancar()' de la clase base 'Vehiculo':
        // Aquí se invoca el método 'arrancar()' tal como está definido en la clase 'Vehiculo',
        System.out.println("--- Comportamiento de la clase base Vehiculo ---");
        vehiculo.arrancar(); // Imprime: "El vehículo Vehículo Modelo ha arrancado."

        System.out.println(""); 

        // 4. Demostración de Polimorfismo con 'Automovil':
        // Aunque 'auto' es de tipo Automovil, los métodos 'arrancar()', 'mostrarInfo()' y 'detener()'
        // están sobrescritos en la clase Automovil. Java ejecutará las versiones específicas de Automovil.
        System.out.println("--- Comportamiento específico de Automovil (Polimorfismo) ---");
        auto.arrancar();    // Invoca el arrancar() de Automovil (sobrescrito).
        auto.mostrarInfo(); // Invoca el mostrarInfo() de Automovil (sobrescrito).
        auto.detener();     // Invoca el detener() de Automovil (sobrescrito).

        System.out.println(""); // Salto de línea.

        // 5. Demostración de Polimorfismo con 'Avion':
        System.out.println("--- Comportamiento específico de Avion (Polimorfismo) ---");
        avion.arrancar();   // Invoca el arrancar() de Avion (sobrescrito).
        avion.mostrarInfo(); // Invoca el mostrarInfo() de Avion (sobrescrito).
        avion.detener();    // Invoca el detener() de Avion (sobrescrito).

        System.out.println(""); // Salto de línea.

        // 6. Demostración de Polimorfismo con 'Barco':
        System.out.println("--- Comportamiento específico de Barco (Polimorfismo) ---");
        barco.arrancar();   // Invoca el arrancar() de Barco (sobrescrito).
        barco.mostrarInfo(); // Invoca el mostrarInfo() de Barco (sobrescrito).
        barco.detener();    // Invoca el detener() de Barco (sobrescrito).
    }
}
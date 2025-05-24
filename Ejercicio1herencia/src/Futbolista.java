package Ejercicio1herencia.src; // Declara el paquete al que pertenece esta clase.

// Clase 'Futbolista' que HEREDA de 'Persona'.
// Esto significa que un Futbolista ES UNA Persona, heredando sus atributos
// (id, nombre, apellidos, edad) y comportamientos (concentrarse, viajar).
public class Futbolista extends Persona {
    // Atributos específicos de un Futbolista.
    private Integer dorsal;
    private String demarcacion;

    // Constructor por defecto.
    public Futbolista() {
    }

    // Constructor con parámetros.
    // Llama al constructor de la clase padre 'Persona' (super(...))
    // para inicializar los atributos heredados de Persona.
    public Futbolista(Integer id, String nombre, String apellidos, Integer edad, Integer dorsal, String demarcacion) {
        super(id, nombre, apellidos, edad); // Inicializa los campos de Persona.
        this.dorsal = dorsal;               // Inicializa los campos propios de Futbolista.
        this.demarcacion = demarcacion;
    }

    // Métodos 'getter' para los atributos específicos de Futbolista.
    public Integer getDorsal() {
        return dorsal;
    }

    // Métodos 'setter' para los atributos específicos de Futbolista.
    public void setDorsal(Integer dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    // Métodos que representan comportamientos específicos de un Futbolista.
    public void jugarPartido() {
        System.out.println("Jugando partido");
    }

    public void entrenar() {
        System.out.println("Entrenando");
    }

    // Método para imprimir la información completa del Futbolista.
    // Utiliza los getters de la superclase (Persona) para acceder a los atributos heredados.
    public void imprimir() {
        System.out.println("Futbolista: " + getNombre() + " " + getApellidos() + ", Edad: " + getEdad() + ", Dorsal: " + dorsal + ", Demarcación: " + demarcacion);
    }
}
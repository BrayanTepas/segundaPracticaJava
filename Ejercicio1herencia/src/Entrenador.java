package Ejercicio1herencia.src; // Declara el paquete al que pertenece esta clase.

// Clase 'Entrenador' que HEREDA de 'Persona'.
// Esto significa que un Entrenador ES UNA Persona, por lo que hereda sus atributos
// (id, nombre, apellidos, edad) y sus comportamientos (concentrarse, viajar).
public class Entrenador extends Persona {
    // Atributo específico de un Entrenador, que no tiene una Persona genérica.
    private String idFederacion;

    // Constructor por defecto.
    public Entrenador() {
    }

    // Constructor con parámetros.
    // Llama al constructor de la clase padre 'Persona' (super(...))
    // para inicializar los atributos heredados.
    public Entrenador(Integer id, String nombre, String apellidos, Integer edad, String idFederacion) {
        super(id, nombre, apellidos, edad); // Inicializa los campos de Persona.
    }

    // Método 'getter' para el atributo específico de Entrenador.
    public String getIdFederacion() {
        return idFederacion;
    }

    // Método 'setter' para el atributo específico de Entrenador.
    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    // Métodos que representan comportamientos específicos de un Entrenador.
    public void dirigirPartido() {
        System.out.println("Dirigiendo partido");
    }

    public void dirigirEntrenamiento() {
        System.out.println("Dirigiendo entrenamiento");
    }
}
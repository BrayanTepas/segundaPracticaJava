package Ejercicio1herencia.src; // Declara el paquete al que pertenece esta clase.

// Clase 'Masajista' que HEREDA de 'Persona'.
// Esto significa que un Masajista ES UNA Persona, por lo que hereda sus atributos
// (id, nombre, apellidos, edad) y sus comportamientos (concentrarse, viajar).
public class Masajista extends Persona {
    // Atributos específicos de un Masajista, que no tiene una Persona genérica.
    private String titulacion;
    private Integer aniosExperiencia;

    // Constructor por defecto.
    public Masajista() {
    }

    // Constructor con parámetros.
    // Llama al constructor de la clase padre 'Persona' (super(...))
    // para inicializar los atributos heredados, promoviendo la reutilización de código.
    public Masajista(Integer id, String nombre, String apellidos, Integer edad, String titulacion, Integer aniosExperiencia) {
        super(id, nombre, apellidos, edad); // Inicializa los campos de Persona.
        this.titulacion = titulacion;       // Inicializa los campos propios de Masajista.
        this.aniosExperiencia = aniosExperiencia;
    }

    // Métodos 'getter' para los atributos específicos de Masajista.
    public String getTitulacion() {
        return titulacion;
    }

    // Métodos 'setter' para los atributos específicos de Masajista.
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public Integer getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(Integer aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    // Método que representa un comportamiento específico de un Masajista.
    public void darMasaje() {
        System.out.println("Dando masaje");
    }
}
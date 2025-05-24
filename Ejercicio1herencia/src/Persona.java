package Ejercicio1herencia.src; // Declara el paquete al que pertenece esta clase.

// Clase base que representa una Persona.
// Será la superclase de la que otras clases heredarán.
public class Persona {
    // Atributos privados comunes a todas las personas.
    // 'private' asegura la encapsulación, el acceso se realiza mediante getters/setters.
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;

    // Constructor por defecto.
    public Persona() {
    }

    // Constructor con parámetros para inicializar todos los atributos.
    public Persona(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    // Métodos 'getter' para acceder a los atributos.
    public Integer getId() {
        return id;
    }

    // Métodos 'setter' para modificar los atributos.
    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    // Métodos que representan comportamientos comunes de cualquier persona.
    // Serán heredados por las subclases.
    public void concentrarse() {
        System.out.println("Concentrandose");
    }

    public void viajar() {
        System.out.println("Viajando");
    }
}
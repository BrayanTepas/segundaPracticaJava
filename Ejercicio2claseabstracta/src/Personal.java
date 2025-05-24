package Ejercicio2claseabstracta.src; // Declara el paquete al que pertenece esta clase abstracta.

// La palabra clave 'abstract' significa que no se pueden crear instancias directas de esta clase.
// Su propósito principal es servir como una plantilla (un contrato) para otras clases (subclases).
// Las clases que hereden de 'Personal' estarán obligadas a implementar todos los métodos abstractos que aquí se declaren.
public abstract class Personal {
    // Atributos (propiedades) comunes a todos los tipos de personal.
    // 'protected' significa que estos atributos son accesibles desde:
    // - La propia clase Personal.
    // - Cualquier otra clase dentro del mismo paquete (Ejercicio2claseabstracta.src).
    // - CUALQUIER subclase de Personal (como 'Empleado'), sin importar en qué paquete se encuentre.
    // Esto permite a las subclases acceder directamente a estos datos.
    protected int id;
    protected String nombre;
    protected String apellido;

    // Permite que las subclases tengan un constructor sin argumentos o que llamen a 'super()' sin argumentos.
    public Personal() {
    }

    // cuando una subclase de Personal es instanciada y llama a este constructor padre.
    public Personal(int id, String nombre, String apellido) {
        this.id = id;          // Asigna el valor del parámetro 'id' al atributo de la instancia.
        this.nombre = nombre;    // Asigna el valor del parámetro 'nombre' al atributo de la instancia.
        this.apellido = apellido; // Asigna el valor del parámetro 'apellido' al atributo de la instancia.
    }

    // Métodos 'getter' para acceder a los atributos comunes desde fuera de la clase.
    // Estos son métodos concretos (no abstractos) y pueden ser usados directamente por las subclases
    // o por cualquier otra clase que tenga una referencia a un objeto 'Personal' (polimórficamente).
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    /**
     * Método abstracto 'registrar()'.
     * - La palabra clave 'abstract' indica que este método no tiene una implementación (cuerpo) aquí.
     * Termina con un punto y coma (;).
     * - Cualquier clase NO ABSTRACTA que herede de 'Personal' (ej. 'Empleado')
     * DEBE proporcionar una implementación concreta para este método.
     * - Su propósito es definir un comportamiento común (el registro) que todos los tipos de personal
     * deben tener, pero cuya forma específica de "registro" variará para cada tipo de personal.
     * - No devuelve ningún valor (void).
     */
    public abstract void registrar();

    /**
     * Método abstracto 'calcularSueldo()'.
     * - También es 'abstract', lo que significa que no tiene implementación aquí.
     * - Obliga a las subclases concretas de 'Personal' a definir su propia lógica
     * para calcular el sueldo.
     * - Su propósito es establecer que todos los tipos de personal tienen un sueldo que se puede calcular,
     * pero la forma exacta de calcularlo dependerá del tipo específico de personal (ej. Empleado, Gerente, etc.).
     * - Devuelve un valor de tipo 'double', lo que significa que la implementación en las subclases
     * deberá retornar un número decimal.
     */
    public abstract double calcularSueldo();
}
package src; // Declara que la clase Animal pertenece al paquete 'src'.
             // Los paquetes se usan para organizar clases y evitar conflictos de nombres.

public class Animal {
    // Declaración de propiedades (atributos) de la clase Animal.
    // Todas son 'private', lo que es clave para el encapsulamiento.
    private String nombre; // Propiedad para almacenar el nombre del animal.
    private String orden;  // Propiedad para almacenar el orden taxonómico del animal.
    private int extremidades; // Propiedad para almacenar el número de extremidades del animal.

    // Constructor por defecto (sin argumentos).
    // Permite crear un objeto Animal sin inicializar sus propiedades inmediatamente.
    public Animal() {
    }

    // Constructor con argumentos.
    // Permite crear un objeto Animal e inicializar sus propiedades al momento de la creación.
    // 'this' se usa para referirse a las variables de instancia de la clase.
    public Animal(String nombre, String orden, int extremidades) {
        this.nombre = nombre;        // Asigna el valor del parámetro 'nombre' a la propiedad 'nombre'.
        this.orden = orden;          // Asigna el valor del parámetro 'orden' a la propiedad 'orden'.
        this.extremidades = extremidades; // Asigna el valor del parámetro 'extremidades' a la propiedad 'extremidades'.
    }

    // getter se utilizan para acceder a los valores encapsulados
    // setter se utilizan para modificar los valores encapsulados
    // Permite a otras clases leer el valor de 'nombre' de forma controlada.
    public String getNombre() {
        return nombre;
    }

    // Método 'setter' para la propiedad 'nombre'.
    // Permite a otras clases modificar el valor de 'nombre' de forma controlada.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método 'getter' para la propiedad 'orden'.
    public String getOrden() {
        return orden;
    }

    // Método 'setter' para la propiedad 'orden'.
    public void setOrden(String orden) {
        this.orden = orden;
    }

    // Método 'getter' para la propiedad 'extremidades'.
    public int getExtremidades() {
        return extremidades;
    }

    // Método 'setter' para la propiedad 'extremidades'.
    public void setExtremidades(int extremidades) {
        this.extremidades = extremidades;
    }
}
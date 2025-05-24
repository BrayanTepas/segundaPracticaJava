package ejercicio3interfaz.src; // Declara el paquete al que pertenece la clase Doctor.

// 'implements IProfesion' significa que esta clase se compromete a proporcionar
// una implementación para todos los métodos abstractos definidos en la interfaz IProfesion.
public class Doctor implements IProfesion {
    // 'private' indica que solo pueden ser accedidos directamente desde dentro de esta clase.
    private String nombre;
    private String especialidad;

    // Permite crear un objeto Doctor sin inicializar sus atributos nombre y especialidad
    public Doctor() {
    }
    // Permite inicializar los atributos 'nombre' y 'especialidad'
    // al momento de crear una nueva instancia de Doctor.
    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;       // Asigna el valor del parámetro 'nombre' al atributo de la instancia.
        this.especialidad = especialidad; // Asigna el valor del parámetro 'especialidad' al atributo de la instancia.
    }

    // Método getter para el atributo 'nombre'.
    // Permite a otras clases obtener el valor del nombre del doctor.
    public String getNombre() {
        return nombre;
    }

    // Método setter para el atributo 'nombre'.
    // Permite a otras clases establecer o cambiar el valor del nombre del doctor.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Este es el método que implementa (sobrescribe) el método abstracto 'calcularSueldo()'
    // de la interfaz 'IProfesion'.
    // La anotación '@Override' es una buena práctica; le indica al compilador que
    // este método tiene la intención de sobrescribir un método de una superclase o interfaz.
    // Si la firma del método no coincidiera con la de la interfaz, el compilador daría un error.
    @Override
    public double calcularSueldo() {
        // Aquí se define la lógica para calcular el sueldo de un Doctor.
        // En este caso, simplemente devuelve un valor fijo de 5000.0.
        // Este valor es el que será retornado y utilizado por la clase 'Main'
        // cuando llame a doctor.calcularSueldo().
        return 5000.0; // Sueldo fijo para el doctor
    }
}
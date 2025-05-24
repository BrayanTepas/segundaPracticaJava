package Ejercicio2claseabstracta.src; // Declara el paquete al que pertenece esta clase.

// 'extends Personal' indica que Empleado es una subclase de la clase abstracta Personal.
// Esto significa que Empleado hereda todos los atributos y métodos no privados de Personal,
// y está OBLIGADO a implementar todos los métodos abstractos definidos en Personal.
public class Empleado extends Personal {
    private double sueldoBase;
    private double horasExtras;

    // Permite crear una instancia de Empleado sin valores iniciales para sus atributos,
    public Empleado() {
    }

    // Permite inicializar los atributos de Empleado y también los heredados de Personal.
    public Empleado(int id, String nombre, String apellido, double sueldoBase, double horasExtras) {
        // 'super(id, nombre, apellido);'
        // Esta llamada es CRUCIAL. Invoca al constructor de la clase padre (Personal)
        // para inicializar los atributos heredados (id, nombre, apellido).
        super(id, nombre, apellido);
        this.sueldoBase = sueldoBase;     // Inicializa el atributo sueldoBase de esta instancia.
        this.horasExtras = horasExtras; // Inicializa el atributo horasExtras de esta instancia.
    }

    // Método getter para 'sueldoBase'.
    public double getSueldoBase() {
        return sueldoBase;
    }

    // Método setter para 'sueldoBase'.
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    // Método getter para 'horasExtras'.
    public double getHorasExtras() {
        return horasExtras;
    }

    // Método setter para 'horasExtras'.
    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    /**
     * Este método es la implementación CONCRETA del método abstracto 'registrar()'
     * declarado en la clase abstracta 'Personal'.
     *
     * La anotación '@Override' es una buena práctica. Le dice al compilador que
     * este método está destinado a sobrescribir un método de una superclase o interfaz.
     * Si la firma del método no coincidiera con la del método abstracto en 'Personal',
     * el compilador generaría un error, ayudando a detectar errores de tipeo o lógica.
     */
    @Override
    public void registrar() {
        // Aquí se define la lógica específica para "registrar" a un Empleado.
        // Se accede directamente a los atributos 'id', 'nombre', 'apellido'
        // porque fueron declarados como 'protected' en la clase Personal,
        // lo que permite el acceso directo desde las subclases.
        System.out.println("ID: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        // También se imprimen los atributos específicos de Empleado.
        System.out.println("Sueldo Base: " + sueldoBase);
        System.out.println("Horas Extras: " + horasExtras);
    }

    /**
     * Este método es la implementación CONCRETA del método abstracto 'calcularSueldo()'
     * declarado en la clase abstracta 'Personal'.
     *
     * Al igual que con 'registrar()', la anotación '@Override' asegura que se está
     * implementando correctamente el método abstracto.
     */
    @Override
    public double calcularSueldo() {
        // Aquí se define la lógica específica para calcular el sueldo de un Empleado.
        // Utiliza los atributos propios de la clase Empleado (sueldoBase, horasExtras)
        // para realizar el cálculo.
        // Suponiendo que cada hora extra se paga a 10 unidades monetarias.
        double sueldoTotal = sueldoBase + (horasExtras * 10);
        return sueldoTotal; // El método devuelve el sueldo calculado como un valor de tipo double.
    }

}
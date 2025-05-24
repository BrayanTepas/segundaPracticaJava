package ejercicio1polimorfismo.src; // Declara el paquete al que pertenece esta clase.

// 'extends Vehiculo' indica que Barco es una CLASE DERIVADA (subclase) de Vehiculo.
// Esto significa que Barco hereda todos los atributos (marca, modelo, velocidadActual)
// y los métodos (arrancar, detener, mostrarInfo) de la clase Vehiculo.
public class Barco extends Vehiculo {
    private boolean esDeCarga;
    private String tipoBarco;

    public Barco() {
    }

    public Barco(String marca, String modelo, double velocidadActual, boolean esDeCarga, String tipoBarco) {
        // 'super(marca, modelo, velocidadActual);'
        // Esta es una llamada al constructor de la clase padre (Vehiculo).
        // Se encarga de inicializar los atributos 'marca', 'modelo' y 'velocidadActual'
        // que son definidos en la clase Vehiculo.
        super(marca, modelo, velocidadActual);
        // Inicializa los atributos específicos de Barco.
        this.esDeCarga = esDeCarga;
        this.tipoBarco = tipoBarco;
    }

    // Métodos 'getter' para los atributos específicos de Barco.
    public boolean isEsDeCarga() {
        return esDeCarga;
    }

    // Métodos 'setter' para los atributos específicos de Barco.
    public void setEsDeCarga(boolean esDeCarga) {
        this.esDeCarga = esDeCarga;
    }

    public String getTipoBarco() {
        return tipoBarco;
    }

    public void setTipoBarco(String tipoBarco) {
        this.tipoBarco = tipoBarco;
    }

    // SOBREESCRITURA DE MÉTODOS (POLIMORFISMO EN ACCIÓN)

    /**
     * Este método 'arrancar()' es un ejemplo de SOBREESCRITURA (Override).
     * La anotación '@Override' (opcional, pero muy recomendada) indica que este método
     * está proporcionando una nueva implementación para un método ya existente en la superclase 'Vehiculo'.
     *
     * Aquí, el comportamiento de "arrancar" es específico para un barco,
     * aunque en este caso el mensaje es muy similar al de la clase padre,
     * Esto demuestra que, si llamas a 'arrancar()' en un objeto de tipo 'Barco',
     * se ejecutará esta versión específica, no la de 'Vehiculo'.
     */
    @Override
    public void arrancar() {
        System.out.println("El barco " + marca + " " + modelo + " ha arrancado.");
    }

    /**
     * Este método 'mostrarInfo()' también es un ejemplo de SOBREESCRITURA.
     * En la clase 'Vehiculo', 'mostrarInfo()' estaba vacío, lo que indicaba que
     * las subclases DEBÍAN proporcionar su propia implementación.
     *
     * Aquí, se define cómo se muestra la información específica de un Barco,
     * incluyendo sus atributos heredados (marca, modelo, velocidadActual)
     * y sus atributos propios (esDeCarga, tipoBarco).
     *
     * Cuando se invoca 'mostrarInfo()' en un objeto 'Barco' (ya sea directamente o a través de una referencia 'Vehiculo'),
     * se ejecutará esta implementación. Esto es una clave del polimorfismo:
     * el comportamiento del método depende del tipo real del objeto en tiempo de ejecución.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Barco: " + marca + " " + modelo + ", Velocidad Actual: " + velocidadActual +
                           ", Es de Carga: " + esDeCarga + ", Tipo de Barco: " + tipoBarco);
    }
}
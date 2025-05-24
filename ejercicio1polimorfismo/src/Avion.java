package ejercicio1polimorfismo.src; // Declara el paquete al que pertenece esta clase.

// 'extends Vehiculo' indica que Avion es una CLASE DERIVADA (subclase) de Vehiculo.
// Esto significa que Avion hereda todos los atributos (marca, modelo, velocidadActual)
// y los métodos (arrancar, detener, mostrarInfo) de la clase Vehiculo.
public class Avion extends Vehiculo {
    private int numeroMotores;
    private String tipoAvion;

    public Avion() {
    }

    // Este constructor inicializa tanto los atributos heredados de Vehiculo como los propios de Avion.
    public Avion(String marca, String modelo, double velocidadActual, int numeroMotores, String tipoAvion) {
  
        super(marca, modelo, velocidadActual);
        // Inicializa los atributos específicos de Avion.
        this.numeroMotores = numeroMotores;
        this.tipoAvion = tipoAvion;
    }

    // Métodos 'getter' para los atributos específicos de Avion.
    public int getNumeroMotores() {
        return numeroMotores;
    }

    // Métodos 'setter' para los atributos específicos de Avion.
    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public String getTipoAvion() {
        return tipoAvion;
    }

    public void setTipoAvion(String tipoAvion) {
        this.tipoAvion = tipoAvion;
    }

    // SOBREESCRITURA DE MÉTODOS (POLIMORFISMO EN ACCIÓN)

    /**
     * Este método 'arrancar()' es un ejemplo de SOBREESCRITURA (Override).
     * La anotación '@Override' (opcional, pero muy recomendada) indica que este método
     * está proporcionando una nueva implementación para un método ya existente en la superclase 'Vehiculo'.
     *
     * Aquí, el comportamiento de "arrancar" es específico para un avión,
     * aunque el mensaje en este caso es idéntico al de la clase padre.
     * Si se quisiera enfatizar, se podría cambiar el mensaje (ej., "el avión enciende sus turbinas").
     * Esto demuestra que, al llamar a 'arrancar()' en un objeto de tipo 'Avion',
     * se ejecutará esta versión específica, no la de 'Vehiculo'.
     */
    @Override
    public void arrancar() {
        System.out.println("El avión " + marca + " " + modelo + " ha arrancado.");
    }

    /**
     * Este método 'detener()' también es un ejemplo de SOBREESCRITURA.
     * Proporciona una implementación específica de "detener" para un avión.
     * Un avión se detiene al aterrizar.
     *
     * Cuando se invoca 'detener()' en un objeto 'Avion' (ya sea directamente o a través de una referencia 'Vehiculo'),
     * se ejecutará esta implementación particular, ilustrando el polimorfismo.
     */
    @Override
    public void detener() {
        System.out.println("El avión " + marca + " " + modelo + " se ha detenido.");
    }

    /**
     * Este método 'mostrarInfo()' es otro ejemplo de SOBREESCRITURA.
     * En la clase 'Vehiculo', 'mostrarInfo()' estaba declarado con un cuerpo vacío,
     * esperando que las subclases proporcionaran su propia lógica.
     *
     * Aquí, se define cómo se muestra la información completa y específica de un Avión,
     * incluyendo sus atributos heredados (marca, modelo, velocidadActual)
     * y sus atributos propios (numeroMotores, tipoAvion).
     *
     * Esto es fundamental para el polimorfismo: cuando tienes una lista de 'Vehiculo'
     * que contiene objetos de 'Avion', al llamar a 'mostrarInfo()', se invocará
     * esta versión particular para los objetos de tipo 'Avion'.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Avión: " + marca + " " + modelo + ", Velocidad Actual: " + velocidadActual +
                           ", Número de Motores: " + numeroMotores + ", Tipo de Avión: " + tipoAvion);
    }
}
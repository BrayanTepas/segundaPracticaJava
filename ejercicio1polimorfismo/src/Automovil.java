package ejercicio1polimorfismo.src; // Declara el paquete al que pertenece esta clase.

// 'extends Vehiculo' indica que Automovil es una CLASE DERIVADA (subclase) de Vehiculo.
public class Automovil extends Vehiculo {
    private int numeroPuertas;
    private String tipoCombustible;

    public Automovil() {
    }

    // Este constructor inicializa tanto los atributos heredados de Vehiculo como los propios de Automovil.
    public Automovil(String marca, String modelo, double velocidadActual, int numeroPuertas, String tipoCombustible) {
  
        super(marca, modelo, velocidadActual);
        // Inicializa los atributos específicos de Automovil.
        this.numeroPuertas = numeroPuertas;
        this.tipoCombustible = tipoCombustible;
    }

    // Métodos 'getter' para los atributos específicos de Automovil.
    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    // Métodos 'setter' para los atributos específicos de Automovil.
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    
    // SOBREESCRITURA DE MÉTODOS (POLIMORFISMO EN ACCIÓN)

    /**
     * Este método 'arrancar()' es un ejemplo de SOBREESCRITURA (Override).
     * La anotación '@Override' (opcional, pero muy recomendada) indica que este método
     * está proporcionando una nueva implementación para un método ya existente en la superclase 'Vehiculo'.
     *
     * Aquí, el comportamiento de "arrancar" es específico para un automóvil.
     * Aunque el mensaje en este caso es idéntico al de la clase padre,
     * la intención es que si en el futuro se necesitara una lógica de arranque
     * diferente para los automóviles (ej., "el automóvil arranca su motor de combustión"),
     * se modificaría solo aquí.
     */
    @Override
    public void arrancar() {
        System.out.println("El automóvil " + marca + " " + modelo + " ha arrancado.");
    }

    /**
     * Este método 'detener()' también es un ejemplo de SOBREESCRITURA.
     * Proporciona una implementación específica de "detener" para un automóvil.
     * Al igual que 'arrancar()', si la lógica de detención para un automóvil
     * tuviera particularidades (ej., "el automóvil pisa el freno"), se definiría aquí.
     *
     * Cuando se invoca 'detener()' en un objeto 'Automovil' (directamente o a través de una referencia 'Vehiculo'),
     * se ejecutará esta implementación particular, ilustrando el polimorfismo.
     */
    @Override
    public void detener() {
        System.out.println("El automóvil " + marca + " " + modelo + " se ha detenido.");
    }

    /**
     * Este método 'mostrarInfo()' es otro ejemplo de SOBREESCRITURA.
     * En la clase 'Vehiculo', 'mostrarInfo()' estaba declarado con un cuerpo vacío,
     * lo que indicaba que las subclases DEBÍAN proporcionar su propia lógica.
     *
     * Aquí, se define cómo se muestra la información completa y específica de un Automóvil,
     * incluyendo sus atributos heredados (marca, modelo, velocidadActual)
     * y sus atributos propios (numeroPuertas, tipoCombustible).
     *
     * Este es un caso crucial de polimorfismo: si tienes una lista de objetos de tipo 'Vehiculo'
     * (que incluye automóviles, barcos y aviones), y llamas a 'mostrarInfo()' en cada elemento,
     * Java automáticamente invocará la implementación correcta ('mostrarInfo()' de Automovil,
     * de Barco o de Avion) dependiendo del tipo real del objeto en tiempo de ejecución.
     */
    @Override
    public void mostrarInfo() {
        System.out.println("Automóvil: " + marca + " " + modelo + ", Velocidad Actual: " + velocidadActual +
                           ", Número de Puertas: " + numeroPuertas + ", Tipo de Combustible: " + tipoCombustible);
    }
}
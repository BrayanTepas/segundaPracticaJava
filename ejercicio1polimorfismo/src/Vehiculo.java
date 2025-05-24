package ejercicio1polimorfismo.src; // Declara el paquete al que pertenece esta clase.

// Contendrá los atributos y métodos comunes a todos los vehículos.
public class Vehiculo {
    // 'protected' permite que las subclases (Automóvil, Barco, Avión) accedan directamente a estos atributos,
    protected String marca;
    protected String modelo;
    protected double velocidadActual;

    // Permite crear un objeto Vehiculo sin inicializar sus atributos,
    public Vehiculo() {
    }

    // Permite inicializar la marca, el modelo y la velocidad actual al crear una instancia de Vehiculo.
    public Vehiculo(String marca, String modelo, double velocidadActual) {
        this.marca = marca;             // Asigna el valor del parámetro 'marca' al atributo de la instancia.
        this.modelo = modelo;           // Asigna el valor del parámetro 'modelo' al atributo de la instancia.
        this.velocidadActual = velocidadActual; // Asigna el valor del parámetro 'velocidadActual' al atributo de la instancia.
    }

    // Métodos 'getter' para acceder a los atributos desde fuera de la clase.
    public String getMarca() {
        return marca;
    }

    // Métodos 'setter' para modificar los atributos desde fuera de la clase.
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    
    /**
     * Método 'arrancar()'.
     * Este es un comportamiento común a todos los vehículos.
     * Las clases derivadas (Automóvil, Barco, Avión) PUEDEN sobrescribir este método
     */
    public void arrancar() {
        System.out.println("El vehículo " + marca + " " + modelo + " ha arrancado.");
    }

    /**
     * Método 'detener()'.
     * Otro comportamiento común. Imprime un mensaje genérico cuando un vehículo se detiene.
     * Las subclases también PUEDEN sobrescribir este método para definir
     */
    public void detener() {
        System.out.println("El vehículo " + marca + " " + modelo + " se ha detenido.");
    }

    /**
     * Método 'mostrarInfo()'.
     * Este método está declarado aquí, pero su cuerpo está vacío (`{};`).
     * Esto lo convierte en un método que DEBERÍA ser sobrescrito por las subclases
     * para que realmente muestre información útil y específica de cada tipo de vehículo.
     */
    public void mostrarInfo() {
        // En esta clase base, no se imprime nada, esperando que las clases derivadas
        // proporcionen su propia implementación para mostrar su información específica.
    }
}
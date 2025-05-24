import src.Animal; // Importa la clase Animal del mismo paquete 'src'.
                  // Esto permite usar la clase Animal en esta clase Main.
public class Main {
    // Método principal de la aplicación. Es el punto de entrada cuando se ejecuta el programa.
    public static void main(String[] args) {
        // Creación de una instancia (objeto) de la clase Animal usando el constructor por defecto.
        Animal animal = new Animal();

        // Establecimiento de los valores de las propiedades del objeto 'animal'
        // utilizando los métodos 'setter'.
        animal.setNombre("perro");
        animal.setOrden("mamifero");
        animal.setExtremidades(4);

        // Acceso a los valores de las propiedades del objeto 'animal'
        // utilizando los métodos 'getter' y los imprime en la consola.
        System.out.println(animal.getNombre());
        System.out.println(animal.getOrden());
        System.out.println(animal.getExtremidades());

        // Creación de otra instancia de la clase Animal
        // utilizando el constructor con argumentos, inicializando las propiedades directamente.
        Animal animal2 = new Animal("gato", "mamifero", 4);

        // Acceso e impresión solo del nombre del segundo animal.
        System.out.println(animal2.getNombre());
    }
}
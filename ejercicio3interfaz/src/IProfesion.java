package ejercicio3interfaz.src; // Declara el paquete al que pertenece esta interfaz.

// Una interfaz es un contrato que especifica un conjunto de métodos
// las clases que la implementen deben definir los metodos que tengan.
public interface IProfesion {

    // Declara el método abstracto 'calcularSueldo()'.
    // En las interfaces de Java (desde versiones muy antiguas hasta JDK 21):
    // 1. Los métodos son implícitamente 'public' si no se especifica un modificador de acceso.
    // 2. Los métodos son implícitamente 'abstract' si no tienen un cuerpo (terminan con ';').
    
    // Este método indica que cualquier clase que 'implemente' IProfesion
    // (como Ingeniero y Doctor) debe proporcionar una implementación concreta
    // para un método llamado 'calcularSueldo()' que no toma argumentos
    // y devuelve un valor de tipo 'double'.
    public double calcularSueldo();
}
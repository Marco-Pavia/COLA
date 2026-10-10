// Marco Antonio Pavi Flores
// MainColaEsta.java

public class MainColaEsta {
    public static void main(String[] args) {
        // Creamos una cola con espacio para 3 personas/elementos[cite: 6]
        ColaEstatica miCola = new ColaEstatica(3);

        // Metemos elementos[cite: 6]
        miCola.enqueue(10);
        miCola.enqueue(20);
        miCola.enqueue(30);

        // Vemos cómo queda la fila[cite: 5, 6]
        miCola.mostrar();

        // Atendemos al primero[cite: 5, 6]
        miCola.dequeue();

        // Vemos cómo queda la fila despues de atender[cite: 5]
        miCola.mostrar();
    }
}
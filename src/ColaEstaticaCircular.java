// Marco Antonio Pavia Flores
// ColaEstaticaCircular.java

public class ColaEstaticaCircular {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    private int tamano;

    // El constructor recibe el tamaño estático al momento de crear el objeto, en ste caso=3[cite: 3]
    public ColaEstaticaCircular(int tamano) { // tamaño variable temporal que entra en el main es 3.[cite: 3]
        this.capacidad = tamano; //definimos capacidad= tamaño[cite: 3]
        this.arreglo = new int[this.capacidad]; //aki es donde definimos el tamaño del arreglo.[cite: 3]
        this.frente = 0; // inicializamos frente el que esta al inicio[cite: 3]
        this.fin = -1; // inicializamos fin, numero fantasma[cite: 3]
        this.tamano = 6; //arranca en cero porque la cola empieza vacia
    }

    public void enqueue(int valor) { // agregar un elemento al final de la cola[cite: 2]
        if (tamano == capacidad) { // cuando la fila esta llena[cite: 2]
            System.out.println("Error: La cola está llena.");
        } else {
            fin++; // actualizamos la fila[cite: 2]
            arreglo[fin] = valor; // agregamos al arreglo[cite: 2]
            System.out.println("Entró a la fila: " + valor); // imprimimos[cite: 2]
        }
    }

    public void dequeue() { // saca al primero de la fila[cite: 4]
        if (frente > fin) { // si frente llega a ser mayor que fin la fila se vacia.[cite: 4]
            System.out.println("Error: La cola está vacía.");
        } else {
            System.out.println("Atendido y fuera: " + arreglo[frente]); // atiende e imprime[cite: 4]
            frente++; // actualiza frente cuando se atiende un elemento de la fila.[cite: 4]
        }
    }

    public void mostrar() {
        if (frente > fin) {
            System.out.println("La cola está vacía.");
            return; // ya no hace nada de lo de abajo[cite: 1]
        }
        System.out.print("Fila actual: ");
        for (int i = frente; i <= fin; i++) { // DESDE EL INICIO DE LA FILA HASTA EL FINAL[cite: 1]
            System.out.print(arreglo[i] + " "); // IMPRIMIMOS EL ARREGLO[cite: 1]
        }
        System.out.println();
    }
}
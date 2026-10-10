// Marco Antonio Pavia Flores
// ColaEstatica.java

public class ColaEstatica {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;

    // El constructor recibe el tamaño estático al momento de crear el objeto, en ste caso=3[cite: 3]
    public ColaEstatica(int tamano) { // tamaño variable temporal que entra en el main es 3.[cite: 3]
        this.capacidad = tamano; //definimos capacidad= tamaño[cite: 3]
        this.arreglo = new int[this.capacidad]; //aki es donde definimos el tamaño del arreglo.[cite: 3]
        this.frente = 0; // inicializamos frente el que esta al inicio[cite: 3]
        this.fin = -1; // inicializamos fin, numero fantasma[cite: 3]
    }


    //public void enqueue(int valor) { // agregar un elemento al final de la cola[cite: 2]
    //    if (fin == capacidad - 1) { // cuando la fila esta llena[cite: 2]
    //        System.out.println("Error: La cola está llena.");
    //    } else {
    //        fin++; // actualizamos la fila
    //        arreglo[fin] = valor; // agregamos al arreglo
    //        System.out.println("Entró a la fila: " + valor); // imprimimos
    //    }
    //}

    public int dequeue() {
        if (tamano == 0){
            System.out.println("La cola está vacía ");
            return -1;
        }
    }

    int atendido = arreglo[frente];
    frente = (frente + 1) % capacidad;

    tamano  --;

    public void mostrar() {
        if (frente > fin) {
            System.out.println("La cola está vacía.");
            return; // ya no hace nada de lo de abajo
        }
        System.out.print("Fila actual: ");
        for (int i = frente; i <= fin; i++) { // DESDE EL INICIO DE LA FILA HASTA EL FINAL
            System.out.print(arreglo[i] + " "); // IMPRIMIMOS EL ARREGLO
        }
        System.out.println();
    }
}
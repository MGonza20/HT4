import java.util.LinkedList;

public class PilaLinkedList<E> extends Pila<E>{
    // Variable en la cual se va a guardar el valor.
    private E valor;
    // Variable para enlazar los nodos.
    protected Nodo inicio,fin;
    private  int count;


    public void PilaLinkedList(){
        inicio = null;
        fin = null;
    }

    /**
     * elimina el primer elemento de la pila
     */
    @Override
    public E pop() {
        Nodo<E> temp = inicio;
        inicio= inicio.getSiguiente(); // move head down list
        count--;
        return temp.getDato();
    }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public E peek() {
        return (E) inicio.getDato();
    }

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {

        if (inicio == null) {
            return false;
        }else {
            return true;
        }
    }

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public int size() {
        // number of elements we've seen in list
        int elementCount = 0;
// reference to potential first element
        Nodo<E> finger = inicio;
        while (finger != null) {
// finger references a new element, count it
            elementCount++;
// reference possible next element
            finger = finger.getSiguiente();
        }
        return elementCount;
    }

    /**
     * @param item tipo objeto E
     */
    @Override
    public void push(Object item) {
        inicio = new Nodo(valor, inicio);
        count++;

    }
}

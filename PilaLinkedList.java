import java.util.LinkedList;

public class PilaLinkedList<E> extends Pila<E>{
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private PilaLinkedList siguiente;

    public void PilaLinkedList(){
        this.valor = 0;
        this.siguiente = null;
    }

    /**
     * elimina el primer elemento de la pila
     */
    @Override
    public Object pop() {
        return null;
    }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public Object peek() {
        return null;
    }

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return false;
    }

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public int size() {
        return 0;
    }

    /**
     * @param item tipo objeto E
     */
    @Override
    public void push(Object item) {

    }
}

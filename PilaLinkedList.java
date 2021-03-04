import java.util.LinkedList;

public class PilaLinkedList<E> extends Pila<E>{
    // Variable en la cual se va a guardar el valor.
    private E valor;
    // Variable para enlazar los nodos.
    protected Nodo inicio,fin;
    private  int count;


    public void PilaLinkedList(){
        this.inicio = null;

    }

    /**
     * elimina el primer elemento de la pila
     * if(!esVacia()){
     * 			fin.siguiente=new Nodo(valor);
     * 			fin = fin.siguiente;
     *                }else {
     * 			insertarInicio(valor);
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
        if (!empty()) {
            return (E) inicio.getDato();
        } else {
            System.out.println("Stack is empty");
            Character c = 'd';
            return (E) c;
        }
    }

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {

        if (inicio == null) {
            return true;
        }else {
            return false;
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
        inicio = new Nodo(item, inicio);
        count++;
        }

}

import java.util.ArrayList;

public class PilaArrayList<E> extends Pila<E> {
   private ArrayList<E> lista;

    public PilaArrayList(){
        lista = new ArrayList<E>();
    }
    /**
     * elimina el primer elemento de la pila
     */
    @Override
    public E pop() {
        return lista.remove(lista.size()-1);
    }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public E peek() {
        return lista.get(size() - 1);
    }

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return size() == 0;
    }

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public int size() {
        return lista.size();
    }

    /**
     * @param item tipo objeto E
     */
    @Override
    public void push(E item) {
        lista.add(item);
    }

}

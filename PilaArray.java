import java.util.Vector;

public class PilaArray<E> extends Pila<E> {
    private Vector<E> lista;


    public PilaArray() {
        lista = new Vector<E>();
    }

    /**
     * elimina el primer elemento de la pila
     *
     * @return
     */
    @Override
    public E pop() {
        return lista.remove(lista.size()-1);
    }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public E  peek()
    {
            return lista.firstElement();
        }


    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return lista.isEmpty();
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
       lista.addElement(item);


    }

}

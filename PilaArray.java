public class PilaArray<E> extends Pila<E> {
    private E[] lista;
    private int tam;

    public PilaArray() {
        lista = (E[]) new Object[100];
        tam = 0;
    }

    /**
     * elimina el primer elemento de la pila
     *
     * @return
     */
    @Override
    public E pop() {
        return lista[--tam];
    }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public E peek() {
        return lista[0];
    }

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return (lista.length == 0);
    }

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public int size() {
        return lista.length;
    }

    /**
     * @param item tipo objeto E
     */
    @Override
    public void push(E item) {
        if (tam == lista.length) {
            Object[] tmp = new Object[2 * tam];
            System.arraycopy(lista, 0, tmp, 0, tam - 1);
            lista = (E[]) tmp;
        }
        lista[tam++] = item;
    }

}

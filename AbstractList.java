public abstract class AbstractList<E> extends Pila<E>{


    /**
     * elimina el primer elemento de la pila
     */
    @Override
    public abstract E  pop();


    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public abstract E peek();

    /**
     * muestra si la pila esta vacia
     */
    @Override
    public abstract boolean empty();

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public abstract int size();

    /**
     * @param item tipo objeto E
     */
    @Override
    public abstract void push(E item);
}

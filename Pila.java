import java.util.ArrayList;
import java.util.LinkedList;

public abstract class Pila <E> implements Stack<E>{
    private Object lista;

    public Pila() {
    }

    /**
     *To String solo para ver el contenido de la pila
     *no se utiliza
     */
    public String toString() {
        return lista.toString();
    }


    /**
     *elimina el primer elemento de la pila
     */
    @Override
    public abstract E pop();

    /**
     *muestra el primer elemento de la pila
     */
    @Override
    public abstract E peek();

    /**
     *muestra si la pila esta vacia
     */
    @Override
    public abstract boolean empty();

    /**
     *muestra el tamaño de la pila
     */
    @Override
    public abstract int size();


    /**
     *@param item tipo objeto E
     */
    @Override
    public abstract void push(E item);
}


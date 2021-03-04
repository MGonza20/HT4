public class Nodo2<E> {
    private E dato;
    private Nodo2 siguiente;
    private Nodo2 anterior;

    public Nodo2(E dato) {
        this.dato = dato;

    }
    public Nodo2(E v, Nodo2<E> siguiente,
                            Nodo2<E> anterior)
    {
        dato = v;
        this.siguiente = siguiente;
        if (this.siguiente != null)
            this.siguiente.anterior = this;
        this.anterior= anterior;
        if (this.anterior != null)
            this.anterior.siguiente = this;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public void setSiguiente(Nodo2 siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo2 anterior) {
        this.anterior = anterior;
    }

    public E getDato() {
        return dato;
    }

    public Nodo2 getSiguiente() {
        return siguiente;
    }

    public Nodo2 getAnterior() {
        return anterior;
    }
}

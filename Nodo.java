public class Nodo<E> {

    // --> Atributos
    private E dato;
    private Nodo siguiente; // En donde esta apuntando

    // --> Constructores
    public Nodo(E d){ // Se utilizará para inicializarlo
        dato = d;
        siguiente = null;
    }

    public Nodo(E d, Nodo puntero){
        dato = d;
        siguiente = puntero;
    }

    // --> Propiedades
    public E getDato(){
        return dato;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public void setNuevoNodo(Nodo nuevoNodo){
        siguiente = nuevoNodo;
    }
}

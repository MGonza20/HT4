public class DobleEnArray<E> extends AbstractList<E>{
    protected int count;
    protected Nodo2<E> head;
    protected Nodo2<E> tail;
    private Runtime.Version Assert;


    public DobleEnArray() {
        head = null;
        tail = null;
        count = 0;

    }

    @Override
    public E pop() {
        Nodo2<E> temp = head;
        Nodo2<E> ant = tail;

        while (temp.getSiguiente()!= null){
            ant = temp;
            temp = (Nodo2<E>) temp.getSiguiente();
        }

        if(ant == null){
            head = null;
        }

        else {
            ant.setSiguiente(null);
        }
        count--;
        return (E) ant.getDato();
    }

    
    @Override
    public E peek() {
        Nodo2<E> actual = head;
        for (int i = 0; i<0; i++){
            actual = (Nodo2<E>) actual.getSiguiente();
        }
        return (E) actual.getDato();
    }

    @Override
    public boolean empty() {
        if (head== null){
            return true;
        }
        else{
            return false;
        }

    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public void push(E item) // pre: value is not null
// post: adds element to head of list
    {
// construct a new element, making it head
        head = new Nodo2<E>(item, head, null);
// fix tail, if necessary
        if (tail == null) tail = head;
        count++;
    }
}

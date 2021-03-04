public class PilaArray<E> extends Pila<E> {
    private E[] lista;
    private int tam;
    private int max = 100;

    public PilaArray() {
        lista = (E[]) new Object[max];
        tam = -1;
    }

    /**
     * elimina el primer elemento de la pila
     *
     * @return
     */
    @Override
    public E pop() {
        try{
            if(tam == -1){
                System.out.println("Stack OverFlow1");
                return null;
            }
            else {
                System.out.println("\n item popped: " + lista[tam--]);
                if (tam!=-1){
                    return lista[tam--];
                }

            }
        }
        catch (Exception e){

        }
            return lista[0] ;
        }

    /**
     * muestra el primer elemento de la pila
     */
    @Override
    public E  peek()
    {
            if (tam < 0) {
                System.out.println("Stack Underflow23");
                return null;
            }
            else {
                E x = lista[tam];
                return x;
            }
        }


    /**
     * muestra si la pila esta vacia
     */
    @Override
    public boolean empty() {
        return (tam<0);
    }

    /**
     * muestra el tamaño de la pila
     */
    @Override
    public int size() {
        return tam;
    }

    /**
     * @param item tipo objeto E
     */
    @Override
    public void push(E item) {
        if (tam == max -1) {
            System.out.println("Stack Overflow4");

        }
        else{
            tam++;
            lista[tam]=item;
        }

    }

}

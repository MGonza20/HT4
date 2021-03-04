public class Factory {

    public Factory() {

    }

    public static Stack fabricar(int stackType, int listType) {
        switch (stackType) {
            case 1: //Arraylist
                return new PilaArrayList();
            case 2: //Vector
                return new PilaArray();
            case 3: //Lista
                FactoryLista factoryLista = new FactoryLista();
                return factoryLista.fabricar2(listType);
            default:
                System.out.println("No existe en el sistema");
                return null;
        }
    }
}

/*
abstractlist
    simpleEn    DobleEnl
---------------------------------------------
 */
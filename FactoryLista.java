public class FactoryLista{

        public FactoryLista() {

        }

        public static Stack fabricar2(int listType) {
                switch (listType) {
                        case 1:
                                return new PilaLinkedList();
                        case 2:
                                return new DobleEnArray();
                        default:
                                System.out.println("No existe en el sistema");
                                return null;
                }
        }
}

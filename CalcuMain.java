import java.util.Scanner;

public class CalcuMain {


    public static void main(String[] args) {

        int opcion1 = 0;
        int opcion2 = 0;
        Scanner scan = new Scanner(System.in);


        Calculadora calcu = Calculadora.getInstance();


        System.out.println(" ----- MENU ----- \n");
        System.out.println("Opciones: \n");
        System.out.println("1. Arraylist \n" + "2. Vector \n" + "3. Lista \n");

        opcion1 = scan.nextInt();

        if(opcion1 == 3 ){

            System.out.println("Opciones: \n");
            System.out.println("1. Lista Sencilla \n" + "2. Lista Doblemente Enlazada \n ");
            opcion2 = scan.nextInt();
        }
        else if(opcion1 == 1 || opcion1 == 2){
            opcion2 = 0;

        }

            System.out.println(calcu.operar(calcu.infixToPosfix(calcu.leerDocu(), opcion1, opcion2),opcion1, opcion2));

    }

}

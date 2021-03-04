import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Calculadora<E> {
    private Pila<Character> pila;
    private Pila<Integer> pilaCalcu;

    private static Calculadora calcu = new Calculadora<>();

    private Calculadora(){

    }

    public static Calculadora getInstance(){
        return calcu;
    }


    public String infixToPosfix(String expresion, int stackType, int listType){
        String resultado = "";
        pila = (Pila<Character>) new Factory().fabricar(stackType, listType);

        for(int i = 0; i<expresion.length(); i++){
            Character c = expresion.charAt(i);

            if(precedence(c)>0){
                while(pila.empty()==false && precedence(pila.peek())>=precedence(c)){
                    resultado += pila.pop();
                }
                pila.push(c);

            }else if(c==')'){
                char x = pila.pop();
                while(x!='('){
                    resultado += x;
                    x = pila.pop();
                }
            }else if(c=='('){
                pila.push(c);
            }else{
                //character is neither operator nor (
                resultado += c;

            }
        }
        for (int i = 0; i <=pila.size() ; i++) {
            resultado += pila.pop();
        }
        System.out.println(resultado);
        return resultado;
    }


    static int precedence(char c){
        switch (c){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }

    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') ||
                (c >= 'A' && c <= 'Z') ||
                (c >= '0' && c <= '9');
    }

    public double operar(String p, int stackType, int listType) {
        // TODO Auto-generated method stub
        pilaCalcu = (Pila<Integer>) new Factory().fabricar(stackType, listType);


        for (int i = 0; i<p.length();i++) {
            char a = p.charAt(i);

            if (Character.isDigit(a)) {
                pilaCalcu.push(a -'0');
            }

            else {
                if (p.charAt(i)!= ' ') {
                    int value1 = pilaCalcu.pop();

                    int value2 = pilaCalcu.pop();


                    switch (a) {
                        case '+':
                            pilaCalcu.push(value1+value2);
                            break;
                        case '-':
                            pilaCalcu.push(value1-value2);
                            break;
                        case '*':
                            pilaCalcu.push(value1*value2);
                            break;
                        case '/':
                            pilaCalcu.push((value1/value2));
                            break;
                    }
                }

            }
        }
        return pilaCalcu.pop();
    }

    /*public String LeerTXT(){
        String info = "";
        try {
            File texto = new File("C:\\Users\\sarap\\IdeaProjects\\HT4algo\\Infix.txt");
            Scanner scanner = new Scanner(texto);
            while (scanner.hasNextLine()){
                info = String.valueOf(scanner.hasNextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
        }
        return info;
    }*/

    public String leerDocu() {
        // TODO Auto-generated method stub
        String texto = new String();

        // TODO Auto-generated method stub
        ArrayList<String> operacion = new ArrayList<String>();
        try {
            FileReader fr = new FileReader("C:\\Users\\sarap\\IdeaProjects\\HT4algo\\Infix.txt");// Objeto para que establece origen de los datos
            BufferedReader entrada = new BufferedReader(fr); // buffer para el manejo de los datos
            String s;
            while((s = entrada.readLine()) != null)// leer linea a linea
                texto += s + "\n";
            operacion =  new ArrayList<String>(Arrays.asList(texto.split("[\n]", 0)));

            entrada.close();

            // impresion de los datos leidos en pantalla
        }
        catch(java.io.FileNotFoundException fnfex) {
            System.out.println("Archivo no encontrado: ");}
        catch(java.io.IOException ioex) {

        }

        return operacion.get(0);
    }

}


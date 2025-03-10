import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.ArrayDeque;

public class metodos {

    Stack<Integer> pila = new Stack<>();
    Queue<String> cola = new ArrayDeque<>(); 

    Scanner sc = new Scanner(System.in);

    public Stack<Integer> LlenarPila(){
        
        Stack<Integer> pila = new Stack<>();
        boolean bandera = true;
        int opt = 0;

        while (bandera){

            System.out.println("Ingrese el registro: ");
            pila.push(sc.nextInt());
            System.out.println("¿Desea ingresar más registros? 1: Si // 2 = No");
            
            while (!sc.hasNextInt()) {

                System.out.println("El valor ingresado no es numerico, por favor revise ");
                sc.next();
                
            }

            opt = sc.nextInt();

            while (opt <1 || opt > 2) {

                System.out.println("Por favor, ingrese una opción entre 1 y 2");
                opt = sc.nextInt();

            }
            
            if (opt == 2){

                bandera = false;

            }

        }

        return pila;

        sc.close();

    }

    public void MostrarPila(Stack<Integer> pila){

        System.out.println(pila);

    }

    public Stack<Integer> EliminarDato(Stack<Integer> pila){

        Stack<Integer> auxiliar = new Stack<>();
        int numero = 0;

        System.out.println("Ingrees el numero a eliminar: ");
        numero = sc.nextInt();

        while(!pila.isEmpty()){

            if (pila.peek() == numero) {

                pila.pop();

            }
            
            else {

                auxiliar.push(pila.pop());

            }
        
        }

        while(!auxiliar.isEmpty()){

            pila.push(auxiliar.pop());

        }

        return pila;

    }

    


}

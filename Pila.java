import java.util.Scanner;
import java.util.Stack;

public class Pila {

    public void mipilita(){

        Scanner sc = new Scanner(System.in);
        Stack<Integer> pila = new Stack<>();
        Utils u = new Utils();
        pila = u.LlenarPila();
        u.MostrarPila(pila);
        pila = u.EliminarDato(pila);
        u.MostrarPila(pila);

        sc.close();

    }

    


    
}

/**
 * @author: Diego Duarte
 * 
 * @since:20/04/2023
 **/
import java.util.Scanner;

public class View{
    Scanner sc = new Scanner(System.in);

    public String principal(){
        System.out.println("*** DICCIONARIO PT2 *** \n¿Con que arbol desea trabajar?\n1. AVL\n2. RBT");
        String res = sc.next();
        return res;
    }

    public void MensajeFinal(String original, String traduccion){
        System.out.println("\nMensaje Original:\n" + original);
        System.out.println("\nMensaje Traducido:\n" + traduccion);

    }
}
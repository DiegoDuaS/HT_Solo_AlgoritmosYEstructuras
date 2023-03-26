/**
 * @author: Diego Duarte
 * 
 * @since:25/03/2023
 **/
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class View {
    Scanner sc = new Scanner(System.in);

    public String MenuPrincipal(){
        System.out.println(" ***DICCIONARIO***\n¿Qué desea hacer? \n 1 Ver palabras \n 2 Traducir texto en archivo 'texto.txt' \n 3 Salir");
        String res = sc.next();
        return res;
    }

    public void Palabras(PriorityQueue<Association<String,ArrayList<String>>> tree){
        for (Association<String, ArrayList<String>> info : tree) {
            System.out.println("Ingles: " + info.getKey());
            System.out.println("Español: " + info.getValue().get(0));
            System.out.println("Frances: " + info.getValue().get(1));
            System.out.println("----------------------");
        }
    }

    public String IdiomaOriginal(){
        System.out.println("¿En que idioma se encuentra el texto en el archivo 'texto.txt'? \n 1 Ingles \n 2 Español \n 3 Frances");
        String res = sc.next();
        return res;
    }

    public String IdiomaTraducir(){
        System.out.println("¿A que idioma desea traducir el texto? \n 1 Ingles \n 2 Español \n 3 Frances");
        String res = sc.next();
        return res;
    }

    public void Valido(){
       System.out.println("Escriba un número válido"); 
    }

    public void Salir(){
        System.out.println("Gracias por usar el diccionario");
    }

    public void ImprimirMensajes(String Traduccion, ArrayList<String> Original){
        System.out.println("Mensaje Original:");
        for(int i = 0; i < Original.size(); i++){ 
            System.out.print(Original.get(i) + " ");
        }
        System.out.println("\nMensaje Traducido: \n" + Traduccion);
    }
}

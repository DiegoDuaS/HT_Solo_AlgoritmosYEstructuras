import java.util.Scanner;
/**
 * @author: Diego Duarte
 * 
 * @since:19/02/2023
 **/
public class View {
    Scanner sc = new Scanner(System.in);
    
    public int MenuP(){
        System.out.println("BIENVENIDO A LA CALCULADORA: \n ¿Que implementacion desea usar? \n 1. ArrayList \n 2. Vectores \n 3. Listas");
        int answ = sc.nextInt();
        return answ;
    }

    public int MenuLista(){
        System.out.println("¿Cual tipo de lista quiere estar? \n 1. Encadenada \n 2. Doblemente Encandenada");
        int answ = sc.nextInt();
        return answ;
    }

    public void noOperandos(){
        System.out.println("No hay suficientes operandos para poder realizar la operacion");
    }

    public void dividirCero(){
        System.out.println("Esta operacion no se puede realizar, debido a que se divide entre cero");
    }

    public void simboloNoReconocido(){
        System.out.println("Esta operacion no se puede realizar, no se reconoce el simbolo utilizado.");
    }

    public static void resultadoOPer(int res){
        System.out.println("El resultado es: " +  res);
    }

    public void infix(String infix){
        System.out.println("Ecuacion original: "+ infix);
    }
}

/**
 * @author: Sofia Garcia, Diego Duarte, Marcela Cordon (HT2 Grupo 9)
 * 
 * @since:30/01/2023
 **/

 import java.util.ArrayList;
 import java.util.Stack;

 public class Calculator implements IPostfixCalculator{
 
     private static Calculator instance = null;
        private IStack<Integer> stack;
     private Calculator(IStack<Integer> sstack) {
         stack = sstack;
     }
 
     public static Calculator getInstance(IStack<Integer> sstack) {
         if (instance == null) {
             instance = new Calculator(sstack);
         }
         return instance;
     }
    

     @Override
     public boolean isOneItem(IStack operandos) {
         if (operandos.size() == 1){
             return true;
         }
         else{
             return false;
         }
     }
     
     @Override
     public int suma(int a, int b) {
         int respuesta = a + b;
         return respuesta;
     }
 
     @Override
     public int resta(int a, int b) {
         int respuesta = a - b;
         return respuesta;
     }
 
     @Override
     public int multiplicacion(int a, int b) {
         int respuesta = a * b;
         return respuesta;
     }
 
     @Override
     public int division(int a, int b) {
         int respuesta = a/b;
         return respuesta;
     }
 
     @Override
     public boolean isOperator(String item) {
         try {
             Integer.valueOf(item);
             return false;
         } 
         catch (NumberFormatException e) {
             return true;
         }     
     }
 
     @Override
     public ArrayList<String> getItems(String _expresion) {
         // TODO Auto-generated method stub
         return null;
     }

     public static String infixToPostfix(String infix) {
    Stack<Character> stack = new Stack<>();
    stack.push('#');
    StringBuilder postfix = new StringBuilder();
    
    for (char ch : infix.toCharArray()) {
        if (Character.isLetterOrDigit(ch)) {
            postfix.append(ch).append(" "); // Agregar un espacio después de cada operando
        }
        else if (ch == '(') {
            stack.push(ch);
        }
        else if (ch == ')') {
            while (stack.peek() != '(') {
                postfix.append(stack.pop()).append(" "); // Agregar un espacio después de cada operador
            }
            stack.pop();
        }
        else if (ch == '^') {
            stack.push(ch);
        }
        else {
            while (stack.peek() != '#' && getPrecedence(ch) <= getPrecedence(stack.peek())) {
                postfix.append(stack.pop()).append(" "); // Agregar un espacio después de cada operador
            }
            stack.push(ch);
        }
    }
    
    while (stack.peek() != '#') {
        postfix.append(stack.pop()).append(" "); // Agregar un espacio después de cada operador
    }
    
    return postfix.toString();
}

private static int getPrecedence(char ch) {
    switch (ch) {
        case '^':
            return 3;
        case '*':
        case '/':
            return 2;
        case '+':
        case '-':
            return 1;
        default:
            return 0;
    }
}
}
     
 

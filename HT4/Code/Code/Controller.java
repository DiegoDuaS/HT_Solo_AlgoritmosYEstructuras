import java.util.ArrayList;

/**
 * @author: Diego Duarte
 * 
 * @since:21/02/2023
 **/

public class Controller{
    
    View view = new View();
    Calculator calculator;
    boolean start = true;
    Read read = new Read();
    ArrayList<String> items = new ArrayList<String>();
    int resultado;
    
    
    public void menu(){
        while (start) {
            IStack<Integer> stack;
            int respuesta = view.MenuP();
            switch (respuesta) {
                case 1:
                    stack = Factory.createStack(1, null);
                    calculator = calculator.getInstance(stack);
                    items = convert(calculator);
                    view.infix(read.leer());
                    calcular(stack, items, calculator); 
                    break;                  
                case 2:
                    stack = Factory.createStack(2, null);
                    calculator = calculator.getInstance(stack);
                    items = convert(calculator);
                    view.infix(read.leer());
                    calcular(stack, items, calculator);  
                    break;
                case 3:
                    int cho = view.MenuLista();
                    switch (cho) {
                        case 1:
                            stack = Factory.createStack(3,1);
                            calculator = calculator.getInstance(stack);
                            items = convert(calculator);
                            view.infix(read.leer());
                            calcular(stack, items, calculator);  
                            break;
                        case 2:
                            stack = Factory.createStack(3,2);
                            calculator = calculator.getInstance(stack);
                            items = convert(calculator);
                            view.infix(read.leer());
                            calcular(stack, items, calculator);  
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    start = false;
                    break;
            }
        }
    }
    
    private ArrayList<String> convert(Calculator calculator){
        String data = read.leer();
        String Postfix = Calculator.infixToPostfix(data);
        String[] items = Postfix.split(" "); // dividir la cadena en subcadenas utilizando la coma como delimitador
        ArrayList<String> list = new ArrayList<>(); // crear el ArrayList
        for (String item : items) { // iterar  sobre el array de subcadenas
            list.add(item); // agregar cada subcadena al ArrayList
        }
        return list;
    }

    
    private void calcular(IStack<Integer> Pila, ArrayList<String> list, Calculator calculator){
        int a;
        int b;
        for (int i = 0 ; i < items.size();i++){
            if (calculator.isOperator(items.get(i)) == true){
                if (calculator.isOneItem(Pila) == false){ 
                    if (items.get(i).equals("+")){
                        a = Pila.pull();
                        b = Pila.pull();
                        resultado = calculator.suma(a, b);
                        Pila.push(resultado);
                        if(calculator.isOneItem(Pila) == true){
                            View.resultadoOPer(Pila.pull());
                            break;
                        }
                    }
                    else if (items.get(i).equals("-")){
                        a = Pila.pull();
                        b = Pila.pull();
                        resultado = calculator.resta(a, b);
                        Pila.push(resultado);
                        if(calculator.isOneItem(Pila) == true){
                            view.resultadoOPer(Pila.pull());
                            break;
                        }
                    }
                    else if (items.get(i).equals("*")){
                        a = Pila.pull();
                        b = Pila.pull();
                        resultado = calculator.multiplicacion(a, b);
                        Pila.push(resultado);
                        if(calculator.isOneItem(Pila) == true){
                            view.resultadoOPer(Pila.pull());
                            break;
                        }
                    }
                    else if (items.get(i).equals("/")){
                        a = Pila.pull();
                        b = Pila.pull();
                        if(b == 0){
                            view.dividirCero();
                            break;
                        }
                        else{
                            resultado = calculator.division(a, b);
                            Pila.push(resultado);
                                if(calculator.isOneItem(Pila) == true){
                                    view.resultadoOPer(Pila.pull());
                                    break;
                                }
                        }
                    }
                    else{
                        view.simboloNoReconocido();
                        //Hay un valor no valido 
                        break;
                    }
                }
                else{
                    view.noOperandos();
                    //No hay suficientes operandos 
                    break;
                }
            }
            else{
                Pila.push(Integer.valueOf(items.get(i)));
            }
        }
        
    }

}
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Controller{
    PriorityQueue<Association<String,ArrayList<String>>> tree;
    Read read = new Read();

    public PriorityQueue<Association<String,ArrayList<String>>> CrearDiccionario(){
        PriorityQueue<Association<String,ArrayList<String>>> nuevo = read.read();
        return nuevo;
    }

    public void work(){
        tree = CrearDiccionario();
    }

}
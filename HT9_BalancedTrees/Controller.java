/**
 * @author: Diego Duarte
 *  
 * @since:20/04/2023
 **/
import java.util.ArrayList;


public class Controller{

    View view = new View();
    Read read = new Read();

    public void work(){
        String tipo = view.principal();
        Map<String,String> tree = read.Diccionario(tipo);
        ArrayList<String> texto = read.texto();
        StringBuilder mientras = new StringBuilder();
        for(String palabra: texto){
            String value = tree.search(palabra);
            if(value != null){
                mientras.append(value + " ");
            }
            else{
                mientras.append("*" + palabra + "* ");
            }
        }
        String traduccion = mientras.toString();
        mientras = new StringBuilder();
        for(String palabra: texto){
            mientras.append(palabra + " ");
        }
        String original = mientras.toString();
        view.MensajeFinal(original, traduccion);
    }

}
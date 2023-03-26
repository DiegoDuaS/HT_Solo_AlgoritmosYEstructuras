/**
 * @author: Diego Duarte
 * 
 * @since:25/03/2023
 **/
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.FormatFlagsConversionMismatchException;
import java.util.PriorityQueue;

public class Controller{
    PriorityQueue<Association<String,ArrayList<String>>> tree;
    Read read = new Read();
    View view = new View();
    boolean seguir = true;

    
    /** 
     * @return PriorityQueue<Association<String, ArrayList<String>>>
     */
    public PriorityQueue<Association<String,ArrayList<String>>> CrearDiccionario(){
        PriorityQueue<Association<String,ArrayList<String>>> nuevo = read.read();
        return nuevo;
    }

    
    /** 
     * @throws FileNotFoundException
     */
    public void work() throws FileNotFoundException{
        tree = CrearDiccionario();
        while(seguir == true){
            String accion = view.MenuPrincipal();
            if(accion.equals("1")){
                view.Palabras(tree);
            }
            else if (accion.equals("2")){
                String idiomaoriginal = view.IdiomaOriginal();
                String idiomatraduccion = view.IdiomaTraducir();
                ArrayList<String> mensaje = read.readWords();
                String traduccion = Traducir(idiomaoriginal, idiomatraduccion, tree, mensaje);
                view.ImprimirMensajes(traduccion, mensaje);
            }
            else if (accion.equals("3")){
                view.Salir();
                seguir = false;
                break;
            }
            else{
               view.Valido(); 
            }
        }
    }

    
    /** 
     * @param O
     * @param T
     * @param tree
     * @param texto
     * @return String
     */
    public String Traducir(String O, String T, PriorityQueue<Association<String,ArrayList<String>>> tree, ArrayList<String> texto){
        StringBuilder mientras = new StringBuilder();
        String traduccion = " ";
        boolean found = false;
        if(O.equals("1")){
            if(T.equals("1")){
                for(int i = 0; i < texto.size() ; i++){
                    mientras.append(texto.get(i));
                    mientras.append(" ");
                }
                traduccion = mientras.toString();
            }
            else if (T.equals("2")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getKey().equals(texto.get(i))){
                            mientras.append(info.getValue().get(0));
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
                traduccion = mientras.toString();
            }
            else if (T.equals("3")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getKey().equals(texto.get(i))){
                            mientras.append(info.getValue().get(1));
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
                traduccion = mientras.toString();
            }
        }
        else if (O.equals("2")){
            if(T.equals("1")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getValue().get(0).equals(texto.get(i))){
                            mientras.append(info.getKey());
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
            }
            else if (T.equals("2")){
                for(int i = 0; i < texto.size() ; i++){
                    mientras.append(texto.get(i));
                    mientras.append(" ");
                }
                traduccion = mientras.toString();

            }
            else if (T.equals("3")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getValue().get(0).equals(texto.get(i))){
                            mientras.append(info.getValue().get(1));
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
            }
        }
        else if (O.equals("3")){
            if(T.equals("1")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getValue().get(1).equals(texto.get(i))){
                            mientras.append(info.getKey());
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
            }
            else if (T.equals("2")){
                for(int i = 0; i < texto.size() ; i++){
                    found = false;
                    for (Association<String, ArrayList<String>> info : tree){
                        if(info.getValue().get(1).equals(texto.get(i))){
                            mientras.append(info.getValue().get(0));
                            mientras.append(" ");
                            found = true;
                            break;
                        }
                    }
                    if(found == false){
                        mientras.append("*");
                        mientras.append(texto.get(i));
                        mientras.append("*");
                        mientras.append(" ");      
                    }
                }
            }
            else if (T.equals("3")){
                for(int i = 0; i < texto.size() ; i++){
                    mientras.append(texto.get(i));
                    mientras.append(" ");
                }
                traduccion = mientras.toString();
                
            }
        }
        return traduccion;
    }

}
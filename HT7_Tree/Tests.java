/**
 * @author: Diego Duarte
 * 
 * @since:25/03/2023
 **/
import static org.junit.Assert.assertEquals;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.PriorityQueue;
import org.junit.Test;

public class Tests {
    PriorityQueue<Association<String,ArrayList<String>>> tree = new PriorityQueue<Association<String,ArrayList<String>>>(); 
    Controller con = new Controller();
    Read read = new Read();

    @Test
    public void AddTest(){
        ArrayList<String> prueba = new ArrayList<String>();
        String a = "a";
        String b = "b";
        prueba.add(a);
        prueba.add(b);
        Association<String,ArrayList<String>> pruebita = new Association<String,ArrayList<String>>("prueba",prueba);
        tree.add(pruebita);
        assertEquals("prueba", tree.peek().getKey());
        assertEquals("a", tree.peek().getValue().get(0));
    }

    
    /** 
     * @throws FileNotFoundException
     */
    @Test
    public void TraductorTest() throws FileNotFoundException{
        tree = con.CrearDiccionario();
        ArrayList<String> texto = new ArrayList<>();
        String perro = "dog";
        String gato = "cat";
        texto.add(gato);
        texto.add(perro);
        String prueba = con.Traducir("1", "2", tree, texto);
        assertEquals("*cat* perro " , prueba);

    }
}

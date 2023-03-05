import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Controller {
    Read read = new Read();
    View vista = new View();
    Scanner sc = new Scanner(System.in);
    Map<String, String> map;

    public void prueba(){
        String tipo = sc.nextLine();
        map = read.read(tipo);
        vista.Prueba(map);
    }


}

/**
 * @author: Diego Duarte
 * 
 * @since:20/04/2023
 **/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read {
    
public Map<String, String> read(String tipo){ 
    Map<String, String> arbol = Factory.createTree(tipo);
        try (BufferedReader br = new BufferedReader(new FileReader("texto.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                String key = parts[0].trim();
                String value = parts[1].trim();
                arbol.insert(key, value);
            }
        } catch (IOException e) {
            System.err.format("Error al leer el archivo '%s': %s");
        }
    return arbol;
    }
}


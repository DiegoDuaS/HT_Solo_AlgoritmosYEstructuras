import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Read {

    public Map<String, String> read(String mapType) {
        try {
            File file = new File("ListadoProducto (2).txt");
            Scanner scanner = new Scanner(file);
            Map<String, String> map = Factory.createMap(mapType);
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String key = parts[0].trim();
                String value = parts[1].trim();
                map.put(key, value);
            }
    
            scanner.close();
            return map;
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            return null;
        }
    }
}
    
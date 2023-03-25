import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Read {
    
    public static PriorityQueue<Association<String, ArrayList<String>>> read() {
        PriorityQueue<Association<String, ArrayList<String>>> result = new PriorityQueue<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader("diccionario.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String key = parts[0].trim();
                ArrayList<String> values = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    values.add(parts[i].trim());
                }
                Association<String, ArrayList<String>> data = new Association<>();
                data.setKey(key);
                data.setValue(values);
                result.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return result;
    }
}


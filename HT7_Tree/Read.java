/**
 * @author: Diego Duarte
 * 
 * @since:25/03/2023
 **/
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Read {
    static Comparator<Association<String, ArrayList<String>>> comparador = new Comparator<Association<String, ArrayList<String>>>() {
        public int compare(Association<String, ArrayList<String>> a1, Association<String, ArrayList<String>> a2) {
            return a1.getKey().compareToIgnoreCase(a2.getKey());
        }
    };
    

    
    /** 
     * @return PriorityQueue<Association<String, ArrayList<String>>>
     */
    public static PriorityQueue<Association<String, ArrayList<String>>> read() {
        PriorityQueue<Association<String, ArrayList<String>>> result = new PriorityQueue<>(comparador);
    
        try (BufferedReader reader = new BufferedReader(new FileReader("diccionario.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String key = parts[0].trim();
                ArrayList<String> values = new ArrayList<>();
                for (int i = 1; i < parts.length; i++) {
                    values.add(parts[i].trim());
                }
                Association<String, ArrayList<String>> data = new Association<>(key, values);
                result.add(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    
        return result;
    }

    
    /** 
     * @return ArrayList<String>
     * @throws FileNotFoundException
     */
    public ArrayList<String> readWords() throws FileNotFoundException {
        File file = new File("texto.txt");
        Scanner scanner = new Scanner(file);
        String linea = scanner.nextLine();
        String[] palabras = linea.split("\\s+");
        ArrayList<String> mensaje = new ArrayList<>();
        for (String word : palabras) {
            mensaje.add(word);
        }
        scanner.close();

        return mensaje;
    }
    
    
    
}


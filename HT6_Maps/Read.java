/**
 * @author: Diego Duarte
 * 
 * @since:05/03/2023
 **/ 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;

public class Read {

    
    /** 
     * @param mapType
     * @return Map<Integer, Producto>
     */
    public Map<Integer, Producto> read(String mapType) {
        try {
            File file = new File("ListadoProducto (2).txt");
            Scanner scanner = new Scanner(file);
            Map<Integer, Producto> map = Factory.createMap(mapType);
            int contador = 0;
    
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split("\\|");
                String tipo = parts[0].trim();
                String nombre = parts[1].trim();
                Producto prod = new Producto(tipo, nombre);
                map.put(contador, prod);
                contador++;
            }
    
            scanner.close();
            return map;
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
            return null;
        }
    }
}
    
/**
 * @author: Diego Duarte
 * 
 * @since:05/03/2023
 **/

import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class Factory {
    
    /** 
     * @param type
     * @return Map<Integer, Producto>
     */
    public static Map<Integer, Producto> createMap(String type) {
        switch(type.toLowerCase()) {
            case "1":
                return new HashMap<>();
            case "2":
                return new TreeMap<>();
            case "3":
                return new LinkedHashMap<>();
            default:
                throw new IllegalArgumentException("No");
        }
    }
}

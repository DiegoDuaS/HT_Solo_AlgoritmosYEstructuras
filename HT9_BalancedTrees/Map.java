/**
 * @author: Diego Duarte
 * 
 * @since:20/04/2023
 **/
public interface Map<K extends Comparable<K>, V> {
    void insert(K key, V value);
    V search(K key);
}

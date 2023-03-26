/**
 * @author: Diego Duarte
 * 
 * @since:25/03/2023
 **/
public class Association<K extends Comparable<K>, V> implements Comparable<Association<K, V>> {
    private K key;
    private V value;

    public Association() {
    }

    public Association(K key, V value) {
        this.key = key;
        this.value = value;
    }

    
    /** 
     * @return K
     */
    public K getKey() {
        return key;
    }

    
    /** 
     * @param key
     */
    public void setKey(K key) {
        this.key = key;
    }

    
    /** 
     * @return V
     */
    public V getValue() {
        return value;
    }

    
    /** 
     * @param value
     */
    public void setValue(V value) {
        this.value = value;
    }

    
    /** 
     * @param other
     * @return int
     */
    public int compareTo(Association<K, V> other) {
        return this.key.compareTo(other.key);
    }
}



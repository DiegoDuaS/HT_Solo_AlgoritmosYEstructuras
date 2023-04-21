public interface Map<K, V> {
    void insert(K key, V value);
    void delete(K key);
    V find(K key);
}

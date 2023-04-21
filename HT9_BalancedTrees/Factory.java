/**
 * @author: Diego Duarte
 * 
 * @since:20/04/2023
 **/
public class Factory {
    public static <K extends Comparable<K>, V> Map<K, V> createTree(String treeType) {
        if (treeType == null) {
            throw new IllegalArgumentException("No es posible que sea Null");
        }

        switch (treeType) {
            case "1":
                return new AVL<>();
            case "2":
                return new RBT<>();
            default:
                throw new IllegalArgumentException("Invalid tree type");
        }
    }
}

import structure5.DoublyLinkedList;
/**
 * @author: Diego Duarte
 * 
 * @since:19/02/2023
 **/
public class DoubleLinked<E> implements IStack<E> {

    private DoublyLinkedList<E> stack;

    public DoubleLinked() {
        stack = new DoublyLinkedList<E>();
    }

    public void push(E item) {
        stack.addFirst(item);
    }

    public E pull() {
        return stack.removeFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public E peek() {
        return stack.getFirst();
    }
}

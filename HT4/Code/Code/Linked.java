import java.util.EmptyStackException;
import java.util.LinkedList;
/**
 * @author: Diego Duarte
 * 
 * @since:19/02/2023
 **/
public class Linked<E> implements IStack<E> {

    private LinkedList<E> stack;

    public Linked(){
        stack = new LinkedList<E>();
    }

    public void push(E item) {
        stack.addFirst(item);
    }

    public E pull() throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.removeFirst();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

    public E peek() {
        if (empty()) {
            throw new EmptyStackException();
        }
        return stack.getFirst();
    }
}
